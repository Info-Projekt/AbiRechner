/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import it.dsmailand.abirechner.data.Data;
import it.dsmailand.abirechner.data.OptSearcher;
import static it.dsmailand.abirechner.gui.ComponentHighlighter.highlightTemporarily;
import it.dsmailand.abirechner.subjects.Subject;
import it.dsmailand.abirechner.subjects.SubjectNumber;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Luca13
 */
public class ChoicePanel extends javax.swing.JPanel implements ActionListener   {

    //private JComboBox<Subject>[] examComboBoxes = new JComboBox<Subject>[4];
    private ArrayList<JComboBox<Subject>> examComboBoxes = new ArrayList<>();
    private JTextField[] markInputField = new JTextField[4];
    Color defaultComboBoxColor;
    public OptionUpdater optionUpdater;
    private Subject[] subjects;
    private final WahlfachHighlighter wahlfachHighlighter;

    /**
     * Creates new form ChoicePanel
     */
    public ChoicePanel() {
        initComponents();
        this.optionUpdater = new OptionUpdater();
        defaultComboBoxColor = jComboBox1.getBackground();
        examComboBoxes.add(0, jComboBox1);
        examComboBoxes.add(1, jComboBox2);
        examComboBoxes.add(2, jComboBox3);
        examComboBoxes.add(3, jComboBox4);

        markInputField[0] = markTextField1;
        markInputField[1] = markTextField2;
        markInputField[2] = markTextField3;
        markInputField[3] = markTextField4;
        
        JComboBox[] choiceBoxes;
        choiceBoxes = examComboBoxes.toArray(new JComboBox[examComboBoxes.size()]);
        choiceBoxes = Arrays.copyOfRange(choiceBoxes, 1, 4);
        wahlfachHighlighter = new WahlfachHighlighter(choiceBoxes);
        for(JComboBox thisBox:choiceBoxes)  {
            thisBox.addActionListener(this);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<Subject>();
        jComboBox2 = new javax.swing.JComboBox<Subject>();
        jComboBox3 = new javax.swing.JComboBox<Subject>();
        jComboBox4 = new javax.swing.JComboBox<Subject>();
        markTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        markTextField2 = new javax.swing.JTextField();
        markTextField3 = new javax.swing.JTextField();
        markTextField4 = new javax.swing.JTextField();

        jLabel1.setText("Wahl der PF");

        markTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField1ActionPerformed(evt);
            }
        });
        markTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });
        markTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                markTextField1markTextFieldKeyTyped(evt);
            }
        });

        jLabel2.setText("Note");

        markTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField2ActionPerformed(evt);
            }
        });
        markTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField24FocusGained(evt);
            }
        });
        markTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                markTextField2markTextFieldKeyTyped(evt);
            }
        });

        markTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField3ActionPerformed(evt);
            }
        });
        markTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField34FocusGained(evt);
            }
        });
        markTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                markTextField3markTextFieldKeyTyped(evt);
            }
        });

        markTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField4ActionPerformed(evt);
            }
        });
        markTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField44FocusGained(evt);
            }
        });
        markTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                markTextField4markTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, 110, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(markTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(markTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void markTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField1ActionPerformed

    private void markTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_markTextField14FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField14FocusGained

    private void markTextField1markTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_markTextField1markTextFieldKeyTyped
        //javax.swing.JTextField jt = (javax.swing.JTextField) evt.getSource();
        //System.out.println(jt.getText());
    }//GEN-LAST:event_markTextField1markTextFieldKeyTyped

    private void markTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField2ActionPerformed

    private void markTextField24FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_markTextField24FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField24FocusGained

    private void markTextField2markTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_markTextField2markTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField2markTextFieldKeyTyped

    private void markTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField3ActionPerformed

    private void markTextField34FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_markTextField34FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField34FocusGained

    private void markTextField3markTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_markTextField3markTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField3markTextFieldKeyTyped

    private void markTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField4ActionPerformed

    private void markTextField44FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_markTextField44FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField44FocusGained

    private void markTextField4markTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_markTextField4markTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField4markTextFieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Subject> jComboBox1;
    private javax.swing.JComboBox<Subject> jComboBox2;
    private javax.swing.JComboBox<Subject> jComboBox3;
    private javax.swing.JComboBox<Subject> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    javax.swing.JTextField markTextField1;
    javax.swing.JTextField markTextField2;
    javax.swing.JTextField markTextField3;
    javax.swing.JTextField markTextField4;
    // End of variables declaration//GEN-END:variables

    public void readInput(Data data) throws NumberFormatException, IllegalChoicesException {
        data.resetChoices();
        for (int i = 0; i < 4; i++) {
            JComboBox<Subject> thisBox = examComboBoxes.get(i);
            Subject selectedSubject = (Subject) thisBox.getSelectedItem();

            resetBackground(thisBox);
            //Check for multiple choices of the same subject
            for (int j = 0; j < i; j++) {
                if (examComboBoxes.get(j).getSelectedItem().equals(selectedSubject)) {
                    highlightTemporarily(examComboBoxes.get(j), null);
                    throw new IllegalChoicesException();
                }

            }
            selectedSubject.abinote = Integer.parseInt(markInputField[i].getText());
            if (i < 3) {
                selectedSubject.writtenExamSubject = true;
            } else {
                selectedSubject.oralExamSubject = true;
            }
        }
    }

    public void updateOutput(Data data) {
        assignSubjects(data.subjects);
        Subject[] writtenExamSubjects = OptSearcher.findWESubjects(data);
        Subject oralExamSubject = OptSearcher.findOESubject(data);

        for (int i = 0; i < 4; i++) {
            //Select the wESubjects in the first three cases, then the oESubject
            Subject thisSubject = (i < 3) ? writtenExamSubjects[i] : oralExamSubject;

            JComboBox<Subject> thisBox = examComboBoxes.get(i);
            thisBox.setSelectedItem(thisSubject);
            resetBackground(thisBox);
            markInputField[i].setText(String.valueOf(thisSubject.abinote));
        }
    }

    public void assignSubjects(Subject[] subjects) {
        this.subjects = subjects;
        examComboBoxes.get(0).addItem(subjects[0]);  //Deutsch

        for (int i = 1; i < 4; i++) {
            DefaultComboBoxModel<Subject> model = new DefaultComboBoxModel<>(Arrays.copyOfRange(subjects, 1, subjects.length));
            examComboBoxes.get(i).setModel(model);
        }
        //set pre-selected subjects
        examComboBoxes.get(2).setSelectedIndex(1);
        examComboBoxes.get(3).setSelectedIndex(3);
    }

    private void resetBackground(JComboBox source) {
        source.setBackground(defaultComboBoxColor);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Called when an action is performed on a ComboBox
        //See if the selection is correct

            //mark the comboBoxes that have the same selectedIndex
            for (int i = 1; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (examComboBoxes.get(i).getSelectedIndex() == examComboBoxes.get(j).getSelectedIndex()) {
                        wahlfachHighlighter.highlightBox(examComboBoxes.get(i), "Doppelte Auswahl!");
                        wahlfachHighlighter.highlightBox(examComboBoxes.get(j), "Doppelte Auswahl!");
                    }
                }
            }
    }

    public void clearInput() {
        for(int i=0; i<4; i++)  {
            markInputField[i].setText("");
        }
    }

    class OptionUpdater implements ActionListener   {

        @Override
        public void actionPerformed(ActionEvent ae) {
            //Update the options given in the ComboBoxes based on changes made in UserInputPanel
            for (int i = 1; i < 4; i++) {
                DefaultComboBoxModel<Subject> model = new DefaultComboBoxModel<>(Arrays.copyOfRange(subjects, 1, subjects.length));
                //Apply the updated model to the comboBox
                int selectedIndex = examComboBoxes.get(i).getSelectedIndex();
                examComboBoxes.get(i).setModel(model);
                examComboBoxes.get(i).setSelectedIndex(selectedIndex);
            }
            /*Object source = ae.getSource();
             for(int i=1; i<4; i++)   {
             Object selected = examComboBoxes.get(i).getSelectedItem();
             examComboBoxes.get(i).getModel().
             for (int i = 1; i < subjects.length; i++) {
             examComboBoxes.get(i).addItem(subjects[j]);
             }
             }
             */
        }

    }

    public class IllegalChoicesException extends Exception {

        public IllegalChoicesException() {
            super();
        }

        public IllegalChoicesException(String message) {
            super(message);
        }

        public IllegalChoicesException(String message, Throwable cause) {
            super(message, cause);
        }

        public IllegalChoicesException(Throwable cause) {
            super(cause);
        }
    }
}
