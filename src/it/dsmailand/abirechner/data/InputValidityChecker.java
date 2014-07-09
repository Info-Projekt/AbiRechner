/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.data;

import it.dsmailand.abirechner.data.Data.WeFuckedUpException;
import it.dsmailand.abirechner.subjects.Semester;
import it.dsmailand.abirechner.subjects.Semester.UsedState;
import it.dsmailand.abirechner.subjects.Subject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luca13
 */
public class InputValidityChecker {

    private static final Logger logger = Logger.getLogger(InputValidityChecker.class.getName());

    public static boolean checkData(Data data) {
        if (!checkNumberOfWESubjects(data)) {
            logger.log(Level.SEVERE, "Falsche Anzahl an schriftlichen Abiturfächern");
            return false;
        }
        if (!checkNumberOfOESubjects(data)) {
            logger.log(Level.SEVERE, "Falsche Anzahl an mündlichen Abiturfächern");
            return false;
        }
        return true;
    }

    public void checkOutputData(Data data) {
        try {
            countUsedHJs(data);
        } catch (WeFuckedUpException ex) {
            Logger.getLogger(InputValidityChecker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Converts markStrings into ints if possible Checks if marks are ints from
     * 0 to 15
     *
     * @param markString String from SubjectUI
     * @deprecated Checks are already performed in gui package
     */
    public static int checkMarks(String markString) throws NumberFormatException {
        int mark = Integer.parseInt(markString);
        if (mark < 0 || mark > 15) {
            throw new NumberFormatException();
        }
        return mark;
    }

    public static boolean checkNumberOfWESubjects(Data data) {
        int wESubjects = 0;
        for (int subjectNo = 0; subjectNo < 12; subjectNo++) {
            if (data.subjects[subjectNo].writtenExamSubject == true) {
                wESubjects++;
            }
        }
        return (wESubjects == 3);
    }

    public static boolean checkNumberOfOESubjects(Data data) {
        int oESubjects = 0;
        for (int subjectNo = 0; subjectNo < 12; subjectNo++) {
            if (data.subjects[subjectNo].oralExamSubject == true) {
                oESubjects++;
            }
        }
        return (oESubjects == 1);
    }

    public static void countUsedHJs(Data data) throws WeFuckedUpException {
        int usedHJs = 0;
        for (Subject thisSubject : data.subjects) {
            for (Semester thisSemester : thisSubject.semesters) {
                if (thisSemester.usedState != UsedState.none) {
                    usedHJs++;
                }
            }
        }

        if (usedHJs != 35) {
            throw new WeFuckedUpException();
        }
    }
}
