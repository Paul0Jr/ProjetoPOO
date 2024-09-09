package DAO;

import DAO.Conexao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import view.Menu;
import view.TelaLogin1;

public class LoginCad {

    public static int logar(String email, String nome, String senha, int notfound) {
        try {
            String emailBD;
            String senhaBD;
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM login_cadastro WHERE email ='" + email + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nome = rs.getString("nome_comp");
                emailBD = rs.getString("email");
                senhaBD = rs.getString("senha");
                notfound = 1;
                if (notfound == 1 && email.equals(emailBD) && senha.equals(senhaBD)) {
                    showMessageDialog(null, "Seja bem vindo, " + nome + "!");
                    notfound = 1;
                } else {
                    notfound = 0;
                } //Eu não faço ideia de como que isso funciona, mas só não mexe nisso plmds.
            }
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return notfound;
    }

    public static PreparedStatement criar(String email, String nomecomp, String senha) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO login_cadastro (nome_comp, email, senha)" + "VALUES('" + nomecomp + "', '" + email + "', '" + senha + "')");
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return null;
    }
}
