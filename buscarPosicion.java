package es.studium.ejerciciosCadenas;

import java.util.Scanner;

public class buscarPosicion {

	public static void main(String[] args) {
		//Variables
		String frase;
		char caracter;
		int posicion=-1;
		//Inicio
		Scanner teclado= new Scanner (System.in);
		System.out.println("Escriba una  frase");
		frase = teclado.next();
		System.out.println("Indique el caracter a buscar");
		caracter = teclado.next().charAt(0);
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==caracter) {
				posicion=1;
				i=frase.length();
			}
		}
		if(posicion==-1) {
			System.out.println("No encontrado");
		}
		else {
			System.out.println("Se ha encontrado en la posición " + posicion);
		}
	}

}
