package dao; 

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

import main.ConnectionFactory;
import main.Contact;
/**
 * @author VictorSampaio
 *
 */

public class ContactDAO {

	private Connection connection;
	
	public ContactDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}	
	
	public void adiciona(Contact contact) {

		String sql = "insert into contact " +
		"(name,email,address)" +
		" values(?,?,?)";
		
		try {
			java.sql.PreparedStatement stmt = connection.prepareStatement(sql);
			
			//-- Set values
			stmt.setString(1, contact.getName());
			stmt.setString(2, contact.getEmail());
			stmt.setString(3, contact.getAddress());
			
			stmt.execute();
			stmt.close();		
		} catch (Exception e) {
			throw new RuntimeException(e);
		}		
	}
}
