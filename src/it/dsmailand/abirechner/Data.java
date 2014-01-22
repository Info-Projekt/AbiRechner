package it.dsmailand.abirechner;

import it.dsmailand.abirechner.gui.SubjectUI;
import it.dsmailand.abirechner.subjects.Subject;
import java.io.*;

/**
 * Contains all the subject data, organized in Subject objects. Can be saved to
 * disk *TO BE IMPLEMENTED
 *
 *
 * @author MasterCarl
 * @param sUI: reference to the GUI
 * @version 0.1 - incomplete
 * @serial The various subjects with marks and choice preferences
 */
public class Data implements Serializable {

    Subject[] subjects = new Subject[12];       //Subject classes that store the information entered by the user

    public Data(SubjectUI[] sUI) {
        //initializes the subject objects
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = new Subject(sUI[i]);
        }
    }

    /*
     * Routine that updates the contents of data, to be called before every calculation
     * @TODO add other stuff to be fetched
     */
    public void readFromGUI() {
        for (Subject thisSubject : subjects) {
            thisSubject.fetchMarks();
        }
    }
} 

