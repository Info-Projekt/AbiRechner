/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

/**
 * Contains the references to all of the GUI elements that belong to a certain Subject.
 * Additionally provides methods to highlight certain input fields
 * and a FocusListener to automatically select the text when the user selects a JTextField.
 * @author MasterCarl
 */
public class SubjectUI implements FocusListener {

    JTextField[] semesterMarkInputField = new JTextField[4];
    HighlightMode[] markFieldHighlighted = new HighlightMode[4];
    JLabel displayNameLabel;
    JComboBox comboBox;
    boolean choice;

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
        choice = true;
    }

    public void setDisplayNameLabel(JLabel displayNameLabel) {
        this.displayNameLabel = displayNameLabel;
        choice = false;
    }

    public void setSemesterTextFields(JTextField s12_1, JTextField s12_2, JTextField s13_1, JTextField s13_2) {
        semesterMarkInputField[0] = s12_1;
        semesterMarkInputField[1] = s12_2;
        semesterMarkInputField[2] = s13_1;
        semesterMarkInputField[3] = s13_2;
        for (int i = 0; i < 4; i++) {
            semesterMarkInputField[i].addFocusListener(this);
        }
    }

    public int[] getMarks() {
        int[] marks = new int[4];
        for (int i = 0; i < 4; i++) {
            marks[i] = Integer.parseInt(semesterMarkInputField[i].getText());
        }
        return marks;
    }

    /*
     * Highlights a specific InputBox to provide visual feedback
     */
    public void setMarkInputFieldHighlight(int number, HighlightMode hl) {
        markFieldHighlighted[number] = hl;
        switch(hl)  {
            case none:    semesterMarkInputField[number].setBackground(Color.WHITE);
                break;
                case error:    semesterMarkInputField[number].setBackground(Color.RED);
                break;
        }
    }

    @Override
    public void focusGained(FocusEvent fe) {
        JTextField thisField = (JTextField) fe.getSource();
        thisField.selectAll();
    }

    @Override
    public void focusLost(FocusEvent fe) {
        //TODO: trigger a validity checker
    }
    
    public enum HighlightMode  {
        none, error
    }
}
