package DAO;

import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Produto {

    static String nomebd;
    static int idbd = 0, qtdbd = 0;
    static float precobd = 0;

    public static PreparedStatement criar(String nome, String forn, int qtd, float preco) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO produtos (nome, forn, quantidade, preco)" + "VALUES('" + nome + "', '" + forn + "', '" + qtd + "', '" + preco + "')");
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return null;
    }

    public static int buscar(String nome, int notfound) {

        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM produtos WHERE nome ='" + nome + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nomebd = rs.getString("nome");
                idbd = rs.getInt("id");
                qtdbd = rs.getInt("quantidade");
                precobd = rs.getFloat("preco");
                notfound = 1;
                if (notfound == 1) {
                    showMessageDialog(null, "ID: " + idbd + "\nNome: " + nomebd + "\nQuantidade: " + qtdbd + "\nPreço: R$" + precobd);
                }
            }
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return notfound;
    }

    public static int buscar(int id, int notfound) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM produtos WHERE id ='" + id + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nomebd = rs.getString("nome");
                idbd = rs.getInt("id");
                qtdbd = rs.getInt("quantidade");
                precobd = rs.getFloat("preco");
                notfound = 1;
                if (notfound == 1) {
                    showMessageDialog(null, "ID: " + idbd + "\nNome: " + nomebd + "\nQuantidade: " + qtdbd + "\nPreço: R$" + precobd);
                }
            }
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return notfound;
    }

    public static PreparedStatement deletar(int id) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("DELETE FROM produtos WHERE id =" + id);
            pst.execute();
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return null;
    }

    public static PreparedStatement atualizar(String nome, int id) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("UPDATE produtos SET nome = '" + nome + "' WHERE id = '" + id + "'");
            pst.execute();
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return null;
    }

    public static PreparedStatement atualizar(float preco, int id) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("UPDATE produtos SET preco = '" + preco + "' WHERE id = '" + id + "'");
            pst.execute();
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return null;
    }

    public static PreparedStatement atualizar(int quantidade, int id) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("UPDATE produtos SET quantidade = '" + quantidade + "' WHERE id = '" + id + "'");
            pst.execute();
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return null;
    }
}
