package com.mycompany.stockeasy;
import telas.login;

public class StockEasy {

    public static void main(String[] args) {
        try{
        login start = new login();
        start.setVisible(true);
        start.pack();
        start.setLocationRelativeTo(null);
        }
        catch (Exception e) {
            System.out.println("ERRO!" + e.getMessage());
        }
    }
}
