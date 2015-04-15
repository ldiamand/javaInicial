package net.polotecnologico.pila;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiPrimerVentana {

	private JFrame ventana;
	
	private JButton boton;
	
	public MiPrimerVentana() {
		ventana = new JFrame();

		Container ct = ventana.getContentPane();
		ct.setLayout(new GridLayout(5, 6));
		
		for (int i = 0; i < 30; i++) {
			boton = new JButton("Boton " + i);
			ct.add(boton);
		}
//		ct.add(boton, BorderLayout.NORTH);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(400, 300);
		ventana.setVisible(true);
	}

}
