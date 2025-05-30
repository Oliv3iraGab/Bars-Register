/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.bars_register.view;

import br.com.bars_register.persistence.Usuario;
import javax.swing.JToggleButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import br.com.bars_register.view.forms.*;

/**s
 *
 * @author limag
 */
public class MainFrame extends javax.swing.JFrame {
    // Painéis do sistema
    private Dashboard dashboardPanel;
    private Produtos produtosPanel;
    private Vendas vendasPanel;
    private Usuarios usuariosPanel;
    private Fornecedores fornecedoresPanel;
    private Relatorios relatorioPanel;
    private Usuario usuario;
    
    public MainFrame(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
    
        // Configura todos os botões laterais
        configureLateralButtons(BtnDashboard);
        configureLateralButtons(BtnProdutos);
        configureLateralButtons(BtnVendas);
        configureLateralButtons(BtnRelatorios);
        configureLateralButtons(BtnUsuarios);
        configureLateralButtons(BtnFornecedores);
        
        // Inicializa os painéis
        inicializarPaineis();
        
        // Adiciona os listeners aos botões
        BtnDashboard.addActionListener(e -> trocarPainel("Dashboard"));
        BtnProdutos.addActionListener(e -> trocarPainel("Produtos"));
        BtnVendas.addActionListener(e -> trocarPainel("Vendas"));
        BtnRelatorios.addActionListener(e -> trocarPainel("Relatorios"));
        BtnUsuarios.addActionListener(e -> trocarPainel("Usuarios"));
        BtnFornecedores.addActionListener(e -> trocarPainel("Fornecedores"));
        
        // Mostra o painel Dashboard por padrão
        trocarPainel("Dashboard");
    }
    
    private void inicializarPaineis() {
        // Cria as instâncias dos painéis na ordem correta
        dashboardPanel = new Dashboard();
        produtosPanel = new Produtos();
        vendasPanel = new Vendas();
        usuariosPanel = new Usuarios();
        fornecedoresPanel = new Fornecedores();
        relatorioPanel = new Relatorios(usuario);
        
        // Converte os JFrames para JPanels e armazena seus painéis principais
        dashboardPanel.setContentPane((JPanel)dashboardPanel.getContentPane());
        produtosPanel.setContentPane((JPanel)produtosPanel.getContentPane());
        vendasPanel.setContentPane((JPanel)vendasPanel.getContentPane());
        usuariosPanel.setContentPane((JPanel)usuariosPanel.getContentPane());
        fornecedoresPanel.setContentPane((JPanel)fornecedoresPanel.getContentPane());
        relatorioPanel.setContentPane((JPanel)relatorioPanel.getContentPane());
    }
    
    private void trocarPainel(String nomePainel) {
        // Remove todos os componentes do painel principal
        PanelMain.removeAll();
        
        JPanel painelSelecionado = null;
        switch (nomePainel) {
            case "Dashboard":
                dashboardPanel.atualizarTabelaVendas();
                dashboardPanel.atualizarTotalVendasHoje();
                painelSelecionado = (JPanel)dashboardPanel.getContentPane();
                break;
            case "Produtos":
                produtosPanel.atualizarTabelaProdutos();
                painelSelecionado = (JPanel)produtosPanel.getContentPane();
                break;
            case "Vendas":
                vendasPanel.atualizarTabelaRegistroProdutos();
                painelSelecionado = (JPanel)vendasPanel.getContentPane();
                break;
            case "Usuarios":
                usuariosPanel.atualizarTabelaUsuarios();
                painelSelecionado = (JPanel)usuariosPanel.getContentPane();
                break;
            case "Fornecedores":
                fornecedoresPanel.atualizarTabelaFornecedores();
                fornecedoresPanel.atualizarTotalFornecedores();
                painelSelecionado = (JPanel)fornecedoresPanel.getContentPane();
                break;
            case "Relatorios":
                painelSelecionado = (JPanel)relatorioPanel.getContentPane();
                relatorioPanel.atualizarReceitaTotal();
                relatorioPanel.atualizarTotalVendas();
                break;
        }
        
        if (painelSelecionado != null) {
            PanelMain.setLayout(new BorderLayout());
            
            // Adiciona o painel selecionado ocupando todo o espaço
            PanelMain.add(painelSelecionado, BorderLayout.CENTER);
        }
        
        // Atualiza o painel
        PanelMain.revalidate();
        PanelMain.repaint();
    }
    
    private void configureLateralButtons(JToggleButton button) {
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgLateral = new javax.swing.ButtonGroup();
        PanelLateral = new javax.swing.JPanel();
        BtnFornecedores = new javax.swing.JToggleButton();
        BtnDashboard = new javax.swing.JToggleButton();
        BtnProdutos = new javax.swing.JToggleButton();
        BtnVendas = new javax.swing.JToggleButton();
        btnVoltar = new javax.swing.JButton();
        BtnRelatorios = new javax.swing.JToggleButton();
        BtnUsuarios = new javax.swing.JToggleButton();
        PanelSuperior = new javax.swing.JPanel();
        LbLogo = new javax.swing.JLabel();
        LbTitulo = new javax.swing.JLabel();
        PanelMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLateral.setBackground(new java.awt.Color(78, 52, 46));

        BtnFornecedores.setBackground(new java.awt.Color(93, 64, 55));
        BgLateral.add(BtnFornecedores);
        BtnFornecedores.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        BtnFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        BtnFornecedores.setText("Fornecedor");
        BtnFornecedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnFornecedores.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnFornecedores.setIconTextGap(3);
        BtnFornecedores.setMargin(new java.awt.Insets(2, 6, 3, 20));

        BtnDashboard.setBackground(new java.awt.Color(93, 64, 55));
        BgLateral.add(BtnDashboard);
        BtnDashboard.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        BtnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        BtnDashboard.setSelected(true);
        BtnDashboard.setText("Dashboard");
        BtnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnDashboard.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnDashboard.setIconTextGap(3);
        BtnDashboard.setMargin(new java.awt.Insets(2, 6, 3, 20));

        BtnProdutos.setBackground(new java.awt.Color(93, 64, 55));
        BgLateral.add(BtnProdutos);
        BtnProdutos.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        BtnProdutos.setForeground(new java.awt.Color(255, 255, 255));
        BtnProdutos.setText("Produto");
        BtnProdutos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnProdutos.setIconTextGap(3);
        BtnProdutos.setMargin(new java.awt.Insets(2, 6, 3, 20));

        BtnVendas.setBackground(new java.awt.Color(93, 64, 55));
        BgLateral.add(BtnVendas);
        BtnVendas.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        BtnVendas.setForeground(new java.awt.Color(255, 255, 255));
        BtnVendas.setText("Venda");
        BtnVendas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnVendas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnVendas.setIconTextGap(3);
        BtnVendas.setMargin(new java.awt.Insets(2, 6, 3, 20));

        btnVoltar.setBackground(new java.awt.Color(78, 52, 46));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconeVoltar.png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        BtnRelatorios.setBackground(new java.awt.Color(93, 64, 55));
        BgLateral.add(BtnRelatorios);
        BtnRelatorios.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        BtnRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        BtnRelatorios.setText("Relatório");
        BtnRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnRelatorios.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnRelatorios.setIconTextGap(3);
        BtnRelatorios.setMargin(new java.awt.Insets(2, 6, 3, 20));

        BtnUsuarios.setBackground(new java.awt.Color(93, 64, 55));
        BgLateral.add(BtnUsuarios);
        BtnUsuarios.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        BtnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        BtnUsuarios.setText("Usuário");
        BtnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnUsuarios.setIconTextGap(3);
        BtnUsuarios.setMargin(new java.awt.Insets(2, 6, 3, 20));

        javax.swing.GroupLayout PanelLateralLayout = new javax.swing.GroupLayout(PanelLateral);
        PanelLateral.setLayout(PanelLateralLayout);
        PanelLateralLayout.setHorizontalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnVendas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnRelatorios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFornecedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PanelLateralLayout.setVerticalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(BtnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(BtnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(BtnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(BtnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(BtnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(BtnFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(PanelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, 540));

        PanelSuperior.setBackground(new java.awt.Color(93, 64, 55));

        LbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo-BarsMini.png"))); // NOI18N

        LbTitulo.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        LbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LbTitulo.setText("Bar's Register");

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(LbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(LbTitulo)
                .addContainerGap(625, Short.MAX_VALUE))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LbTitulo)
                    .addComponent(LbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(PanelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        PanelMain.setBackground(new java.awt.Color(233, 236, 239));
        PanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 670, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BgLateral;
    private javax.swing.JToggleButton BtnDashboard;
    javax.swing.JToggleButton BtnFornecedores;
    private javax.swing.JToggleButton BtnProdutos;
    javax.swing.JToggleButton BtnRelatorios;
    javax.swing.JToggleButton BtnUsuarios;
    private javax.swing.JToggleButton BtnVendas;
    private javax.swing.JLabel LbLogo;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JPanel PanelLateral;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JButton btnVoltar;
    // End of variables declaration//GEN-END:variables
}
