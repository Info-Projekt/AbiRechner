package it.dsmailand.abirechner.subjects;

import it.dsmailand.abirechner.gui.*;

/**
 *
 * @author StrawberryLemonade
 */
public class Subject {

    public String name;        //TODO: add "name" to various subclasses
    int area; //can be 1, 2 or 3
    transient final public boolean foreignLang; //needed
    transient public boolean naturalScience; //needed
    boolean writtenExamSubject;
    boolean oralExamSubject;
    int[] semesterMarks = new int[4];
    SubjectUI guiReference;

    public Subject(SubjectUI guiReference) {
        foreignLang = true;
        this.guiReference = guiReference;
    }

    public Subject(String name, boolean langAndNotScience) {
        this.name = name;
        foreignLang = langAndNotScience;
        naturalScience = !langAndNotScience;
    }

    void setPanel(SubjectUI sPanel) {
        this.guiReference = sPanel;
    }

    public void fetchMarks() {

        semesterMarks = guiReference.getMarks();

        //writtenExamSubject = /*TODO*/;
        //oralExamSubject = /*TODO*/;
    }
    

}
