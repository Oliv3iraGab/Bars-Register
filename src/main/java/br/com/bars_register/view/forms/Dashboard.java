package br.com.bars_register.view.forms;

import br.com.bars_register.util.View;
import br.com.bars_register.DAOClasses.VendaDAO;
import br.com.bars_register.persistence.Venda;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author limag
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    
    public Dashboard() {
        initComponents();
        atualizarTabelaVendas();
    }

    private void atualizarTabelaVendas() {
        VendaDAO vendaDAO = new VendaDAO();
        List <Venda> listaVendas = vendaDAO.listarVendas();

        DefaultTableModel modeloTable = (DefaultTableModel) TblVendasRecentes.getModel();
        modeloTable.setRowCount(0);
        
        for (Venda venda : listaVendas){
            Object[] rowData = {
                venda.getDataVenda(),
                "R$ " + venda.getTotal(),
                venda.getTipoPagamento()
            };
            modeloTable.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMain = new javax.swing.JPanel();
        PanelFundo = new javax.swing.JPanel();
        PanelVendasRecentes = new javax.swing.JPanel();
        LbVendasRecentes = new javax.swing.JLabel();
        ScPanelVendasRecentes = new javax.swing.JScrollPane();
        TblVendasRecentes = new javax.swing.JTable();
        PanelVendasHoje = new javax.swing.JPanel();
        LbVendasHoje = new javax.swing.JLabel();
        LbNumeroVendas = new javax.swing.JLabel();
        PanelProdutos = new javax.swing.JPanel();
        LbProdutosHoje = new javax.swing.JLabel();
        LbNumeroProdutos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(670, 540));

        PanelMain.setBackground(new java.awt.Color(233, 236, 239));

        PanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        View.standardCornerRadius(PanelFundo);
        PanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelVendasRecentes.setBackground(new java.awt.Color(248, 249, 250));
        View.standardCornerRadius(PanelVendasRecentes);

        LbVendasRecentes.setBackground(new java.awt.Color(62, 39, 35));
        LbVendasRecentes.setFont(new java.awt.Font("Inter", 1, 16)); // NOI18N
        LbVendasRecentes.setText("Vendas Recentes");

        View.standardCornerRadius(ScPanelVendasRecentes);

        TblVendasRecentes.setAutoCreateRowSorter(true);
        TblVendasRecentes.setBackground(new java.awt.Color(248, 249, 250));
        TblVendasRecentes.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        TblVendasRecentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Total", "Foma Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblVendasRecentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TblVendasRecentes.setShowGrid(false);
        ScPanelVendasRecentes.setViewportView(TblVendasRecentes);
        TblVendasRecentes.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout PanelVendasRecentesLayout = new javax.swing.GroupLayout(PanelVendasRecentes);
        PanelVendasRecentes.setLayout(PanelVendasRecentesLayout);
        PanelVendasRecentesLayout.setHorizontalGroup(
            PanelVendasRecentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVendasRecentesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelVendasRecentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbVendasRecentes)
                    .addComponent(ScPanelVendasRecentes, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelVendasRecentesLayout.setVerticalGroup(
            PanelVendasRecentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVendasRecentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbVendasRecentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScPanelVendasRecentes, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        PanelFundo.add(PanelVendasRecentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 140, 590, 340));

        PanelVendasHoje.setBackground(new java.awt.Color(78, 52, 46));
        PanelVendasHoje.setPreferredSize(new java.awt.Dimension(180, 100));
        View.standardCornerRadius(PanelVendasHoje);

        LbVendasHoje.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        LbVendasHoje.setForeground(new java.awt.Color(173, 181, 189));
        LbVendasHoje.setText("Vendas Hoje");

        LbNumeroVendas.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        LbNumeroVendas.setForeground(new java.awt.Color(255, 255, 255));
        LbNumeroVendas.setText("R$ 0");

        javax.swing.GroupLayout PanelVendasHojeLayout = new javax.swing.GroupLayout(PanelVendasHoje);
        PanelVendasHoje.setLayout(PanelVendasHojeLayout);
        PanelVendasHojeLayout.setHorizontalGroup(
            PanelVendasHojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVendasHojeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelVendasHojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbVendasHoje)
                    .addComponent(LbNumeroVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        PanelVendasHojeLayout.setVerticalGroup(
            PanelVendasHojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVendasHojeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(LbVendasHoje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbNumeroVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        PanelFundo.add(PanelVendasHoje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 100));

        PanelProdutos.setBackground(new java.awt.Color(78, 52, 46));
        PanelProdutos.setPreferredSize(new java.awt.Dimension(180, 100));
        View.standardCornerRadius(PanelProdutos);

        LbProdutosHoje.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        LbProdutosHoje.setForeground(new java.awt.Color(173, 181, 189));
        LbProdutosHoje.setText("Produtos");

        LbNumeroProdutos.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        LbNumeroProdutos.setForeground(new java.awt.Color(255, 255, 255));
        LbNumeroProdutos.setText("0");

        javax.swing.GroupLayout PanelProdutosLayout = new javax.swing.GroupLayout(PanelProdutos);
        PanelProdutos.setLayout(PanelProdutosLayout);
        PanelProdutosLayout.setHorizontalGroup(
            PanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProdutosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbProdutosHoje)
                    .addComponent(LbNumeroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        PanelProdutosLayout.setVerticalGroup(
            PanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProdutosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(LbProdutosHoje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbNumeroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        PanelFundo.add(PanelProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        javax.swing.GroupLayout PanelMainLayout = new javax.swing.GroupLayout(PanelMain);
        PanelMain.setLayout(PanelMainLayout);
        PanelMainLayout.setHorizontalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(PanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PanelMainLayout.setVerticalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(PanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("FlatLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbNumeroProdutos;
    private javax.swing.JLabel LbNumeroVendas;
    private javax.swing.JLabel LbProdutosHoje;
    private javax.swing.JLabel LbVendasHoje;
    private javax.swing.JLabel LbVendasRecentes;
    private javax.swing.JPanel PanelFundo;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPanel PanelProdutos;
    private javax.swing.JPanel PanelVendasHoje;
    private javax.swing.JPanel PanelVendasRecentes;
    private javax.swing.JScrollPane ScPanelVendasRecentes;
    private javax.swing.JTable TblVendasRecentes;
    // End of variables declaration//GEN-END:variables
}
