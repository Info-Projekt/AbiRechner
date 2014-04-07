package it.dsmailand.abirechner.subjects;

import it.dsmailand.abirechner.data.Data;
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
    
    private static final long serialVersionUID = 11;
    //transient SubjectUI guiReference;     //Object that contains referneces to the GUI/Swing elements concerning the subject
    
    //Variables that depend on user input
    public int wahlfachType;   //equals the selected index of the ComboBox
    public Semester[] semesters = new Semester[4];
    public boolean writtenExamSubject;
    public boolean oralExamSubject;
    
    public Subject() {
        for(int i = 0;i<4;i++)  {
            semesters[i] = new Semester();
        }
        foreignLang = true;
    }

    public Subject(String name, boolean langAndNotScience) {
        for(int i = 0;i<4;i++)  {
            semesters[i] = new Semester();
        }
        this.name = name;
        foreignLang = langAndNotScience;
        naturalScience = !langAndNotScience;
    }

    public void setMarks(int[] marks) {
        for(int i = 0; i<4; i++)    {
            semesters[i].mark = marks[i];
        }
    }

    public int[] getMarks() {
        int[] returnMarks = new int[4];
        for(int i = 0; i<4; i++)    {
            returnMarks[i] = semesters[i].mark;
        }
        return returnMarks;
    }

}
