package es.studium.ejerciciosCadenas;

import java.util.Scanner;

public class Nombres {

	public static void main(String [] args) 
	{
		String nombre1= "";
		String nombre2= "";
		String nombre3= "";
		String nombre4= "";
		String nombre5= "";
	
		Scanner teclado= new Scanner (System.in);
		System.out.println("Dame una cadena");
		nombre1 = teclado.next();
		System.out.println("Dame otra cadena");
		nombre2 = teclado.next();
		System.out.println("Dame la siguiente cadena");
		nombre3 = teclado.next();
		System.out.println("Dame otra cadena");
		nombre4 = teclado.next();
		System.out.println("Dame la última cadena");
		nombre5 = teclado.next();
		System.out.println(String.format("Las cadenas son '%s','%s','%s','%s' y '%s'", nombre1, nombre2, nombre3, nombre4, nombre5));
		teclado.close();
}
	
}
