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
public class OpticalConfiguration extends javax.swing.JFrame {

    /**
     * Creates new form OpticalConfiguration
     */
    public OpticalConfiguration() {
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

        jPanel1 = new javax.swing.JPanel();
        backjButton = new javax.swing.JButton();
        savejButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        waveLengthLabel = new javax.swing.JLabel();
        beamDivergenceLabel = new javax.swing.JLabel();
        waveLengthComboBox = new javax.swing.JComboBox();
        divergenceTextField = new javax.swing.JTextField();
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

        backjButton.setText("Back");
        backjButton.setToolTipText("Click to back previous window");

        savejButton.setText("Save");

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Laser"));

        waveLengthLabel.setText("Wave Length:");

        beamDivergenceLabel.setText("Beam Divergence:");

        waveLengthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "532 nm", "355 nm" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(beamDivergenceLabel)
                        .addGap(18, 18, 18)
                        .addComponent(divergenceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(waveLengthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(waveLengthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Detector"));

        apdLabel.setText("APD Type:");

        apdSelectionjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "R7400U-03", "R7400P-03", "C30956E", "oldAPD", "Custom..." }));

        multiplicationFactorLabel.setText("Multiplication Factor:");

        xcessNoiseFactorjLabel.setText("Excess noise Factor:");

        surfaceDarkCurrentjLabel.setText("Surface Dark Current:");

        cathodeSensitivityjLabel.setText("Cathode Sensitivity:");

        anodeDarkCurrentjLabel.setText("Anode Dark Current:");

        bulkDarkCurrentjLabel.setText("Bulk Dark Current:");

        transducerGainjLabel.setText("Transducer Gain:");

        preamplifierLimitsjLabel.setText("Pre-Amplifier Limits:");

        currentNoiseDensityjLabel.setText("Current Noise Density:");

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
                                    .addComponent(bulkDarkCurrentjTextField)
                                    .addComponent(transducerGainjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(currentNoiseDensityjLabel)
                                .addGap(23, 23, 23)
                                .addComponent(currentNoiseDensityjTextField))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(multiplicationFactorLabel)
                                    .addComponent(xcessNoiseFactorjLabel)
                                    .addComponent(surfaceDarkCurrentjLabel)
                                    .addComponent(cathodeSensitivityjLabel)
                                    .addComponent(anodeDarkCurrentjLabel)
                                    .addComponent(preamplifierLimitsjLabel))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(anodeDarkCurrentjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(multiplicationFactorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(excessNoiseFactorjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(surfaceDarkCurrentjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cathodeSensitivityTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(preamplifierLimitsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(OpticalConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpticalConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpticalConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpticalConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpticalConfiguration().setVisible(true);
            }
        });
    }

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
