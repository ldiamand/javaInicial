
public class Usuario {

	private Integer id;
	
	private String usuario;
	
	private char [] clave;
	
	private String email;
	
	public Usuario(String usuario,
			char [] clave, String email) {
		this.usuario = usuario;
		this.clave = clave;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public String getUsuario() {
		return usuario;
	}

	public char [] getClave() {
		return clave;
	}

	public String getEmail() {
		return email;
	}
	
}
