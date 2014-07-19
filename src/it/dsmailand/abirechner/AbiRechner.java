package it.dsmailand.abirechner;

import it.dsmailand.abirechner.data.Data;
import it.dsmailand.abirechner.data.Optimizer;
import it.dsmailand.abirechner.gui.*;
import it.dsmailand.abirechner.subjects.Subject;
import javax.swing.*;

/**
 * Behold, the class that unites the GUI and the backend
 *
 * @author StrawberryLemonade, MasterCarl
 */
public class AbiRechner {

    public MainFrame mainFrame;
    public Data data;
    Listeners listeners;
    Optimizer optimizer;

    public static void main(String[] args) {
        AbiRechner abiRechner = new AbiRechner();
        abiRechner.initialize();
    }

    void initialize() {
        //<editor-fold defaultstate="collapsed" desc="Set look and feel (system)">
        //MainFrame.setNimbus();
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // handle exception
        }
//</editor-fold>
        mainFrame = new it.dsmailand.abirechner.gui.MainFrame();
        mainFrame.setVisible(true);

        data = new Data();
        
        addListeners();
        
        mainFrame.choicePanel.assignSubjects(data.subjects);
        
        listeners = new Listeners(this);

        //Add Listeners to buttons
        mainFrame.loadFileJButton.addActionListener(listeners.loadButtonListener);  //Load
        mainFrame.saveAsJButton.addActionListener(listeners.saveButtonListener);    //Save As...
        mainFrame.saveJButton.addActionListener(listeners.saveButtonListener);      //Save
        mainFrame.clearJButton.addActionListener(listeners.clearButtonListener);    //clear input
        mainFrame.calculateButton.addActionListener(listeners.calculateButtonListener); //calculate

    }
    
    private void addListeners() {
        //Add choicePanel listener to VariableSubjects
        for(Subject thisSubject : data.getVariableSubjects())   {
            thisSubject.addActionListener(mainFrame.choicePanel.optionUpdater);
        }
        //Add data.subjects, UserInputPanel listener to SubjectUI instances
        for(int i=6; i<mainFrame.userInputPanel.subjectUI.length; i++)    {
        mainFrame.userInputPanel.subjectUI[i].addActionListener(data.subjects[i]);
        mainFrame.userInputPanel.subjectUI[i].addActionListener(mainFrame.userInputPanel);
        }
        
    }
}
