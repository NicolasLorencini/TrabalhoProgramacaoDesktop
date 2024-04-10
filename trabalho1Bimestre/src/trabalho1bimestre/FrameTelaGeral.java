/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho1bimestre;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class FrameTelaGeral extends javax.swing.JFrame {
       
    /**
     * Creates new form FrameTelaGeral
     */
    public FrameTelaGeral() {
        initComponents();
        setLocationRelativeTo(this);
       
       
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btIformacoesPessoais = new javax.swing.JButton();
        btInformacoesVeiculo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btSintomasVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btIformacoesPessoais.setText("Informações Pessoais");
        btIformacoesPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIformacoesPessoaisActionPerformed(evt);
            }
        });

        btInformacoesVeiculo.setText("Informações do Veicúlo");
        btInformacoesVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInformacoesVeiculoActionPerformed(evt);
            }
        });

        jButton1.setText("Registro dos Serviços");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btSintomasVeiculo.setText("Serviços Prestados");
        btSintomasVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSintomasVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btIformacoesPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btInformacoesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSintomasVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btIformacoesPessoais)
                .addGap(18, 18, 18)
                .addComponent(btInformacoesVeiculo)
                .addGap(18, 18, 18)
                .addComponent(btSintomasVeiculo)
                .addGap(16, 16, 16)
                .addComponent(jButton1)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIformacoesPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIformacoesPessoaisActionPerformed
       FrameInformacoesPessoais frameInformacoesPessoais = new FrameInformacoesPessoais();
        frameInformacoesPessoais.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btIformacoesPessoaisActionPerformed

    private void btInformacoesVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInformacoesVeiculoActionPerformed
        FrameInformacoesVeiculo frameInformacoesVeiculo = new FrameInformacoesVeiculo();
        frameInformacoesVeiculo.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btInformacoesVeiculoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btSintomasVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSintomasVeiculoActionPerformed
      FrameServicosPrestados frameServicosPrestados = new FrameServicosPrestados();
      frameServicosPrestados.setVisible(true);
      
      this.dispose();
    }//GEN-LAST:event_btSintomasVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(FrameTelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTelaGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIformacoesPessoais;
    private javax.swing.JButton btInformacoesVeiculo;
    private javax.swing.JButton btSintomasVeiculo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
