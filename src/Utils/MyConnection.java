/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raid
 */

public class MyConnection {
    private static final String url ="JDBC:mysql://localhost/mybd";
    private  static String user="root";
    private  static String mdp="";
    private static Connection conn;
    
    public static MyConnection inst;

    public static Connection getConn() {
        return conn;
    }
    
    
    /*public static void  ooo()
    {
        try {
            conn=DriverManager.getConnection(url,user,mdp);
            
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    
    private  MyConnection()
    {
        try {
            conn=DriverManager.getConnection(url,user,mdp);
            
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    public static MyConnection getInstance()
    {
        if(inst==null)
            inst = new MyConnection();
        
        return inst;
    }
    
}
