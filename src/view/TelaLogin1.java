package view;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.ResultSet;
import DAO.Conexao;
import DAO.LoginCad;
import view.Menu;

public class TelaLogin1 extends javax.swing.JFrame {

    public TelaLogin1() {
        initComponents();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        TelaDireita = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        StockEasy = new javax.swing.JLabel();
        StockEasy1 = new javax.swing.JLabel();
        TelaEsquerda = new javax.swing.JPanel();
        TextoLogin = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        AvisoSenha = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        SenhaText = new javax.swing.JPasswordField();
        AvisoEmail = new javax.swing.JLabel();
        CadastroTexto = new javax.swing.JLabel();
        BotaoCad = new javax.swing.JButton();
        BotaoLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setPreferredSize(new java.awt.Dimension(800, 500));
        Login.setLayout(null);

        TelaDireita.setBackground(new java.awt.Color(204, 204, 204));
        TelaDireita.setPreferredSize(new java.awt.Dimension(400, 500));

        Logo.setBackground(new java.awt.Color(0, 153, 0));
        Logo.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stockeasy (1).png"))); // NOI18N

        StockEasy.setBackground(new java.awt.Color(0, 153, 0));
        StockEasy.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        StockEasy.setForeground(new java.awt.Color(0, 0, 0));
        StockEasy.setText("StockEasy");

        StockEasy1.setBackground(new java.awt.Color(0, 153, 0));
        StockEasy1.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        StockEasy1.setForeground(new java.awt.Color(0, 0, 0));
        StockEasy1.setText("Facilitando sua vida");

        javax.swing.GroupLayout TelaDireitaLayout = new javax.swing.GroupLayout(TelaDireita);
        TelaDireita.setLayout(TelaDireitaLayout);
        TelaDireitaLayout.setHorizontalGroup(
            TelaDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaDireitaLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(TelaDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo)
                    .addGroup(TelaDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaDireitaLayout.createSequentialGroup()
                            .addComponent(StockEasy)
                            .addGap(114, 114, 114))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaDireitaLayout.createSequentialGroup()
                            .addComponent(StockEasy1)
                            .addGap(148, 148, 148)))))
        );
        TelaDireitaLayout.setVerticalGroup(
            TelaDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaDireitaLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(StockEasy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StockEasy1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logo)
                .addGap(102, 102, 102))
        );

        Login.add(TelaDireita);
        TelaDireita.setBounds(360, 0, 440, 500);

        TelaEsquerda.setBackground(new java.awt.Color(0, 102, 102));
        TelaEsquerda.setPreferredSize(new java.awt.Dimension(400, 500));

        TextoLogin.setBackground(new java.awt.Color(0, 153, 0));
        TextoLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        TextoLogin.setForeground(new java.awt.Color(255, 255, 255));
        TextoLogin.setText("LOGUE SUA CONTA");

        Email.setBackground(new java.awt.Color(0, 0, 0));
        Email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");

        EmailText.setBackground(new java.awt.Color(255, 255, 255));

        AvisoSenha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoSenha.setForeground(new java.awt.Color(255, 0, 0));

        Senha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setText("Senha");

        SenhaText.setBackground(new java.awt.Color(255, 255, 255));

        AvisoEmail.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoEmail.setForeground(new java.awt.Color(255, 0, 0));

        CadastroTexto.setForeground(new java.awt.Color(255, 255, 255));
        CadastroTexto.setText("Não possui conta?");
        CadastroTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BotaoCad.setBackground(new java.awt.Color(255, 255, 255));
        BotaoCad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotaoCad.setForeground(new java.awt.Color(255, 51, 51));
        BotaoCad.setText("Realizar Cadastro");
        BotaoCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadActionPerformed(evt);
            }
        });

        BotaoLogin.setBackground(new java.awt.Color(0, 102, 0));
        BotaoLogin.setForeground(new java.awt.Color(255, 255, 255));
        BotaoLogin.setText("LOGIN");
        BotaoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoLogin.setPreferredSize(new java.awt.Dimension(80, 500));
        BotaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLoginActionPerformed(evt);
            }
        });
        BotaoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoLoginKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BotaoLoginKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout TelaEsquerdaLayout = new javax.swing.GroupLayout(TelaEsquerda);
        TelaEsquerda.setLayout(TelaEsquerdaLayout);
        TelaEsquerdaLayout.setHorizontalGroup(
            TelaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaEsquerdaLayout.createSequentialGroup()
                .addGroup(TelaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaEsquerdaLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(TextoLogin))
                    .addGroup(TelaEsquerdaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(TelaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AvisoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TelaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(TelaEsquerdaLayout.createSequentialGroup()
                                    .addComponent(CadastroTexto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotaoCad))
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SenhaText, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                .addComponent(EmailText, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                .addComponent(BotaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AvisoSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        TelaEsquerdaLayout.setVerticalGroup(
            TelaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaEsquerdaLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(TextoLogin)
                .addGap(68, 68, 68)
                .addComponent(Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvisoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SenhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(AvisoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(TelaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCad)
                    .addComponent(CadastroTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        Login.add(TelaEsquerda);
        TelaEsquerda.setBounds(-10, 0, 370, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadActionPerformed
        TelaCadastro1 telacad = new TelaCadastro1();
        telacad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotaoCadActionPerformed

    private void BotaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLoginActionPerformed

        //CONEXAO COM O BANCO
        String nome = null, email = null, senha = null;
        Connection con = Conexao.getConnection();
        int notfound = 0;
        try {
            email = EmailText.getText();
            senha = new String(SenhaText.getPassword()).trim();
            int pst = LoginCad.logar(email, nome, senha, notfound);
            if (pst == 1) {
                System.out.println("OKAY");
                Menu MenuFrame = new Menu();
                MenuFrame.setVisible(true);
                MenuFrame.pack();
                MenuFrame.setLocationRelativeTo(null);
                MenuFrame.setExtendedState(Menu.MAXIMIZED_BOTH);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Email ou senha incorreto!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
    }//GEN-LAST:event_BotaoLoginActionPerformed

    private void BotaoLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoLoginKeyPressed

    }//GEN-LAST:event_BotaoLoginKeyPressed

    private void BotaoLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoLoginKeyTyped

    }//GEN-LAST:event_BotaoLoginKeyTyped

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisoEmail;
    private javax.swing.JLabel AvisoSenha;
    private javax.swing.JButton BotaoCad;
    private javax.swing.JButton BotaoLogin;
    private javax.swing.JLabel CadastroTexto;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailText;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Senha;
    private javax.swing.JPasswordField SenhaText;
    private javax.swing.JLabel StockEasy;
    private javax.swing.JLabel StockEasy1;
    private javax.swing.JPanel TelaDireita;
    private javax.swing.JPanel TelaEsquerda;
    private javax.swing.JLabel TextoLogin;
    // End of variables declaration//GEN-END:variables
}
