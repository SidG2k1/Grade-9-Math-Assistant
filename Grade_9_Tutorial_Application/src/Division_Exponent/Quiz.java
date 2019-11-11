// By Siddharth Gupta
// July 26, 2017
package Division_Exponent;

/**
 *
 * @author siddharth
 */
public class Quiz extends javax.swing.JFrame {

    /**
     * Creates new form Quiz
     */
    public Quiz() {
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

        btnBeginSG = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaOutQSG = new javax.swing.JTextArea();
        btnBackSG = new javax.swing.JButton();
        lblInfo1SG = new javax.swing.JLabel();
        txtNumSG = new javax.swing.JTextField();
        lblOutCheckSG = new javax.swing.JLabel();
        btnIntroSG = new javax.swing.JButton();
        btnSubmitSG = new javax.swing.JButton();
        lblInfo2SG = new javax.swing.JLabel();
        lblTitleSG = new javax.swing.JLabel();
        txtDenSG = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBeginSG.setText("Begin");
        btnBeginSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeginSGActionPerformed(evt);
            }
        });

        jtaOutQSG.setColumns(20);
        jtaOutQSG.setLineWrap(true);
        jtaOutQSG.setRows(5);
        jScrollPane1.setViewportView(jtaOutQSG);

        btnBackSG.setText("<-- Back");
        btnBackSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSGActionPerformed(evt);
            }
        });

        lblInfo1SG.setText("Numerator:");

        txtNumSG.setText("0");
        txtNumSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSGActionPerformed(evt);
            }
        });

        lblOutCheckSG.setFont(new java.awt.Font("LM Roman Slanted 12", 0, 24)); // NOI18N

        btnIntroSG.setText("Back to Intro");
        btnIntroSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntroSGActionPerformed(evt);
            }
        });

        btnSubmitSG.setText("Submit");
        btnSubmitSG.setEnabled(false);
        btnSubmitSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitSGActionPerformed(evt);
            }
        });

        lblInfo2SG.setText("Denominator:");

        lblTitleSG.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        lblTitleSG.setText("Quiz");

        txtDenSG.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnBackSG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnBeginSG))
                    .addComponent(lblTitleSG))
                .addGap(244, 244, 244))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnIntroSG, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblInfo1SG)
                                    .addGap(2, 2, 2)
                                    .addComponent(txtNumSG, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblInfo2SG)
                                    .addGap(2, 2, 2)
                                    .addComponent(txtDenSG, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(btnSubmitSG))
                                .addComponent(lblOutCheckSG, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleSG)
                    .addComponent(btnBackSG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBeginSG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblInfo2SG)
                        .addComponent(txtDenSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblInfo1SG)
                        .addComponent(txtNumSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSubmitSG)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutCheckSG, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIntroSG)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int intDenSG=(int)Math.ceil(Math.random()*7),intNumSG=(int)Math.ceil(Math.random()*7),intExpSG=(int)Math.ceil(Math.random()*3+1);
    private void btnBeginSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeginSGActionPerformed
        this.jtaOutQSG.setText("You are allowed a paper and pencil. Leave the answer unsimplified.\nQUESTION: What is the numerator and denominator of "+intNumSG+"/"+intDenSG+" to the power of "+intExpSG);//Output
        this.btnSubmitSG.setEnabled(true);
        this.btnBeginSG.setEnabled(false);
        //enables and disables appropriately
    }//GEN-LAST:event_btnBeginSGActionPerformed

    private void btnBackSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSGActionPerformed
        new Info1().setVisible(true);
        //opens prev. JFrame
        this.dispose();
        //closes this JFrame class
    }//GEN-LAST:event_btnBackSGActionPerformed

    private void btnIntroSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntroSGActionPerformed
        new Intro.Introduction().setVisible(true);
        //opens intro JFrame
        this.dispose();
        //closes this JFrame class
    }//GEN-LAST:event_btnIntroSGActionPerformed

    private void btnSubmitSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitSGActionPerformed
        //User inputs:
        int intUNumSG=Integer.parseInt(this.txtNumSG.getText()),intUDenSG=Integer.parseInt(this.txtDenSG.getText());
        if(intUNumSG==(int)Math.pow(intNumSG,intExpSG)&&intUDenSG==(int)Math.pow(intDenSG,intExpSG)){
            //correct
            this.lblOutCheckSG.setText("CONGRATULATIONS! You are correct!");
        }
        else{
            //wrong
            this.lblOutCheckSG.setText("Try Again- Practice makes Perfect!");
        }
    }//GEN-LAST:event_btnSubmitSGActionPerformed

    private void txtNumSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumSGActionPerformed

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
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSG;
    private javax.swing.JButton btnBeginSG;
    private javax.swing.JButton btnIntroSG;
    private javax.swing.JButton btnSubmitSG;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaOutQSG;
    private javax.swing.JLabel lblInfo1SG;
    private javax.swing.JLabel lblInfo2SG;
    private javax.swing.JLabel lblOutCheckSG;
    private javax.swing.JLabel lblTitleSG;
    private javax.swing.JTextField txtDenSG;
    private javax.swing.JTextField txtNumSG;
    // End of variables declaration//GEN-END:variables
}
