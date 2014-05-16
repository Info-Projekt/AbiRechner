package it.dsmailand.abirechner.subjects;

import it.dsmailand.abirechner.data.Data;
import java.io.Serializable;

/**
 *
 * @author StrawberryLemonade
 */
public class Subject implements Serializable{

    int subjectIndex;
    transient public String name;   //needed?
    transient int area; //can be 1, 2 or 3        needed?
    transient public boolean foreignLang;
    transient public boolean naturalScience;
    
    private static final long serialVersionUID = 11;
    //transient SubjectUI guiReference;     //Object that contains referneces to the GUI/Swing elements concerning the subject
    
    //Variables that depend on user input
    public int wahlfachType = 0;   //equals the selected index of the ComboBox, zero if non-negotiable
    public Semester[] semesters = new Semester[4];
    public boolean writtenExamSubject;
    public boolean oralExamSubject;
    public int abinote;
    
    public Subject(int subjectIndex) {
        for(int i = 0;i<4;i++)  {
            semesters[i] = new Semester();
        }
        this.subjectIndex = subjectIndex;
        //foreignLang = true;
    }

    public Subject(String name, boolean langAndNotScience) {
        for(int i = 0;i<4;i++)  {
            semesters[i] = new Semester();
        }
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

    @Override
    public String toString()    {
        return SubjectNumber.name[subjectIndex][wahlfachType];
    }
}
