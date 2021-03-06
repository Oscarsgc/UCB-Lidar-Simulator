/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gonzalez.lidar.ui;

import org.gonzalez.lidar.laser.Laser;
import org.gonzalez.lidar.monochromator.Monochromator;
import org.gonzalez.lidar.project.SimulationProject;

import javax.swing.JOptionPane;

/**
 * @author oscar_sgc
 */
public class OpticalConfigurationWindow extends javax.swing.JFrame {

    /**
     * Creates new form OpticalConfiguration
     */
    SimulationProject project = SimulationProject.getInstance();
    private Monochromator monochromator;
    private Laser laser;

    public OpticalConfigurationWindow() {
        initComponents();
        setFirstAPD(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backjButton = new javax.swing.JButton();
        savejButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        waveLengthLabel = new javax.swing.JLabel();
        beamDivergenceLabel = new javax.swing.JLabel();
        waveLengthComboBox = new javax.swing.JComboBox();
        divergenceTextField = new javax.swing.JTextField();
        laserEnergyLabel = new javax.swing.JLabel();
        laserEnergyTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        apdLabel = new javax.swing.JLabel();
        apdSelectionjComboBox = new javax.swing.JComboBox();
        multiplicationFactorLabel = new javax.swing.JLabel();
        multiplicationFactorTextField = new javax.swing.JTextField();
        xcessNoiseFactorjLabel = new javax.swing.JLabel();
        excessNoiseFactorjTextField = new javax.swing.JTextField();
        surfaceDarkCurrentjLabel = new javax.swing.JLabel();
        surfaceDarkCurrentjTextField = new javax.swing.JTextField();
        cathodeSensitivityjLabel = new javax.swing.JLabel();
        cathodeSensitivityTextField = new javax.swing.JTextField();
        anodeDarkCurrentjLabel = new javax.swing.JLabel();
        anodeDarkCurrentjTextField = new javax.swing.JTextField();
        bulkDarkCurrentjLabel = new javax.swing.JLabel();
        bulkDarkCurrentjTextField = new javax.swing.JTextField();
        transducerGainjLabel = new javax.swing.JLabel();
        transducerGainjTextField = new javax.swing.JTextField();
        preamplifierLimitsjLabel = new javax.swing.JLabel();
        preamplifierLimitsjTextField = new javax.swing.JTextField();
        currentNoiseDensityjLabel = new javax.swing.JLabel();
        currentNoiseDensityjTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("UI/Bundle"); // NOI18N
        backjButton.setText(bundle.getString("OpticalConfigurationWindow.backjButton.text")); // NOI18N
        backjButton.setToolTipText(bundle.getString("OpticalConfigurationWindow.backjButton.toolTipText")); // NOI18N
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });


        savejButton.setText(bundle.getString("OpticalConfigurationWindow.savejButton.text")); // NOI18N
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(backjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(savejButton)
                                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(backjButton)
                                        .addComponent(savejButton))
                                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);


        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OpticalConfigurationWindow.jPanel2.border.title"))); // NOI18N


        waveLengthLabel.setText(bundle.getString("OpticalConfigurationWindow.waveLengthLabel.text")); // NOI18N


        beamDivergenceLabel.setText(bundle.getString("OpticalConfigurationWindow.beamDivergenceLabel.text")); // NOI18N

        waveLengthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"532 nm", "355 nm"}));
        waveLengthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waveLengthComboBoxActionPerformed(evt);
            }
        });


        laserEnergyLabel.setText(bundle.getString("OpticalConfigurationWindow.laserEnergyLabel.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(waveLengthLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                                .addComponent(waveLengthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(beamDivergenceLabel)
                                                                .addGap(18, 18, 18))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(laserEnergyLabel)
                                                                .addGap(46, 46, 46)))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(laserEnergyTextField)
                                                        .addComponent(divergenceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(waveLengthLabel)
                                        .addComponent(waveLengthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(beamDivergenceLabel)
                                        .addComponent(divergenceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(laserEnergyLabel)
                                        .addComponent(laserEnergyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);


        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OpticalConfigurationWindow.jPanel3.border.title"))); // NOI18N


        apdLabel.setText(bundle.getString("OpticalConfigurationWindow.apdLabel.text")); // NOI18N

        apdSelectionjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"R7400U-03", "R7400P-03", "C30956E", "oldAPD", "Custom..."}));
        apdSelectionjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apdSelectionjComboBoxActionPerformed(evt);
            }
        });


        multiplicationFactorLabel.setText(bundle.getString("OpticalConfigurationWindow.multiplicationFactorLabel.text")); // NOI18N

        multiplicationFactorTextField.setEditable(false);


        xcessNoiseFactorjLabel.setText(bundle.getString("OpticalConfigurationWindow.xcessNoiseFactorjLabel.text")); // NOI18N

        excessNoiseFactorjTextField.setEditable(false);


        surfaceDarkCurrentjLabel.setText(bundle.getString("OpticalConfigurationWindow.surfaceDarkCurrentjLabel.text")); // NOI18N

        surfaceDarkCurrentjTextField.setEditable(false);


        cathodeSensitivityjLabel.setText(bundle.getString("OpticalConfigurationWindow.cathodeSensitivityjLabel.text")); // NOI18N

        cathodeSensitivityTextField.setEditable(false);


        anodeDarkCurrentjLabel.setText(bundle.getString("OpticalConfigurationWindow.anodeDarkCurrentjLabel.text")); // NOI18N

        anodeDarkCurrentjTextField.setEditable(false);


        bulkDarkCurrentjLabel.setText(bundle.getString("OpticalConfigurationWindow.bulkDarkCurrentjLabel.text")); // NOI18N

        bulkDarkCurrentjTextField.setEditable(false);


        transducerGainjLabel.setText(bundle.getString("OpticalConfigurationWindow.transducerGainjLabel.text")); // NOI18N

        transducerGainjTextField.setEditable(false);


        preamplifierLimitsjLabel.setText(bundle.getString("OpticalConfigurationWindow.preamplifierLimitsjLabel.text")); // NOI18N

        preamplifierLimitsjTextField.setEditable(false);


        currentNoiseDensityjLabel.setText(bundle.getString("OpticalConfigurationWindow.currentNoiseDensityjLabel.text")); // NOI18N

        currentNoiseDensityjTextField.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(apdLabel)
                                                .addGap(51, 51, 51)
                                                .addComponent(apdSelectionjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(bulkDarkCurrentjLabel)
                                                                        .addComponent(transducerGainjLabel))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(transducerGainjTextField)
                                                                        .addComponent(bulkDarkCurrentjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(multiplicationFactorLabel)
                                                                        .addComponent(xcessNoiseFactorjLabel)
                                                                        .addComponent(surfaceDarkCurrentjLabel)
                                                                        .addComponent(cathodeSensitivityjLabel)
                                                                        .addComponent(anodeDarkCurrentjLabel)
                                                                        .addComponent(preamplifierLimitsjLabel)
                                                                        .addComponent(currentNoiseDensityjLabel))
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addGap(23, 23, 23)
                                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(anodeDarkCurrentjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                                                                        .addComponent(multiplicationFactorTextField)
                                                                                        .addComponent(excessNoiseFactorjTextField)
                                                                                        .addComponent(surfaceDarkCurrentjTextField)
                                                                                        .addComponent(cathodeSensitivityTextField)))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(currentNoiseDensityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(preamplifierLimitsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(apdLabel)
                                        .addComponent(apdSelectionjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(multiplicationFactorLabel)
                                        .addComponent(multiplicationFactorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(excessNoiseFactorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xcessNoiseFactorjLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(surfaceDarkCurrentjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(surfaceDarkCurrentjLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cathodeSensitivityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cathodeSensitivityjLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(anodeDarkCurrentjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(anodeDarkCurrentjLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(preamplifierLimitsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(preamplifierLimitsjLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(currentNoiseDensityjLabel)
                                        .addComponent(currentNoiseDensityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bulkDarkCurrentjLabel)
                                        .addComponent(bulkDarkCurrentjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(transducerGainjLabel)
                                        .addComponent(transducerGainjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        SettingsWindow w = new SettingsWindow();
        this.dispose();
        w.setVisible(true);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void apdSelectionjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apdSelectionjComboBoxActionPerformed
        int var = this.apdSelectionjComboBox.getSelectedIndex();
        switch (var) {
            case 0:
                disableFields();
                setFirstAPD(this.waveLengthComboBox.getSelectedIndex());
                break;
            case 1:
                disableFields();
                setSecondAPD(this.waveLengthComboBox.getSelectedIndex());
                break;
            case 2:
                disableFields();
                setThirdAPD();
                break;
            case 3:
                disableFields();
                setFourthAPD();
                break;
            case 4:
                enableFields();
                setFifthAPD();
                break;
        }

    }//GEN-LAST:event_apdSelectionjComboBoxActionPerformed

    private void waveLengthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waveLengthComboBoxActionPerformed
        apdSelectionjComboBoxActionPerformed(evt);

    }//GEN-LAST:event_waveLengthComboBoxActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        double aux = 0;
        if (this.divergenceTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please set Beam divergence.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            if (this.laserEnergyTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please set Laser Energy.", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                switch (this.waveLengthComboBox.getSelectedIndex()) {
                    case 0:
                        aux = 532;
                        break;
                    case 1:
                        aux = 355;
                        break;
                }
                this.laser = new Laser();
                this.laser.setDivergence(Double.parseDouble(this.divergenceTextField.getText()));
                this.laser.setEmissionWavelength(aux);
                this.laser.setEnergy(Double.parseDouble(this.laserEnergyTextField.getText()));
                this.project.getSimpleSimulation().setLaser(this.laser);
                if (this.monochromator != null) {
                    this.project.saveProject();
                    JOptionPane.showMessageDialog(null, "Optical Values Established");
                    SettingsWindow w = new SettingsWindow();
                    this.dispose();
                    w.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please set Optical Values.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_savejButtonActionPerformed

    private void setFirstAPD(int wavelenght) {
        double idb, rioAux = 0;
        this.multiplicationFactorTextField.setText("7e5");
        this.excessNoiseFactorjTextField.setText("1.3");
        this.surfaceDarkCurrentjTextField.setText("0");
        switch (wavelenght) {
            case 0:
                this.cathodeSensitivityTextField.setText("30e-3");
                rioAux = 30e-3;
                break;
            case 1:
                this.cathodeSensitivityTextField.setText("55e-3");
                rioAux = 55e-3;
                break;
        }
        this.anodeDarkCurrentjTextField.setText("0.01e-9");
        idb = 0.01e-9 / 7e5;
        this.bulkDarkCurrentjTextField.setText(String.valueOf(idb));
        this.transducerGainjTextField.setText("50");
        this.preamplifierLimitsjTextField.setText("-");
        this.currentNoiseDensityjTextField.setText("-");
        this.monochromator = new Monochromator(7e5, 1.3, 0, rioAux, 0.01e-9, idb, 50, "R7400U-03");
        this.project.getSimpleSimulation().setMonochromator(this.monochromator);
    }

    private void setSecondAPD(int wavelenght) {
        double idb, rioAux = 0;
        this.multiplicationFactorTextField.setText("1e6");
        this.excessNoiseFactorjTextField.setText("1.3");
        this.surfaceDarkCurrentjTextField.setText("0");
        switch (wavelenght) {
            case 0:
                this.cathodeSensitivityTextField.setText("30e-3");
                rioAux = 30e-3;
                break;
            case 1:
                this.cathodeSensitivityTextField.setText("55e-3");
                rioAux = 55e-3;
                break;
        }
        this.anodeDarkCurrentjTextField.setText("0.08e-9");
        idb = 0.08e-9 / 1e6;
        this.bulkDarkCurrentjTextField.setText(String.valueOf(idb));
        this.transducerGainjTextField.setText("50");
        this.preamplifierLimitsjTextField.setText("-");
        this.currentNoiseDensityjTextField.setText("-");
        this.monochromator = new Monochromator(1e6, 1.3, 0, rioAux, 0.08e-9, idb, 50, "R7400P-03");
        this.project.getSimpleSimulation().setMonochromator(this.monochromator);
    }

    private void setThirdAPD() {
        this.multiplicationFactorTextField.setText("100");
        this.excessNoiseFactorjTextField.setText("4");
        this.surfaceDarkCurrentjTextField.setText("7.73e-8");
        this.cathodeSensitivityTextField.setText("340e-3");
        this.anodeDarkCurrentjTextField.setText("-");
        this.bulkDarkCurrentjTextField.setText("1.19e-10");
        this.transducerGainjTextField.setText("-");
        this.preamplifierLimitsjTextField.setText("10e6");
        this.currentNoiseDensityjTextField.setText("7.2e-12");
        this.monochromator = new Monochromator(100, 4, 7.73e-8, 340e-3, 1.19e-10, 10e6, 7.2e-12, 11e3, "C30956E");
        this.project.getSimpleSimulation().setMonochromator(this.monochromator);
    }

    private void setFourthAPD() {
        this.multiplicationFactorTextField.setText("150");
        this.excessNoiseFactorjTextField.setText("4.5");
        this.surfaceDarkCurrentjTextField.setText("7.64e-8");
        this.cathodeSensitivityTextField.setText("240e-3");
        this.anodeDarkCurrentjTextField.setText("-");
        this.bulkDarkCurrentjTextField.setText("3.10e-10");
        this.transducerGainjTextField.setText("-");
        this.preamplifierLimitsjTextField.setText("-");
        this.currentNoiseDensityjTextField.setText("5e-12");
        this.monochromator = new Monochromator(150, 4.5, 7.64e-8, 240e-3, 3.10e-10, 0, 5e-12, 5750 * 20.3, "oldAPD");
        this.project.getSimpleSimulation().setMonochromator(this.monochromator);
    }

    private void setFifthAPD() {
        double multiplicationFactor = Double.parseDouble(this.multiplicationFactorTextField.getText());
        double excessNoiseFactor = Double.parseDouble(this.excessNoiseFactorjTextField.getText());
        double surfaceDarkCurrent = Double.parseDouble(this.surfaceDarkCurrentjTextField.getText());
        double cathodeSensitivity = Double.parseDouble(this.cathodeSensitivityTextField.getText());
        double anodeDarkCurrent = Double.parseDouble(this.anodeDarkCurrentjTextField.getText());
        double bulkDarkCurrent = Double.parseDouble(this.bulkDarkCurrentjTextField.getText());
        double transducerGain = Double.parseDouble(this.transducerGainjTextField.getText());
        double preamplifierLimits = Double.parseDouble(this.preamplifierLimitsjTextField.getText());
        double currentNoiseDensity = Double.parseDouble(this.currentNoiseDensityjTextField.getText());
        this.monochromator = new Monochromator(multiplicationFactor, excessNoiseFactor, surfaceDarkCurrent, cathodeSensitivity, anodeDarkCurrent, bulkDarkCurrent, transducerGain, preamplifierLimits, currentNoiseDensity, "Custom");
        this.project.getSimpleSimulation().setMonochromator(this.monochromator);
    }

    private void disableFields() {
        this.multiplicationFactorTextField.setEditable(false);
        this.excessNoiseFactorjTextField.setEditable(false);
        this.surfaceDarkCurrentjTextField.setEditable(false);
        this.cathodeSensitivityTextField.setEditable(false);
        this.anodeDarkCurrentjTextField.setEditable(false);
        this.preamplifierLimitsjTextField.setEditable(false);
        this.currentNoiseDensityjTextField.setEditable(false);
        this.bulkDarkCurrentjTextField.setEditable(false);
        this.transducerGainjTextField.setEditable(false);
    }

    private void enableFields() {
        this.multiplicationFactorTextField.setEditable(true);
        this.excessNoiseFactorjTextField.setEditable(true);
        this.surfaceDarkCurrentjTextField.setEditable(true);
        this.cathodeSensitivityTextField.setEditable(true);
        this.anodeDarkCurrentjTextField.setEditable(true);
        this.preamplifierLimitsjTextField.setEditable(true);
        this.currentNoiseDensityjTextField.setEditable(true);
        this.bulkDarkCurrentjTextField.setEditable(true);
        this.transducerGainjTextField.setEditable(true);
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            System.setProperty("apple.laf.useScreenMenuBar", "true");
//            System.setProperty("com.apple.mrj.application.apple.menu.about.name", "WikiTeX");
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(OpticalConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(OpticalConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(OpticalConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(OpticalConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new OpticalConfigurationWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anodeDarkCurrentjLabel;
    private javax.swing.JTextField anodeDarkCurrentjTextField;
    private javax.swing.JLabel apdLabel;
    private javax.swing.JComboBox apdSelectionjComboBox;
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel beamDivergenceLabel;
    private javax.swing.JLabel bulkDarkCurrentjLabel;
    private javax.swing.JTextField bulkDarkCurrentjTextField;
    private javax.swing.JTextField cathodeSensitivityTextField;
    private javax.swing.JLabel cathodeSensitivityjLabel;
    private javax.swing.JLabel currentNoiseDensityjLabel;
    private javax.swing.JTextField currentNoiseDensityjTextField;
    private javax.swing.JTextField divergenceTextField;
    private javax.swing.JTextField excessNoiseFactorjTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel laserEnergyLabel;
    private javax.swing.JTextField laserEnergyTextField;
    private javax.swing.JLabel multiplicationFactorLabel;
    private javax.swing.JTextField multiplicationFactorTextField;
    private javax.swing.JLabel preamplifierLimitsjLabel;
    private javax.swing.JTextField preamplifierLimitsjTextField;
    private javax.swing.JButton savejButton;
    private javax.swing.JLabel surfaceDarkCurrentjLabel;
    private javax.swing.JTextField surfaceDarkCurrentjTextField;
    private javax.swing.JLabel transducerGainjLabel;
    private javax.swing.JTextField transducerGainjTextField;
    private javax.swing.JComboBox waveLengthComboBox;
    private javax.swing.JLabel waveLengthLabel;
    private javax.swing.JLabel xcessNoiseFactorjLabel;
    // End of variables declaration//GEN-END:variables

}
