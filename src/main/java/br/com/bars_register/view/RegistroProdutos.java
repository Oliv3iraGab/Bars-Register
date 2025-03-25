/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.bars_register.view;

import br.com.bars_register.persistence.Produto;
import br.com.bars_register.util.View;
import br.com.bars_register.view.forms.Produtos;
import javax.swing.JOptionPane;

/**
 *
 * @author limag
 */
public class RegistroProdutos extends javax.swing.JFrame {

    private Produtos produtosFrame;

    public RegistroProdutos(Produtos produtosFrame) {
        initComponents();
        this.produtosFrame = produtosFrame;
        
        // Listner para quando apertar enter clicar no botão "Confirmar"
        txtAcoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    BtnConfirmarActionPerformed(null);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMain = new javax.swing.JPanel();
        PanelFundo = new javax.swing.JPanel();
        BtnConfirmar = new javax.swing.JButton();
        LbNome = new javax.swing.JLabel();
        LbPreco = new javax.swing.JLabel();
        LbEstoque = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPreco = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JFormattedTextField();
        LbEstoque1 = new javax.swing.JLabel();
        txtAcoes = new javax.swing.JTextField();

        setTitle("Registro De Produtos");
        setResizable(false);

        PanelMain.setBackground(new java.awt.Color(233, 236, 239));
        PanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        View.standardCornerRadius(PanelFundo);

        BtnConfirmar.setBackground(new java.awt.Color(93, 64, 55));
        BtnConfirmar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        BtnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });

        LbNome.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        LbNome.setText("Nome");

        LbPreco.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        LbPreco.setText("Preço");

        LbEstoque.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        LbEstoque.setText("Estoque");

        txtNome.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        View.standardCornerRadius(txtNome);

        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPreco.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        View.standardCornerRadius(txtPreco);

        jLabel1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel1.setText("R$");

        txtEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        txtEstoque.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        View.standardCornerRadius(txtEstoque);

        LbEstoque1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        LbEstoque1.setText("Ações");

        txtAcoes.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        View.standardCornerRadius(txtAcoes);

        javax.swing.GroupLayout PanelFundoLayout = new javax.swing.GroupLayout(PanelFundo);
        PanelFundo.setLayout(PanelFundoLayout);
        PanelFundoLayout.setHorizontalGroup(
            PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFundoLayout.createSequentialGroup()
                        .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbPreco)
                            .addComponent(LbNome))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFundoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, 0)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addGroup(PanelFundoLayout.createSequentialGroup()
                        .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbEstoque)
                            .addComponent(LbEstoque1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFundoLayout.createSequentialGroup()
                                .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PanelFundoLayout.createSequentialGroup()
                                .addComponent(txtAcoes)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelFundoLayout.setVerticalGroup(
            PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFundoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbPreco)
                    .addComponent(jLabel1)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbEstoque)
                    .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbEstoque1)
                    .addComponent(txtAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        View.standardCornerRadius(BtnConfirmar);

        PanelMain.add(PanelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        String nome = txtNome.getText();
        String preco = txtPreco.getText().replace(",", ".");
        String estoque = txtEstoque.getText();
        String acoes = txtAcoes.getText();

        if (nome.isEmpty() | preco.isEmpty() | estoque.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        } else {
            try {
                double precoConvertido = Double.parseDouble(preco);
                int estoqueConvertido = Integer.parseInt(estoque);

                Produto produto = new Produto();
                produto.setNome(nome);
                produto.setPreco(precoConvertido);
                produto.setEstoque(estoqueConvertido);
                produto.setAcoes(acoes);

                JOptionPane.showMessageDialog(this, "Produto registrado!");
                produtosFrame.adicionarProduto(produto);
                this.dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_BtnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProdutos(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JLabel LbEstoque;
    private javax.swing.JLabel LbEstoque1;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbPreco;
    private javax.swing.JPanel PanelFundo;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAcoes;
    private javax.swing.JFormattedTextField txtEstoque;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
