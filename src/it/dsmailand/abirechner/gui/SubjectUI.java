/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import it.dsmailand.abirechner.subjects.Semester.UsedState;
import it.dsmailand.abirechner.subjects.Subject;
import it.dsmailand.abirechner.subjects.SubjectNumber;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Contains the references to all of the GUI elements that belong to a certain
 * Subject. Additionally provides methods to highlight certain input fields and
 * a FocusListener to automatically select the text when the user selects a
 * JTextField. Currently, an array of SubjectUI instances is created by
 * mainFrame.userInputPanel.
 *
 * @author MasterCarl
 */
public class SubjectUI implements FocusListener, ActionListener, Serializable {

    final int index;
    JTextField[] semesterMarkInputField = new JTextField[4];
    JLabel displayNameLabel;
    JComboBox<String> comboBox;
    private boolean choice;
    private boolean usedStateHighlightersSet = false;
    DefaultComboBoxModel<String> model;
    private final ArrayList<ActionListener> listeners = new ArrayList<>();
    
    public SubjectUI(int index) {
        this.index = index;
    }

    public void setComboBox(JComboBox<String> comboBox) {
        this.comboBox = comboBox;
        choice = true;

        comboBox.addActionListener(this);
        //Populate the list of available choices according to SubjectNumber.name[index]
        
        model = new DefaultComboBoxModel<>(SubjectNumber.name[index]);
        comboBox.setModel(model);
    }

    void readInput(Subject subject) {
        subject.setMarks(this.getMarks());
        subject.wahlfachType = this.getComboBoxState();
    }
    
    void updateOutput(Subject subject)  {
        setMarks(subject.getMarks());
        setComboBoxState(subject.wahlfachType);
    }

    public int getComboBoxState() {
        if (!choice) {
            return 0;
        }
        return comboBox.getSelectedIndex();
    }

    public void setComboBoxState(int wahlfachType) {
        if (choice) {
            comboBox.setSelectedIndex(wahlfachType);
        }
    }

    public void setDisplayNameLabel(JLabel displayNameLabel) {
        this.displayNameLabel = displayNameLabel;
        displayNameLabel.setText(SubjectNumber.name[index][0]);
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

    public int[] getMarks() throws NumberFormatException{
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

    private void setMarkInputFieldHighlight(JTextField field, HighlightMode hl) {
        switch (hl) {
            case NONE:
                field.setBackground(Color.WHITE);
                field.setForeground(Color.BLACK);   //Removes any UsedState highlighting
                field.setToolTipText(null);
                break;
            case NUM_ERROR:
                field.setBackground(new Color(127, 215, 212));
                field.setToolTipText("Die eingegebene Note muss zwischen 0 und 15 liegen");
                break;
            case INVALID_INPUT:
                field.setBackground(new Color(127, 215, 212));
                field.setToolTipText("Falsche Eingabe!");
                break;
        }
    }

    private void setMarkInputFieldHighlight(JTextField field, UsedState us) {
        usedStateHighlightersSet = true;
        //us: mandatory, eligible, mandLegible, none
        switch (us) {
            case none:
                field.setForeground(Color.GRAY);
                //field.setBackground(Color.WHITE);
                field.setToolTipText("Nicht eingebracht");
                break;
            case mandatory:
                field.setForeground(new Color(30, 144, 255));  //DodgerBlue
                field.setToolTipText("Pflichtfach");
                break;
            case eligible:
                field.setForeground(new Color(0, 205, 102));    //SpringGreen3
                field.setToolTipText("Eingebringbar");
                break;
            case mandLegible:
                field.setForeground(new Color(255, 165, 0));  //orange
                field.setToolTipText("Wahlpflicht");
                break;
        }
    }

    public void setMarkInputFieldHighlight(int fieldNumber, HighlightMode hl) {
        setMarkInputFieldHighlight(semesterMarkInputField[fieldNumber], hl);
    }

    public void setMarkInputFieldHighlight(int fieldNumber, UsedState us) {
        setMarkInputFieldHighlight(semesterMarkInputField[fieldNumber], us);
    }

    @Override
    public void focusGained(FocusEvent fe) {
        if (usedStateHighlightersSet) {
            resetFieldHighlight();
            usedStateHighlightersSet = false;
        }
        JTextField thisField = (JTextField) fe.getSource();
        thisField.selectAll();
        setMarkInputFieldHighlight(thisField, HighlightMode.NONE);
    }

    @Override
    public void focusLost(FocusEvent fe) {
        //System.out.println("Focus lost!");
        JTextField thisField = (JTextField) fe.getSource();
        try {
            int inputNumber = Integer.parseInt(thisField.getText());
            //System.out.print("Parsed: ");
            //System.out.println(inputNumber);

            //If the user entered a wrong mark, e.g. 16
            if (inputNumber < 0 || inputNumber > 15) {
                setMarkInputFieldHighlight(thisField, HighlightMode.NUM_ERROR);
            } else {
                setMarkInputFieldHighlight(thisField, HighlightMode.NONE);
            }
        } catch (NumberFormatException e) {
            if (thisField.getText().equals("")) {
                setMarkInputFieldHighlight(thisField, HighlightMode.NONE);              //No input
            } else {
                setMarkInputFieldHighlight(thisField, HighlightMode.INVALID_INPUT);      //If the input is non-numerical and not empty
            }
        }

    }

    public void clearInput() {
        for (int i = 0; i < 4; i++) {
            semesterMarkInputField[i].setText("");
        }
    }

    public void resetComboBox() {
        if (choice) {
            comboBox.setSelectedIndex(0);
        }
    }

    private void resetFieldHighlight() {
        for (int i = 0; i < 4; i++) {
            setMarkInputFieldHighlight(semesterMarkInputField[i], HighlightMode.NONE);
        }
    }

    private Object makeObj(final String item)  {
     return new Object() { public String toString() { return item; } };
   }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Notify all listeners that a comboBox has changed
        if(ae.getSource().equals(comboBox)) {
            if(!listeners.isEmpty())  {
                for(ActionListener thisListener:listeners)  {
                    thisListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
                }
            }
        }
    }

    public void addActionListener(ActionListener al)    {
        listeners.add(al);
    }
    public void removeActionListener(ActionListener al)    {
        listeners.remove(al);
    }

    public enum HighlightMode {

        NONE, NUM_ERROR, INVALID_INPUT
    }
}
