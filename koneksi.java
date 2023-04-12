/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Ratih Mardianingsih
 */
public class koneksi {
    static Connection kon;
    
    public static Connection connection(){
        if (kon == null) {
            MysqlDataSource data = new MysqlDataSource
                    data.seDatabaseName("toko");
                    data.seUser("root");
                    data.setPassword("");
                    try {
                        kon = data.getConnection();
                        System.out.println("sudah konek");
                    } catch (SQLEcaption ex) {
                        System.out.println("tidak konek");
                    }
        }
        return kon;
    }
    
}
