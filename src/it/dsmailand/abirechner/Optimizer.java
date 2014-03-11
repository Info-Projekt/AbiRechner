/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner;

/**
 *
 * @author galurowa
 */
public class Optimizer {
    Data myData;
    int[] wESubjects;
    int oESubject;
    int[] natScSubjects;
    int[] fLangSubjects;
    
    public Optimizer(Data myData){
        this.myData = myData;
    }
    
    public void optimize(){
        
        wESubjects = OptSearcher.searchForWESubjects(myData);
        oESubject = OptSearcher.searchForOESubject(myData);
        int[][]bothArrays = OptSearcher.searchForNatScAndFLangSubjects(myData);
        natScSubjects = bothArrays[0];
        fLangSubjects = bothArrays[1];
        createAScore(wESubjects);
        createCScore(wESubjects, oESubject);
        createBScore();

    }
                    
    private int createAScore(int[] wESubjects){
        //A: 12.1, 12.2, 13.1 of all wESubjects
        int aPoints = 0;

        for(int arrayField=0; arrayField<3; arrayField++){
            for(int hj=0; hj<3; hj++){
                int subjectNo = wESubjects[arrayField];
                aPoints += myData.subjects[subjectNo].semesterMarks[hj];
                myData.subjects[subjectNo].alreadyUsed[hj] = true;
            }
        }
        
        return aPoints;
    }
    
    private int createCScore(int[] wESubjects, int oESubject){
        //C: (13.2 + 4*examScore) of all wESubjects and oESubject
        int cPoints = 0;
        
        //13.2
        for(int arrayField=0; arrayField<3; arrayField++){
            int subjectNo = wESubjects[arrayField];
            cPoints += myData.subjects[subjectNo].semesterMarks[3];
            myData.subjects[subjectNo].alreadyUsed[3] = true;
        }
        cPoints += myData.subjects[oESubject].semesterMarks[3];
        myData.subjects[oESubject].alreadyUsed[3] = true;
        
        //examScore TODO
        
        return cPoints;
    }
    
    
    private int createBScore(){
                
        int bPoints = 0;

        //Mathe: 4 hjs mandatory
        if(myData.subjects[2].writtenExamSubject!=true){
            int hjsToAdd;
            if(myData.subjects[2].oralExamSubject==true){
                hjsToAdd = 3; //since 13.2 is already in C
            } else {hjsToAdd = 4;}
            
            for(int hj=0; hj<hjsToAdd; hj++){
                bPoints += myData.subjects[2].semesterMarks[hj];
                myData.subjects[2].alreadyUsed[hj] = true;
            }
        }
        
        //Geschichte: 2 hjs mandatory
        if(myData.subjects[3].writtenExamSubject!=true){
            int geHjsToAdd;
            int geBestHj;
            if(myData.subjects[3].oralExamSubject==true){
                geHjsToAdd = 1; //since 13.2 is already in C
            } else {geHjsToAdd = 2;}
            
            for (int i=0; i<geHjsToAdd; i++){
                geBestHj = OptSearcher.getBestSubjectHj(myData, 3);
                bPoints += myData.subjects[3].semesterMarks[geBestHj];
                myData.subjects[3].alreadyUsed[geBestHj] = true;
            }
        }
            
        //Kunst/Musik: 3 hjs mandatory
        int kumuHjsToAdd;
        int kumuBestHj;
        if(myData.subjects[6].oralExamSubject==true){
            kumuHjsToAdd = 2; //since 13.2 is already in C
        } else {kumuHjsToAdd = 3;}

        for (int i=0; i<kumuHjsToAdd; i++){
            kumuBestHj = OptSearcher.getBestSubjectHj(myData, 6);
            bPoints += myData.subjects[6].semesterMarks[kumuBestHj];
            myData.subjects[6].alreadyUsed[kumuBestHj] = true;
        }
            
        // Sector 2: 2hjs out of GE, FI, POWI, RE/ET
        // TODO (maybe): catch Exception (shouldn't actually be possible)
        // TODO: dammit forgot wES and oES
        int[] subjectNo = new int[]{3,4,7,8};
        for(int i=0; i<2; i++){
            int bestSec2SubjectNo = OptSearcher.getSubjectOfBestHj(myData, subjectNo);
            int sec2BestHj = OptSearcher.getBestSubjectHj(myData, bestSec2SubjectNo);
            bPoints += myData.subjects[bestSec2SubjectNo].semesterMarks[sec2BestHj];
            myData.subjects[bestSec2SubjectNo].alreadyUsed[sec2BestHj] = true;
        }
        
        // ForeignLanguages: 4 hjs mandatory
        // NaturalSciences: 4 hjs mandatory
        // Process is identical
        for(int iteration=0; iteration<2; iteration++){
            int[] subjectArray;
            
            if(iteration==0){subjectArray = natScSubjects;
            } else{subjectArray = fLangSubjects;}
        
            int hjsToAdd = 4; // 4 is default
            for(int subject=0; subject<subjectArray.length; subject++){
                if(myData.subjects[subjectArray[subject]].writtenExamSubject){
                    hjsToAdd = 0; // A and C already have 4hjs
                    break;
                }
                if(myData.subjects[subjectArray[subject]].oralExamSubject){
                    hjsToAdd = 3; // C already has 1 hj
                }
            }

            for(int i=0; i<hjsToAdd; i++){
                int bestSubjectNo = OptSearcher.getSubjectOfBestHj(myData, subjectArray);
                int bestHj = OptSearcher.getBestSubjectHj(myData, bestSubjectNo);
                bPoints += myData.subjects[bestSubjectNo].semesterMarks[bestHj];
                myData.subjects[bestSubjectNo].alreadyUsed[bestHj] = true;
            }
        }
        
        // FLang and NatSc together: 14
        // Already have at least 8 from step before
        int hjsToAdd = 14;
        int fLangAlreadyUsedHjs = 0;
        int natScAlreadyUsedHjs = 0;
        
        // wESubject means 4 hjs already there
        // oESubject means 4 hjs already there
        for(int tempNameSubjectNo: fLangSubjects){
            for(int i: wESubjects){
                if (tempNameSubjectNo==i)fLangAlreadyUsedHjs += 4;
            }
            if (tempNameSubjectNo==oESubject) fLangAlreadyUsedHjs ++;
        }
        
        for(int tempNameSubjectNo: natScSubjects){
            for(int i: wESubjects){
                if (tempNameSubjectNo==i) natScAlreadyUsedHjs += 4;
            }
            if (tempNameSubjectNo==oESubject) natScAlreadyUsedHjs ++;
        }
        
        //from step before there are at least 4 FLangHjs and 4 NatScHjs
        if(fLangAlreadyUsedHjs<4) fLangAlreadyUsedHjs = 4;
        if(natScAlreadyUsedHjs<4) natScAlreadyUsedHjs = 4;
        
        hjsToAdd = hjsToAdd - fLangAlreadyUsedHjs - natScAlreadyUsedHjs;
        
        // Combines NatSc and FLang SubjectNo-arrays into one
        int[] natScAndFLang = new int[natScSubjects.length + fLangSubjects.length];
        System.arraycopy(natScSubjects, 0, natScAndFLang, 0, natScSubjects.length);
        System.arraycopy(fLangSubjects, 0, natScAndFLang, natScSubjects.length, fLangSubjects.length);
        
        for(int i=0; i<hjsToAdd; i++){
            int bestSubjectNo = OptSearcher.getSubjectOfBestHj(myData, natScAndFLang);
            int bestHj = OptSearcher.getBestSubjectHj(myData, bestSubjectNo);
            bPoints += myData.subjects[bestSubjectNo].semesterMarks[bestHj];
            myData.subjects[bestSubjectNo].alreadyUsed[bestHj] = true;
        }
        
        
        return bPoints;
    }
    
  
}