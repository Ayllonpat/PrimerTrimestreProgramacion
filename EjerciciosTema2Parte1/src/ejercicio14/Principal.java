package ejercicio14;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leer una secuencia de 10 números y mostrar solo la suma y el producto de todos ellos.
		 */
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double resultado=0, num;
		int tope=11, opcion;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 14.");
		System.out.println("-----------------------------------");
		
		do {
		
		System.out.println("Escriba 0 para cerrar y 1 para continuar");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
		
			case 0:
				break;
			case 1:
				System.out.println("Vamos a sumar 10 números y mostrar el resultado.");
				
				for(int i=1 ; i<tope ; i++) {
					
					System.out.printf("\nEscriba el número %d:\n",i);
					aux=sc.nextLine();
					num=Double.parseDouble(aux);
					
					resultado=num+resultado;
					
				}
				System.out.printf("\nLa suma da %.2f.",resultado);
				
				break;
		}
		}while(opcion!=0);
				
				System.out.println("  ");	
				System.out.println("-----------------------------------");
				System.out.println("Muchas gracias por su atención :).");
				System.out.println("-----------------------------------");
				
		
		}

	}


