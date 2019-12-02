package es.studium.ejerciciosCadenas;

import java.util.Scanner;

public class MayuscMinusc {

	public static void main(String[] args) {
		
		String Mayuscula;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("Dame una cadena con mayúscula y minúscula");
		Mayuscula = teclado.next();
		teclado.close();
		System.out.println("Mayúsculas: "+Mayuscula.toUpperCase());
		System.out.println("Minúsculas: "+Mayuscula.toUpperCase());
		
		
	}

}
