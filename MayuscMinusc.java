package es.studium.ejerciciosCadenas;

import java.util.Scanner;

public class MayuscMinusc {

	public static void main(String[] args) {
		
		String Mayuscula;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("Dame una cadena con may�scula y min�scula");
		Mayuscula = teclado.next();
		teclado.close();
		System.out.println("May�sculas: "+Mayuscula.toUpperCase());
		System.out.println("Min�sculas: "+Mayuscula.toUpperCase());
		
		
	}

}
