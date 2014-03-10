package it.dsmailand.abirechner.subjects;

import it.dsmailand.abirechner.gui.*;
import java.io.Serializable;

/**
 *
 * @author StrawberryLemonade
 */
public class Subject implements Serializable{

    transient public String name;        //TODO: add "name" to various subclasses
    transient int area; //can be 1, 2 or 3        needed?
    transient public boolean foreignLang;
    transient public boolean naturalScience;
    
    private static final long serialVersionUID = 10;
    transient SubjectUI guiReference;     //Object that contains referneces to the GUI/Swing elements concerning the subject
    
    //Variables that depend on user input
    public int wahlfachType;   //equals the selected index of the ComboBox
    public int[] semesterMarks = new int[4];
    public boolean writtenExamSubject;
    public boolean oralExamSubject;
    
    transient public boolean[] alreadyUsed = new boolean[4]; //True if corresponding semesterMark adds to the final mark

    public Subject(SubjectUI guiReference) {
        foreignLang = true;
        this.guiReference = guiReference;
    }

    public Subject(String name, boolean langAndNotScience) {
        this.name = name;
        foreignLang = langAndNotScience;
        naturalScience = !langAndNotScience;
    }

    public void updateContent() {

        semesterMarks = guiReference.getMarks();
        if(guiReference.choice) {
            wahlfachType = guiReference.getComboBoxState();
        }
        //writtenExamSubject = /*TODO*/;
        //oralExamSubject = /*TODO*/;
    }

    public void applyContent() {
        guiReference.setMarks(semesterMarks);
        if(guiReference.choice) {
            guiReference.setComboBoxState(wahlfachType);
        }
    }
    

}
