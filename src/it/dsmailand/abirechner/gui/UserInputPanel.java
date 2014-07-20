/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import it.dsmailand.abirechner.subjects.SubjectNumber;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JComboBox;

/**
 *
 * @author Carl
 */
public class UserInputPanel extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form UserInputPanel
     */
    public UserInputPanel() {
        this.subjectUI = new SubjectUI[12];
        for (int i = 0; i < subjectUI.length; i++) {
            subjectUI[i] = new SubjectUI(i);
        }
        initComponents();
        addReferences();
        this.wahlfachHighlighter = new WahlfachHighlighter(sWahlfach3_1ComboBox, sWahlfach3_2ComboBox, sWahlfach4ComboBox);
    }
    public SubjectUI[] subjectUI;
    WahlfachHighlighter wahlfachHighlighter;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sDeutschLabel = new javax.swing.JLabel();
        semesterLabel0 = new javax.swing.JLabel();
        semesterLabel1 = new javax.swing.JLabel();
        semesterLabel2 = new javax.swing.JLabel();
        semesterLabel3 = new javax.swing.JLabel();
        sItaLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        markTextField5 = new javax.swing.JTextField();
        markTextField6 = new javax.swing.JTextField();
        markTextField7 = new javax.swing.JTextField();
        markTextField8 = new javax.swing.JTextField();
        markTextField9 = new javax.swing.JTextField();
        markTextField10 = new javax.swing.JTextField();
        markTextField11 = new javax.swing.JTextField();
        markTextField12 = new javax.swing.JTextField();
        markTextField13 = new javax.swing.JTextField();
        markTextField14 = new javax.swing.JTextField();
        markTextField15 = new javax.swing.JTextField();
        markTextField16 = new javax.swing.JTextField();
        markTextField17 = new javax.swing.JTextField();
        markTextField18 = new javax.swing.JTextField();
        markTextField19 = new javax.swing.JTextField();
        markTextField20 = new javax.swing.JTextField();
        markTextField21 = new javax.swing.JTextField();
        markTextField22 = new javax.swing.JTextField();
        markTextField23 = new javax.swing.JTextField();
        markTextField24 = new javax.swing.JTextField();
        markTextField25 = new javax.swing.JTextField();
        markTextField26 = new javax.swing.JTextField();
        markTextField27 = new javax.swing.JTextField();
        markTextField28 = new javax.swing.JTextField();
        markTextField29 = new javax.swing.JTextField();
        markTextField30 = new javax.swing.JTextField();
        markTextField31 = new javax.swing.JTextField();
        markTextField32 = new javax.swing.JTextField();
        markTextField33 = new javax.swing.JTextField();
        markTextField34 = new javax.swing.JTextField();
        markTextField35 = new javax.swing.JTextField();
        markTextField36 = new javax.swing.JTextField();
        markTextField37 = new javax.swing.JTextField();
        markTextField38 = new javax.swing.JTextField();
        markTextField39 = new javax.swing.JTextField();
        markTextField40 = new javax.swing.JTextField();
        markTextField41 = new javax.swing.JTextField();
        markTextField42 = new javax.swing.JTextField();
        markTextField43 = new javax.swing.JTextField();
        markTextField44 = new javax.swing.JTextField();
        markTextField45 = new javax.swing.JTextField();
        markTextField46 = new javax.swing.JTextField();
        markTextField47 = new javax.swing.JTextField();
        markTextField48 = new javax.swing.JTextField();
        markTextField4 = new javax.swing.JTextField();
        markTextField3 = new javax.swing.JTextField();
        markTextField2 = new javax.swing.JTextField();
        markTextField1 = new javax.swing.JTextField();
        sMatheLabel = new javax.swing.JLabel();
        sGeschichteLabel = new javax.swing.JLabel();
        sFilosofiaLabel = new javax.swing.JLabel();
        sSportLabel = new javax.swing.JLabel();
        sKunstMusikComboBox = new javax.swing.JComboBox<String>();
        sPoWiComboBox = new javax.swing.JComboBox<String>();
        sReligionEthikComboBox = new javax.swing.JComboBox<String>();
        sWahlfach4ComboBox = new javax.swing.JComboBox<String>();
        sWahlfach3_1ComboBox = new javax.swing.JComboBox<String>();
        sWahlfach3_2ComboBox = new javax.swing.JComboBox<String>();

        sDeutschLabel.setText("Deutsch");

        semesterLabel0.setText("12.1");

        semesterLabel1.setText("12.2");

        semesterLabel2.setText("13.1");

        semesterLabel3.setText("13.2");

        sItaLabel.setText("Italienisch");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        sMatheLabel.setText("Mathematik");

        sGeschichteLabel.setText("Geschichte");

        sFilosofiaLabel.setText("Filosofia");

        sSportLabel.setText("Sport");

<<<<<<< HEAD
        sWahlfach4ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sWahlfach4ComboBoxActionPerformed(evt);
            }
        });
=======
        sKunstMusikComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kunst", "Musik" }));

        sPoWiComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PoWi bilingual", "PoWi deutsch" }));

        sReligionEthikComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Religion", "Ethik" }));

        sWahlfach4ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Platzhalter" }));
>>>>>>> origin/master

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sDeutschLabel)
                    .addComponent(sItaLabel)
                    .addComponent(sMatheLabel)
                    .addComponent(sGeschichteLabel)
                    .addComponent(sFilosofiaLabel)
                    .addComponent(sSportLabel)
                    .addComponent(sKunstMusikComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sPoWiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sReligionEthikComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sWahlfach4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sWahlfach3_1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sWahlfach3_2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(markTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(markTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semesterLabel0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(markTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semesterLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(markTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semesterLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semesterLabel3)
                            .addComponent(markTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(semesterLabel0)
                            .addComponent(semesterLabel1)
                            .addComponent(semesterLabel2)
                            .addComponent(semesterLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sDeutschLabel)
                            .addComponent(markTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(markTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sItaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(markTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sMatheLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sGeschichteLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(markTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(markTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(markTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(markTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(markTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(markTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(markTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(sFilosofiaLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sSportLabel)
                    .addComponent(markTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(markTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sKunstMusikComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sPoWiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(markTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sReligionEthikComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(markTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sWahlfach4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(markTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sWahlfach3_1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(markTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sWahlfach3_2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    javax.swing.JTextField markTextField1;
    javax.swing.JTextField markTextField10;
    javax.swing.JTextField markTextField11;
    javax.swing.JTextField markTextField12;
    javax.swing.JTextField markTextField13;
    javax.swing.JTextField markTextField14;
    javax.swing.JTextField markTextField15;
    javax.swing.JTextField markTextField16;
    javax.swing.JTextField markTextField17;
    javax.swing.JTextField markTextField18;
    javax.swing.JTextField markTextField19;
    javax.swing.JTextField markTextField2;
    javax.swing.JTextField markTextField20;
    javax.swing.JTextField markTextField21;
    javax.swing.JTextField markTextField22;
    javax.swing.JTextField markTextField23;
    javax.swing.JTextField markTextField24;
    javax.swing.JTextField markTextField25;
    javax.swing.JTextField markTextField26;
    javax.swing.JTextField markTextField27;
    javax.swing.JTextField markTextField28;
    javax.swing.JTextField markTextField29;
    javax.swing.JTextField markTextField3;
    javax.swing.JTextField markTextField30;
    javax.swing.JTextField markTextField31;
    javax.swing.JTextField markTextField32;
    javax.swing.JTextField markTextField33;
    javax.swing.JTextField markTextField34;
    javax.swing.JTextField markTextField35;
    javax.swing.JTextField markTextField36;
    javax.swing.JTextField markTextField37;
    javax.swing.JTextField markTextField38;
    javax.swing.JTextField markTextField39;
    javax.swing.JTextField markTextField4;
    javax.swing.JTextField markTextField40;
    javax.swing.JTextField markTextField41;
    javax.swing.JTextField markTextField42;
    javax.swing.JTextField markTextField43;
    javax.swing.JTextField markTextField44;
    javax.swing.JTextField markTextField45;
    javax.swing.JTextField markTextField46;
    javax.swing.JTextField markTextField47;
    javax.swing.JTextField markTextField48;
    javax.swing.JTextField markTextField5;
    javax.swing.JTextField markTextField6;
    javax.swing.JTextField markTextField7;
    javax.swing.JTextField markTextField8;
    javax.swing.JTextField markTextField9;
    private javax.swing.JLabel sDeutschLabel;
    private javax.swing.JLabel sFilosofiaLabel;
    private javax.swing.JLabel sGeschichteLabel;
    private javax.swing.JLabel sItaLabel;
    private javax.swing.JComboBox<String> sKunstMusikComboBox;
    private javax.swing.JLabel sMatheLabel;
    private javax.swing.JComboBox<String> sPoWiComboBox;
    private javax.swing.JComboBox<String> sReligionEthikComboBox;
    private javax.swing.JLabel sSportLabel;
    private javax.swing.JComboBox<String> sWahlfach3_1ComboBox;
    private javax.swing.JComboBox<String> sWahlfach3_2ComboBox;
    private javax.swing.JComboBox<String> sWahlfach4ComboBox;
    private javax.swing.JLabel semesterLabel0;
    private javax.swing.JLabel semesterLabel1;
    private javax.swing.JLabel semesterLabel2;
    private javax.swing.JLabel semesterLabel3;
    // End of variables declaration//GEN-END:variables

    private void addReferences() {
        //DEUTSCH
        subjectUI[SubjectNumber.DEUTSCH].setSemesterTextFields(markTextField1, markTextField2, markTextField3, markTextField4);
        subjectUI[SubjectNumber.DEUTSCH].setDisplayNameLabel(sDeutschLabel);
        //ITA
        subjectUI[SubjectNumber.ITA].setSemesterTextFields(markTextField8, markTextField7, markTextField6, markTextField5);
        subjectUI[SubjectNumber.ITA].setDisplayNameLabel(sItaLabel);
        //MATHE
        subjectUI[SubjectNumber.MATHE].setSemesterTextFields(markTextField12, markTextField11, markTextField10, markTextField9);
        subjectUI[SubjectNumber.MATHE].setDisplayNameLabel(sMatheLabel);
        //GESCHI
        subjectUI[SubjectNumber.GESCHICHTE].setSemesterTextFields(markTextField16, markTextField15, markTextField14, markTextField13);
        subjectUI[SubjectNumber.GESCHICHTE].setDisplayNameLabel(sGeschichteLabel);
        //FILOSOFIA
        subjectUI[SubjectNumber.FILOSOFIA].setSemesterTextFields(markTextField20, markTextField19, markTextField18, markTextField17);
        subjectUI[SubjectNumber.FILOSOFIA].setDisplayNameLabel(sFilosofiaLabel);
        //SPORT
        subjectUI[SubjectNumber.SPORT].setSemesterTextFields(markTextField24, markTextField23, markTextField22, markTextField21);
        subjectUI[SubjectNumber.SPORT].setDisplayNameLabel(sSportLabel);
        //KU/MU
        subjectUI[SubjectNumber.KUNST_MUSIK].setSemesterTextFields(markTextField28, markTextField27, markTextField26, markTextField25);
        subjectUI[SubjectNumber.KUNST_MUSIK].setComboBox(sKunstMusikComboBox);
        //POWI
        subjectUI[SubjectNumber.PO_WI].setSemesterTextFields(markTextField32, markTextField31, markTextField30, markTextField29);
        subjectUI[SubjectNumber.PO_WI].setComboBox(sPoWiComboBox);
        //RELIGION/ETHIK
        subjectUI[SubjectNumber.RELIGION_ETHIK].setSemesterTextFields(markTextField36, markTextField35, markTextField34, markTextField33);
        subjectUI[SubjectNumber.RELIGION_ETHIK].setComboBox(sReligionEthikComboBox);
        //Wahlfach4
        subjectUI[SubjectNumber.WAHLFACH4].setSemesterTextFields(markTextField40, markTextField39, markTextField38, markTextField37);
        subjectUI[SubjectNumber.WAHLFACH4].setComboBox(sWahlfach4ComboBox);
        //Wahlfach3
        subjectUI[SubjectNumber.WAHLFACH3_1].setSemesterTextFields(markTextField44, markTextField43, markTextField42, markTextField41);
        subjectUI[SubjectNumber.WAHLFACH3_1].setComboBox(sWahlfach3_1ComboBox);
        //Wahlfach3
        subjectUI[SubjectNumber.WAHLFACH3_2].setSemesterTextFields(markTextField48, markTextField47, markTextField46, markTextField45);
        subjectUI[SubjectNumber.WAHLFACH3_2].setComboBox(sWahlfach3_2ComboBox);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //If a choiceSubject comboBox has been changed
        if (ae.getSource() instanceof SubjectUI) {

            //See if the selection is correct
            int[] selectedIndices = new int[3];
            int fLang = 0;
            int natSci = 0;
            for (int i = SubjectNumber.WAHLFACH4; i < subjectUI.length; i++) {
                int j = i - SubjectNumber.WAHLFACH4;
                selectedIndices[j] = subjectUI[i].comboBox.getSelectedIndex();
                if (selectedIndices[j] < 3) {
                    fLang++;
                } else {
                    natSci++;
                }
            }
            //mark the comboBoxes that have the same selectedIndex
            for (int i = 0; i < 2; i++) {
                for (int j = i + 1; j < 3; j++) {
                    if (selectedIndices[i] == selectedIndices[j]) {
                        wahlfachHighlighter.highlightBox(subjectUI[i + 9].comboBox, "Doppelte Auswahl!");
                        wahlfachHighlighter.highlightBox(subjectUI[j + 9].comboBox, "Doppelte Auswahl!");
                    }
                }
            }
            if(fLang==0||natSci==0)
                for (int i = SubjectNumber.WAHLFACH4; i < subjectUI.length; i++) {
                        wahlfachHighlighter.highlightBox(subjectUI[i].comboBox, "Keine " + (fLang==0 ? "Fremdsprache":"Naturwissenschaft") + " ausgewählt");
                }
        }
    }
    
    private class WahlfachHighlighter  {
        private final JComboBox box0;
        private final JComboBox box1;
        private final JComboBox box2;
        private final Color originalColor;
        
        WahlfachHighlighter(JComboBox box0, JComboBox box1, JComboBox box2)   {
            this.box0 = box0;
            this.box1 = box1;
            this.box2 = box2;
            originalColor = box0.getForeground();
        }
        
        void highlightBox(final JComboBox box, String toolTipText) {

        box.setForeground(Color.RED);
        box.setToolTipText(toolTipText);
        
        box.addFocusListener(new FocusListener()    {
            @Override
            public void focusGained(FocusEvent fe) {
                box0.setForeground(originalColor);
                box0.setToolTipText(null);
                box1.setForeground(originalColor);
                box1.setToolTipText(null);
                box2.setForeground(originalColor);
                box2.setToolTipText(null);
             box.removeFocusListener(this);
            }
            @Override
            public void focusLost(FocusEvent fe) {}
        }   );

    }
    }
}
