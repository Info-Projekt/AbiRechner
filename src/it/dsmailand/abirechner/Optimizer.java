/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner;

import java.util.ArrayList;
import java.util.List;

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
        natScSubjects = OptSearcher.searchForNatScSubjects(myData);
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
        
        //NaturalSciences: 4 hjs mandatory
        //TODO: see if Wahlfach==wES->doNothing()
        // if Wahlfach==oES->add 3
        // if Wahlfach!=eS->add 4
        
        int natScHjsToAdd = 4; // 4 is default
        for(int subject=0; subject<natScSubjects.length; subject++){
            if(myData.subjects[natScSubjects[subject]].writtenExamSubject){
                natScHjsToAdd = 0; // A and C already have 4hjs
                break;
            }
            if(myData.subjects[natScSubjects[subject]].oralExamSubject){
                natScHjsToAdd = 3; // C already has 1 hj
            }
        }
        
        for(int i=0; i<natScHjsToAdd; i++){
            int bestNatScSubjectNo = OptSearcher.getSubjectOfBestHj(myData, natScSubjects);
            int natScBestHj = OptSearcher.getBestSubjectHj(myData, bestNatScSubjectNo);
            bPoints += myData.subjects[bestNatScSubjectNo].semesterMarks[natScBestHj];
            myData.subjects[bestNatScSubjectNo].alreadyUsed[natScBestHj] = true;
        }
        
        
        return bPoints;
    }
    
  
}