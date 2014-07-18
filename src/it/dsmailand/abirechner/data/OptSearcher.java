/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner.data;

import it.dsmailand.abirechner.subjects.Semester;
import it.dsmailand.abirechner.subjects.Subject;
import static it.dsmailand.abirechner.subjects.Subject.SubjectType.*;
import static it.dsmailand.abirechner.subjects.SubjectNumber.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
    public static Subject[] findWESubjects(Data myData){
        //Important: Deutsch should always be at the [0] position (see ChoicePanel.updateOutput() )
        Subject[] wESubjects = new Subject[3];
        int arrayField = 0;
        for(Subject thisSubject:myData.subjects){
            if (thisSubject.writtenExamSubject){               
                wESubjects[arrayField++] = thisSubject;
            }
            //if(arrayField==3) break;
        }
        return wESubjects;
    }

    /**
     * Searches for the user-selected OESubject
     * @param myData
     * @return SubjectNumber of ther OESubject (if 0=> error)
     */
    public static Subject findOESubject(Data myData){
        for(Subject thisSubject:myData.subjects){
            if (thisSubject.oralExamSubject==true){               
                return thisSubject;
            }
        }
        throw new NoSuchElementException();
    }
    
        /**
     * Searches for NatSc Subjects among the ChoiceSubjects
     * @param myData
     * @return Array of the NatScSubjects
     */
    public static Subject[] findNatScSubjects(Data myData)  {
        List<Subject> results = new ArrayList<>();
        for(Subject thisWahlfach:myData.getWahlfaecher())   {
            if(thisWahlfach.getSubjectType()==NATURAL_SCIENCE) results.add(thisWahlfach);
        }
        if(results.isEmpty())   throw new NoSuchElementException();
        Subject[] resultsArr = new Subject[results.size()];
        resultsArr = results.toArray(resultsArr);
        return resultsArr;
    }
    
        public static Subject[] findFLangSubjects(Data myData)  {
        List<Subject> results = new ArrayList<>();
        for(Subject thisWahlfach:myData.getWahlfaecher())   {
            if(thisWahlfach.getSubjectType()==FOREIGN_LANG) results.add(thisWahlfach);
        }
        if(results.isEmpty())   throw new NoSuchElementException();
        return (Subject[]) results.toArray();
    }
    
    /**
   * Returns the best non-used semester of a given subject
   * 
   * TODO: Exception if no new bestHj is found
   * 
   * @param thisSubject
   * @return bestHj 
   */
    public static Semester findBestSubjectSemester(Subject thisSubject){
        int bestMark = -1;
        Semester bestSemester = null;
        for(Semester thisSemester:thisSubject.semesters){
            if(thisSemester.mark > bestMark &&
                    thisSemester.usedState == Semester.UsedState.none){
                bestSemester = thisSemester;
                bestMark = bestSemester.mark;
            }
        }
        return bestSemester;
    }
    
    /**
     * Returns the subject with the best non-used semester
     * @param myData
     * @param givenSubjects Subject[] holding SubjectNumbers to choose from
     * @return Subject whose BestSubjectHj is highest
     */
    public static Subject findSubjectOfBestHj(Data myData, Subject[] givenSubjects){
        int i = 0;
        Subject bestSubject = givenSubjects[i];
        
        for(int j=i+1; j<givenSubjects.length; j++){
            if (findBestSubjectSemester(bestSubject)==null){
                bestSubject = givenSubjects[j];
                i = j;
            } else break;
        }
        
        for(int k=i+1; k<givenSubjects.length; k++){
            if (findBestSubjectSemester(givenSubjects[k])!=null){
                if (findBestSubjectSemester(givenSubjects[k]).mark>findBestSubjectSemester(bestSubject).mark){
                bestSubject = givenSubjects[k];
                }
            }    
        }
        return bestSubject;
    }
    
    public static int countAlreadyUsed(Data myData){
        int usedHjs = 0;
        for(int subjectNo=0; subjectNo<12; subjectNo++){
            for(int hj=0; hj<4; hj++){
                if (myData.subjects[subjectNo].semesters[hj].usedState != Semester.UsedState.none){
                    usedHjs++;
                }
            }
        }
        return usedHjs;
    }
}
