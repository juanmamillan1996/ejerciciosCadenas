package es.studium.ejerciciosCadenas;

import java.util.Scanner;


public class Mayor {

	public static void main(String[] args) {
		String mayor;
		int i;
		String [] tabla= new String [5];
		
		Scanner teclado = new Scanner(System.in);
		for(i=0;i<(tabla.length);i++)
		{
		System.out.println("Escriba la palabra número" + (i+1));
		tabla[i]=teclado.nextLine();
		}
		mayor = tabla[0];
		for (i=1; i<tabla.length;i++) {
			System.out.println(i + " Comparar: " + tabla[i]+ " con base");
			
			if (tabla[i].compareTo(mayor)>0) {
				System.out.println("Encontrado nuevo mayor --> cambia base");
				mayor = tabla[i];
			}
		}

		
	}

}
