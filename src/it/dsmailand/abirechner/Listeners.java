/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner;

import it.dsmailand.abirechner.data.FileIO;
import it.dsmailand.abirechner.gui.SubjectUI;
import it.dsmailand.abirechner.subjects.Subject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 * Contains the various ActionListeners
 *
 * @author MasterCarl
 */
public class Listeners {
    //Create a file chooser

    JFileChooser fc;
    public AbiRechner mainClass;

    public Listeners(AbiRechner mainClass) {
        this.mainClass = mainClass;
        fc = new JFileChooser();
        //TODO: add file filter
    }
    
    //  CALCULATE
        ActionListener calculateButtonListener = new ActionListener()   {
        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
                
        };
    //  LOAD
    ActionListener loadButtonListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Show the FileChooser
            int returnVal = fc.showOpenDialog(mainClass.mainFrame);
            //If the user selects a file
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try {
                    //Read the file to data
                    mainClass.data = null;
                    mainClass.data = FileIO.readFromDisk(file);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Listeners.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Listeners.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Listeners.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("after call in listener");
            for (int i = 0; i < 4; i++) {
                System.out.print(mainClass.data.subjects[0].semesters[i].mark);
            }
                //Update the data in the GUI
                mainClass.mainFrame.userInputPanel.writeDataToGUI(mainClass.data);
            }
        }
    };
    
    //  SAVE
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
            mainClass.mainFrame.userInputPanel.readInputToData(mainClass.data);
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

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }