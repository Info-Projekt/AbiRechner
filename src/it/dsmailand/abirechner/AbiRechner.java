package it.dsmailand.abirechner;

import it.dsmailand.abirechner.gui.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Behold, the class that unites the GUI and the backend
 *
 * @author StrawberryLemonade, MasterCarl
 */
public class AbiRechner {

    private void test() {
        System.out.println("Teste Speicherung. Fortfahren (y/n)");
        // Well, that's why it wouldn't save what I entered. data.readFromGUI();
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            if (bufferRead.readLine().equals("y")) {
                data.readFromGUI();
                fifo.saveToDisk();
            }
            System.out.println("Fortfahren mit einlesen? (y/n)");
            if (bufferRead.readLine().equals("y")) {
                fifo.readFromDisk();
                data.writeToGUI();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    MainFrame mainFrame;
    Data data;
    FileInputOutput fifo;

    public static void main(String[] args) {
        AbiRechner abiRechner = new AbiRechner();
        abiRechner.initialize();
        abiRechner.test();
    }

    void initialize() {
        MainFrame.setNimbus();
        mainFrame = new it.dsmailand.abirechner.gui.MainFrame();
        mainFrame.setVisible(true);

        data = new Data(mainFrame.userInputPanel.inputReferences);

        fifo = new FileInputOutput(data);

        /*mainFrame.mainActionJButton.addListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
         data.
         }
         });*/
    }
}
