/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner.data;

import it.dsmailand.abirechner.data.Data;
import it.dsmailand.abirechner.subjects.Subject;

/**
 *
 * @author luca13
 */
public class InputValidityChecker {
  
    public void check(Data data){
        checkForWESubjects(data);
        checkForOESubject(data);
    }
     
    /**
    * Converts markStrings into ints if possible
    * Checks if marks are ints from 0 to 15
    * @param markString String from SubjectUI
    */
    public static int checkMarks(String markString) throws NumberFormatException{
        int mark = Integer.parseInt(markString);
        if (mark<0||mark>15) throw new NumberFormatException();
        return mark;
    }
    
    public static void checkForWESubjects(Data data){
        int wESubjects = 0;
        for(int subjectNo=0; subjectNo<12; subjectNo++){
            if (data.subjects[subjectNo].writtenExamSubject==true){
                wESubjects++;
            }
            if (wESubjects!=3) throw new IllegalArgumentException();
        }
    }
    
    public static void checkForOESubject(Data data){
        int oESubjects = 0;
        for(int subjectNo=0; subjectNo<12; subjectNo++){
            if (data.subjects[subjectNo].oralExamSubject==true){
                oESubjects++;
            }
            if (oESubjects!=1) throw new IllegalArgumentException();
        }
    }
}

