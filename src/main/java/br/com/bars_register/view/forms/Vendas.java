/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.bars_register.view.forms;

import br.com.bars_register.DAOClasses.ItemVendaDAO;
import br.com.bars_register.DAOClasses.ProdutoDAO;
import br.com.bars_register.DAOClasses.VendaDAO;
import br.com.bars_register.persistence.ItemVenda;
import br.com.bars_register.util.View;
import br.com.bars_register.persistence.Produto;
import br.com.bars_register.persistence.Venda;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.DefaultListModel;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vendas extends javax.swing.JFrame {

    private DefaultListModel<String> listModel;
    private double totalValue = 0.0;
    private DecimalFormat currencyFormat;

    public Vendas() {
        initComponents();
        setupComponents();
    }

    public void atualizarTabelaRegistroProdutos() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        String nomeProduto = txtBuscaProduto.getText();

        List<Produto> listaProdutos = produtoDAO.listarProdutos(nomeProduto);

        DefaultTableModel modeloTable = (DefaultTableModel) TblProdutos.getModel();
        modeloTable.setRowCount(0);

        for (Produto produto : listaProdutos) {
            Object[] rowData = {
                produto.getNome(),
                1,
                "R$ " + produto.getPreco()
            };
            modeloTable.addRow(rowData);
        }
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
        txtBuscaProduto = new javax.swing.JTextField();
        JsPanelProdutos = new javax.swing.JScrollPane();
        TblProdutos = new javax.swing.JTable();
        CbTipoPagamento = new javax.swing.JComboBox<>();
        PanelCarrinho = new javax.swing.JPanel();
        PanelTotalCarrinho = new javax.swing.JPanel();
        LbTotal = new javax.swing.JLabel();
        LbTotalNumero = new javax.swing.JLabel();
        LbCarrinho = new javax.swing.JLabel();
        JsPanelCarrinho = new javax.swing.JScrollPane();
        ListCarrinho = new javax.swing.JList<>();
        BtnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(670, 540));

        PanelMain.setBackground(new java.awt.Color(233, 236, 239));

        PanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        View.standardCornerRadius(PanelFundo);

        View.standardCornerRadius(txtBuscaProduto);
        txtBuscaProduto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtBuscaProdutoCaretUpdate(evt);
            }
        });

        TblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JsPanelProdutos.setViewportView(TblProdutos);

        CbTipoPagamento.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        CbTipoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DINHEIRO", "CRÉDITO", "DÉBITO", "PIX" }));

        javax.swing.GroupLayout PanelFundoLayout = new javax.swing.GroupLayout(PanelFundo);
        PanelFundo.setLayout(PanelFundoLayout);
        PanelFundoLayout.setHorizontalGroup(
            PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JsPanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addGroup(PanelFundoLayout.createSequentialGroup()
                        .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbTipoPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelFundoLayout.setVerticalGroup(
            PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFundoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(PanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JsPanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelCarrinho.setBackground(new java.awt.Color(78, 52, 46));
        PanelCarrinho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        View.standardCornerRadius(PanelCarrinho);

        PanelTotalCarrinho.setBackground(new java.awt.Color(62, 39, 35));

        LbTotal.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        LbTotal.setForeground(new java.awt.Color(173, 181, 189));
        LbTotal.setText("Total");

        LbTotalNumero.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        LbTotalNumero.setForeground(new java.awt.Color(255, 255, 255));
        LbTotalNumero.setText("R$ 0,00");

        javax.swing.GroupLayout PanelTotalCarrinhoLayout = new javax.swing.GroupLayout(PanelTotalCarrinho);
        PanelTotalCarrinho.setLayout(PanelTotalCarrinhoLayout);
        PanelTotalCarrinhoLayout.setHorizontalGroup(
            PanelTotalCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalCarrinhoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelTotalCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbTotalNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelTotalCarrinhoLayout.createSequentialGroup()
                        .addComponent(LbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelTotalCarrinhoLayout.setVerticalGroup(
            PanelTotalCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalCarrinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTotal)
                .addGap(0, 0, 0)
                .addComponent(LbTotalNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelCarrinho.add(PanelTotalCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 350, 200, -1));

        LbCarrinho.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        LbCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        LbCarrinho.setText("Carrinho");
        PanelCarrinho.add(LbCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, -1));

        JsPanelCarrinho.setBorder(null);

        ListCarrinho.setBackground(new java.awt.Color(78, 52, 46));
        ListCarrinho.setBorder(null);
        ListCarrinho.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        ListCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        JsPanelCarrinho.setViewportView(ListCarrinho);

        PanelCarrinho.add(JsPanelCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 300));

        BtnConfirmar.setBackground(new java.awt.Color(78, 52, 46));
        BtnConfirmar.setFont(new java.awt.Font("Inter", 1, 28)); // NOI18N
        BtnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirmar.setText("Confirmar");
        View.standardCornerRadius(BtnConfirmar);
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMainLayout = new javax.swing.GroupLayout(PanelMain);
        PanelMain.setLayout(PanelMainLayout);
        PanelMainLayout.setHorizontalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(BtnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        PanelMainLayout.setVerticalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMainLayout.createSequentialGroup()
                        .addComponent(PanelCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaProdutoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtBuscaProdutoCaretUpdate
        atualizarTabelaRegistroProdutos();
    }//GEN-LAST:event_txtBuscaProdutoCaretUpdate

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {
        if (listModel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Carrinho vazio!");
            return;
        }
        try {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            VendaDAO vendaDAO = new VendaDAO();
            ArrayList<ItemVenda> itensVenda = new ArrayList<>();
            
            Venda venda = new Venda();
            venda.setDataVenda(java.time.LocalDateTime.now());
            venda.setTotal(totalValue);
            String tipoPag = CbTipoPagamento.getSelectedItem().toString();
            venda.setTipoPagamento(tipoPag);
            
            vendaDAO.salvarVenda(venda);

            for (int i = 0; i < listModel.size(); i++) {
                String item = listModel.getElementAt(i);

                String[] parts = item.split("x");
                String nomeProduto = parts[0].trim();
                int quantidade = Integer.parseInt(parts[1].split("-")[0].trim());
                
                Produto produto = produtoDAO.listarProdutos("").stream()
                        .filter(p -> p.getNome().equals(nomeProduto))
                        .findFirst()
                        .orElse(null);

                if (produto != null) {
                    if (quantidade > produto.getEstoque()) {
                        JOptionPane.showMessageDialog(this, "Quantidade insuficiente em estoque para " + nomeProduto);
                        listModel.remove(i);
                        totalValue -= produto.getPreco() * quantidade;
                        atualizarTotal();
                        return;
                    }
                    
                    ItemVenda itemVenda = new ItemVenda();
                    itemVenda.setProduto(produto);
                    itemVenda.setVenda(venda);
                    itemVenda.setQuantidade(quantidade);
                    itensVenda.add(itemVenda);
                    
                    int novoEstoque = produto.getEstoque() - quantidade;
                    produtoDAO.atualizarEstoque(nomeProduto, novoEstoque);
                }
            }
            
            ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
            for (ItemVenda item : itensVenda) {
                itemVendaDAO.cadastrarItemVenda(item);
            }

            listModel.clear();
            totalValue = 0.0;
            atualizarTotal();

            JOptionPane.showMessageDialog(this, "Venda registrada com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JComboBox<String> CbTipoPagamento;
    private javax.swing.JScrollPane JsPanelCarrinho;
    private javax.swing.JScrollPane JsPanelProdutos;
    private javax.swing.JLabel LbCarrinho;
    private javax.swing.JLabel LbTotal;
    private javax.swing.JLabel LbTotalNumero;
    private javax.swing.JList<String> ListCarrinho;
    private javax.swing.JPanel PanelCarrinho;
    private javax.swing.JPanel PanelFundo;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPanel PanelTotalCarrinho;
    private javax.swing.JTable TblProdutos;
    private javax.swing.JTextField txtBuscaProduto;
    // End of variables declaration//GEN-END:variables

    private void setupComponents() {
        listModel = new DefaultListModel<>();
        ListCarrinho.setModel(listModel);
        atualizarTabelaRegistroProdutos();
        txtBuscaProduto.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Busque um produto");
        currencyFormat = new DecimalFormat("R$ #,##0.00");

        TblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    adicionarItemAoCarrinho();
                }
            }
        });

        ListCarrinho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE) {
                    removerItemDoCarrinho();
                }
            }
        });
    }

    private void adicionarItemAoCarrinho() {
        int row = TblProdutos.getSelectedRow();
        if (row != -1) {
            String nome = (String) TblProdutos.getValueAt(row, 0);
            int quantidade = Integer.parseInt(TblProdutos.getValueAt(row, 1).toString());
            String precoStr = TblProdutos.getValueAt(row, 2).toString().replace("R$ ", "");
            double preco = Double.parseDouble(precoStr);

            String item = String.format("%s x%d - %s", nome, quantidade,
                    currencyFormat.format(preco * quantidade));

            listModel.addElement(item);
            totalValue += (preco * quantidade);
            atualizarTotal();
        }
    }

    private void removerItemDoCarrinho() {
        int index = ListCarrinho.getSelectedIndex();
        if (index != -1) {
            // Extrai o preço da string do item
            String item = listModel.getElementAt(index);
            String priceStr = item.substring(item.lastIndexOf("R$")).trim();
            try {
                double price = currencyFormat.parse(priceStr).doubleValue();
                totalValue -= price;
                atualizarTotal();
            } catch (ParseException e) {
                e.printStackTrace();
            }

            listModel.remove(index);
        }
    }

    private void atualizarTotal() {
        LbTotalNumero.setText(currencyFormat.format(totalValue));
    }
}
