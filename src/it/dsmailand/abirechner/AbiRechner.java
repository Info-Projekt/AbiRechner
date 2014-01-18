package it.dsmailand.abirechner;

import it.dsmailand.abirechner.gui.MainFrame;
import java.awt.event.*;

/**
 *
 * @author StrawberryLemonade
 */
public class AbiRechner {

    static MainFrame mainFrame;
    static Data data;

    public static void main(String[] args) {
        MainFrame.setNimbus();
        mainFrame = new it.dsmailand.abirechner.gui.MainFrame();
        mainFrame.setVisible(true);

        mainFrame.mainActionJButton.addListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                data.
            }
        });
    }
}
