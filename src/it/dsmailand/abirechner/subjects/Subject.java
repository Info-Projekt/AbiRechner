package it.dsmailand.abirechner.subjects;

import it.dsmailand.abirechner.gui.*;

/**
 *
 * @author StrawberryLemonade
 */
public class Subject {

    public String name;        //TODO: add "name" to various subclasses
    int area; //can be 1, 2 or 3
    public boolean foreignLang; //needed
    public boolean naturalScience; //needed
    boolean writtenExamSubject;
    boolean oralExamSubject;
    int[] semesterMark = new int[4];
    SubjectUI guiReference;

    public Subject() {

    }

    public Subject(String name, boolean langAndNotScience) {
        this.name = name;
        foreignLang = langAndNotScience;
        naturalScience = !langAndNotScience;
    }

    void setPanel(SubjectUI sPanel) {
        this.guiReference = sPanel;
    }

    public void getData() {

        semesterMark = guiReference.getMarks();

        //writtenExamSubject = /*TODO*/;
        //oralExamSubject = /*TODO*/;
    }

}
