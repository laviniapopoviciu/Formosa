package db;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseCreator {
	public static void main(String[] args) {
		dropOldDatabase(); //Schema und alte DB  geloescht
		createNewDatabase(); // schema wird hier angelegt
		insertDummyData();

	}
private static void dropOldDatabase() {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:derby:formosa_DB; create=true; user=lavinia; passwort=test");
			System.out.println("Connection established");
			
			Statement stmt = con.createStatement();
			
			stmt.execute("DROP TABLE ACC_FORMOSA");
			System.out.println("Table ACC_FORMOSA dropped");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	private static void createNewDatabase() {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:derby:formosa_DB; create=true; user=lavinia; passwort=test");
			System.out.println("Connection established");
			
			Statement stmt = con.createStatement();
			
			stmt.execute("CREATE TABLE ACC_FORMOSA (id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY, " + "username VARCHAR(255), " 
						+ "service VARCHAR(255))" + "salon VARCHAR(255))" );
			System.out.println("New Table created");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

private static void insertDummyData() {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:derby:formosa_DB; create=true; user=lavinia; password=true");
			System.out.println("Connection established");
			
			PreparedStatement pStmt = con.prepareStatement("INSERT INTO ACC_FORMOSA (username, service, salon) VALUES(?, ?)");
			
//			pStmt.setLong(1, 1);
			pStmt.setString(1,"Lavinia");
			pStmt.setString(2, "Haircut");
			pStmt.setString(3, "LaruBeauty");
			
			int rowsChanged = pStmt.executeUpdate();
			System.out.println("Rows changed " + rowsChanged);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}