import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class UsuarioDao {

	private Connection c;
	
	public UsuarioDao () {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			c = DriverManager.getConnection(
					"jdbc:derby://localhost:1527/test"
					, "app", "app");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert(Usuario usuario) {
		String sql = "INSERT INTO usuarios ("
			+ "usuario, clave, email) VALUES ('"
			+ usuario.getUsuario() + "', '"
			+ String.valueOf(usuario.getClave()) + "', '" 
			+ usuario.getEmail() + "')";
		
		try {
			Statement st = c.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
