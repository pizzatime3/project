package �������α׷�����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;	
	
	public static UserDao userDao = new UserDao ();	
	
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234");
			System.out.println("db��������");
		}catch(Exception e) {
			System.out.println("DB��������  : "+ e);
		}
	}
}
