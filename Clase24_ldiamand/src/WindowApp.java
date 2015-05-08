import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class WindowApp {

	private JFrame frame;
	
	private UsuarioDao dao;
	private JTextField usuarioField;
	private JPasswordField passwordField;
	private JTextField emailField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowApp window = new WindowApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		dao = new UsuarioDao();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(86, 64, 60, 15);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblClave = new JLabel("Clave:");
		lblClave.setBounds(97, 91, 49, 15);
		frame.getContentPane().add(lblClave);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(97, 118, 49, 15);
		frame.getContentPane().add(lblEmail);
		
		usuarioField = new JTextField();
		usuarioField.setBounds(157, 62, 114, 19);
		frame.getContentPane().add(usuarioField);
		usuarioField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 89, 114, 19);
		frame.getContentPane().add(passwordField);
		
		emailField_1 = new JTextField();
		emailField_1.setBounds(157, 116, 114, 19);
		frame.getContentPane().add(emailField_1);
		emailField_1.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sUsuario = usuarioField.getText();
				char [] password = passwordField.getPassword();
				String email = emailField_1.getText();
				Usuario usuario = new Usuario(sUsuario,
						password, email);
				dao.insert(usuario);
			}
		});
		btnGuardar.setBounds(138, 185, 117, 25);
		frame.getContentPane().add(btnGuardar);
	}
}
