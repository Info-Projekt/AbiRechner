/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import javax.swing.*;

/**
 *
 * @author Carl
 */
public class SubjectUI {

    JTextField[] semesterMarkInputField = new JTextField[4];
    JLabel displayNameLabel;
    JComboBox comboBox;

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public void setDisplayNameLabel(JLabel displayNameLabel) {
        this.displayNameLabel = displayNameLabel;
    }

    public void setSemesterTextFields(JTextField s12_1, JTextField s12_2, JTextField s13_1, JTextField s13_2) {
        semesterMarkInputField[0] = s12_1;
        semesterMarkInputField[1] = s12_2;
        semesterMarkInputField[2] = s13_1;
        semesterMarkInputField[3] = s13_2;
    }

    public int[] getMarks() {
        int[] marks = new int[4];
        for (int i = 0; i < 4; i++) {
            marks[i] = Integer.parseInt(semesterMarkInputField[i].getText());
        }
        return marks;
    }
}
