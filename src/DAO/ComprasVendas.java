package DAO;

import java.sql.*;
public class ComprasVendas {

    static String nomebd;
    static float gastobd;
    static int idbd = 0, qtdbd = 0, idprodbd = 0;
    static float precobd = 0;

    public static int buscarcompras(int id) {
        int notfound = 0;
        try {
            Connection con = Conexao.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM produtos WHERE id ='" + id + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nomebd = rs.getString("nome");
                idprodbd = rs.getInt("id");
                notfound = 1;
            }
        } catch (SQLException e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return notfound;
    }
}
