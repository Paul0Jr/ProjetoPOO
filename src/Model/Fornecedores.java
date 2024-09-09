package Model;

import DAO.Conexao;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import DAO.Fornecedor;

public class Fornecedores extends javax.swing.JPanel {

    String nome;
    int id = 0, notfound = 0, cnpj = 0;
    Connection con = Conexao.getConnection();
    ResultSet rs = null;
    PreparedStatement ps = null;

    public Fornecedores() {
        initComponents();
        tabela();
    }

    private void tabela() {

        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM fornecedores");
                rs = ps.executeQuery();
                java.sql.ResultSetMetaData rsmd = rs.getMetaData();
                int n = rsmd.getColumnCount();
                DefaultTableModel dtm = (DefaultTableModel) TabelaProd.getModel();
                dtm.setRowCount(0);

                while (rs.next()) {
                    Vector vetor = new Vector();
                    for (int i = 1; i < n; i++) {
                        vetor.add(rs.getString(1));
                        vetor.add(rs.getString(2));
                        vetor.add(rs.getString(3));
                    }
                    dtm.addRow(vetor);
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
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BuscarNome = new javax.swing.JFormattedTextField();
        BuscarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProd = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        IdForn = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        NomeForn = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        AdicionarBtn = new javax.swing.JButton();
        AttBtn = new javax.swing.JButton();
        DeletarBtn = new javax.swing.JButton();
        AvisoID = new javax.swing.JLabel();
        AvisoNome = new javax.swing.JLabel();
        AvisoQtd = new javax.swing.JLabel();
        AvisoPreco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cnpjforn = new javax.swing.JFormattedTextField();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GERENCIADOR DE FORNECEDORES");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hand (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BUSCAR FORNECEDOR");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BUSCAR NOME:");

        BuscarNome.setBackground(new java.awt.Color(255, 255, 255));
        BuscarNome.setForeground(new java.awt.Color(0, 0, 0));
        BuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNomeActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(BuscarBtn)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BuscarBtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        TabelaProd.setBackground(new java.awt.Color(255, 255, 255));
        TabelaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID FORNE", "NOME", "NÚMERO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaProd);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID FORNE:");

        IdForn.setBackground(new java.awt.Color(255, 255, 255));
        IdForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdFornActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOME:");

        NomeForn.setBackground(new java.awt.Color(255, 255, 255));
        NomeForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeFornActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CNPJ");

        AdicionarBtn.setBackground(new java.awt.Color(0, 102, 0));
        AdicionarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AdicionarBtn.setForeground(new java.awt.Color(255, 255, 255));
        AdicionarBtn.setText("ADICIONAR");
        AdicionarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdicionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarBtnActionPerformed(evt);
            }
        });

        AttBtn.setBackground(new java.awt.Color(0, 102, 0));
        AttBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AttBtn.setForeground(new java.awt.Color(255, 255, 255));
        AttBtn.setText("ATUALIZAR");
        AttBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AttBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttBtnActionPerformed(evt);
            }
        });

        DeletarBtn.setBackground(new java.awt.Color(0, 102, 0));
        DeletarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeletarBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeletarBtn.setText("DELETAR");
        DeletarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeletarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarBtnActionPerformed(evt);
            }
        });

        AvisoID.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoID.setForeground(new java.awt.Color(255, 0, 0));

        AvisoNome.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoNome.setForeground(new java.awt.Color(255, 0, 0));

        AvisoQtd.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoQtd.setForeground(new java.awt.Color(255, 0, 0));

        AvisoPreco.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoPreco.setForeground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("GERENCIAR FORNECEDOR");

        cnpjforn.setBackground(new java.awt.Color(255, 255, 255));
        cnpjforn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjfornActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(AvisoPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AvisoQtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AvisoNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NomeForn, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(AvisoID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdForn)
                            .addComponent(cnpjforn)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(AdicionarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AttBtn)
                        .addGap(18, 18, 18)
                        .addComponent(DeletarBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvisoID, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpjforn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(AvisoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvisoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdicionarBtn)
                            .addComponent(AttBtn)
                            .addComponent(DeletarBtn))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
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


    private void BuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarNomeActionPerformed

    private void IdFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdFornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdFornActionPerformed

    private void NomeFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeFornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeFornActionPerformed

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        try {
            if (con != null) {
                if ("".equals(BuscarNome.getText())) {
                    JOptionPane.showMessageDialog(new JFrame(), "Necessário inserir o nome do fornecedor!", "Erro ao buscar!", JOptionPane.ERROR_MESSAGE);
                } else {
                    nome = BuscarNome.getText();
                    int pst = Fornecedor.buscar(nome, notfound);
                    if (pst == 1) {
                        System.out.println("OKAY");
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Fornecedor não encontrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    }
                }
                IdForn.setText("");
                NomeForn.setText("");
                cnpjforn.setText("");
                BuscarNome.setText("");
                tabela();
            }
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void AdicionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarBtnActionPerformed
        try {
            if (con != null) {
                //MENSAGENS DE ERRO
                if ("".equals(IdForn.getText()) || (IdForn.getText().length() <= 0)) {
                    AvisoID.setText("Insira um id válido!");
                    AvisoNome.setText("");
                    AvisoQtd.setText("");

                } else if ("".equals(NomeForn.getText()) || NomeForn.getText().length() <= 3) {
                    AvisoID.setText("");
                    AvisoNome.setText("Insira um nome válido!");
                    AvisoQtd.setText("");

                } else if ("".equals(cnpjforn.getText()) || cnpjforn.getText().length() <= 3) {
                    AvisoID.setText("");
                    AvisoNome.setText("");
                    AvisoQtd.setText("Insira um número válido!");

                } else {
                    nome = NomeForn.getText();
                    cnpj = Integer.parseInt(cnpjforn.getText());

                    //CONSULTA NO BANCO
                    int pst = Fornecedor.buscar(nome, notfound);
                    if (pst == 1) {
                        JOptionPane.showMessageDialog(new JFrame(), "O ID DIGITADO JÁ ESTÁ SENDO UTILIZADO!", "Erro ao adicionar!", JOptionPane.ERROR_MESSAGE);
                        AvisoID.setText("Insira um id válido!");
                        IdForn.setText("");
                    } else {
                        System.out.println("OKAY");
                        PreparedStatement pst1 = Fornecedor.adicionar(nome, cnpj, notfound);
                        IdForn.setText("");
                        NomeForn.setText("");
                        cnpjforn.setText("");
                        showMessageDialog(null, "Fornecedor adicionado com sucesso!");
                        AvisoID.setText("");
                        AvisoNome.setText("");
                        AvisoQtd.setText("");
                        AvisoPreco.setText("");
                    }
                    tabela();
                }
            }
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
    }//GEN-LAST:event_AdicionarBtnActionPerformed

    private void DeletarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarBtnActionPerformed
        try {
            if (con != null) {
                //ID VAZIO
                if (IdForn.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Insira apenas o ID do fornecedor que deseja deletar!", "Erro ao deletar!", JOptionPane.ERROR_MESSAGE);
                } else {
                    //CONSULTA NO BANCO
                    id = Integer.parseInt(IdForn.getText());
                    int query = Fornecedor.buscar(id, notfound);
                    if (query == 1) {
                        showMessageDialog(null, "Fornecedor deletado com sucesso!");
                        AvisoID.setText("");
                        AvisoNome.setText("");
                        AvisoQtd.setText("");
                        AvisoPreco.setText("");
                        IdForn.setText("");
                        NomeForn.setText("");
                        cnpjforn.setText("");
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Fornecedor não encontrado!", "Erro ao deletar!", JOptionPane.ERROR_MESSAGE);
                    }
                    tabela();
                }
            }
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
    }//GEN-LAST:event_DeletarBtnActionPerformed

    private void AttBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttBtnActionPerformed
        try {
            if (con != null) {
                if (IdForn.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Insira o ID do fornecedor que deseja atualizar as informações!", "Erro ao atualizar!", JOptionPane.ERROR_MESSAGE);
                } else {
                    id = Integer.parseInt(IdForn.getText());
                    //CONSULTA NO BANCO
                    int query = Fornecedor.buscar(id, notfound);

                    //VALIDAÇÃO DE DADOS
                    if (query == 1) {
                        //ATUALIZAÇÃO DE NOME
                        if (!NomeForn.getText().isEmpty()) {
                            nome = NomeForn.getText();
                            PreparedStatement pst = Fornecedor.atualizar(nome, id);

                            //ATUALIZAÇÃO DE CNPJ
                        }
                        if (!cnpjforn.getText().isEmpty()) {
                            cnpj = Integer.parseInt(cnpjforn.getText());
                            PreparedStatement pst = Fornecedor.atualizar(cnpj, id);
                            AvisoID.setText("");

                        }
                        showMessageDialog(null, "Fornecedor atualizado com sucesso!");

                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Fornecedor não encontrado na base de dados!", "Erro ao atualizar!", JOptionPane.ERROR_MESSAGE);
                    }
                    AvisoID.setText("");
                    AvisoNome.setText("");
                    AvisoQtd.setText("");
                    AvisoPreco.setText("");
                    IdForn.setText("");
                    NomeForn.setText("");
                    cnpjforn.setText("");
                    tabela();
                }
            }
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
    }//GEN-LAST:event_AttBtnActionPerformed

    private void cnpjfornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjfornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjfornActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarBtn;
    private javax.swing.JButton AttBtn;
    private javax.swing.JLabel AvisoID;
    private javax.swing.JLabel AvisoNome;
    private javax.swing.JLabel AvisoPreco;
    private javax.swing.JLabel AvisoQtd;
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JFormattedTextField BuscarNome;
    private javax.swing.JButton DeletarBtn;
    private javax.swing.JFormattedTextField IdForn;
    private javax.swing.JFormattedTextField NomeForn;
    private javax.swing.JTable TabelaProd;
    private javax.swing.JFormattedTextField cnpjforn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
