package it.dsmailand.abirechner.subjects;

import it.dsmailand.abirechner.data.Data;
import it.dsmailand.abirechner.*;
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
    //transient SubjectUI guiReference;     //Object that contains referneces to the GUI/Swing elements concerning the subject
    
    //Variables that depend on user input
    public int wahlfachType;   //equals the selected index of the ComboBox
    public int[] semesterMarks = new int[4];
    public boolean writtenExamSubject;
    public boolean oralExamSubject;
    transient public Data.UsedState[] usedState = new Data.UsedState[4]; 
    
    public Subject() {
        foreignLang = true;
    }

    public Subject(String name, boolean langAndNotScience) {
        this.name = name;
        foreignLang = langAndNotScience;
        naturalScience = !langAndNotScience;
    }

}
