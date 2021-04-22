package com.vehicleInsurance.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConnectionManagerMysql {
	static Connection con = null;
	
	  public static Connection connectToSql()  {
		  Locale locale = new Locale("en", "US");
	        ResourceBundle bundle = ResourceBundle.getBundle("resources",locale);
	        String class_name = bundle.getString("mysqlcname");
	        String url = bundle.getString("url");
	        String userid = bundle.getString("username");
	        String password = bundle.getString("password");
	        
//	        System.out.println(class_name);
	        try {
	            Class.forName(class_name);
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        
	       Connection con = null;
	    try {
	        con = DriverManager.getConnection(url,userid,password);
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	     if(con != null)
//	         System.out.println(" succesfully Connected");
	     
	        return con;
	        
	    }
	    
//	    public static void main(String[] args) {
//	        connectToSql();
//	    }

}