import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JToggleButton;


public class BatallaServidor {

	private JFrame frame;
	
	private PrintWriter pw;
	
	private Scanner sc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BatallaServidor window = new BatallaServidor();
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
	public BatallaServidor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			ServerSocket ss = new ServerSocket(4444);
			Socket s = ss.accept();
			pw = new PrintWriter(s.getOutputStream(), true);
			sc = new Scanner(s.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		frame = new JFrame("Servidor");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
		
		final JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("1");
		frame.getContentPane().add(tglbtnNewToggleButton_1);
		
		final JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("2");
		frame.getContentPane().add(tglbtnNewToggleButton_2);
		
		final JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("3");
		frame.getContentPane().add(tglbtnNewToggleButton_3);
		
		final JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("4");
		frame.getContentPane().add(tglbtnNewToggleButton_4);
		
		Thread t = new Thread() {
			
			@Override
			public void run() {
				while(true) {
					while (sc.hasNextLine()) {
						String linea = sc.nextLine();
						if ("1_on".equals(linea)) {
							tglbtnNewToggleButton_1.setSelected(true);
						} else if ("1_off".equals(linea)) {
							tglbtnNewToggleButton_1.setSelected(false);
						} else if ("2_on".equals(linea)) {
							tglbtnNewToggleButton_2.setSelected(true);
						} else if ("2_off".equals(linea)) {
							tglbtnNewToggleButton_2.setSelected(false);
						} else if ("3_on".equals(linea)) {
							tglbtnNewToggleButton_3.setSelected(true);
						} else if ("3_off".equals(linea)) {
							tglbtnNewToggleButton_3.setSelected(false);
						} else if ("4_on".equals(linea)) {
							tglbtnNewToggleButton_4.setSelected(true);
						} else if ("4_off".equals(linea)) {
							tglbtnNewToggleButton_4.setSelected(false);
						} else {
							System.out.println("Invalido!");
						}
					}
				}
			}
			
		};
		t.start();
	}

}
