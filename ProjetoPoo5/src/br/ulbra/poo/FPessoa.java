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
public class FPessoa extends javax.swing.JFrame {

    /**
     * Creates new form FPrincipal
     */
    public FPessoa() {
        initComponents();
        ocultarTela ();
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
        lbTitulo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        lbIdade = new javax.swing.JLabel();
        edIdade = new javax.swing.JTextField();
        lbPeso = new javax.swing.JLabel();
        edPeso = new javax.swing.JTextField();
        lbCasado = new javax.swing.JLabel();
        rdSim = new javax.swing.JRadioButton();
        rdNao = new javax.swing.JRadioButton();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btExibir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbTitulo.setBackground(new java.awt.Color(204, 204, 255));
        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTitulo.setText("CADASTRO DE PESSOAS");

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNome.setText("NOME:");

        edNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNomeActionPerformed(evt);
            }
        });

        lbIdade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbIdade.setText("IDADE:");

        edIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edIdadeActionPerformed(evt);
            }
        });

        lbPeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPeso.setText("PESO:");

        lbCasado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCasado.setText("CASADO:");

        buttonGroup1.add(rdSim);
        rdSim.setText("SIM");
        rdSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSimActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdNao);
        rdNao.setSelected(true);
        rdNao.setText("NÃO");
        rdNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNaoActionPerformed(evt);
            }
        });

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btNovo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNovo.setText("NOVO");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIdade)
                            .addComponent(lbPeso)
                            .addComponent(lbCasado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdSim)
                                .addGap(18, 18, 18)
                                .addComponent(rdNao))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(edPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addComponent(edIdade, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btExibir)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCasado)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdSim)
                    .addComponent(rdNao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar)
                    .addComponent(btNovo)
                    .addComponent(btExibir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSimActionPerformed

    private void edNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNomeActionPerformed

    private void edIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edIdadeActionPerformed
    public void salvar() {

    }
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        JOptionPane.showMessageDialog(null, "Vamos limpar!");
        edNome.setText(null);
        edIdade.setText(null);
        edPeso.setText(null);
        JOptionPane.showMessageDialog(null, "Tá limpo xiru!");      
    }//GEN-LAST:event_btLimparActionPerformed
    public void ocultarTela(){
    lbTitulo.setText("Click no batão Novo!");
    lbNome.setVisible(false);
    edNome.setVisible(false);
    lbIdade.setVisible(false);
    edIdade.setVisible(false);
    lbPeso.setVisible(false);
    edPeso.setVisible(false);
    lbCasado.setVisible(false);
    rdSim.setVisible(false);
    rdNao.setVisible(false);
    btSalvar.setVisible(false);
    btLimpar.setVisible(false);
    btNovo.setEnabled(true);
    btExibir.setVisible(false);
    
    }
     public void revelarTela(){
    lbTitulo.setText("Tela de cadastro!");
    lbNome.setVisible(true);
    edNome.setVisible(true);
    lbIdade.setVisible(true);
    edIdade.setVisible(true);
    lbPeso.setVisible(true);
    edPeso.setVisible(true);
    lbCasado.setVisible(true);
    rdSim.setVisible(true);
    rdNao.setVisible(true);
    btSalvar.setVisible(true);
    btLimpar.setVisible(true);
    btNovo.setEnabled(false);
    
    
    }
    Pessoa p1 = new Pessoa();
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        p1.setNome(edNome.getText());
        p1.setIdade(Integer.parseInt(edIdade.getText()));
        p1.setPeso(Double.parseDouble(edPeso.getText()));
        if (rdSim.isSelected()){
        p1.setEhCasado(true);
        } else {
        p1.setEhCasado(false);
        }
        JOptionPane.showMessageDialog(null, p1.toString());
        ocultarTela();
        btExibir.setVisible(true);
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
       revelarTela();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExibirActionPerformed
       JOptionPane.showMessageDialog(null, p1.toString());
    }//GEN-LAST:event_btExibirActionPerformed

    private void rdNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNaoActionPerformed

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
            java.util.logging.Logger.getLogger(FPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExibir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edIdade;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edPeso;
    private javax.swing.JLabel lbCasado;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JRadioButton rdNao;
    private javax.swing.JRadioButton rdSim;
    // End of variables declaration//GEN-END:variables
}