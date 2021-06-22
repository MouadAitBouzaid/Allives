package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static Connection conn;

public static synchronized Connection getConnection() {
	
	if ( conn==null ) {
       try {
    	   Class.forName("com.mysql.cj.jdbc.Driver");
  conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/allives", "root", "root");

} catch (Exception e) { 
e.printStackTrace();
}
    }
return conn;

}
}
