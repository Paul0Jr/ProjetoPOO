/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Fornecedor {

    static String nomebd;
    static int idbd = 0, cnpjbd = 0;

    public static int buscar(String nome, int notfound) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM fornecedores WHERE nome ='" + nome + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nomebd = rs.getString("nome");
                idbd = rs.getInt("id");
                cnpjbd = rs.getInt("cnpj");
                notfound = 1;
                if (notfound == 1) {
                    showMessageDialog(null, "ID: " + idbd + "\nNome: " + nomebd + "\nCnpj: " + cnpjbd);
                } else {
                    notfound = 0;
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
            PreparedStatement pst = con.prepareStatement("SELECT * FROM fornecedores WHERE id ='" + id + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nomebd = rs.getString("nome");
                idbd = rs.getInt("id");
                cnpjbd = rs.getInt("cnpj");
                notfound = 1;
                if (notfound == 1) {
                    JOptionPane.showMessageDialog(null, "ID: " + idbd + "\nNome: " + nomebd + "\nCnpj: " + cnpjbd);
                }

            }
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return notfound;
    }

    public static PreparedStatement adicionar(String nome, int cnpj, int notfound) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO fornecedores (nome, cnpj)" + "VALUES('" + nome + "', '" + cnpj + "')");
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return null;
    }

    public static PreparedStatement deletar(int id) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("DELETE FROM fornecedores WHERE id =" + id);
            pst.execute();
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return null;
    }

    public static PreparedStatement atualizar(String nome, int id) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("UPDATE fornecedores SET nome = '" + nome + "' WHERE id = '" + id + "'");
            pst.execute();
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return null;
    }

    public static PreparedStatement atualizar(int cnpj, int id) {
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("UPDATE fornecedores SET cnpj = '" + cnpj + "' WHERE id = '" + id + "'");
            pst.execute();
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return null;
    }
}
