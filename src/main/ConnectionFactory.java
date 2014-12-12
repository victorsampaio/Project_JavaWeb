package main;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author VictorSampaio
 *
 */
public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			System.out.println("--- Try ---");
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/test","root","vertrigo");
			
		} catch (Exception e) {
			System.out.println("--- Catch - Exception ---");
			System.out.println("ERROR: " + e.getMessage());
			e.getMessage();
			throw new RuntimeException(e);
		}		
	}
}
