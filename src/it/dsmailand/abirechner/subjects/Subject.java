package it.dsmailand.abirechner.subjects;

import it.dsmailand.abirechner.gui.*;

/**
 *
 * @author StrawberryLemonade
 */
public class Subject {

    transient public String name;        //TODO: add "name" to various subclasses
    transient int area; //can be 1, 2 or 3        needed?
    transient public boolean foreignLang;
    transient public boolean naturalScience;
    
    //Variables that depend on user input
    int[] semesterMarks = new int[4];
    boolean writtenExamSubject;
    boolean oralExamSubject;
    
    transient SubjectUI guiReference;     //Object that contains referneces to the GUI/Swing elements concerning the subject

    public Subject(SubjectUI guiReference) {
        foreignLang = true;
        this.guiReference = guiReference;
    }

    public Subject(String name, boolean langAndNotScience) {
        this.name = name;
        foreignLang = langAndNotScience;
        naturalScience = !langAndNotScience;
    }

    public void fetchMarks() {

        semesterMarks = guiReference.getMarks();

        //writtenExamSubject = /*TODO*/;
        //oralExamSubject = /*TODO*/;
    }
    

}
