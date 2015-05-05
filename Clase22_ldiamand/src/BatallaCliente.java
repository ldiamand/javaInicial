import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BatallaCliente {

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
					BatallaCliente window = new BatallaCliente();
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
	public BatallaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			Socket s = new Socket("localhost", 4444);
			sc = new Scanner(s.getInputStream());
			pw = new PrintWriter(s.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		frame = new JFrame("Cliente");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
		
		final JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("1");
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_1.isSelected()) {
					pw.println("1_on");
				} else {
					pw.println("1_off");
				}
			}
		});
		frame.getContentPane().add(tglbtnNewToggleButton_1);
		
		final JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("2");
		tglbtnNewToggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_2.isSelected()) {
					pw.println("2_on");
				} else {
					pw.println("2_off");
				}
			}
		});
		frame.getContentPane().add(tglbtnNewToggleButton_2);
		
		final JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("3");
		tglbtnNewToggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_3.isSelected()) {
					pw.println("3_on");
				} else {
					pw.println("3_off");
				}
			}
		});
		frame.getContentPane().add(tglbtnNewToggleButton_3);
		
		final JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("4");
		tglbtnNewToggleButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton_4.isSelected()) {
					pw.println("4_on");
				} else {
					pw.println("4_off");
				}
			}
		});
		frame.getContentPane().add(tglbtnNewToggleButton_4);
	}

}
