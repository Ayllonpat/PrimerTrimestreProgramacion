package ejercicio13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Leer un número entero y mostrar su tabla de multiplicar
		 */
		
		
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int tope=11, num, resultado, opcion;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 13.");
		System.out.println("-----------------------------------");
		
		do {
		
		System.out.println("Escriba 0 para cerrar y 1 para continuar");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
		
			case 0:
				break;
			case 1:
				System.out.println("Vamos a mostrar la tabla de multiplicar del número elegido.");
				
				System.out.println("\nElija un número entero:");
				aux=sc.nextLine();
				num=Integer.parseInt(aux);
				
				for(int i=1 ; i<tope ; i++) {
					
					resultado=num*i;
					System.out.printf("%d*%d=%d\n",num,i,resultado);
					
					
				}
				break;
		}
		}while(opcion!=0);
				
				System.out.println("  ");	
				System.out.println("-----------------------------------");
				System.out.println("Muchas gracias por su atención :).");
				System.out.println("-----------------------------------");
				
		}
		
		
	}

