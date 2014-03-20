/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner;

import java.util.ArrayList;
import java.util.List;

/**
 * Static methods used by the Optimizer class, all take Data as param
 * @author galurowa
 */
public class OptSearcher {

    /**
     * Searches for the user-selected Written-Exam-Subject
     * @param myData
     * @return Array of the WESubjects' SubjectNumbers
     */
    public static int[] searchForWESubjects(Data myData){
        int[] wESubjects = new int[3];
        int arrayField = 0;
        for(int subjectNo=0; subjectNo<12; subjectNo++){
            if (myData.subjects[subjectNo].writtenExamSubject==true){               
                wESubjects[arrayField++] = subjectNo;
            }
            if(arrayField==3) break;
        }
        return wESubjects;
    }

    /**
     * Searches for the user-selected OESubject
     * @param myData
     * @return SubjectNumber of ther OESubject (if 0=> error)
     */
    public static int searchForOESubject(Data myData){
        int oESubject = 0;
        for(int subjectNo=0; subjectNo<12; subjectNo++){
            if (myData.subjects[subjectNo].oralExamSubject==true){               
                oESubject = subjectNo;
            }
        }
        return oESubject;
    }
    
    /**
     * Searches for all NatSc and FLang Subjects among the ChoiceSubjects
     * @param myData
     * @return Array of the NatScSubjects' SubjectNumbers
     */
    public static int[][] searchForNatScAndFLangSubjects(Data myData){
        List<Integer> natScSubjectList = new ArrayList<>();
        List<Integer> fLangSubjectList = new ArrayList<>();
        fLangSubjectList.add(1);    //Ita is always ForeignLanguage
        
        for(int wahlfachNo=9; wahlfachNo<12; wahlfachNo++){
            if (myData.subjects[wahlfachNo].naturalScience){
                natScSubjectList.add(wahlfachNo);
            } else {fLangSubjectList.add(wahlfachNo);   
            }
        }

        int[] natScSubjects = new int[natScSubjectList.size()];
        int[] fLangSubjects = new int[fLangSubjectList.size()];

        for(int i=0; i<natScSubjectList.size(); i++){
            natScSubjects[i] = natScSubjectList.get(i);
        }
        for(int i=0; i<fLangSubjectList.size(); i++){
            fLangSubjects[i] = fLangSubjectList.get(i);
        }
        
        int[][] bothArrays = new int[][]{natScSubjects, fLangSubjects};
        return bothArrays;
    }
    
    /**
   * Returns the best non-used semester of a given subject
   * 
   * TODO: Exception if no new bestHj is found
   * 
   * @param myData
   * @param subjectNo
   * @return bestHj 
   */
    public static int getBestSubjectHj(Data myData, int subjectNo){
        int bestMark = 0;
        int bestHj = 20;
        for(int hj=0; hj<4; hj++){
            if(myData.subjects[subjectNo].semesterMarks[hj] > bestMark &&
                    myData.subjects[subjectNo].usedState[hj] == Data.UsedState.none){
                bestHj = hj;
            }
        }
        return bestHj;
    }
    
    /**
     * Returns the subject with the best non-used semester
     * @param myData
     * @param subjectNo int[] holding SubjectNumbers to choose from
     * @return SubjectNumber whose BestSubjectHj is highest
     */
    public static int getSubjectOfBestHj(Data myData, int[] subjectNo){
        int bestSubjectNo = subjectNo[0];
        for(int subjectIndex=1; subjectIndex<subjectNo.length; subjectIndex++){
            if (getBestSubjectHj(myData, subjectIndex)>getBestSubjectHj(myData, bestSubjectNo)){
                bestSubjectNo = subjectNo[subjectIndex];
            }
        }
        return bestSubjectNo;
    }
    
    public static int countAlreadyUsed(Data myData){
        int usedHjs = 0;
        for(int subjectNo=0; subjectNo<12; subjectNo++){
            for(int hj=0; hj<4; hj++){
                if (myData.subjects[subjectNo].usedState[hj] != Data.UsedState.none){
                    usedHjs++;
                }
            }
        }
        return usedHjs;
    }
}
