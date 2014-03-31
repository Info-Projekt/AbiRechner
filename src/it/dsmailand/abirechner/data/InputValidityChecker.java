/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner.data;

import it.dsmailand.abirechner.data.Data.*;
import it.dsmailand.abirechner.subjects.Subject;

/**
 *
 * @author luca13
 */
public class InputValidityChecker {
  
    public void checkInputData(Data data){
        checkForWESubjects(data);
        checkForOESubject(data);
    }
    
    public void checkOutputData(Data data){
        countUsedHJs(data);
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
    
    public static void checkForWESubjects(Data data) throws WeFuckedUpException{
        int wESubjects = 0;
        for(int subjectNo=0; subjectNo<12; subjectNo++){
            if (data.subjects[subjectNo].writtenExamSubject==true){
                wESubjects++;
            }
            if (wESubjects!=3) throw new WeFuckedUpException();
        }
    }
    
    public static void checkForOESubject(Data data) throws WeFuckedUpException{
        int oESubjects = 0;
        for(int subjectNo=0; subjectNo<12; subjectNo++){
            if (data.subjects[subjectNo].oralExamSubject==true){
                oESubjects++;
            }
            if (oESubjects!=1) throw new WeFuckedUpException();
        }
    }
    
    public static void countUsedHJs(Data data) throws WeFuckedUpException{
        int usedHJs = 0;
        for(Subject subjects: data.subjects){
            for(UsedState usedState: subjects.usedState){
                if(usedState != UsedState.none){
                    usedHJs++;
                }
            }
        }
        
        if (usedHJs!= 35){
            throw new WeFuckedUpException();
        }
    }
}

