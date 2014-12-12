import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author VictorSampaio
 *
 */

public class ProjectJavaWebMain {

			public static void main(String[] args) throws SQLException {
				
				Connection con = null;
				try {
				con = new ConnectionFactory().getConnection();
				System.out.println("--------------");
				System.out.println("Connection: Open!");
				System.out.println("--------------");
				
				String sql = "insert into contact" + " (name,email,address)" + " values(?,?,?)";
				
				PreparedStatement stmt = con.prepareStatement(sql);	
				
				//Values
				stmt.setString(1,"Tiago");
				stmt.setString(2,"tico@email.com");
				stmt.setString(3,"rua tico 123");
				
				stmt.execute();
				System.out.println("--//--//--//--//--");
				System.out.println("Executing 'sql' !");
				System.out.println("--//--//--//--//--");
			
				stmt.close();
				System.out.println("-- Recorded --");
														
				} catch (Exception e){
					System.out.println("ERROR: ");
					System.out.println(e);
				} finally {
					con.close();
					System.out.println("--//--//--//--//--");
					System.out.println("Connection: Close!");
					System.out.println("--//--//--//--//--");
				}
			}
	
	}


