package it.dsmailand.abirechner;

import it.dsmailand.abirechner.gui.*;
import java.awt.event.*;

/**
 * Behold, the class that unites the GUI and the backend
 * @author StrawberryLemonade, MasterCarl
 */
public class AbiRechner {
    MainFrame mainFrame;
    Data data;
    FileInputOutput fifo;

    public static void main(String[] args) {
        AbiRechner abiRechner = new AbiRechner();
        abiRechner.initialize();
    }
    
    void initialize()   {
        MainFrame.setNimbus();
        mainFrame = new it.dsmailand.abirechner.gui.MainFrame();
        mainFrame.setVisible(true);
        
        data = new Data(mainFrame.userInputPanel.inputReferences);
        
        fifo = new FileInputOutput(data);

        mainFrame.mainActionJButton.addListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                data.
            }
        });
    }
}
