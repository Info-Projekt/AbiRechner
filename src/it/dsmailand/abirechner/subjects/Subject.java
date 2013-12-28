package it.dsmailand.abirechner.subjects;
import it.dsmailand.abirechner.gui.*;

/**
 *
 * @author StrawberryLemonade
 */
public class Subject {
    int area; //can be 1, 2 or 3
    boolean foreignLang; //not sure if needed
    boolean naturalScience; //not sure if needed
    boolean writtenExamSubject;
    boolean oralExamSubject;
    int[] semesterMark = new int[4];
    SubjectUI guiReference;
    
    void setPanel(SubjectUI sPanel){
        this.guiReference = sPanel;
    }
    
    public void getData(){
        
        semesterMark = guiReference.getMarks();

        writtenExamSubject = /*TODO*/;
        oralExamSubject = /*TODO*/; 
    }
    

}
