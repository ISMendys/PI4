/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Isaelsantos
 */
public class conector {
    
    private static final String DRIVER =  "com.mysql.jdbc.Driver";
    private static final String URL =  "jdbc:mysql//localhost:3306/dbusuario";
    private static final String USER =  "root";
    private static final String PASS =  "";
    
    public static Connection getConnection(){
        try {        
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão",ex);
        }
    }
    
    public static void fecharConecxao(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro!"+ex);
            }
        }
    }
    public static void fecharConecxao(Connection con,PreparedStatement stat){
        if(stat != null){
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println("Erro!"+ex);
            }
        }
        
       fecharConecxao(con);
    }
    public static void fecharConecxao(Connection con,PreparedStatement stat,ResultSet rc){
        if(rc != null){
            try {
                rc.close();
            } catch (SQLException ex) {
                System.err.println("Erro!"+ex);
            }
        }
        
       fecharConecxao(con,stat);
    }
}
