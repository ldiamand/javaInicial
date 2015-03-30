package net.polotecnologico.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//import java.util.*;
//import java.sql.*;

public class Prueba2 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		Date hoy = new Date();
		System.out.println(hoy);
		java.sql.Date hoy2 = 
				new java.sql.Date(System.currentTimeMillis());
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format.format(hoy));
	
		String ayer = "29/03/2015";
		
		Date ayerDate = format.parse(ayer);
		System.out.println(ayerDate);
	}
	
}
