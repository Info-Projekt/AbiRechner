/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.Serializable;
import javax.swing.*;

/**
 * Contains the references to all of the GUI elements that belong to a certain
 * Subject. Additionally provides methods to highlight certain input fields and
 * a FocusListener to automatically select the text when the user selects a
 * JTextField. Currently, an array of SubjectUI instances is created by
 * mainFrame.userInputPanel and then passed to data.Subjects by AbiRechner. This
 * is kind of complicated.
 *
 * @author MasterCarl
 * @TODO complete FocusLost()
 */
public class SubjectUI implements FocusListener, Serializable {

    JTextField[] semesterMarkInputField = new JTextField[4];
    JLabel displayNameLabel;
    JComboBox comboBox;
    public boolean choice;

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
        choice = true;
    }

    public int getComboBoxState() {
        if(!choice) return -1;
        System.out.println(comboBox.getSelectedIndex());
        return comboBox.getSelectedIndex();
    }
    
    public void setComboBoxState(int wahlfachType) {
       comboBox.setSelectedIndex(wahlfachType);
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

    public void setMarks(int[] semesterMarks) {
        for (int i = 0; i < 4; i++) {
            semesterMarkInputField[i].setText(String.valueOf(semesterMarks[i]));
        }
    }
    /*
     * Highlights a specific InputBox to provide visual feedback
     */

    public void setMarkInputFieldHighlight(JTextField field, HighlightMode hl) {
        switch (hl) {
            case none:
                field.setBackground(Color.WHITE);
                break;
            case error:
                field.setBackground(Color.RED);
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
        //System.out.println("Focus lost!");
        JTextField thisField = (JTextField) fe.getSource();
        try {
            int inputNumber = Integer.parseInt(thisField.getText());
            if (inputNumber < 0 || inputNumber < 15) {
                setMarkInputFieldHighlight(thisField, HighlightMode.error);
            }
        } catch (Exception e) {
            setMarkInputFieldHighlight(thisField, HighlightMode.error);
        }
        setMarkInputFieldHighlight(thisField, HighlightMode.none);

    }

    public void clearInput() {
        for (int i = 0; i < 4; i++) {
            semesterMarkInputField[i].setText("");
        }
    }

    public void resetComboBox() {
        comboBox.setSelectedIndex(0);
    }

    public enum HighlightMode {

        none, error
    }
}
