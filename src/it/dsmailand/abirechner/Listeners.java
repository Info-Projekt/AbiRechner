/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner;

import it.dsmailand.abirechner.gui.SubjectUI;
import it.dsmailand.abirechner.subjects.Subject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

/**
 * Contains the various ActionListeners
 *
 * @author MasterCarl
 */
public class Listeners {
    //Create a file chooser

    JFileChooser fc;
    private final AbiRechner mainClass;

    public Listeners(AbiRechner mainClass) {
        this.mainClass = mainClass;
        fc = new JFileChooser();
        //TODO: add file filter
    }
    
    ActionListener loadButtonListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Show the FileChooser
            int returnVal = fc.showOpenDialog(mainClass.mainFrame);
            //If the user selects a file
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                //Read the file to data
                FileIO.readFromDisk(file, mainClass.data);
                System.out.print("Loading: ");
                System.out.println(mainClass.data.subjects[6].wahlfachType);
                //Update the data in the GUI
                mainClass.data.writeToGUI();
            }
        }
    };
    ActionListener saveButtonListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            File file;

            //Check whether "Save As..." has been clicked
            if (e.getSource() == mainClass.mainFrame.saveAsJButton) {
                //Show the FileChooser
                int returnVal = fc.showSaveDialog(mainClass.mainFrame);
                //If the user selects a file/destination
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    file = fc.getSelectedFile();
                    //To facilitate saving, enable the "Save" button
                    mainClass.mainFrame.saveJButton.setEnabled(true);
                } else {
                    return;
                }
            } else {
                //If the user clicked the "save" button instead of "Save As...", just get the last file
                file = fc.getSelectedFile();
            }
            System.out.print("Before: ");
                System.out.println(mainClass.data.subjects[6].wahlfachType);
            //Get the latest input
            mainClass.data.readFromGUI();
            System.out.print("After reading: ");
                System.out.println(mainClass.data.subjects[6].wahlfachType);
            //Save the data
            FileIO.saveToDisk(mainClass.data, file);
        }
    };
    ActionListener clearButtonListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            for(SubjectUI thisSubjectUI:mainClass.mainFrame.userInputPanel.subjectUI)    {
                thisSubjectUI.clearInput();
                if(thisSubjectUI.choice) thisSubjectUI.resetComboBox();
            }
        }
        
    };
}