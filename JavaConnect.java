/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Om
 */
public class JavaConnect {
    
    Connection conn;
    
    public static Connection Connectdb(){
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","niit");  
            return conn;
        
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null, e);
        
            return null;
        }
    }
    
    
    
}
