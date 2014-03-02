/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author galurowa
 */
public class Optimizer {
    Data myData;
    
    public Optimizer(Data myData){
        this.myData = myData;
    }
    
    public int[] searchForWESubjects(){
        int[] wESubjects = new int[3];
        int arrayField = 0;
        for(int subjectNo=0; subjectNo<12; subjectNo++){
            if (myData.subjects[subjectNo].writtenExamSubject==true){               
                wESubjects[arrayField++] = subjectNo;
            }
        }
        return wESubjects;
    }

    /**
     * Searches for the selected OESubject
     * @return SubjectNumber of ther OESubject (if 0=> error)
     */
    public int searchForOESubject(){
        int oESubject = 0;
        for(int subjectNo=0; subjectNo<12; subjectNo++){
            if (myData.subjects[subjectNo].writtenExamSubject==true){               
                oESubject = subjectNo;
            }
        }
        return oESubject;
    }
    
    public void optimize(){
        
        int[] wESubjects = searchForWESubjects();
        int oESubject = searchForOESubject();
        getAPoints(wESubjects);
        getCPoints(wESubjects, oESubject);
        
        
    }
                    
    private int getAPoints(int[] wESubjects){
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
    
    private int getCPoints(int[] wESubjects, int oESubject){
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
    
    private List createArrayListception(){
        /**
         * inner ArrayList => single Subject
         * Element => single Mark
         * Every time a mark gets counted, it is deleted from the Array
         */
        List<List<Integer>> semesterMarks = new ArrayList<>();
        for(int subjectNo=0; subjectNo<12; subjectNo++){
            List<Integer> newSubject = new ArrayList<>();
            for(int hj=0; hj<4; hj++){
                int mark = myData.subjects[subjectNo].semesterMarks[hj];
                newSubject.add(mark);
            }
            semesterMarks.add(newSubject);
        }
        return semesterMarks;
        
    }
    
    
    private int optimizeBPoints(){
        
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
                geBestHj = getBestSubjectHj(3);
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
            kumuBestHj = getBestSubjectHj(6);
            bPoints += myData.subjects[6].semesterMarks[kumuBestHj];
            myData.subjects[6].alreadyUsed[kumuBestHj] = true;
        }
            
        
        return bPoints;
    }
    
  /**
   * Returns the best not-used semester of a given subject
   * 
   * TODO: Exception if no new bestHj is found
   * 
   * @param subjectNo
   * @return bestHj 
   */
    private int getBestSubjectHj(int subjectNo){
        int bestMark = 0;
        int bestHj = 20;
        for(int hj=0; hj<4; hj++){
            if(myData.subjects[subjectNo].semesterMarks[hj] > bestMark &&
                    myData.subjects[subjectNo].alreadyUsed[hj] == false){
                bestHj = hj;
            }
        }
        return bestHj;
    }
}