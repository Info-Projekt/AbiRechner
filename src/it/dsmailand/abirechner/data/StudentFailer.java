/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner.data;

import it.dsmailand.abirechner.subjects.Semester;
import it.dsmailand.abirechner.subjects.Semester.UsedState;
import it.dsmailand.abirechner.subjects.Subject;

/**
 *
 * @author Blaidd Drwg
 */
public class StudentFailer {
    int counter = 0;
    
    /**
     * @return false if student is failed
     */
    public static boolean checkFor0Points(Data myData) {
        //0 points only allowed in "none" semesters
        for(Subject thisSubject:myData.subjects){
            for(Semester thisSemester:thisSubject.semesters){
                if (thisSemester.mark==0 && thisSemester.usedState!=UsedState.none)
                    return false;
            }
        }
        return true;
    }
    
    public void add1ToCounter(){
        counter++;
    }
    
    public boolean checkCounter(char area){
        switch (area){
            case 'a': if(counter<6) return false; break;
            case 'b': if(counter<16) return false; break;
            case 'c': if(counter<2) return false; break;
        }
        return true;
    }
    
    public boolean checkPoints(int points, char area){
        switch (area){
            case 'a': if(points<90) return false; break;
            case 'b': if(points<110) return false; break;
            case 'c': if(points<100) return false; break;
        }
        return true;
    }
    
    
}
