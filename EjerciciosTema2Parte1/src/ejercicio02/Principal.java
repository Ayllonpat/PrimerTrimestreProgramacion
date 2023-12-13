package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leer dos números doubles. Vamos a dividir el primero entre el segundo y se debe mostrar un
		mensaje de error si el segundo es cero ANTES de hacer la operación. Mostrar el resultado de
		la división con dos decimales si no lo es
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double num1, num2, resultado;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 2.");
		System.out.println("-----------------------------------");
		
		System.out.println("Vamos a dividir dos números.");
		System.out.println("   ");
		System.out.println("Indique el número 1:");
		
		aux=sc.nextLine();
		num1=Double.parseDouble(aux);
		
		System.out.println("   ");
		System.out.println("Indique el número 2:");
		
		aux=sc.nextLine();
		num2=Double.parseDouble(aux);
		
		System.out.println("  ");	
		
		if (num2==0){
		
			System.out.println("ERROR: NO ES POSIBLE REALIZAR LA DIVISIÓN");
			
		}else{ 
			
			resultado=num1/num2;
			
			System.out.printf("El resultado de la división es %.2f.", resultado);
			
			System.out.println("\n  ");	
			System.out.println("-----------------------------------");
			System.out.println("Muchas gracias por su atención :).");
			System.out.println("-----------------------------------");
			
		}
		
		

	}

}
