 package Model;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.*;
import java.util.Vector;
import DAO.Conexao;
import javax.swing.table.DefaultTableModel;
import DAO.Produto;

public class Produtos extends javax.swing.JPanel {

    Connection con = Conexao.getConnection();
    ResultSet rs = null;
    PreparedStatement ps = null;

    public Produtos() {
        initComponents();
        Tabela();
    }

    private void Tabela() {

        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM produtos");
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
                        vetor.add(rs.getString(4));
                        vetor.add(rs.getString(5));
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
        AvisoBuscaNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProd = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        IdProd = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        NomeForn = new javax.swing.JFormattedTextField();
        QtdProd = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        PrecoProd = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        AdicionarBtn = new javax.swing.JButton();
        AttBtn = new javax.swing.JButton();
        DeletarBtn = new javax.swing.JButton();
        AvisoID = new javax.swing.JLabel();
        AvisoNome = new javax.swing.JLabel();
        AvisoQtd = new javax.swing.JLabel();
        AvisoPreco = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NomeProd = new javax.swing.JFormattedTextField();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTOQUE DE PRODUTOS");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prod.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BUSCAR PRODUTO");

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

        AvisoBuscaNome.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoBuscaNome.setForeground(new java.awt.Color(255, 0, 0));

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
                                .addGap(177, 177, 177)
                                .addComponent(AvisoBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(BuscarBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(BuscarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvisoBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TabelaProd.setBackground(new java.awt.Color(255, 255, 255));
        TabelaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID PROD", "NOME", "FORNECEDOR", "QTD", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
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
        jLabel4.setText("ID PROD");

        IdProd.setBackground(new java.awt.Color(255, 255, 255));
        IdProd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        IdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdProdActionPerformed(evt);
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

        QtdProd.setBackground(new java.awt.Color(255, 255, 255));
        QtdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtdProdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("QTD:");

        PrecoProd.setBackground(new java.awt.Color(255, 255, 255));
        PrecoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecoProdActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("FORNECEDOR");

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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PREÇO:");

        NomeProd.setBackground(new java.awt.Color(255, 255, 255));
        NomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(AdicionarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(AttBtn)
                        .addGap(18, 18, 18)
                        .addComponent(DeletarBtn))
                    .addComponent(AvisoNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AvisoID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(IdProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(NomeForn, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(QtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(AvisoPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(163, 163, 163)
                .addComponent(AvisoQtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addComponent(AvisoID, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(NomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(AvisoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(AvisoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdicionarBtn)
                    .addComponent(AttBtn)
                    .addComponent(DeletarBtn))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
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

    String nome, forn;
    int id, qtd;
    float preco;
    int notfound = 0;

    private void BuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarNomeActionPerformed

    private void NomeFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeFornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeFornActionPerformed

    private void QtdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtdProdActionPerformed

    private void PrecoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecoProdActionPerformed

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        try {
            if (con != null) {
                nome = BuscarNome.getText();
                //id = Integer.parseInt(BuscarID.getText());
                int pst = Produto.buscar(nome, notfound);
                if (pst == 1) {
                    System.out.println("OKAY");
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Produto não encontrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            }
            Tabela();
            IdProd.setText("");
            NomeForn.setText("");
            QtdProd.setText("");
            PrecoProd.setText("");
            BuscarNome.setText("");
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void AdicionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarBtnActionPerformed
        try {
            if (con != null) {

                //MENSAGENS DE ERRO
                if ("".equals(IdProd.getText()) || (IdProd.getText().length() <= 0)) {
                    AvisoID.setText("Insira um id válido!");
                    AvisoNome.setText("");
                    AvisoQtd.setText("");
                    AvisoPreco.setText("");

                } else if ("".equals(NomeForn.getText()) || NomeForn.getText().length() <= 3) {
                    AvisoID.setText("");
                    AvisoNome.setText("Insira um nome válido!");
                    AvisoQtd.setText("");
                    AvisoPreco.setText("");

                } else if ("".equals(QtdProd.getText()) || QtdProd.getText().length() <= 0) {
                    AvisoID.setText("");
                    AvisoNome.setText("");
                    AvisoQtd.setText("Insira uma quantidade válida!");
                    AvisoPreco.setText("");
 
                } else if ("".equals(PrecoProd.getText()) || PrecoProd.getText().length() <= 0) {
                    AvisoID.setText("");
                    AvisoNome.setText("");
                    AvisoQtd.setText("");
                    AvisoPreco.setText("Insira um preço válido!");
                } else {

                    id = Integer.parseInt(IdProd.getText());
                    nome = NomeProd.getText();
                    forn = NomeForn.getText();
                    qtd = Integer.parseInt(QtdProd.getText());
                    
                    preco = (int) Float.parseFloat(PrecoProd.getText());

                    //CRIAÇÃO NO BANCO
                    PreparedStatement pst1 = Produto.criar(nome, forn, qtd, preco);
                    IdProd.setText("");
                    NomeForn.setText("");
                    QtdProd.setText("");
                    NomeProd.setText("");
                    PrecoProd.setText("");
                    showMessageDialog(null, "Produto adicionado com sucesso!");
                    AvisoID.setText("");
                    AvisoNome.setText("");
                    AvisoQtd.setText("");
                    AvisoPreco.setText("");
                }
                Tabela();

            }
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
    }//GEN-LAST:event_AdicionarBtnActionPerformed
    }
    private void DeletarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarBtnActionPerformed
        try {
            if (con != null) {

                //ID VAZIO
                if (IdProd.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Insira apenas o ID do produto que deseja deletar!", "Erro ao deletar!", JOptionPane.ERROR_MESSAGE);
                } else {

                    //CONSULTA NO BANCO
                    id = Integer.parseInt(IdProd.getText());
                    int query = Produto.buscar(id, notfound);

                    if (query == 1) {
                        PreparedStatement pst = Produto.deletar(id);
                        showMessageDialog(null, "Produto deletado com sucesso!");
                        IdProd.setText("");
                        NomeForn.setText("");
                        QtdProd.setText("");
                        PrecoProd.setText("");
                        AvisoID.setText("");
                        AvisoNome.setText("");
                        AvisoQtd.setText("");
                        AvisoPreco.setText("");

                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Produto não encontrado!", "Erro ao deletar!", JOptionPane.ERROR_MESSAGE);
                    }
                    Tabela();

                }
            }
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
    }//GEN-LAST:event_DeletarBtnActionPerformed

    private void AttBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttBtnActionPerformed
        try {
            if (con != null) {
                if (IdProd.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Insira apenaso ID do produto que deseja atualizar as informações!", "Erro ao atualizar!", JOptionPane.ERROR_MESSAGE);
                } else {
                    id = Integer.parseInt(IdProd.getText());
                    //CONSULTA NO BANCO
                    int query = Produto.buscar(id, notfound);
                    //VALIDAÇÃO DE DADOS
                    if (query == 1) {
                        //ATUALIZAÇÃO DE NOME
                        if (!NomeForn.getText().isEmpty()) {
                            nome = NomeForn.getText();
                            PreparedStatement pst = Produto.atualizar(nome, id);

                            //ATUALIZAÇÃO DE QUANTIDADE
                        }
                        if (!QtdProd.getText().isEmpty()) {
                            qtd = Integer.parseInt(QtdProd.getText());
                            PreparedStatement pst = Produto.atualizar(qtd, id);

                            //ATUALIZAÇÃO DE PREÇO
                        }
                        if (!PrecoProd.getText().isEmpty()) {
                            preco = Float.parseFloat(PrecoProd.getText());
                            PreparedStatement pst = Produto.atualizar(preco, id);
                        }
                        IdProd.setText("");
                        NomeForn.setText("");
                        QtdProd.setText("");
                        PrecoProd.setText("");
                        AvisoID.setText("");
                        AvisoNome.setText("");
                        AvisoQtd.setText("");
                        AvisoPreco.setText("");
                        Tabela();

                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Produto não encontrado na base de dados!", "Erro ao atualizar!", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
    }//GEN-LAST:event_AttBtnActionPerformed

    private void NomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeProdActionPerformed

    private void IdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdProdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarBtn;
    private javax.swing.JButton AttBtn;
    private javax.swing.JLabel AvisoBuscaNome;
    private javax.swing.JLabel AvisoID;
    private javax.swing.JLabel AvisoNome;
    private javax.swing.JLabel AvisoPreco;
    private javax.swing.JLabel AvisoQtd;
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JFormattedTextField BuscarNome;
    private javax.swing.JButton DeletarBtn;
    private javax.swing.JFormattedTextField IdProd;
    private javax.swing.JFormattedTextField NomeForn;
    private javax.swing.JFormattedTextField NomeProd;
    private javax.swing.JFormattedTextField PrecoProd;
    private javax.swing.JFormattedTextField QtdProd;
    private javax.swing.JTable TabelaProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
