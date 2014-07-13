package it.dsmailand.abirechner.subjects;

import it.dsmailand.abirechner.gui.SubjectUI;
import static it.dsmailand.abirechner.subjects.Subject.SubjectType.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author StrawberryLemonade
 */
public class Subject implements Serializable, ActionListener{

    int subjectIndex;
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
    
    //Listeners that are notified when content is updated
    private final ArrayList<ActionListener> listeners = new ArrayList<>();
    
    public Subject(int subjectIndex) {
        for(int i = 0;i<4;i++)  {
            semesters[i] = new Semester();
        }
        this.subjectIndex = subjectIndex;
        //foreignLang = true;
    }

    /**
     * @deprecated Only required in ChoiceManagement
     * @param name
     * @param langAndNotScience 
     */
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
    
    public SubjectType getSubjectType() {
        if(subjectIndex<9) return STANDARD;
        if(wahlfachType<3)  {
            return FOREIGN_LANG;
        } else  {
            return NATURAL_SCIENCE;
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Currently only deals with changes made in the respective SubjectUI object
        if(ae.getSource() instanceof SubjectUI) {
            SubjectUI subjectUI = (SubjectUI) ae.getSource();
            //this.setMarks(subjectUI.getMarks());
            this.wahlfachType = subjectUI.getComboBoxState();
            //Notify listeners
            fireActionEvent(ActionEvent.ACTION_PERFORMED);
        }
    }
    public enum SubjectType    {
        STANDARD, FOREIGN_LANG, NATURAL_SCIENCE
    }
    
    /**
     * Adds an AcionListener to be notified when the wahlfachType is changed.
     * @param al 
     */
    public void addActionListener(ActionListener al)    {
        listeners.add(al);
    }
    public void removeActionListener(ActionListener al)    {
        listeners.remove(al);
    }
    
    public void fireActionEvent(int id) {
        if(listeners.isEmpty())   return;
        for(ActionListener thisListener:listeners)  {
            thisListener.actionPerformed(new ActionEvent(this, id, null));
        }
    }
}
