import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 */

/**
 * @author VictorSampaio
 *
 */
public class TesteInsere {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		
		
		Connection conexao = DriverManager.getConnection(
				"jdbc:mysql://localhost/test","root","vertrigo");
				System.out.println("Conectado!");
				conexao.close();
	
		
		
	}

}
