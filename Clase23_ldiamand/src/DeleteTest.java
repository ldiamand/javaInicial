import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.apache.derby.jdbc.ClientDriver;

public class DeleteTest {

	public static void main(String[] args) {
		// ClientDriver cd = new ClientDriver();
		String url = "jdbc:derby://localhost:1527/test";
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			Connection conn = 
				DriverManager.getConnection(url, "app", "app");

			Statement st = conn.createStatement();
			int cant = st.executeUpdate(
				"DELETE FROM usuarios"
				+ " WHERE id = 1");

			System.out.println("Registros: " + cant);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
