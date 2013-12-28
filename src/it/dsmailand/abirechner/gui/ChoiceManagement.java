/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JComboBox;

/**
 *
 * @author Carl
 */
public class ChoiceManagement {
    JComboBox[] box = new JComboBox[3];
    String[] lingSubjects = {"Englisch", "Französisch", "Latein"};
    String[] scienceSubjects = {"Biologie", "Physik", "Chemie"};
    ArrayList<String> availableSubjects = new ArrayList();
    ActionListener actionPerformed = new ActionListener()   {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object source = ae.getSource();
            for(JComboBox thisBox:box)   {
                if(thisBox == source) System.out.println("Source identified as CB");    //TODO: Make it do something
            }
        }
        
    };
    
    void setComboBoxes(JComboBox boxA, JComboBox boxB, JComboBox boxC){
        box[0] = boxA;
        box[1] = boxB;
        box[2] = boxC;
    }
    
    void initialize()   {
        Collections.addAll(availableSubjects, lingSubjects);
        Collections.addAll(availableSubjects, scienceSubjects);
    }
}
