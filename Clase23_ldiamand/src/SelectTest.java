import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.apache.derby.jdbc.ClientDriver;


public class SelectTest {

	public static void main(String[] args) {
		//ClientDriver cd = new ClientDriver();
		String url = "jdbc:derby://localhost:1527/test";
		try {
		Class.forName(
				"org.apache.derby.jdbc.ClientDriver");
		Connection conn =
				DriverManager.getConnection(url);
		
		Statement st = conn.createStatement();
		ResultSet rs =
			st.executeQuery(
			"SELECT * FROM usuarios WHERE usuario LIKE 'A%'");
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String usuario = rs.getString("usuario");
			String clave = rs.getString("clave");
			String email = rs.getString("email");
			System.out.println("{ " + id + ", " +
				usuario + ", " + clave + ", " +
				email + " }");
		}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
