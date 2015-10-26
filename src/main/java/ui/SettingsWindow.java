/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author oscar_sgc
 */
public class SettingsWindow extends javax.swing.JFrame {

    /**
     * Creates new form SettingsWindow
     */
    public SettingsWindow() {
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        atmosphereDetailsLabel = new javax.swing.JLabel();
        telescopeDetailsLabel = new javax.swing.JLabel();
        laserDetailsLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        detailsPanel = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        detailsTextPane = new javax.swing.JTextPane();
        actionPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        languageMenu = new javax.swing.JMenu();
        englishMenuItem = new javax.swing.JMenuItem();
        spanishMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UCB LIDAR SIMULATOR");
        setResizable(false);

        configurationsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurations"));
        configurationsPanel.setLayout(new java.awt.BorderLayout());

        jLabel4.setText("Atmosphere");

        jLabel5.setText("Telescope");

        jLabel6.setText("Laser");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(65, 65, 65)
                .addComponent(jLabel6)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)))
        );

        configurationsPanel.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        atmosphereDetailsLabel.setForeground(new java.awt.Color(51, 51, 255));
        atmosphereDetailsLabel.setText("View Details");
        atmosphereDetailsLabel.setToolTipText("Click for Atmosphere details");
        atmosphereDetailsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atmosphereDetailsLabelMouseClicked(evt);
            }
        });

        telescopeDetailsLabel.setForeground(new java.awt.Color(51, 51, 255));
        telescopeDetailsLabel.setText("View Details");
        telescopeDetailsLabel.setToolTipText("Click for Telescope details");
        telescopeDetailsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telescopeDetailsLabelMouseClicked(evt);
            }
        });

        laserDetailsLabel.setForeground(new java.awt.Color(51, 51, 255));
        laserDetailsLabel.setText("View Details");
        laserDetailsLabel.setToolTipText("Click for Laser details");
        laserDetailsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laserDetailsLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(atmosphereDetailsLabel)
                .addGap(61, 61, 61)
                .addComponent(telescopeDetailsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(laserDetailsLabel)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laserDetailsLabel)
                    .addComponent(telescopeDetailsLabel)
                    .addComponent(atmosphereDetailsLabel))
                .addGap(20, 20, 20))
        );

        configurationsPanel.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/atmosphere.png"))); // NOI18N
        jButton1.setToolTipText("Atmosphere");
        jButton1.setPreferredSize(new java.awt.Dimension(60, 60));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/telescope.png"))); // NOI18N
        jButton2.setToolTipText("Telescope");
        jButton2.setPreferredSize(new java.awt.Dimension(60, 60));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/laser.png"))); // NOI18N
        jButton3.setToolTipText("Laser");
        jButton3.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        configurationsPanel.add(jPanel3, java.awt.BorderLayout.CENTER);

        detailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        detailsTextPane.setEditable(false);
        detailsTextPane.setToolTipText("Displays current details from selected component");
        detailsTextPane.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane.setViewportView(detailsTextPane);

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        actionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ui/Bundle"); // NOI18N
        fileMenu.setText(bundle.getString("StartWindow.fileMenu.text")); // NOI18N

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

        languageMenu.setLabel(bundle.getString("StartWindow.languageMenu.label")); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(configurationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
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

    }//GEN-LAST:event_englishMenuItemActionPerformed

    private void spanishMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spanishMenuItemActionPerformed

    }//GEN-LAST:event_spanishMenuItemActionPerformed

    private void laserDetailsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laserDetailsLabelMouseClicked
        this.detailsTextPane.setText("Laser: \n Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n"
            + "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n"
            + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n"
            + "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n"
            + "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n"
            + "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
    }//GEN-LAST:event_laserDetailsLabelMouseClicked

    private void telescopeDetailsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telescopeDetailsLabelMouseClicked
        this.detailsTextPane.setText("Telescopio: \n Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n"
            + "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n"
            + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n"
            + "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n"
            + "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n"
            + "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
    }//GEN-LAST:event_telescopeDetailsLabelMouseClicked

    private void atmosphereDetailsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atmosphereDetailsLabelMouseClicked
        this.detailsTextPane.setText("ATMOSFERA:\nLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n"
            + "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n"
            + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n"
            + "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n"
            + "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n"
            + "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
    }//GEN-LAST:event_atmosphereDetailsLabelMouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
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
              //  new SettingsWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JLabel atmosphereDetailsLabel;
    private javax.swing.JPanel configurationsPanel;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JTextPane detailsTextPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem englishMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JMenu languageMenu;
    private javax.swing.JLabel laserDetailsLabel;
    private javax.swing.JMenuItem spanishMenuItem;
    private javax.swing.JLabel telescopeDetailsLabel;
    // End of variables declaration//GEN-END:variables
}
