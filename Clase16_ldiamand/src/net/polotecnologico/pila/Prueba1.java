package net.polotecnologico.pila;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prueba1 {

	private JFrame frame;
	private JButton btnNewButton;

	private class BotonesListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("Hola");
		}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba1 window = new Prueba1();
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
	public Prueba1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		BotonesListener bl = new BotonesListener();
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(bl);
		
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(bl);
		frame.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File+");
		menuBar.add(mnFile);
		
		JMenuItem mntmHhh = new JMenuItem("hhh");
		mnFile.add(mntmHhh);
	}
}
