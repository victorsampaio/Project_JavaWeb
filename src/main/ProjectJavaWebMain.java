package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dao.ContactDAO;

/**
 * @author VictorSampaio
 *
 */
public class ProjectJavaWebMain {

	public static void main(String[] args) throws SQLException {
		
		Contact contato = new Contact();
		contato.setName("JonasSousa");
		contato.setEmail("jonas@email.com");
		contato.setAddress("Rua Sousa 32121");
		
		ContactDAO dao = new ContactDAO();
		
		dao.adiciona(contato);
		System.out.println("--- Registered ---");		
	}
}
