/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner.data;

import it.dsmailand.abirechner.subjects.Semester;

/**
 * 
 * TODO: getResults (with points, mandatory hjs, half-m hjs, filled hjs)
 * TODO: check if stuff is legit
 * @author galurowa
 */
public class Optimizer {
    Data myData;
    int[] wESubjects;
    int oESubject;
    int[] natScSubjects;
    int[] fLangSubjects;
    int aScore = 0;
    int cScore = 0;
    int bScore = 0;
    
    public Optimizer(Data myData){
        this.myData = myData;
    }
    
    public void optimize(){
        wESubjects = OptSearcher.searchForWESubjects(myData);
        oESubject = OptSearcher.searchForOESubject(myData);
        int[][]bothArrays = OptSearcher.searchForNatScAndFLangSubjects(myData);
        natScSubjects = bothArrays[0];
        fLangSubjects = bothArrays[1];
        createAScore();
        createCScore();
        // oSector2 has to be called AFTER oGeschichte
        // oFLangAndNatSc has to be called AFTER oFLangOrNatSc
        optimizeMathe();
        optimizeGeschichte();
        optimizeKunstMusik();
        optimizeSector2();
        optimizeFLangOrNatSc(true); // optimizes NatScSubjects
        optimizeFLangOrNatSc(false); // optimizes FLangSubjects
        optimizeFLangAndNatSc();
        fillUp();
    }
                    
    private void createAScore(){
        //A: (12.1, 12.2, 13.1 of all wESubjects) * 2
        for(int arrayField=0; arrayField<3; arrayField++){
            int subjectNo = wESubjects[arrayField];
            for(int hj=0; hj<3; hj++){
                aScore += myData.subjects[subjectNo].semesters[hj].mark;
                myData.subjects[subjectNo].semesters[hj].usedState = Semester.UsedState.mandatory;
            }
        }
        aScore = 2 * aScore;
    }
    
    private void createCScore(){
        //C: (13.2 + 4*examScore) of all wESubjects and oESubject
        //13.2
        for(int arrayField=0; arrayField<3; arrayField++){
            int subjectNo = wESubjects[arrayField];
            cScore += myData.subjects[subjectNo].semesters[3].mark;
            myData.subjects[subjectNo].semesters[3].usedState = Semester.UsedState.mandatory;
        }
        cScore += myData.subjects[oESubject].semesters[3].mark;
        myData.subjects[oESubject].semesters[3].usedState = Semester.UsedState.mandatory;
        
        //examScore TODO
    }
    
    private void optimizeMathe(){
        //Mathe: 4 hjs mandatory
        if(myData.subjects[2].writtenExamSubject==false){
            int hjsToAdd;
            if(myData.subjects[2].oralExamSubject==true){
                hjsToAdd = 3; //since 13.2 is already in C
            } else {hjsToAdd = 4;}
            
            for(int hj=0; hj<hjsToAdd; hj++){
                bScore += myData.subjects[2].semesters[hj].mark;
                myData.subjects[2].semesters[hj].usedState = Semester.UsedState.mandLegible;
            }
        }
    }
    
    private void optimizeGeschichte(){
        // Geschichte: 2 hjs mandatory
        // If wESubect, quota already filled
        if(myData.subjects[3].writtenExamSubject==false){
            int hjsToAdd;
            int bestHj;
            if(myData.subjects[3].oralExamSubject==true){
                hjsToAdd = 1; //since 13.2 is already in C
            } else {hjsToAdd = 2;}
            
            for (int i=0; i<hjsToAdd; i++){
                bestHj = OptSearcher.getBestSubjectHj(myData, 3);
                bScore += myData.subjects[3].semesters[bestHj].mark;
                myData.subjects[3].semesters[bestHj].usedState = Semester.UsedState.mandLegible;
            }
        }
    }
    
    private void optimizeKunstMusik(){
        // Kunst/Musik: 3 hjs mandatory
        int hjsToAdd;
        int bestHj;
        if(myData.subjects[6].oralExamSubject==true){
            hjsToAdd = 2; //since 13.2 is already in C
        } else {hjsToAdd = 3;}

        for (int i=0; i<hjsToAdd; i++){
            bestHj = OptSearcher.getBestSubjectHj(myData, 6);
            bScore += myData.subjects[6].semesters[bestHj].mark;
            myData.subjects[6].semesters[bestHj].usedState = Semester.UsedState.mandLegible;
        }
    }
    
    private void optimizeSector2(){
        // Sector 2: 2 more hjs out of GE, FI, POWI, RE/ET
        // TODO (maybe): catch Exception (shouldn't actually be possible)
        if(myData.subjects[3].writtenExamSubject) return; // Hjs already filled
        int[] subjectNo = new int[]{3,4,7,8};
        int hjsToAdd = 2; //default
        for(int i=1; i<4; i++){
            if (myData.subjects[i].oralExamSubject) hjsToAdd = 1; //13.2 already in C
        }
        for(int i=0; i<hjsToAdd; i++){
            int bestSubjectNo = OptSearcher.getSubjectOfBestHj(myData, subjectNo);
            int bestHj = OptSearcher.getBestSubjectHj(myData, bestSubjectNo);
            bScore += myData.subjects[bestSubjectNo].semesters[bestHj].mark;
            myData.subjects[bestSubjectNo].semesters[bestHj].usedState = Semester.UsedState.mandLegible;
        }
    }
    
    private void optimizeFLangOrNatSc(boolean natSc){
        // ForeignLanguages: 4 hjs mandatory
        // NaturalSciences: 4 hjs mandatory
        // Process is identical
        int[] subjectArray;

        if(natSc){subjectArray = natScSubjects;
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
            int bestSubject = OptSearcher.getSubjectOfBestHj(myData, subjectArray);
            int bestHj = OptSearcher.getBestSubjectHj(myData, bestSubject);
            bScore += myData.subjects[bestSubject].semesters[bestHj].mark;
            myData.subjects[bestSubject].semesters[bestHj].usedState = Semester.UsedState.mandLegible;
        }
        
    }
    
    private void optimizeFLangAndNatSc(){
        // FLang and NatSc together: 14
        // Already have at least 8 from step before
        int hjsToAdd = 14;
        int fLangAlreadyUsedHjs = 0;
        int natScAlreadyUsedHjs = 0;
        
        // wESubject means 4 hjs already filled
        // oESubject means 1 hj already filled
        for(int subjectNo: fLangSubjects){
            if (myData.subjects[subjectNo].writtenExamSubject){
                fLangAlreadyUsedHjs += 4;
            } else if (subjectNo==oESubject) fLangAlreadyUsedHjs ++;
        }
        
        for(int subjectNo: natScSubjects){
            if (myData.subjects[subjectNo].writtenExamSubject){
                natScAlreadyUsedHjs += 4;
            } else if (subjectNo==oESubject) natScAlreadyUsedHjs ++;
        }
        
        // At least 4 FLangHjs and 4 NatScHjs already filled in oFLangOrNatSc
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
            bScore += myData.subjects[bestSubjectNo].semesters[bestHj].mark;
            myData.subjects[bestSubjectNo].semesters[bestHj].usedState = Semester.UsedState.mandLegible;
        }
    }
    
    private void fillUp(){
        int hjsToAdd = 35 - OptSearcher.countAlreadyUsed(myData); //ought to be >= 29
        int[] allSubjects = new int[12];
        for(int i=0; i<12; i++){allSubjects[i] = i;}
        for(int i=0; i<hjsToAdd; i++){
            int bestSubjectNo = OptSearcher.getSubjectOfBestHj(myData, allSubjects);
            int bestHj = OptSearcher.getBestSubjectHj(myData, bestSubjectNo);
            bScore += myData.subjects[bestSubjectNo].semesters[bestHj].mark;
            myData.subjects[bestSubjectNo].semesters[bestHj].usedState = Semester.UsedState.eligible;
        }
    }
}