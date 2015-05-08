import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import org.apache.derby.jdbc.ClientDriver;


public class DBTest {

	public static void main(String[] args) {
		//ClientDriver cd = new ClientDriver();
		String url = "jdbc:derby://localhost:1527/test";
		try {
		Class.forName(
				"org.apache.derby.jdbc.ClientDriver");
		Connection conn =
				DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
