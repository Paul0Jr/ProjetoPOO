package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.*;
import DAO.Conexao;
import DAO.LoginCad;

public class TelaCadastro1 extends javax.swing.JFrame {
    public TelaCadastro1() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        TelaDireita = new javax.swing.JPanel();
        TelaEsquerda = new javax.swing.JPanel();
        TextoCadastro = new javax.swing.JLabel();
        NomeCad = new javax.swing.JLabel();
        NomeCadText = new javax.swing.JTextField();
        EmailCad = new javax.swing.JLabel();
        EmailCadText = new javax.swing.JTextField();
        SenhaCad = new javax.swing.JLabel();
        SenhaCadText = new javax.swing.JPasswordField();
        BotaoCadastrar = new javax.swing.JButton();
        LoginText = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        AvisoSenha = new javax.swing.JLabel();
        AvisoEmail = new javax.swing.JLabel();
        AvisoNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setPreferredSize(new java.awt.Dimension(800, 500));
        Login.setLayout(null);

        TelaDireita.setBackground(new java.awt.Color(0, 102, 102));
        TelaDireita.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout TelaDireitaLayout = new javax.swing.GroupLayout(TelaDireita);
        TelaDireita.setLayout(TelaDireitaLayout);
        TelaDireitaLayout.setHorizontalGroup(
            TelaDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        TelaDireitaLayout.setVerticalGroup(
            TelaDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Login.add(TelaDireita);
        TelaDireita.setBounds(360, 0, 450, 500);

        TelaEsquerda.setBackground(new java.awt.Color(204, 204, 204));
        TelaEsquerda.setPreferredSize(new java.awt.Dimension(400, 500));

        TextoCadastro.setBackground(new java.awt.Color(0, 102, 102));
        TextoCadastro.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        TextoCadastro.setForeground(new java.awt.Color(0, 102, 102));
        TextoCadastro.setText("CADASTRO");

        NomeCad.setBackground(new java.awt.Color(0, 0, 0));
        NomeCad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeCad.setForeground(new java.awt.Color(0, 0, 0));
        NomeCad.setText("Nome Completo");

        NomeCadText.setBackground(new java.awt.Color(255, 255, 255));

        EmailCad.setBackground(new java.awt.Color(0, 0, 0));
        EmailCad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EmailCad.setForeground(new java.awt.Color(0, 0, 0));
        EmailCad.setText("Email");

        EmailCadText.setBackground(new java.awt.Color(255, 255, 255));

        SenhaCad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SenhaCad.setForeground(new java.awt.Color(0, 0, 0));
        SenhaCad.setText("Senha");

        SenhaCadText.setBackground(new java.awt.Color(255, 255, 255));

        BotaoCadastrar.setBackground(new java.awt.Color(0, 102, 0));
        BotaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCadastrar.setText("CADASTRAR");
        BotaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        LoginText.setBackground(new java.awt.Color(255, 255, 255));
        LoginText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LoginText.setForeground(new java.awt.Color(0, 0, 0));
        LoginText.setText("Possui conta?");

        LoginBtn.setBackground(new java.awt.Color(255, 255, 255));
        LoginBtn.setForeground(new java.awt.Color(255, 51, 51));
        LoginBtn.setText("Login");
        LoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        AvisoSenha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoSenha.setForeground(new java.awt.Color(255, 0, 0));

        AvisoEmail.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoEmail.setForeground(new java.awt.Color(255, 0, 0));

        AvisoNome.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AvisoNome.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout TelaEsquerdaLayout = new javax.swing.GroupLayout(TelaEsquerda);
        TelaEsquerda.setLayout(TelaEsquerdaLayout);
        TelaEsquerdaLayout.setHorizontalGroup(
            TelaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaEsquerdaLayout.createSequentialGroup()
                .addGroup(TelaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaEsquerdaLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(TextoCadastro))
                    .addGroup(TelaEsquerdaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(TelaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmailCadText)
                            .addComponent(SenhaCadText)
                            .addComponent(NomeCadText)
                            .addComponent(SenhaCad)
                            .addComponent(EmailCad)
                            .addComponent(NomeCad)
                            .addComponent(BotaoCadastrar)
                            .addComponent(AvisoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AvisoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AvisoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaEsquerdaLayout.createSequentialGroup()
                                .addComponent(LoginText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LoginBtn)
                                .addGap(159, 159, 159)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        TelaEsquerdaLayout.setVerticalGroup(
            TelaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaEsquerdaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(TextoCadastro)
                .addGap(72, 72, 72)
                .addComponent(NomeCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeCadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvisoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(EmailCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailCadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(AvisoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(SenhaCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SenhaCadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvisoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(TelaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginText)
                    .addComponent(LoginBtn))
                .addGap(46, 46, 46))
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

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
       String nomecomp = null, emailbd = null, email = null, senha = null;
        System.out.println("Cadastro clicado!");
        Connection con = Conexao.getConnection();
        int notfound = 0;

        try {
            if(con!=null){

            //MENSAGENS DE ERRO
            if ("".equals(NomeCadText.getText()) || (NomeCadText.getText().length() <= 5)) {
                AvisoEmail.setText("");
                AvisoSenha.setText("");
                AvisoNome.setText("Necessário o nome completo!");
                //JOptionPane.showMessageDialog(new JFrame(), "Necessário o nome completo!", "Erro ao cadastrar!", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(EmailCadText.getText()) || (EmailCadText.getText().length() <= 6)) {
                AvisoNome.setText("");
                AvisoSenha.setText("");
                AvisoEmail.setText("Necessário o email do usuário!");
                //JOptionPane.showMessageDialog(new JFrame(), "Necessário o email do usuário!", "Erro ao cadastrar!", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(SenhaCadText.getPassword()) || (SenhaCadText.getPassword().length <8)) {
                AvisoEmail.setText("");
                AvisoNome.setText("");
                AvisoSenha.setText("Necessário senha de 8 caracteres!");
                //JOptionPane.showMessageDialog(new JFrame(), "Necessário inserir uma senha!", "Erro ao cadastrar!", JOptionPane.ERROR_MESSAGE);
            } else {
             
                nomecomp = NomeCadText.getText();
                email = EmailCadText.getText();
                senha = new String(SenhaCadText.getPassword()).trim();
                
                //ERRO CASO VALORES NÂO POSSUAM TAMANHO MÍNIMO
                if (nomecomp.equals(senha)) {
                    AvisoNome.setText("");
                    AvisoEmail.setText("");
                    AvisoSenha.setText("Insira uma senha diferente do seu nome!");
                } else if (nomecomp.equals(email)) {
                    AvisoNome.setText("");
                    AvisoSenha.setText("");
                    AvisoEmail.setText("Insira um email diferente do seu nome!");
                    //JOptionPane.showMessageDialog(new JFrame(), "Insira um email diferente do seu nome!", "Erro ao cadastrar!", JOptionPane.ERROR_MESSAGE);
                } else if (senha.equals(email)) {
                    AvisoNome.setText("");
                    AvisoEmail.setText("");
                    AvisoSenha.setText("Insira uma senha diferente do seu email!");
                    //JOptionPane.showMessageDialog(new JFrame(), "Insira uma senha diferente do seu email!", "Erro ao cadastrar!", JOptionPane.ERROR_MESSAGE);
                } else {

                    //CONSULTA NO BANCO
                    int pst = LoginCad.logar(email, nomecomp, senha, notfound);
                    if (pst == 1 && email.equals(email)) {
                        JOptionPane.showMessageDialog(new JFrame(), "Email já utilizado!", "Erro ao cadastrar!", JOptionPane.ERROR_MESSAGE);
                    } else {
                        //INSERIR NO BANCO
                        PreparedStatement pst1 = LoginCad.criar(email, nomecomp, senha);
                        NomeCadText.setText("");
                        EmailCadText.setText("");
                        SenhaCadText.setText("");
                        showMessageDialog(null, "Conta criada com sucesso!");

                        //SAIR DO CADASTRO
                        TelaLogin1 LoginFrame = new TelaLogin1();
                        LoginFrame.setVisible(true);
                        LoginFrame.pack();
                        LoginFrame.setLocationRelativeTo(null);
                        this.dispose();
                    }
                }
            }

        }} catch (Exception e) {

            //ERRO NO CADASTRO E QUAL TIPO DE ERRO(MOSTRADO APENAS NO CONSOLE
            System.out.println("ERRO!" + e.getMessage());
        }
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        //VOLTAR A TELA DE LOGIN
        TelaLogin1 LoginFrame = new TelaLogin1();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LoginBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisoEmail;
    private javax.swing.JLabel AvisoNome;
    private javax.swing.JLabel AvisoSenha;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JLabel EmailCad;
    private javax.swing.JTextField EmailCadText;
    private javax.swing.JPanel Login;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel LoginText;
    private javax.swing.JLabel NomeCad;
    private javax.swing.JTextField NomeCadText;
    private javax.swing.JLabel SenhaCad;
    private javax.swing.JPasswordField SenhaCadText;
    private javax.swing.JPanel TelaDireita;
    private javax.swing.JPanel TelaEsquerda;
    private javax.swing.JLabel TextoCadastro;
    // End of variables declaration//GEN-END:variables
}
