package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String BDurl = "jdbc:MySQL://127.0.0.1:3306/stockeasy";
    private static String BDusuario = "root";
    private static String BDsenha = "root1234";

    public static Connection getConnection() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(BDurl, BDusuario, BDsenha);
        } catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        return null;
    }
}
