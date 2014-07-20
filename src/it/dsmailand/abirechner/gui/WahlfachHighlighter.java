/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JComboBox;

/**
 *
 * @author Carl
 */
public class WahlfachHighlighter {

    private final JComboBox[] boxes;
    private final Color originalColor;

    public WahlfachHighlighter(JComboBox[] boxes) {
        this.boxes = boxes;
        originalColor = boxes[0].getForeground();
    }

    void highlightBox(final JComboBox box, String toolTipText) {

        box.setForeground(Color.RED);
        box.setToolTipText(toolTipText);

        box.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                for (JComboBox thisBox : boxes) {
                    thisBox.setForeground(originalColor);
                    thisBox.setToolTipText(null);
                }
                box.removeFocusListener(this);
            }

            @Override
            public void focusLost(FocusEvent fe) {
            }
        });

    }

}
