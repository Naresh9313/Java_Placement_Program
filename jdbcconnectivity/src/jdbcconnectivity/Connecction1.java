package jdbcconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecction1 {
	
	static Connection cn;	
	
	public static final String uname="root";
	public static final  String passwrd="naresh@9313";
	public static final  String url = "jdbc:mysql://localhost:3306/mca2student";
	
	
	
	public static Connection  getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection(url,uname,passwrd);
			System.out.println(cn);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
	

}
