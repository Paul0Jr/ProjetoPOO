package Model;

import DAO.Conexao;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import DAO.ComprasVendas;

public class Vendas extends javax.swing.JPanel {

    Connection con = Conexao.getConnection();
    ResultSet rs = null;
    Statement st = null;
    PreparedStatement ps = null;
    String receita, estoque, idvenda, nome, query, codigo, buscaBD = null;
    int notfound = 0, id = 0, qtd = 0;
    float preco = 0;

    public Vendas() {
        initComponents();
        Tabela();
    }

    private void Tabela() {

        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM vendas");
                rs = ps.executeQuery();
                java.sql.ResultSetMetaData rsmd = rs.getMetaData();
                int n = rsmd.getColumnCount();
                DefaultTableModel dtm = (DefaultTableModel) TabelaProd.getModel();
                dtm.setRowCount(0);
                {
                    while (rs.next()) {
                        Vector vetor = new Vector();
                        for (int i = 1; i < n; i++) {
                            vetor.add(rs.getString(2));
                            vetor.add(rs.getString(3));
                            vetor.add(rs.getString(4));
                            vetor.add(rs.getString(5));
                        }
                        //System.out.println(vetor);
                        dtm.addRow(vetor);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BuscarBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        BuscarID = new javax.swing.JFormattedTextField();
        AvisoBuscaNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProd = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        IdProd = new javax.swing.JFormattedTextField();
        PrecoProdText = new javax.swing.JLabel();
        PrecoProd = new javax.swing.JFormattedTextField();
        QtdProd = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        AdicionarBtn = new javax.swing.JButton();
        AvisoID = new javax.swing.JLabel();
        AvisoNome = new javax.swing.JLabel();
        AvisoQtd = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cash.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HISTÓRICO DE VENDAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(358, 358, 358))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BUSCAR VENDA");

        BuscarBtn.setBackground(new java.awt.Color(0, 102, 0));
        BuscarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BuscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        BuscarBtn.setText("BUSCAR");
        BuscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("BUSCAR ID:");

        BuscarID.setBackground(new java.awt.Color(255, 255, 255));
        BuscarID.setForeground(new java.awt.Color(0, 0, 0));
        BuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarIDActionPerformed(evt);
            }
        });

        AvisoBuscaNome.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoBuscaNome.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(BuscarBtn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AvisoBuscaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(BuscarID))))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(AvisoBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarBtn)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        TabelaProd.setBackground(new java.awt.Color(255, 255, 255));
        TabelaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID PROD", "QTD", "PREÇO DE VENDA", "RECEITA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaProd);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID PROD:");

        IdProd.setBackground(new java.awt.Color(255, 255, 255));
        IdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdProdActionPerformed(evt);
            }
        });

        PrecoProdText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PrecoProdText.setForeground(new java.awt.Color(0, 0, 0));
        PrecoProdText.setText("PREÇO:");

        PrecoProd.setBackground(new java.awt.Color(255, 255, 255));
        PrecoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecoProdActionPerformed(evt);
            }
        });

        QtdProd.setBackground(new java.awt.Color(255, 255, 255));
        QtdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtdProdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("QUANTIDADE:");

        AdicionarBtn.setBackground(new java.awt.Color(0, 153, 0));
        AdicionarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AdicionarBtn.setForeground(new java.awt.Color(255, 255, 255));
        AdicionarBtn.setText("VENDER");
        AdicionarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdicionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarBtnActionPerformed(evt);
            }
        });

        AvisoID.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoID.setForeground(new java.awt.Color(255, 0, 0));

        AvisoNome.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoNome.setForeground(new java.awt.Color(255, 0, 0));

        AvisoQtd.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoQtd.setForeground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("GERENCIAR VENDA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AvisoID, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(PrecoProdText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AvisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(IdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(QtdProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PrecoProd, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addComponent(AvisoQtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(AdicionarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvisoID, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addComponent(AvisoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecoProdText)
                    .addComponent(PrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(AdicionarBtn)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void IdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdProdActionPerformed

    private void PrecoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecoProdActionPerformed

    private void QtdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtdProdActionPerformed

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        try {
            if (con != null) {
                if ("".equals(BuscarID.getText())) {
                    JOptionPane.showMessageDialog(new JFrame(), "Necessário inserir o ID da venda!", "Erro ao buscar!", JOptionPane.ERROR_MESSAGE);
                } else {
                    codigo = BuscarID.getText();
                    query = "SELECT * FROM produtos WHERE id ='" + codigo + "'";
                    rs = st.executeQuery(query);
                    while (rs.next()) {
                        buscaBD = rs.getString("id");
                        notfound = 1;
                        nome = rs.getString("nome");
                        query = "SELECT * FROM vendas WHERE idprod ='" + codigo + "'";
                        rs = st.executeQuery(query);
                        while (rs.next()) {
                            idvenda = rs.getString("idvenda");
                            qtd = rs.getInt("quantidade");
                            preco = rs.getFloat("preco");
                            receita = rs.getString("receita");
                            // query = "UPDATE vendas SET lucro = '" + precocompra + "'*'" + preco + "' WHERE id =" + id;
                            showMessageDialog(null, "ID venda: " + idvenda + "\nId produto: " + buscaBD + "\nNome do produto: " + nome + "\nQuantidade: " + qtd + "\nPreço da venda: R$" + preco + "\nReceita:" + receita);
                        }
                    }
                    if ((notfound == 1 && codigo.equals(buscaBD))) {

                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "ID não encontrado!", "Erro ao buscar!", JOptionPane.ERROR_MESSAGE);
                    }
                }
                IdProd.setText("");
                PrecoProd.setText("");
                QtdProd.setText("");
                BuscarID.setText("");

            }
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void AdicionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarBtnActionPerformed
        try {
            st = con.createStatement();

            //MENSAGENS DE ERRO
            if ("".equals(IdProd.getText()) || (IdProd.getText().length() <= 0)) {
                AvisoID.setText("Insira um id válido!");
                AvisoNome.setText("");
                AvisoQtd.setText("");

            } else if ("".equals(PrecoProd.getText()) || PrecoProd.getText().length() <= 0) {
                AvisoID.setText("");
                AvisoNome.setText("Insira um preço de compra válido!");
                AvisoQtd.setText("");

            } else if ("".equals(QtdProd.getText()) || QtdProd.getText().length() <= 0) {
                AvisoID.setText("");
                AvisoNome.setText("");
                AvisoQtd.setText("Insira uma quantidade válida!");

            } else {
                id = Integer.parseInt(IdProd.getText());
                preco = Float.parseFloat(PrecoProd.getText());
                qtd = Integer.parseInt(QtdProd.getText());

                //CONSULTA NO BANCO
                int pst1 = ComprasVendas.buscarcompras(id);
                //INSERIR NO BANCO
                if (pst1 == 1) {
                    query = "UPDATE produtos SET quantidade = quantidade -'" + qtd + "' WHERE id =" + id;
                    st.executeUpdate(query);
                    float receita = preco * qtd;
                    query = "INSERT INTO vendas (idprod, quantidade, preco, receita)" + "VALUES('" + id + "', '" + qtd + "', '" + preco + "', '" + receita + "')";
                    st.executeUpdate(query);
                    IdProd.setText("");
                    PrecoProd.setText("");
                    QtdProd.setText("");
                    showMessageDialog(null, "Produto vendido com sucesso!");
                    AvisoID.setText("");
                    AvisoNome.setText("");
                    AvisoQtd.setText("");
                } else {

                    //VALIDAÇÃO DE DADOS
                    JOptionPane.showMessageDialog(new JFrame(), "O ID DIGITADO NÃO EXISTE!", "Erro ao comprar!", JOptionPane.ERROR_MESSAGE);
                    AvisoID.setText("Insira um id válido!");
                    IdProd.setText("");
                }
            }
            Tabela();

        } catch (Exception e) {

            //ERRO NO CADASTRO DO PRODUTO E QUAL TIPO DE ERRO(MOSTRADO APENAS NO CONSOLE)
            System.out.println("ERRO!" + e.getMessage());
        }
    }//GEN-LAST:event_AdicionarBtnActionPerformed

    private void BuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarIDActionPerformed

    private void TabelaProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaProdMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarBtn;
    private javax.swing.JLabel AvisoBuscaNome;
    private javax.swing.JLabel AvisoID;
    private javax.swing.JLabel AvisoNome;
    private javax.swing.JLabel AvisoQtd;
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JFormattedTextField BuscarID;
    private javax.swing.JFormattedTextField IdProd;
    private javax.swing.JFormattedTextField PrecoProd;
    private javax.swing.JLabel PrecoProdText;
    private javax.swing.JFormattedTextField QtdProd;
    private javax.swing.JTable TabelaProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
