/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.poo;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class FAnimal extends javax.swing.JFrame {

    /**
     * Creates new form FPrincipalAnimal
     */
    public FAnimal() {
        initComponents();
        ocultarTela();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        lbTitulo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        rbMacho = new javax.swing.JRadioButton();
        rbFemea = new javax.swing.JRadioButton();
        lbQuantidadePatas = new javax.swing.JLabel();
        edQuantidadePatas = new javax.swing.JTextField();
        lbPeso = new javax.swing.JLabel();
        lbAltura = new javax.swing.JLabel();
        edPeso = new javax.swing.JTextField();
        edAltura = new javax.swing.JTextField();
        lbTemRaiva = new javax.swing.JLabel();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        lbEhCastrado = new javax.swing.JLabel();
        rbSim2 = new javax.swing.JRadioButton();
        rbNao2 = new javax.swing.JRadioButton();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btExibir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTitulo.setText("CADASTRO ANIMAL");

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setText("NOME:");

        lbSexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSexo.setText("SEXO:");

        buttonGroup1.add(rbMacho);
        rbMacho.setSelected(true);
        rbMacho.setText("MACHO");
        rbMacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMachoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFemea);
        rbFemea.setText("FÊMEA");

        lbQuantidadePatas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbQuantidadePatas.setText("QUANTIDADE DE PATAS:");

        lbPeso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPeso.setText("PESO");

        lbAltura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAltura.setText("ALTURA");

        lbTemRaiva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTemRaiva.setText("Tem raiva?");

        buttonGroup2.add(rbSim);
        rbSim.setText("SIM");
        rbSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSimActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbNao);
        rbNao.setSelected(true);
        rbNao.setText("NÃO");

        lbEhCastrado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEhCastrado.setText("É castrado?");

        buttonGroup3.add(rbSim2);
        rbSim2.setText("SIM");
        rbSim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSim2ActionPerformed(evt);
            }
        });

        buttonGroup3.add(rbNao2);
        rbNao2.setSelected(true);
        rbNao2.setText("NÃO");

        btNovo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNovo.setText("NOVO");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExibir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btExibir.setText("EXIBIR");
        btExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbQuantidadePatas)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbNome)
                                        .addComponent(lbSexo)
                                        .addComponent(rbMacho))
                                    .addGap(48, 48, 48)
                                    .addComponent(rbFemea)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPeso)
                                    .addComponent(lbTemRaiva)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbSim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNao))
                                    .addComponent(edPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbSim2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbNao2))
                                    .addComponent(lbEhCastrado)
                                    .addComponent(lbAltura)
                                    .addComponent(edAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(edQuantidadePatas, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(edNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExibir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lbTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(28, 28, 28)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMacho)
                    .addComponent(rbFemea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbQuantidadePatas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edQuantidadePatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPeso)
                    .addComponent(lbAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTemRaiva)
                    .addComponent(lbEhCastrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSim)
                    .addComponent(rbNao)
                    .addComponent(rbSim2)
                    .addComponent(rbNao2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar)
                    .addComponent(btExibir))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSimActionPerformed

    private void rbSim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSim2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSim2ActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
         revelarTela();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        JOptionPane.showMessageDialog(null, "Vamos limpar!");
        edNome.setText(null);
        edPeso.setText(null);
        edAltura.setText(null);
        edQuantidadePatas.setText(null);
        JOptionPane.showMessageDialog(null, "Tá limpo xiru!");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        a1.setNome(edNome.getText());
        a1.setQuantPatas(Integer.parseInt(edQuantidadePatas.getText()));
        a1.setPeso(Double.parseDouble(edPeso.getText()));
        a1.setAltura(Double.parseDouble(edAltura.getText()));
        
        
        if (rbMacho.isSelected()){
        a1.setSexo("Macho");
        } else {
        a1.setSexo("Fêmea");
        }
        if (rbSim.isSelected()){
        a1.setEhCastrado(true);
        } else {
        a1.setEhCastrado(false);
        }
        if (rbSim2.isSelected()){
        a1.setEhCastrado(true);
        } else {
        a1.setEhCastrado(false);
        }
        
        JOptionPane.showMessageDialog(null, a1.toString());
        ocultarTela();
        btExibir.setVisible(true);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void rbMachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMachoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMachoActionPerformed

    private void btExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExibirActionPerformed
         JOptionPane.showMessageDialog(null, a1.toString());
    }//GEN-LAST:event_btExibirActionPerformed
    public void ocultarTela() {
        lbTitulo.setText("Click no batão Novo!");
        lbNome.setVisible(false);
        edNome.setVisible(false);
        lbSexo.setVisible(false);
        rbFemea.setVisible(false);
        rbMacho.setVisible(false);
        lbQuantidadePatas.setVisible(false);
        edQuantidadePatas.setVisible(false);
        lbPeso.setVisible(false);
        edPeso.setVisible(false);
        lbAltura.setVisible(false);
        edAltura.setVisible(false);
        lbTemRaiva.setVisible(false);
        rbSim.setVisible(false);
        rbNao.setVisible(false);
        lbEhCastrado.setVisible(false);
        rbSim2.setVisible(false);
        rbNao2.setVisible(false);
        btSalvar.setVisible(false);
        btLimpar.setVisible(false);
        btNovo.setEnabled(true);
        btExibir.setVisible(false);
    }
    public void revelarTela(){
     lbTitulo.setText("Click no batão Novo!");
        lbNome.setVisible(true);
        edNome.setVisible(true);
        lbSexo.setVisible(true);
        rbFemea.setVisible(true);
        rbMacho.setVisible(true);
        lbQuantidadePatas.setVisible(true);
        edQuantidadePatas.setVisible(true);
        lbPeso.setVisible(true);
        edPeso.setVisible(true);
        lbAltura.setVisible(true);
        edAltura.setVisible(true);
        lbTemRaiva.setVisible(true);
        rbSim.setVisible(true);
        rbNao.setVisible(true);
        lbEhCastrado.setVisible(true);
        rbSim2.setVisible(true);
        rbNao2.setVisible(true);
        btSalvar.setVisible(true);
        btLimpar.setVisible(true);
        btNovo.setEnabled(false);
        btExibir.setVisible(true);
    }
    public void salvar() {

    }
    Animal a1 = new Animal();

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
            java.util.logging.Logger.getLogger(FAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExibir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField edAltura;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edPeso;
    private javax.swing.JTextField edQuantidadePatas;
    private javax.swing.JLabel lbAltura;
    private javax.swing.JLabel lbEhCastrado;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbQuantidadePatas;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTemRaiva;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JRadioButton rbFemea;
    private javax.swing.JRadioButton rbMacho;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbNao2;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JRadioButton rbSim2;
    // End of variables declaration//GEN-END:variables
}