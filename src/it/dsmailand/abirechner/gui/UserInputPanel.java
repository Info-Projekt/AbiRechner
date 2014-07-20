/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.gui;

import it.dsmailand.abirechner.data.Data;
import it.dsmailand.abirechner.subjects.Subject;
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

        markTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField5ActionPerformed(evt);
            }
        });
        markTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField6ActionPerformed(evt);
            }
        });
        markTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField7ActionPerformed(evt);
            }
        });
        markTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField8ActionPerformed(evt);
            }
        });
        markTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField9ActionPerformed(evt);
            }
        });
        markTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField10ActionPerformed(evt);
            }
        });
        markTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField11ActionPerformed(evt);
            }
        });
        markTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField12ActionPerformed(evt);
            }
        });
        markTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField13ActionPerformed(evt);
            }
        });
        markTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField14ActionPerformed(evt);
            }
        });

        markTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField15ActionPerformed(evt);
            }
        });
        markTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField16ActionPerformed(evt);
            }
        });
        markTextField16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField17ActionPerformed(evt);
            }
        });
        markTextField17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField18ActionPerformed(evt);
            }
        });
        markTextField18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField19ActionPerformed(evt);
            }
        });
        markTextField19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField20ActionPerformed(evt);
            }
        });
        markTextField20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextFieldFocusGained(evt);
            }
        });

        markTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField21ActionPerformed(evt);
            }
        });
        markTextField21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField22ActionPerformed(evt);
            }
        });
        markTextField22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField23ActionPerformed(evt);
            }
        });
        markTextField23.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField24ActionPerformed(evt);
            }
        });
        markTextField24.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField25ActionPerformed(evt);
            }
        });
        markTextField25.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField26ActionPerformed(evt);
            }
        });
        markTextField26.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField27.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField28ActionPerformed(evt);
            }
        });
        markTextField28.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField29ActionPerformed(evt);
            }
        });
        markTextField29.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField30ActionPerformed(evt);
            }
        });
        markTextField30.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField31ActionPerformed(evt);
            }
        });
        markTextField31.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField32ActionPerformed(evt);
            }
        });
        markTextField32.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField33.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField34.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField35ActionPerformed(evt);
            }
        });
        markTextField35.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField36ActionPerformed(evt);
            }
        });
        markTextField36.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField37ActionPerformed(evt);
            }
        });
        markTextField37.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField38ActionPerformed(evt);
            }
        });
        markTextField38.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField39ActionPerformed(evt);
            }
        });
        markTextField39.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField40.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField41ActionPerformed(evt);
            }
        });
        markTextField41.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField42ActionPerformed(evt);
            }
        });
        markTextField42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField43ActionPerformed(evt);
            }
        });
        markTextField43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField44ActionPerformed(evt);
            }
        });
        markTextField44.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField45ActionPerformed(evt);
            }
        });
        markTextField45.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField46ActionPerformed(evt);
            }
        });
        markTextField46.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField47ActionPerformed(evt);
            }
        });
        markTextField47.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField48.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField4ActionPerformed(evt);
            }
        });
        markTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField3ActionPerformed(evt);
            }
        });
        markTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

        markTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextField2ActionPerformed(evt);
            }
        });
        markTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                markTextField14FocusGained(evt);
            }
        });

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
                markTextFieldKeyTyped(evt);
            }
        });

        sMatheLabel.setText("Mathematik");

        sGeschichteLabel.setText("Geschichte");

        sFilosofiaLabel.setText("Filosofia");

        sSportLabel.setText("Sport");

        sWahlfach4ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sWahlfach4ComboBoxActionPerformed(evt);
            }
        });

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

    // <editor-fold defaultstate="collapsed" desc="Useless ActionPerformed code">
    private void markTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField5ActionPerformed

    private void markTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField6ActionPerformed

    private void markTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField7ActionPerformed

    private void markTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField8ActionPerformed

    private void markTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField9ActionPerformed

    private void markTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField10ActionPerformed

    private void markTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField11ActionPerformed

    private void markTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField12ActionPerformed

    private void markTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField13ActionPerformed

    private void markTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField14ActionPerformed

    private void markTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField15ActionPerformed

    private void markTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField16ActionPerformed

    private void markTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField17ActionPerformed

    private void markTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField18ActionPerformed

    private void markTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField19ActionPerformed

    private void markTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField20ActionPerformed

    private void markTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField21ActionPerformed

    private void markTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField22ActionPerformed

    private void markTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField23ActionPerformed

    private void markTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField24ActionPerformed

    private void markTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField25ActionPerformed

    private void markTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField26ActionPerformed

    private void markTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField28ActionPerformed

    private void markTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField29ActionPerformed

    private void markTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField30ActionPerformed

    private void markTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField31ActionPerformed

    private void markTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField32ActionPerformed

    private void markTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField35ActionPerformed

    private void markTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField36ActionPerformed

    private void markTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField37ActionPerformed

    private void markTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField38ActionPerformed

    private void markTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField39ActionPerformed

    private void markTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField41ActionPerformed

    private void markTextField42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField42ActionPerformed

    private void markTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField43ActionPerformed

    private void markTextField44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField44ActionPerformed

    private void markTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField45ActionPerformed

    private void markTextField46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField46ActionPerformed

    private void markTextField47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField47ActionPerformed

    private void markTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField4ActionPerformed

    private void markTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField3ActionPerformed

    private void markTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField2ActionPerformed

    private void markTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_markTextFieldKeyTyped
        //javax.swing.JTextField jt = (javax.swing.JTextField) evt.getSource();
        //System.out.println(jt.getText());
    }//GEN-LAST:event_markTextFieldKeyTyped

    private void markTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField1ActionPerformed

    private void sWahlfach4ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sWahlfach4ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sWahlfach4ComboBoxActionPerformed
    // </editor-fold> 

    private void markTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_markTextField14FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextField14FocusGained

    private void markTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_markTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextFieldFocusGained
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

        //Combobox-Management
        //choiceManagement.setComboBoxes(subjectUI[SubjectNumber.WAHLFACH4].comboBox, subjectUI[SubjectNumber.WAHLFACH3_1].comboBox, subjectUI[SubjectNumber.WAHLFACH3_2].comboBox);
        //choiceManagement.initialize();
        //subjectUI[SubjectNumber.WAHLFACH4].comboBox.addActionListener(choiceManagement.actionPerformed);
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
