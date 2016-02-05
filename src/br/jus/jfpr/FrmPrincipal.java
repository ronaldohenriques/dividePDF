/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jus.jfpr;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author rah
 */
public class FrmPrincipal extends javax.swing.JFrame {

    File arquivoPDF = null;
    File dirPDF = null;

    /**
     * Creates new form frmPrincipal
     */
    public FrmPrincipal() {
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

        jFileAchaPDF = new javax.swing.JFileChooser();
        jFileDestPDF = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        txtOrigemPDF = new javax.swing.JTextField();
        btnAchaPDF = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboMB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDestinoPDF = new javax.swing.JTextField();
        btnDestPDF = new javax.swing.JButton();

        jFileAchaPDF.setAcceptAllFileFilterUsed(false);
        jFileAchaPDF.setCurrentDirectory(new java.io.File("c:\\"));
            jFileAchaPDF.setDialogTitle("Selecione o arquivo PDF");
            jFileAchaPDF.setFileFilter(new FileNameExtensionFilter("arquivo PDF","pdf"));

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setIconImage(new ImageIcon("divide.png").getImage());

            jLabel1.setText("Selecione o arquivo que deseja dividir");

            btnAchaPDF.setText("...");
            btnAchaPDF.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAchaPDFActionPerformed(evt);
                }
            });

            btnDividir.setText("Dividir");
            btnDividir.setEnabled(false);
            btnDividir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnDividirActionPerformed(evt);
                }
            });

            btnCancel.setText("Cancelar");
            btnCancel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnCancelActionPerformed(evt);
                }
            });

            jLabel2.setText("tamanho máximo:");

            cboMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "5" }));

            jLabel3.setText("MB");

            jLabel4.setText("Pasta de destino:");

            btnDestPDF.setText("...");
            btnDestPDF.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnDestPDFActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDividir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCancel)
                            .addGap(47, 47, 47))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDestinoPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDestPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtOrigemPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAchaPDF))))
                            .addContainerGap(38, Short.MAX_VALUE))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOrigemPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAchaPDF))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDestinoPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDestPDF))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDividir)
                            .addComponent(btnCancel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addContainerGap(52, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnAchaPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAchaPDFActionPerformed
        // TODO add your handling code here:
        int returnVal = jFileAchaPDF.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            arquivoPDF = jFileAchaPDF.getSelectedFile();
            txtOrigemPDF.setText(arquivoPDF.toString());
            // btnDividir.setEnabled(true);
        }
    }//GEN-LAST:event_btnAchaPDFActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     *
     * @param evt O botão foi clicado
     */
    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        btnDividir.setEnabled(false);
        btnCancel.setEnabled(false); //Se clicou em dividir este só será habilitado, quando o processo terminar
        if (arquivoPDF != null && dirPDF != null) {
            int tamArqSel = 1000000 * Integer.parseInt(cboMB.getSelectedItem().toString()); //Para informar qual será o tamanho máximo do arquivo
            if (arquivoPDF.length() > tamArqSel) { //Só roda se arquivo selecionado fopr maior tamanho selecionado
                String arquivoSaida = null;
                try {
                    arquivoSaida = dirPDF.getCanonicalPath() + "\\" + arquivoPDF.getName(); //Para indicar onde o arquivo será salvo
                } catch (IOException ex) {
                    Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                /*
                Chama a função que efetivamente faz a divisão
                 */
                String arqDividido = Divisor1.dividePDF(arquivoPDF, arquivoSaida, tamArqSel);

                if (arqDividido.equals("ok")) {
                    JOptionPane.showMessageDialog(null, "Divisão efetuada com sucesso");
                    btnDividir.setEnabled(true);    //Só poderá devidir novamente se a divisaõ de certo

                } else {
                    JOptionPane.showMessageDialog(null, arqDividido, "Alerta", JOptionPane.WARNING_MESSAGE);
                }
                btnCancel.setEnabled(true); //Só volta a ser habilutado depois que todos as divisões foram feitas
                txtOrigemPDF.setText("");
                txtDestinoPDF.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "O tamanho do arquivo selecionado é menor que a divisão a ser efetuada", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnDestPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestPDFActionPerformed
        // TODO add your handling code here:
        jFileDestPDF.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jFileDestPDF.setCurrentDirectory(new java.io.File("c:\\"));
        jFileDestPDF.setDialogTitle("Selecione um diretório"); //Mensagem
        jFileDestPDF.setAcceptAllFileFilterUsed(false);
        int returnVal = jFileDestPDF.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            dirPDF = jFileDestPDF.getSelectedFile(); //A princípio pode parecer errado seleciona aquivo, mas arquivo é o subdiretório. Então tá certo
            try {
                txtDestinoPDF.setText(dirPDF.getCanonicalPath()); //O caminho completo
            } catch (IOException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            btnDividir.setEnabled(true);
        }
    }//GEN-LAST:event_btnDestPDFActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAchaPDF;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDestPDF;
    private javax.swing.JButton btnDividir;
    private javax.swing.JComboBox<String> cboMB;
    private javax.swing.JFileChooser jFileAchaPDF;
    private javax.swing.JFileChooser jFileDestPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDestinoPDF;
    private javax.swing.JTextField txtOrigemPDF;
    // End of variables declaration//GEN-END:variables

}