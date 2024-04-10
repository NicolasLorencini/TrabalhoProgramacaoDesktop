/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho1bimestre;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import trabalho1bimestre.controller.Controller;

/**
 *
 * @author aluno
 */
public class FrameServicoRegistro extends javax.swing.JFrame {
    
    
    
    private final double precoBateria = 300;
    private final double precoJuntasMotor = 150; 
    private final double precoBombaAgua = 130; 
    private final double precoTermostato = 60;
    private final double precoFluidoTransmissao = 120; 
    
    private double totalPagar = 0; 
    
    public FrameServicoRegistro() {
       initComponents();
       
       Controller.listaPecas = new ArrayList<>();
        
       spBateria.setEnabled(cbBateria.isSelected());
       spJuntasMotor.setEnabled(cbJuntasMotor.isSelected());
       spBombaAgua.setEnabled(cbBombaAgua.isSelected());
       spTermostato.setEnabled(cbTermostato.isSelected());
       spFluidoTransimissao.setEnabled(cbFluidoTransmissao.isSelected());
       
       
        
        configSpinner(spBateria, precoBateria);
        configSpinner(spJuntasMotor, precoJuntasMotor);
        configSpinner(spBombaAgua, precoBombaAgua);
        configSpinner(spTermostato, precoTermostato);
        configSpinner(spFluidoTransimissao, precoFluidoTransmissao);
       
        cbBateria.addActionListener((ActionEvent evt) -> {
            spBateria.setEnabled(cbBateria.isSelected());
            spBateria.repaint();
            
             spBateria.setEnabled(cbBateria.isSelected());
        if (!cbBateria.isSelected()) {
            spBateria.setValue(0);
        }
       });
                 
    cbJuntasMotor.addActionListener((ActionEvent evt) -> {
        spJuntasMotor.setEnabled(cbJuntasMotor.isSelected());
        spJuntasMotor.repaint();
        
         spJuntasMotor.setEnabled(cbJuntasMotor.isSelected());
        if (!cbJuntasMotor.isSelected()) {
            spJuntasMotor.setValue(0);
        }
       });

 
    cbBombaAgua.addActionListener((ActionEvent evt) -> {
        spBombaAgua.setEnabled(cbBombaAgua.isSelected());
        spBombaAgua.repaint();
        
         spBombaAgua.setEnabled(cbBombaAgua.isSelected());
        if (!cbBombaAgua.isSelected()) {
            spBombaAgua.setValue(0);
        }
       });

    
    cbTermostato.addActionListener((ActionEvent evt) -> {
        spTermostato.setEnabled(cbTermostato.isSelected());
        spTermostato.repaint();
        
        spTermostato.setEnabled(cbTermostato.isSelected());
        if (!cbTermostato.isSelected()) {
            spTermostato.setValue(0);
        }
       });

    
    cbFluidoTransmissao.addActionListener((ActionEvent evt) -> {
        spFluidoTransimissao.setEnabled(cbFluidoTransmissao.isSelected());
        spFluidoTransimissao.repaint();
        
        spFluidoTransimissao.setEnabled(cbFluidoTransmissao.isSelected());
        if (!cbFluidoTransmissao.isSelected()) {
            spFluidoTransimissao.setValue(0);
        }
       });
     
    }
    
    private void configSpinner(JSpinner spinner, double preco) {
       SpinnerNumberModel model = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1); 
        spinner.setModel(model);
        spinner.setPreferredSize(new Dimension(100, spinner.getPreferredSize().height));
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) spinner.getEditor();
        editor.getTextField().setEditable(false);
        
        
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                
                calcularTotalPagar();
            }
        });
    }
    
    private void calcularTotalPagar() {
       
        totalPagar = (Integer) spBateria.getValue() * precoBateria +
                     (Integer) spJuntasMotor.getValue() * precoJuntasMotor +
                     (Integer) spBombaAgua.getValue() * precoBombaAgua +
                     (Integer) spTermostato.getValue() * precoTermostato +
                     (Integer) spFluidoTransimissao.getValue() * precoFluidoTransmissao;
        
        
        tfTotalPagar.setText(String.format("%.2f R$", totalPagar, " R$"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spBateria = new javax.swing.JSpinner();
        cbBateria = new javax.swing.JCheckBox();
        cbJuntasMotor = new javax.swing.JCheckBox();
        cbBombaAgua = new javax.swing.JCheckBox();
        cbTermostato = new javax.swing.JCheckBox();
        cbFluidoTransmissao = new javax.swing.JCheckBox();
        spJuntasMotor = new javax.swing.JSpinner();
        spBombaAgua = new javax.swing.JSpinner();
        spTermostato = new javax.swing.JSpinner();
        spFluidoTransimissao = new javax.swing.JSpinner();
        tfTotalPagar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spBateria.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        cbBateria.setText("Bateria");
        cbBateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBateriaActionPerformed(evt);
            }
        });

        cbJuntasMotor.setText("Juntas do Motor");
        cbJuntasMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJuntasMotorActionPerformed(evt);
            }
        });

        cbBombaAgua.setText("Bomba da água");
        cbBombaAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBombaAguaActionPerformed(evt);
            }
        });

        cbTermostato.setText("Termostato");
        cbTermostato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTermostatoActionPerformed(evt);
            }
        });

        cbFluidoTransmissao.setText("Fluído de Trasnimissão");
        cbFluidoTransmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFluidoTransmissaoActionPerformed(evt);
            }
        });

        spJuntasMotor.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spBombaAgua.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spTermostato.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spFluidoTransimissao.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel1.setText("Preço: 150 R$");

        jLabel2.setText("VALOR TOTAL");

        jLabel3.setText("Preço: 300 R$");

        jLabel4.setText("Preço: 130 R$");

        jLabel5.setText("Preço: 60 R$");

        jLabel6.setText("Preço: 120 R$");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jButton2.setText("Retornar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbFluidoTransmissao)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spFluidoTransimissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbJuntasMotor)
                                    .addComponent(cbBombaAgua)
                                    .addComponent(cbTermostato)
                                    .addComponent(cbBateria))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(spTermostato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spBombaAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spJuntasMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBateria)
                    .addComponent(spBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJuntasMotor)
                    .addComponent(spJuntasMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBombaAgua)
                    .addComponent(spBombaAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTermostato)
                    .addComponent(spTermostato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFluidoTransmissao)
                    .addComponent(spFluidoTransimissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(jButton2))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFluidoTransmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFluidoTransmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFluidoTransmissaoActionPerformed

    private void cbTermostatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTermostatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTermostatoActionPerformed

    private void cbBombaAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBombaAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBombaAguaActionPerformed

    private void cbJuntasMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJuntasMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJuntasMotorActionPerformed

    private void cbBateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBateriaActionPerformed
       
    }//GEN-LAST:event_cbBateriaActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameServicoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameServicoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameServicoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameServicoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox cbBateria;
    private javax.swing.JCheckBox cbBombaAgua;
    private javax.swing.JCheckBox cbFluidoTransmissao;
    private javax.swing.JCheckBox cbJuntasMotor;
    private javax.swing.JCheckBox cbTermostato;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner spBateria;
    private javax.swing.JSpinner spBombaAgua;
    private javax.swing.JSpinner spFluidoTransimissao;
    private javax.swing.JSpinner spJuntasMotor;
    private javax.swing.JSpinner spTermostato;
    private javax.swing.JTextField tfTotalPagar;
    // End of variables declaration//GEN-END:variables
}
