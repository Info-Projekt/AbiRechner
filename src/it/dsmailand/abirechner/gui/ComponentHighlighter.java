/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner.gui;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.EventListener;
import javax.swing.JComboBox;
import javax.swing.JComponent;

/**
 *
 * @author Carl
 */
public class ComponentHighlighter {
    public static void highlightTemporarily(final javax.swing.JComponent cmp, String toolTipText) {
        final Color originalColor = cmp.getForeground();

        cmp.setForeground(Color.RED);
        cmp.setToolTipText(toolTipText);
        
        cmp.addFocusListener(new FocusListener()    {
            @Override
            public void focusGained(FocusEvent fe) {
                cmp.setForeground(originalColor);
                cmp.setToolTipText(null);
             cmp.removeFocusListener(this);
            }
            @Override
            public void focusLost(FocusEvent fe) {}
        }   );

    }

}
