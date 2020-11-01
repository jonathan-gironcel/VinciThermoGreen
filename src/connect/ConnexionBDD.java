package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;


public class ConnexionBDD {	
	public static void requete(String[] args)throws ParseException, SQLException{
		String resultat;
		Connection cn = null;	
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vincithermogreen?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","user_1","P@ssw0rd");	
			System.out.println("Connected to database");
			st = cn.createStatement();
			
			System.out.println("Statement created");
			
							
			}
		catch(SQLException e){ e.printStackTrace();}
		
		catch( ClassNotFoundException e){e.printStackTrace();}
		
		String sql = "SELECT * FROM stade";
		
		rs = st.executeQuery(sql);
	
		while (rs.next()) {
			resultat = rs.getString("NOM_STADE");
			System.out.println(resultat);
		}		
		
	}
	

	public String resultat;

	

	
}