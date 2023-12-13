package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Crear un programa que reciba por teclado 3 notas, calcule la media y diga si la media sale 
			aprobada o no.
		 */

		Scanner sc=new Scanner(System.in);
		
		String aux, apro="aprobado", susp="suspenso";
		double num1, num2,num3, resultado, numeroNotas=3;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 2.");
		System.out.println("-----------------------------------");

		System.out.println("Vamos a calcular la media de 3 notas.");
		System.out.println("   ");
		System.out.println("Indique la nota 1:");
		
		aux=sc.nextLine();
		num1=Double.parseDouble(aux);
		
		System.out.println("   ");
		System.out.println("Indique la nota 2:");
		
		aux=sc.nextLine();
		num2=Double.parseDouble(aux);
		
		System.out.println("   ");
		System.out.println("Indique la nota 3:");
		
		aux=sc.nextLine();
		num3=Double.parseDouble(aux);
		
		resultado=(num1+num2+num3)/numeroNotas;
		
		System.out.println("   ");
		System.out.printf("Usted tiene una media de %.2f.",resultado);
		
		if (resultado>5){
			
			System.out.println("\nUsted está aprobado.");
			
		}else if(resultado==5){
			
			System.out.println("\nUsted está aprobado.");
			
		}else{ 
		
			System.out.println("\nUsted está suspenso.");	
		}
		
		System.out.println("  ");	
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");

	}

}
