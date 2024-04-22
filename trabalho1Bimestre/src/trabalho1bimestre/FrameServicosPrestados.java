/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho1bimestre;

import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import trabalho1bimestre.controller.Controller;
import trabalho1bimestre.model.ServicoPrestado;

    
public class FrameServicosPrestados extends javax.swing.JFrame {
        private final int precoTrocaOleo = 30;
        private final int precoAlinhamento = 70;
        private final int precoReparoFreios = 180;
        private final int precoTrocaAmortecedores = 300;
        

    public FrameServicosPrestados() {
        initComponents();
       setLocationRelativeTo(this);
        setPreferredSize(new Dimension(900, 750));
        pack();
        setLocationRelativeTo(this);
        
        Controller.listaServicoPrestado = new ArrayList<>();
        
         cbTrocaOleo.addActionListener((java.awt.event.ActionEvent evt) -> {
            registrarServico(cbTrocaOleo, precoTrocaOleo);
        });

        cbAlinhamento.addActionListener((java.awt.event.ActionEvent evt) -> {
            registrarServico(cbAlinhamento, precoAlinhamento);
        });

        cbReparoFreios.addActionListener((java.awt.event.ActionEvent evt) -> {
            registrarServico(cbReparoFreios, precoReparoFreios);
        });

        cbTrocaAmortecedores.addActionListener((java.awt.event.ActionEvent evt) -> {
            registrarServico(cbTrocaAmortecedores, precoTrocaAmortecedores);
        });
    }
   
   private void registrarServico(JCheckBox checkBox, int preco) {
        if (checkBox.isSelected()) {
            ServicoPrestado servicoPrestado = new ServicoPrestado();
            servicoPrestado.setNome(checkBox.getText());
            servicoPrestado.setValorUnitario(preco);
            Controller.listaServicoPrestado.add(servicoPrestado);
        }
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSalvar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        cbTrocaOleo = new javax.swing.JCheckBox();
        cbAlinhamento = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cbReparoFreios = new javax.swing.JCheckBox();
        cbTrocaAmortecedores = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btSalvar.setText("Continuar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btVoltar.setText("Retornar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        cbTrocaOleo.setText("Troca de Óleo e Filtro de Óleo:");
        cbTrocaOleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTrocaOleoActionPerformed(evt);
            }
        });

        cbAlinhamento.setText("Alinhamento e Balanceamento de Rodas:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("SERVIÇOS PRESTADOS:");

        cbReparoFreios.setText("Reparo de Freios:");
        cbReparoFreios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbReparoFreiosActionPerformed(evt);
            }
        });

        cbTrocaAmortecedores.setText("Troca de Amortecedores e Molas:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("30R$");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("70R$");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("180R$");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("300R$");

        jScrollPane1.setToolTipText("");

        jTextPane1.setText("Este serviço envolve a remoção do óleo antigo do motor e a substituição pelo óleo novo adequado, juntamente com a troca do filtro de óleo. É uma manutenção preventiva essencial para manter o motor funcionando suavemente e prolongar sua vida útil.");
        jScrollPane1.setViewportView(jTextPane1);

        jTextPane2.setText("O alinhamento das rodas é o ajuste preciso da suspensão do veículo para garantir que as rodas estejam todas apontando na mesma direção. O balanceamento das rodas compensa quaisquer desequilíbrios de peso nas rodas e pneus, proporcionando uma condução suave e uniforme. Ambos os serviços são essenciais para garantir o desgaste uniforme dos pneus e a estabilidade do veículo.");
        jScrollPane2.setViewportView(jTextPane2);

        jTextPane3.setText("Este serviço abrange a inspeção, manutenção e reparo do sistema de freios do veículo, incluindo pastilhas de freio, discos de freio, tambores, cilindros de roda, fluído de freio e componentes do sistema de freios antibloqueio (ABS). É crucial para garantir a segurança do veículo e dos ocupantes.");
        jScrollPane3.setViewportView(jTextPane3);

        jTextPane4.setText("Os amortecedores e as molas são componentes vitais da suspensão do veículo, proporcionando conforto ao dirigir, estabilidade e controle. A substituição desses componentes desgastados é importante para manter a segurança e o desempenho do veículo. Os preços para a troca de amortecedores e molas variam dependendo do modelo do veículo e da qualidade dos componentes, mas geralmente podem custar entre $200 a $800 ou mais por eixo, incluindo peças e mão de obra.");
        jScrollPane4.setViewportView(jTextPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 354, Short.MAX_VALUE)
                                .addComponent(btSalvar)
                                .addGap(29, 29, 29)
                                .addComponent(btVoltar)
                                .addGap(172, 172, 172))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbAlinhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbReparoFreios)
                                    .addComponent(cbTrocaAmortecedores)
                                    .addComponent(cbTrocaOleo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(cbTrocaOleo)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(cbAlinhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(cbReparoFreios))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSalvar)
                            .addComponent(btVoltar))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(cbTrocaAmortecedores))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel4)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTrocaOleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTrocaOleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTrocaOleoActionPerformed

    private void cbReparoFreiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbReparoFreiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbReparoFreiosActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       for (Component componente : getContentPane().getComponents()) {
        if (componente instanceof JCheckBox) {
            JCheckBox cb = (JCheckBox) componente;
            if (cb.isSelected()) {
                ServicoPrestado servicoPrestado = new ServicoPrestado(); // Criando um novo objeto ServicoPrestado
                switch (cb.getText()) {
                    case "Troca de Óleo e Filtro de Óleo":
                        servicoPrestado.setNome("Troca de Óleo e Filtro de Óleo");
                        servicoPrestado.setValorUnitario(precoTrocaOleo);
                        break;
                    case "Alinhamento e Balanceamento de Rodas":
                        servicoPrestado.setNome("Alinhamento e Balanceamento de Rodas");
                        servicoPrestado.setValorUnitario(precoAlinhamento);
                        break;
                    case "Reparo de Freios":
                        servicoPrestado.setNome("Reparo de Freios");
                        servicoPrestado.setValorUnitario(precoReparoFreios);
                        break;
                    case "Troca de Amortecedores e Molas":
                        servicoPrestado.setNome("Troca de Amortecedores e Molas");
                        servicoPrestado.setValorUnitario(precoTrocaAmortecedores);
                        break;
                    default:
                        break;
                }
                Controller.listaServicoPrestado.add(servicoPrestado);
            }
        }
    }

            JOptionPane.showMessageDialog(this, "Serviços salvos com sucesso!");
            FrameServicoRegistro frameServicoRegistro = new FrameServicoRegistro();
            frameServicoRegistro.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
       FrameTelaGeral frameTelaGeral = new FrameTelaGeral();
       frameTelaGeral.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JCheckBox cbAlinhamento;
    private javax.swing.JCheckBox cbReparoFreios;
    private javax.swing.JCheckBox cbTrocaAmortecedores;
    private javax.swing.JCheckBox cbTrocaOleo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    // End of variables declaration//GEN-END:variables
}
