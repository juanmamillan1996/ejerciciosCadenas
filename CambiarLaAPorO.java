package es.studium.ejerciciosCadenas;

import java.util.Scanner;

public class CambiarLaAPorO {

	public static void main(String[] args) {
		String texto1, texto2;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("Dame un texto");
		texto1 = teclado.nextLine();
		
		texto2=texto1.replace("a","o");
		System.out.println(texto2);
		teclado.close();
		
	

	}

}
