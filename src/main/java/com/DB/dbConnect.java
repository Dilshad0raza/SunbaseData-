package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnect {
     private static Connection con;
     
    static public Connection getcon() {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sunbase?user=root&password=admin");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return con;
    }
     
}
