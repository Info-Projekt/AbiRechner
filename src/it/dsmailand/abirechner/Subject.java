package it.dsmailand.abirechner;

/**
 *
 * @author StrawberryLemonade
 */
class Subject {
    int area; //can be 1, 2 or 3
    boolean foreignLang; //not sure if needed
    boolean naturalScience; //not sure if needed
    boolean examSubject;
    int[] semesterMark = new int[4];
    SubjectPanel sPanel;
    
    void setPanel(SubjectPanel sPanel){
        this.sPanel = sPanel;
    }
    
    int[] getMarks(){
        //TODO: access sPanel, return int[4]
    }
    
}
