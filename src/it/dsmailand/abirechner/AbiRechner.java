package it.dsmailand.abirechner;

import it.dsmailand.abirechner.data.Data;
import it.dsmailand.abirechner.gui.*;
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
        data.setSUI(mainFrame.userInputPanel.subjectUI);

        listeners = new Listeners(this);

        //Add Listeners to buttons
        mainFrame.loadFileJButton.addActionListener(listeners.loadButtonListener);  //Load
        mainFrame.saveAsJButton.addActionListener(listeners.saveButtonListener);    //Save As...
        mainFrame.saveJButton.addActionListener(listeners.saveButtonListener);      //Save
        mainFrame.clearJButton.addActionListener(listeners.clearButtonListener);    //clear input
        mainFrame.calculateButton.addActionListener(listeners.calculateButtonListener); //calculate

    }
}
