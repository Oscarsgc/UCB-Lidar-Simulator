/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import atmosphere.gui.GraphicsConfiguration;
import atmosphere.gui.GraphicsVisualizer;
import laser.Laser;
import monochromator.Monochromator;
import project.SimulationProject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Locale;

/**
 * @author oscar_sgc
 */
public class SettingsWindow extends javax.swing.JFrame {

    /**
     * Creates new form SettingsWindow
     */
    SimulationProject simulationProject = SimulationProject.getInstance();
    
    public SettingsWindow() {
        SimulationProject simulationProject = SimulationProject.getInstance();
        Locale.setDefault(new Locale(System.getProperty("user.language"), System.getProperty("user.country")));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        configurationsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(60, 0), new java.awt.Dimension(60, 0), new java.awt.Dimension(60, 32767));
        opticalLabel = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(70, 0), new java.awt.Dimension(70, 0), new java.awt.Dimension(70, 32767));
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        atmosphereDetailsLabel = new javax.swing.JLabel();
        opticalDetailsLabel = new javax.swing.JLabel();
        simulationDetailsLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        atmosphereConfigurationButton = new javax.swing.JButton();
        simulationSettingsButton = new javax.swing.JButton();
        opticalSettingsButton = new javax.swing.JButton();
        detailsPanel = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        detailsTextPane = new javax.swing.JTextPane();
        actionPanel = new javax.swing.JPanel();
        viewGraphicsButton = new javax.swing.JButton();
        resultsButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        languageMenu = new javax.swing.JMenu();
        englishMenuItem = new javax.swing.JMenuItem();
        spanishMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("UI/Bundle"); // NOI18N
        setTitle(bundle.getString("SettingsWindow.title")); // NOI18N
        setResizable(false);

        configurationsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("SettingsWindow.configurationsPanel.border.title"))); // NOI18N
        configurationsPanel.setLayout(new java.awt.BorderLayout());

        jLabel4.setText(bundle.getString("SettingsWindow.jLabel4.text")); // NOI18N
        jPanel1.add(jLabel4);
        jPanel1.add(filler2);

        opticalLabel.setText(bundle.getString("SettingsWindow.opticalLabel.text")); // NOI18N
        jPanel1.add(opticalLabel);
        jPanel1.add(filler5);

        jLabel1.setText(bundle.getString("SettingsWindow.jLabel1.text")); // NOI18N
        jPanel1.add(jLabel1);

        configurationsPanel.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(404, 40));
        jPanel2.setLayout(null);

        atmosphereDetailsLabel.setForeground(new java.awt.Color(51, 51, 255));
        atmosphereDetailsLabel.setText(bundle.getString("SettingsWindow.atmosphereDetailsLabel.text")); // NOI18N
        atmosphereDetailsLabel.setToolTipText(bundle.getString("SettingsWindow.atmosphereDetailsLabel.toolTipText")); // NOI18N
        atmosphereDetailsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atmosphereDetailsLabelMouseClicked(evt);
            }
        });
        jPanel2.add(atmosphereDetailsLabel);
        atmosphereDetailsLabel.setBounds(80, 10, 77, 16);

        opticalDetailsLabel.setForeground(new java.awt.Color(51, 51, 255));
        opticalDetailsLabel.setText(bundle.getString("SettingsWindow.opticalDetailsLabel.text")); // NOI18N
        opticalDetailsLabel.setToolTipText(bundle.getString("SettingsWindow.opticalDetailsLabel.toolTipText")); // NOI18N
        opticalDetailsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opticalDetailsLabelMouseClicked(evt);
            }
        });
        jPanel2.add(opticalDetailsLabel);
        opticalDetailsLabel.setBounds(210, 10, 77, 16);

        simulationDetailsLabel.setForeground(new java.awt.Color(51, 51, 255));
        simulationDetailsLabel.setText(bundle.getString("SettingsWindow.simulationDetailsLabel.text")); // NOI18N
        simulationDetailsLabel.setToolTipText(bundle.getString("SettingsWindow.simulationDetailsLabel.toolTipText")); // NOI18N
        simulationDetailsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simulationDetailsLabelMouseClicked(evt);
            }
        });
        jPanel2.add(simulationDetailsLabel);
        simulationDetailsLabel.setBounds(340, 10, 77, 16);

        configurationsPanel.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(null);

        atmosphereConfigurationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/atmosphere.png"))); // NOI18N
        atmosphereConfigurationButton.setToolTipText(bundle.getString("SettingsWindow.atmosphereConfigurationButton.toolTipText")); // NOI18N
        atmosphereConfigurationButton.setPreferredSize(new java.awt.Dimension(60, 60));
        atmosphereConfigurationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atmosphereConfigurationButtonActionPerformed(evt);
            }
        });
        jPanel3.add(atmosphereConfigurationButton);
        atmosphereConfigurationButton.setBounds(90, 10, 60, 60);

        simulationSettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/simulation.png"))); // NOI18N
        simulationSettingsButton.setToolTipText(bundle.getString("SettingsWindow.simulationSettingsButton.toolTipText")); // NOI18N
        simulationSettingsButton.setPreferredSize(new java.awt.Dimension(60, 60));
        simulationSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulationSettingsButtonActionPerformed(evt);
            }
        });
        jPanel3.add(simulationSettingsButton);
        simulationSettingsButton.setBounds(350, 10, 60, 60);

        opticalSettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/laser.png"))); // NOI18N
        opticalSettingsButton.setToolTipText(bundle.getString("SettingsWindow.opticalSettingsButton.toolTipText")); // NOI18N
        opticalSettingsButton.setPreferredSize(new java.awt.Dimension(60, 60));
        opticalSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opticalSettingsButtonActionPerformed(evt);
            }
        });
        jPanel3.add(opticalSettingsButton);
        opticalSettingsButton.setBounds(220, 10, 60, 60);

        configurationsPanel.add(jPanel3, java.awt.BorderLayout.CENTER);

        detailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("SettingsWindow.detailsPanel.border.title"))); // NOI18N
        detailsPanel.setToolTipText(bundle.getString("SettingsWindow.detailsPanel.toolTipText")); // NOI18N

        detailsTextPane.setEditable(false);
        detailsTextPane.setToolTipText(bundle.getString("SettingsWindow.detailsTextPane.toolTipText")); // NOI18N
        detailsTextPane.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane.setViewportView(detailsTextPane);

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        actionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("SettingsWindow.actionPanel.border.title"))); // NOI18N

        viewGraphicsButton.setText(bundle.getString("SettingsWindow.viewGraphicsButton.text")); // NOI18N
        viewGraphicsButton.setToolTipText(bundle.getString("SettingsWindow.viewGraphicsButton.toolTipText")); // NOI18N
        viewGraphicsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGraphicsButtonActionPerformed(evt);
            }
        });

        resultsButton.setText(bundle.getString("SettingsWindow.resultsButton.text")); // NOI18N
        resultsButton.setToolTipText(bundle.getString("SettingsWindow.resultsButton.toolTipText")); // NOI18N

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(viewGraphicsButton)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsButton)
                .addGap(42, 42, 42))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(viewGraphicsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultsButton)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        fileMenu.setText(bundle.getString("StartWindow.fileMenu.text")); // NOI18N

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setText(bundle.getString("SettingsWindow.saveMenuItem.text")); // NOI18N
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenuItem.setText(bundle.getString("SettingsWindow.saveAsMenuItem.text")); // NOI18N
        saveAsMenuItem.setToolTipText(bundle.getString("SettingsWindow.saveAsMenuItem.toolTipText")); // NOI18N
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setText(bundle.getString("StartWindow.exitMenuItem.text")); // NOI18N
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText(bundle.getString("StartWindow.editMenu.text")); // NOI18N

        java.util.ResourceBundle bundle1 = java.util.ResourceBundle.getBundle("ui/Bundle"); // NOI18N
        languageMenu.setLabel(bundle1.getString("StartWindow.languageMenu.label")); // NOI18N

        englishMenuItem.setText(bundle.getString("StartWindow.englishMenuItem.text")); // NOI18N
        englishMenuItem.setToolTipText(bundle.getString("StartWindow.englishMenuItem.toolTipText")); // NOI18N
        englishMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishMenuItemActionPerformed(evt);
            }
        });
        languageMenu.add(englishMenuItem);

        spanishMenuItem.setText(bundle.getString("StartWindow.spanishMenuItem.text")); // NOI18N
        spanishMenuItem.setToolTipText(bundle.getString("StartWindow.spanishMenuItem.toolTipText")); // NOI18N
        spanishMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spanishMenuItemActionPerformed(evt);
            }
        });
        languageMenu.add(spanishMenuItem);

        editMenu.add(languageMenu);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(configurationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configurationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void englishMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishMenuItemActionPerformed
        System.setProperty("user.language", "en");
        System.setProperty("user.country", "US");
        SettingsWindow w = new SettingsWindow();
        w.setVisible(true);
        dispose();
    }//GEN-LAST:event_englishMenuItemActionPerformed

    private void spanishMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spanishMenuItemActionPerformed
        System.setProperty("user.language", "es");
        System.setProperty("user.country", "ES");
        SettingsWindow w = new SettingsWindow();
        
        w.setVisible(true);
        dispose();
    }//GEN-LAST:event_spanishMenuItemActionPerformed

    private void opticalDetailsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opticalDetailsLabelMouseClicked
        Laser laser = this.simulationProject.getSimpleSimulation().getLaser();
        Monochromator monochromator = this.simulationProject.getSimpleSimulation().getMonochromator();
        if (laser != null && monochromator != null) {
            this.detailsTextPane.setText("Optical Details: \n" + "Laser Details: \n" + "Wavelength: " + laser.getEmissionWavelength() + "\n"
                    + "Beam divergence: " + laser.getDivergence() + "\n"
                    + "Laser Energy: " + laser.getEnergy() + "\n"
                    + "-------------------------\n"
                    + "Monochromator Details: \n" + "Type:  " + monochromator.getApdName() + "\n"
                    + "Multiplication factor: " + monochromator.getM() + "\n"
                    + "Excess Noise factor: " + monochromator.getF() + "\n"
                    + "Surface Dark Current: " + monochromator.getIds() + "\n"
                    + "Cathode Sensitivity: " + monochromator.getRio() + "\n"
                    + "Bulk Dark Current: " + monochromator.getIdb() + "\n"
                    + "Overlap Factor: " + monochromator.getOverlapFactor());
        } else {
            this.detailsTextPane.setText("Optical Details: \n" + "Laser Details: \n" + "Wavelength: Not defined\n"
                    + "Beam divergence: Not defined \n"
                    + "Laser Energy: Not defined \n"
                    + "-------------------------\n"
                    + "Monochromator Details: \n" + "Type: Not defined \n"
                    + "Multiplication factor: Not defined \n"
                    + "Excess Noise factor: Not defined \n"
                    + "Surface Dark Current: Not defined \n"
                    + "Cathode Sensitivity: Not defined \n"
                    + "Bulk Dark Current: Not defined \n"
                    + "Overlap Factor: Not defined");
        }

    }//GEN-LAST:event_opticalDetailsLabelMouseClicked

    private void atmosphereDetailsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atmosphereDetailsLabelMouseClicked
        double initialAltitude = 0;
        double finalAltitude = 0;
        ArrayList<String> colors = this.simulationProject.getColorsInString();
        if (simulationProject.getData() != null) {
            initialAltitude = this.simulationProject.getData().get(0).doubleValue();
            finalAltitude = this.simulationProject.getData().get(this.simulationProject.getData().size() - 1).doubleValue();
            
            this.detailsTextPane.setText("Atmosphere Details:\n" + "Initial altitude: " + initialAltitude + "\n" + "Final altitude: " + finalAltitude + "\n"
                    + "Atmosphere graphics details:\n" + "Temperature: " + colors.get(0) + "\n" + "Pressure: " + colors.get(1) + "\n" + "Mie: " + colors.get(2) + "\n"
                    + "Alpha Rayleigh: " + colors.get(3) + "\n" + "Beta Rayleigh: " + colors.get(4) + "\n" + "Atmosphere: " + colors.get(5));
        } else {
            this.detailsTextPane.setText("Atmosphere Details:\n" + "Initial altitude: Not defined\n" + "Final altitude: Not defined\n"
                    + "Atmosphere graphics details:\n" + "Temperature: Not defined\n" + "Pressure: Not defined\n" + "Mie: Not defined\n"
                    + "Alpha Rayleigh: Not defined\n" + "Beta Rayleigh: Not defined\n" + "Atmosphere: Not defined");
        }
    }//GEN-LAST:event_atmosphereDetailsLabelMouseClicked

    private void atmosphereConfigurationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atmosphereConfigurationButtonActionPerformed
        GraphicsConfiguration w;
        w = new GraphicsConfiguration();
        this.dispose();
        w.setVisible(true);
    }//GEN-LAST:event_atmosphereConfigurationButtonActionPerformed

    private void viewGraphicsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGraphicsButtonActionPerformed
        if (this.simulationProject.getData() != null) {
            launch();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Atmosphere Data is empty... please fill data first");
        }
    }//GEN-LAST:event_viewGraphicsButtonActionPerformed
    
    private void launch() {
        
        JDialog calculatingDialog = new JDialog(this, "Computing...", true);
        JProgressBar progressBar = new JProgressBar(0, 30);
        progressBar.setIndeterminate(true);
        calculatingDialog.add(BorderLayout.CENTER, progressBar);
        JPanel panel = new JPanel();
        panel.add(BorderLayout.CENTER, new JLabel("Please wait while the system computes the data..."));
        calculatingDialog.add(BorderLayout.NORTH, panel);
        calculatingDialog.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        calculatingDialog.setSize(400, 100);
        calculatingDialog.setLocationRelativeTo(this);
        
        SwingWorker<Void, Void> sw = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                GraphicsVisualizer graphicsVisualizer;
                graphicsVisualizer = new GraphicsVisualizer();
                graphicsVisualizer.setVisible(true);
                return null;
            }
            
            @Override
            protected void done() {
                calculatingDialog.dispose();
            }
        };
        
        Thread thread = new Thread(new Runnable() {
            public void run() {
                calculatingDialog.setVisible(true);
            }
        });
        sw.execute();
        calculatingDialog.setVisible(true);
    }

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        this.simulationProject.saveProject();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        JFileChooser fileSaver = new JFileChooser();
        fileSaver.setDialogTitle("Select Storing Directory");
        fileSaver.setAcceptAllFileFilterUsed(false);
        if (fileSaver.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            this.simulationProject.setProjectName(fileSaver.getSelectedFile().getName());
            this.simulationProject.setProjectLocation(fileSaver.getCurrentDirectory() + "/");
            this.simulationProject.saveProject();
        } else {
            JOptionPane.showMessageDialog(null, "File not saved, please try again");
        }
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void simulationSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulationSettingsButtonActionPerformed
        CompleteSimulationSettingsWindow w = new CompleteSimulationSettingsWindow();
        this.dispose();
        w.setVisible(true);
    }//GEN-LAST:event_simulationSettingsButtonActionPerformed

    private void opticalSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opticalSettingsButtonActionPerformed
        OpticalConfigurationWindow w = new OpticalConfigurationWindow();
        this.dispose();
        w.setVisible(true);
    }//GEN-LAST:event_opticalSettingsButtonActionPerformed

    private void simulationDetailsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simulationDetailsLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_simulationDetailsLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            System.setProperty("apple.laf.useScreenMenuBar", "true");
            System.setProperty("com.apple.mrj.application.apple.menu.about.name", "WikiTeX");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SettingsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JButton atmosphereConfigurationButton;
    private javax.swing.JLabel atmosphereDetailsLabel;
    private javax.swing.JPanel configurationsPanel;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JTextPane detailsTextPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem englishMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JMenu languageMenu;
    private javax.swing.JLabel opticalDetailsLabel;
    private javax.swing.JLabel opticalLabel;
    private javax.swing.JButton opticalSettingsButton;
    private javax.swing.JButton resultsButton;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel simulationDetailsLabel;
    private javax.swing.JButton simulationSettingsButton;
    private javax.swing.JMenuItem spanishMenuItem;
    private javax.swing.JButton viewGraphicsButton;
    // End of variables declaration//GEN-END:variables
}
