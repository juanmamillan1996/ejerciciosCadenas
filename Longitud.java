package es.studium.ejerciciosCadenas;

import java.util.Scanner;

public class Longitud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		String frase;
		int longitudConEspacios, longitudSinEspacios;
		//Funciones
		Scanner teclado= new Scanner (System.in);
		System.out.println("Dame una cadena");
		frase = teclado.nextLine();
		longitudConEspacios= calcularLongitud1(frase);
		System.out.println("Longitud:" + longitudConEspacios);
		longitudSinEspacios= calcularLongitud2(frase);
		System.out.println("Longitud:" + longitudSinEspacios);
		teclado.close();
		
		}
		public static int calcularLongitud1(String cadena) {
			int resultado=0;
			for(int i=0;i<cadena.length();i++);
			{
				resultado++;
			}
			return resultado;
		}
			public static int calcularLongitud2(String cadena)
			{
			int resultado=0;
			for (int i = 0; i < cadena.length(); i++) {
				if (cadena.charAt(i)!= ' ') {
					resultado++;
				}
			}
			return resultado;
					
				}
			

}
