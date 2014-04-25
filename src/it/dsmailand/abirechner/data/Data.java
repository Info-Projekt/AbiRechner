package it.dsmailand.abirechner.data;

import it.dsmailand.abirechner.gui.SubjectUI;
import it.dsmailand.abirechner.subjects.Semester;
import it.dsmailand.abirechner.subjects.Subject;
import java.io.*;

/**
 * Contains all the subject data, organized in Subject objects. Serializable
 *
 *
 * @author MasterCarl
 * @version 1.1         //Who's using this anyway
 * @serial The various subjects with marks and choice preferences
 */
public class Data implements Serializable {

    public Subject[] subjects = new Subject[12];       //Subject classes that store the information entered by the user
    
    private static final long serialVersionUID = 2; //Class version ID used to check compatibility with serialized data



    //<editor-fold defaultstate="collapsed" desc="Exception declarations">
    public static class YouFailException extends Exception {
        public YouFailException() {
        }
    }
    
    public static class WeFuckedUpException extends Exception {
        public WeFuckedUpException() {
        }
    }
//</editor-fold>
    
    public int finalPoints;
    
    public Data() {
        //initializes the subject objects
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = new Subject();
        }
    }

    /*
     * Routine that updates the contents of data, to be called before every calculation
     * @TODO add other stuff to be fetched
     */

    /**
     * Returns the final mark. Exception if called before Optimizer.optimize
     * @return String with AbiMark in the format "X,X"
     * @throws it.dsmailand.abirechner.data.Data.YouFailException
     * @throws it.dsmailand.abirechner.data.Data.WeFuckedUpException
     */
    public String createAbiMark() { //throws YouFailException, WeFuckedUpException
        if(finalPoints<300)//{throw new YouFailException();}
        {return "nicht bestanden";}
        else if(finalPoints<301){return "4,0";}
        else if(finalPoints<319){return "3,9";}
        else if(finalPoints<337){return "3,8";}
        else if(finalPoints<355){return "3,7";}
        else if(finalPoints<373){return "3,6";}
        else if(finalPoints<391){return "3,5";}
        else if(finalPoints<409){return "3,4";}
        else if(finalPoints<427){return "3,3";}
        else if(finalPoints<445){return "3,2";}
        else if(finalPoints<463){return "3,1";}
        else if(finalPoints<481){return "3,0";}
        else if(finalPoints<499){return "2,9";}
        else if(finalPoints<517){return "2,8";}
        else if(finalPoints<535){return "2,7";}
        else if(finalPoints<553){return "2,6";}
        else if(finalPoints<571){return "2,5";}
        else if(finalPoints<589){return "2,4";}
        else if(finalPoints<607){return "2,3";}
        else if(finalPoints<625){return "2,2";}
        else if(finalPoints<643){return "2,1";}
        else if(finalPoints<661){return "2,0";}
        else if(finalPoints<679){return "1,9";}
        else if(finalPoints<697){return "1,8";}
        else if(finalPoints<715){return "1,7";}
        else if(finalPoints<733){return "1,6";}
        else if(finalPoints<751){return "1,5";}
        else if(finalPoints<769){return "1,4";}
        else if(finalPoints<787){return "1,3";}
        else if(finalPoints<805){return "1,2";}
        else if(finalPoints<823){return "1,1";}
        else if(finalPoints<901){return "1,0";}
        else //throw new WeFuckedUpException();
        {return "<1,0";}
    }
    
    public void resetUsedStates() {
        for(Subject thisSubject:subjects)    {
            for(Semester thisSemester:thisSubject.semesters)  {
                thisSemester.usedState=Semester.UsedState.none;
            }  
        }
    }
} 

