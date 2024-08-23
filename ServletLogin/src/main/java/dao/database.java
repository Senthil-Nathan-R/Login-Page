package dao;
import java.sql.*;


public class database {
	
	private final static String url = "jdbc:mysql://localhost:3306/LOGIN";
	private final static String username = "root";
	private final static String passwords = "1811";
	
	public boolean login(String email,String upassword) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,passwords);
			String query="SELECT * FROM USERS WHERE EMAIL=? AND UPASSWORD=?;";
			PreparedStatement pst=con.prepareStatement(query);
			int password=Integer.parseInt(upassword);
			pst.setString(1, email);
			pst.setInt(2, password);
			ResultSet rst=pst.executeQuery();
			if(rst.next()) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	     return false;
		}
		
	public boolean signup(String name,String email,String upassword) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,passwords);
			String query="INSERT INTO USERS VALUES(?,?,?);";
			PreparedStatement pst=con.prepareStatement(query);
			int password=Integer.parseInt(upassword);
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setInt(3, password);
			int row=pst.executeUpdate();
			if(row>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
			
	
}
