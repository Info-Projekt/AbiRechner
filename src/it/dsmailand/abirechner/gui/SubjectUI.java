/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import it.dsmailand.abirechner.subjects.Semester.UsedState;
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
    private boolean usedStateHighlightersSet = false;

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
        choice = true;
    }

    public int getComboBoxState() {
        if (!choice) {
            return -1;
        }
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

        //Add focusListener
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
                field.setToolTipText(null);
                break;
            case numError:
                field.setBackground(new Color(127, 215, 212));
                field.setToolTipText("Die eingegebene Note muss zwischen 0 und 15 liegen");
                break;
            case invalidInput:
                field.setBackground(new Color(127, 215, 212));
                field.setToolTipText("Falsche Eingabe!");
                break;
        }
    }

    public void setMarkInputFieldHighlight(JTextField field, UsedState us) {
        usedStateHighlightersSet = true;
        //us: mandatory, eligible, mandLegible, none
        switch (us) {
            case none:
                field.setBackground(Color.WHITE);
                field.setToolTipText("Nicht eingebracht");
                break;
            case mandatory:
                //field.setBackground(new Color(127, 215, 212));
                field.setToolTipText("Pflichtfach");
                break;
            case eligible:
                //field.setBackground(new Color(127, 215, 212));
                field.setToolTipText(null);
                break;
            case mandLegible:
                //field.setBackground(new Color(127, 215, 212));
                field.setToolTipText(null);
                break;
        }
    }

    @Override
    public void focusGained(FocusEvent fe) {
        if (usedStateHighlightersSet) {
            usedStateHighlightersSet = false;
            resetFieldHighlight();
        }
        JTextField thisField = (JTextField) fe.getSource();
        thisField.selectAll();
        setMarkInputFieldHighlight(thisField, HighlightMode.none);
    }

    @Override
    public void focusLost(FocusEvent fe) {
        //System.out.println("Focus lost!");
        JTextField thisField = (JTextField) fe.getSource();
        try {
            int inputNumber = Integer.parseInt(thisField.getText());
            //System.out.print("Parsed: ");
            //System.out.println(inputNumber);
            if (inputNumber < 0 || inputNumber > 15) {
                setMarkInputFieldHighlight(thisField, HighlightMode.numError);
            } else {
                setMarkInputFieldHighlight(thisField, HighlightMode.none);
            }
        } catch (NumberFormatException e) {
            if (thisField.getText().equals("")) {
                setMarkInputFieldHighlight(thisField, HighlightMode.none);
            } else {
                setMarkInputFieldHighlight(thisField, HighlightMode.invalidInput);
            }
        }

    }

    public void clearInput() {
        for (int i = 0; i < 4; i++) {
            semesterMarkInputField[i].setText("");
        }
    }

    public void resetComboBox() {
        comboBox.setSelectedIndex(0);
    }

    private void resetFieldHighlight() {
        for (int i = 0; i < 4; i++) {
            setMarkInputFieldHighlight(semesterMarkInputField[i], HighlightMode.none);
        }
    }

    public enum HighlightMode {

        none, numError, invalidInput
    }
}
