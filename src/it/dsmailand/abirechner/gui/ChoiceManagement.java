/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import it.dsmailand.abirechner.subjects.Subject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JComboBox;

/**
 *
 * @author Carl
 * @deprecated Functional, but no longer used because it added no usability benefit.
 */
public class ChoiceManagement {

    JComboBox[] box = new JComboBox[3];
    Subject[] lingSubjects1 = new Subject[3];
    Subject[] scienceSubjects1 = new Subject[3];
    String[] lingSubjects = {"Englisch", "Französisch", "Latein"};
    String[] scienceSubjects = {"Biologie", "Physik", "Chemie"};
    ArrayList<String> availableSubjects = new ArrayList<>();
    ArrayList<Subject> availableSubjects1 = new ArrayList<>();

    void setSubjects() {
        lingSubjects1[0] = new Subject("Englisch", true);
        lingSubjects1[1] = new Subject("Französisch", true);
        lingSubjects1[2] = new Subject("Latein", true);
        scienceSubjects1[0] = new Subject("Biologie", false);
        scienceSubjects1[1] = new Subject("Physik", false);
        scienceSubjects1[2] = new Subject("Chemie", false);
    }
    ActionListener actionPerformed = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {}
        public void actionPerformed2(ActionEvent ae) {
            //put all items up for grabs
            Collections.addAll(availableSubjects1, lingSubjects1);
            Collections.addAll(availableSubjects1, scienceSubjects1);
            int numberOfLing = 0, numberOfSci = 0;
            
            //remove selected items from availList
            for (JComboBox thisBox : box) {
                String selectedName = thisBox.getSelectedItem().toString(); //Get the selected subject by name
                System.out.println(selectedName);
                
                for(Subject thisSubject:availableSubjects1) {       //Search and destroty the corres. object
                    if(thisSubject.name.equals(selectedName)) {     //in availableSubjects1
                        if(thisSubject.foreignLang) numberOfLing++;
                        if(thisSubject.naturalScience)  numberOfSci++;
                        availableSubjects1.remove(thisSubject);
                    }
                }
            }
            //if two sci/ling subjects are selected, remove all other sci/ling subjects
            if (numberOfLing > 1) {
                for (Subject thisSubject : availableSubjects1) {
                    if(thisSubject.foreignLang) availableSubjects1.remove(thisSubject);
                }
            }
            if (numberOfSci > 1) {
                for (Subject thisSubject : availableSubjects1) {
                    if(thisSubject.naturalScience) availableSubjects1.remove(thisSubject);
                }
            }
            //repopulate unchanged comboBoxes
            
            /*TODO*/
            initialize();
            for (JComboBox thisBox : box) {
                for (Iterator<String> it = availableSubjects.iterator(); it.hasNext();) {
                    String thisSubject = it.next();
                    if (thisBox.getSelectedItem().toString().equals(thisSubject)) {
                    }

                }
                /*Object source = ae.getSource();
                 for (JComboBox thisBox : box) {
                 //
                 if (thisBox == source) {
                 //get selected item
                 ///remove item from available 
                 //put previous choice back
                 System.out.println("Source identified as CB");
                 }    //TODO: Make it do something
                 }   */
            }
        }
    };

    void setComboBoxes(JComboBox boxA, JComboBox boxB, JComboBox boxC) {
        box[0] = boxA;
        box[1] = boxB;
        box[2] = boxC;
    }

    void initialize() {
        Collections.addAll(availableSubjects, lingSubjects);
        Collections.addAll(availableSubjects, scienceSubjects);
    }
}
