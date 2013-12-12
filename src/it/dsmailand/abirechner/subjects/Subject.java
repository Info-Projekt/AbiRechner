package it.dsmailand.abirechner.subjects;

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
    SubjectPanel sPanel;
    
    void setPanel(SubjectPanel sPanel){
        this.sPanel = sPanel;
    }
    
    public void getData(){
        //Gonna do it as soon as I know how the heck you built the panel
        semesterMark = /*TODO*/;
        writtenExamSubject = /*TODO*/;
        oralExamSubject = /*TODO*/;
    }
    
}
