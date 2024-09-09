package view;

import Model.Compras;
import Model.Vendas;
import Model.Fornecedores;
import Model.Produtos;


public class Menu extends javax.swing.JFrame {

    JpanelLoader jpload = new JpanelLoader();

    public Menu() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProdutosBtn = new javax.swing.JButton();
        ProdutosText = new javax.swing.JLabel();
        FornecedoresBtn = new javax.swing.JButton();
        FornecedoresText = new javax.swing.JLabel();
        ComprasBtn = new javax.swing.JButton();
        ComprasText = new javax.swing.JLabel();
        VendasBtn = new javax.swing.JButton();
        Vendas = new javax.swing.JLabel();
        DesconectarBtn = new javax.swing.JButton();
        DesconectarText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        painel_principal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 51));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1935, 1085));
        jPanel1.setLayout(null);

        ProdutosBtn.setBorder(null);
        ProdutosBtn.setContentAreaFilled(false);
        ProdutosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProdutosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ProdutosBtn);
        ProdutosBtn.setBounds(30, 40, 190, 20);

        ProdutosText.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ProdutosText.setForeground(new java.awt.Color(255, 255, 255));
        ProdutosText.setText("PRODUTOS");
        jPanel1.add(ProdutosText);
        ProdutosText.setBounds(130, 40, 90, 20);

        FornecedoresBtn.setBorder(null);
        FornecedoresBtn.setContentAreaFilled(false);
        FornecedoresBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FornecedoresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FornecedoresBtnActionPerformed(evt);
            }
        });
        jPanel1.add(FornecedoresBtn);
        FornecedoresBtn.setBounds(250, 40, 190, 20);

        FornecedoresText.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        FornecedoresText.setForeground(new java.awt.Color(255, 255, 255));
        FornecedoresText.setText("FORNECEDORES");
        jPanel1.add(FornecedoresText);
        FornecedoresText.setBounds(320, 40, 120, 20);

        ComprasBtn.setBorder(null);
        ComprasBtn.setContentAreaFilled(false);
        ComprasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComprasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprasBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ComprasBtn);
        ComprasBtn.setBounds(470, 40, 190, 20);

        ComprasText.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ComprasText.setForeground(new java.awt.Color(255, 255, 255));
        ComprasText.setText("COMPRAS");
        jPanel1.add(ComprasText);
        ComprasText.setBounds(580, 40, 80, 20);

        VendasBtn.setBorder(null);
        VendasBtn.setContentAreaFilled(false);
        VendasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VendasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendasBtnActionPerformed(evt);
            }
        });
        jPanel1.add(VendasBtn);
        VendasBtn.setBounds(690, 40, 190, 20);

        Vendas.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Vendas.setForeground(new java.awt.Color(255, 255, 255));
        Vendas.setText("VENDAS");
        jPanel1.add(Vendas);
        Vendas.setBounds(820, 40, 62, 20);

        DesconectarBtn.setBorder(null);
        DesconectarBtn.setContentAreaFilled(false);
        DesconectarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DesconectarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesconectarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DesconectarBtn);
        DesconectarBtn.setBounds(950, 40, 190, 20);

        DesconectarText.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        DesconectarText.setForeground(new java.awt.Color(255, 255, 255));
        DesconectarText.setText("DESCONECTAR");
        jPanel1.add(DesconectarText);
        DesconectarText.setBounds(1030, 40, 110, 20);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 60, 190, 10);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(250, 60, 190, 10);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(470, 60, 190, 10);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(690, 60, 190, 10);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(950, 60, 190, 10);

        painel_principal.setBackground(new java.awt.Color(0, 102, 102));
        painel_principal.setForeground(new java.awt.Color(255, 255, 255));
        painel_principal.setMinimumSize(new java.awt.Dimension(0, 0));
        painel_principal.setName(""); // NOI18N
        painel_principal.setPreferredSize(new java.awt.Dimension(1280, 500));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECIONE A ABA QUE DESEJA ACESSAR");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stockeasy (1).png"))); // NOI18N

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_principalLayout.createSequentialGroup()
                .addContainerGap(1000, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel_principalLayout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(jLabel2)
                    .addContainerGap(541, Short.MAX_VALUE)))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_principalLayout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel_principalLayout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
        );

        jPanel1.add(painel_principal);
        painel_principal.setBounds(110, 110, 1210, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1927, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProdutosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosBtnActionPerformed
        Produtos produtos = new Produtos();
        jpload.jPanelLoader(painel_principal, produtos);
    }//GEN-LAST:event_ProdutosBtnActionPerformed

    private void FornecedoresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FornecedoresBtnActionPerformed
        Fornecedores fornecedores = new Fornecedores();
        jpload.jPanelLoader(painel_principal, fornecedores);
    }//GEN-LAST:event_FornecedoresBtnActionPerformed

    private void ComprasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprasBtnActionPerformed
        Compras compras = new Compras();
        jpload.jPanelLoader(painel_principal, compras);
    }//GEN-LAST:event_ComprasBtnActionPerformed

    private void VendasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasBtnActionPerformed
        Vendas vendas = new Vendas();
        jpload.jPanelLoader(painel_principal, vendas);
    }//GEN-LAST:event_VendasBtnActionPerformed

    private void DesconectarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesconectarBtnActionPerformed
        TelaLogin1 LoginFrame = new TelaLogin1();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_DesconectarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComprasBtn;
    private javax.swing.JLabel ComprasText;
    private javax.swing.JButton DesconectarBtn;
    private javax.swing.JLabel DesconectarText;
    private javax.swing.JButton FornecedoresBtn;
    private javax.swing.JLabel FornecedoresText;
    private javax.swing.JButton ProdutosBtn;
    private javax.swing.JLabel ProdutosText;
    private javax.swing.JLabel Vendas;
    private javax.swing.JButton VendasBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel painel_principal;
    // End of variables declaration//GEN-END:variables
}
