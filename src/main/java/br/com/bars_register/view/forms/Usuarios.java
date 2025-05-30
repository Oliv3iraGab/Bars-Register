/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.bars_register.view.forms;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.com.bars_register.DAOClasses.UsuarioDAO;
import br.com.bars_register.persistence.Usuario;
import br.com.bars_register.util.View;
import br.com.bars_register.view.register.RegistroUsuarios;

/**
 *
 * @author limag
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
        atualizarTabelaUsuarios();
        editarStatus();;
        listnerTabela();
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
        JsPanelTblUsuarios = new javax.swing.JScrollPane();
        TblUsuarios = new javax.swing.JTable();
        BtnNovoUsuario = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMain.setBackground(new java.awt.Color(233, 236, 239));

        View.standardCornerRadius(JsPanelTblUsuarios);

        TblUsuarios.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        TblUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        TblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo", "Email", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JsPanelTblUsuarios.setViewportView(TblUsuarios);

        BtnNovoUsuario.setBackground(new java.awt.Color(78, 52, 46));
        BtnNovoUsuario.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        BtnNovoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BtnNovoUsuario.setText("+Novo Usuário");
        View.standardCornerRadius(BtnNovoUsuario);
        BtnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoUsuarioActionPerformed(evt);
            }
        });

        BtnExcluir.setBackground(new java.awt.Color(78, 52, 46));
        BtnExcluir.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        BtnExcluir.setForeground(new java.awt.Color(255, 0, 0));
        BtnExcluir.setText("Excluir");
        View.standardCornerRadius(BtnExcluir);
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMainLayout = new javax.swing.GroupLayout(PanelMain);
        PanelMain.setLayout(PanelMainLayout);
        PanelMainLayout.setHorizontalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNovoUsuario)
                    .addComponent(JsPanelTblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PanelMainLayout.setVerticalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JsPanelTblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoUsuarioActionPerformed
        RegistroUsuarios registroUsuario = new RegistroUsuarios(this);
        registroUsuario.setVisible(true);
    }//GEN-LAST:event_BtnNovoUsuarioActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        try {
            UsuarioDAO dao = new UsuarioDAO();
            int rowSelecionada = TblUsuarios.getSelectedRow();

            String email = TblUsuarios.getValueAt(rowSelecionada, 2).toString();
            String nome = TblUsuarios.getValueAt(rowSelecionada, 0).toString();
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Deseja excluir o usuario " + nome + "?",
                    "Confirmar Exclusão",
                    javax.swing.JOptionPane.YES_NO_OPTION
            );
            if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                dao.excluirUsuario(email);
                atualizarTabelaUsuarios();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnNovoUsuario;
    private javax.swing.JScrollPane JsPanelTblUsuarios;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JTable TblUsuarios;
    // End of variables declaration//GEN-END:variables

    private void editarStatus() {
        TblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) { // Double click
                    int row = TblUsuarios.getSelectedRow();
                    if (row != -1) {
                        String nome = (String) TblUsuarios.getValueAt(row, 0);
                        String status = (String) TblUsuarios.getValueAt(row, 3);
                        boolean isAtivo = status.equals("Ativo");
                        
                        int option = javax.swing.JOptionPane.showConfirmDialog(
                            null,
                            "Deseja alterar o status do usuário " + nome + " para " + 
                            (isAtivo ? "Inativo" : "Ativo") + "?",
                            "Confirmação",
                            javax.swing.JOptionPane.YES_NO_OPTION
                        );
                        
                        if (option == javax.swing.JOptionPane.YES_OPTION) {
                            UsuarioDAO dao = new UsuarioDAO();
                            dao.atualizarStatus(nome, !isAtivo);
                            atualizarTabelaUsuarios();
                        }
                    }
                }
            }
        });
    }

    public void atualizarTabelaUsuarios() {
        UsuarioDAO dao = new UsuarioDAO();
        List<Usuario> usuarios = dao.listarUsuario();

        DefaultTableModel model = (DefaultTableModel) TblUsuarios.getModel();
        model.setRowCount(0);

        TblUsuarios.setBackground(new java.awt.Color(248, 249, 250));
        TblUsuarios.setForeground(new java.awt.Color(33, 37, 41));
        TblUsuarios.setRowHeight(25);

        try {
            for (Usuario usuario : usuarios) {
                model.addRow(new Object[] {
                    usuario.getNome(),
                    usuario.getTipoUsuario(),
                    usuario.getEmail(),
                    usuario.isStatus() ? "Ativo" : "Inativo"
                });
            }

            TblUsuarios.repaint();
            TblUsuarios.revalidate();
            
        } catch (Exception e) {
            System.err.println("Erro ao popular tabela: " + e.getMessage());
            e.printStackTrace();
        }
    }

        /**
     * Verifica se há uma row selecionada para ativar ou não o botão de excluir
     */
    private void listnerTabela() {
        TblUsuarios.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selecionado = TblUsuarios.getSelectedRow();
                if (selecionado != -1) {
                    BtnExcluir.setEnabled(true);
                } else {
                    BtnExcluir.setEnabled(false);
                }
            }
        });
    }
}
