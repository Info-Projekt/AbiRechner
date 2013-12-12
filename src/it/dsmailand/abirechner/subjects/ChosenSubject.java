package it.dsmailand.abirechner.subjects;

/**
 *
 * @author luca13
 */
public class ChosenSubject extends Subject{
    
    private void getSubjectData(){
        int subjectIndex = //TODO get from sPanel;
        if (subjectIndex < 3){
            area = 1;
            foreignLang = true;
            naturalScience = false;
        } else {
            area = 3;
            foreignLang = false;
            naturalScience = true;
        }
    }
            
}
