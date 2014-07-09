/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import it.dsmailand.abirechner.data.Data;
import it.dsmailand.abirechner.data.OptSearcher;
import it.dsmailand.abirechner.subjects.Subject;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Luca13
 */
public class ChoicePanel extends javax.swing.JPanel implements FocusListener {

    //private JComboBox<Subject>[] examComboBoxes = new JComboBox<Subject>[4];
    ArrayList<JComboBox<Subject>> examComboBoxes = new ArrayList<>();
    private JTextField[] markInputField = new JTextField[4];
    Color defaultComboBoxColor;

    /**
     * Creates new form ChoicePanel
     */
    public ChoicePanel() {
        initComponents();
        defaultComboBoxColor = jComboBox1.getBackground();
        examComboBoxes.add(0, jComboBox1);
        examComboBoxes.add(1, jComboBox2);
        examComboBoxes.add(2, jComboBox3);
        examComboBoxes.add(3, jComboBox4);

        markInputField[0] = markTextField1;
        markInputField[1] = markTextField2;
        markInputField[2] = markTextField3;
        markInputField[3] = markTextField4;
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 90, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(markTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(markTextField1)
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
            JComboBox thisBox = examComboBoxes.get(i);
            Subject selectedSubject = (Subject) thisBox.getSelectedItem();
            
            resetBackground(thisBox);
            for (int j = 0; j < i; j++) {
                if (examComboBoxes.get(j).getSelectedItem().equals(selectedSubject)) {
                    highlightBoxTemp(examComboBoxes.get(j));
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
        Subject[] writtenExamSubjects = OptSearcher.findWESubjects(data);
        Subject oralExamSubject = OptSearcher.findOESubject(data);

        for (int i = 0; i < 4; i++) {
            //Select the wESubjects in the first three cases, then the oESubject
            Subject thisSubject = (i < 3) ? writtenExamSubjects[i] : oralExamSubject;

            JComboBox thisBox = examComboBoxes.get(i);
            thisBox.setSelectedItem(thisSubject);
            resetBackground(thisBox);
            markInputField[i].setText(String.valueOf(thisSubject.abinote));
        }
    }

    public void assignSubjects(Subject[] subjects) {
        examComboBoxes.get(0).addItem(subjects[0]);  //Deutsch

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < subjects.length; j++) {
                examComboBoxes.get(i).addItem(subjects[j]);
            }
        }
    }

    private void highlightBoxTemp(JComboBox<Subject> box) {
        box.setBackground(Color.RED);
        box.addFocusListener(this);
    }

    public void focusGained(FocusEvent e) {
        JComboBox<Subject> source = (JComboBox<Subject>) e.getSource();
        resetBackground(source);
    }

    public void focusLost(FocusEvent fe) {
    }

    private void resetBackground(JComboBox<Subject> source) {
        source.setBackground(defaultComboBoxColor);
        source.removeFocusListener(this);
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
