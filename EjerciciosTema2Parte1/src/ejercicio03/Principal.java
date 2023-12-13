package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leer un número y mostrar por la salida estándar si dicho número es o no par
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String aux, par="par", impar="impar";
		int num1;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 3.");
		System.out.println("-----------------------------------");
		
		System.out.println("Vamos a leer un número e indicar si es par o impar.");
		System.out.println("   ");
		System.out.println("Indique el número 1:");
		
		aux=sc.nextLine();
		num1=Integer.parseInt(aux);
		
		if (num1%2==0) {
			System.out.printf("\nEl número es %s.",par);
		}else {
			System.out.printf("\nEl número es %s.",impar);
		}
		
		System.out.println("\n  ");	
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");
		
		

	}

}
