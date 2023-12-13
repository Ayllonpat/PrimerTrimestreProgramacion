package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implementar un programa que rellene automáticamente un array de enteros con 10 posiciones,
cada elemento debe contener el valor del doble de su índice. Mostrar el resultado por pantalla.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int tam=10, opcion, num[];
		String aux;
		
		num= new int [tam];
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 2.");
		System.out.println("-----------------------------------");
		
		do {
		
		System.out.println("Escriba 0 para cerrar y 1 para continuar");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
		
			case 0:
				System.out.println("Cerrar");
				break;
			case 1:
				for(int i=0;i<num.length;i++) {
					System.out.printf("%d.%d\n\n",i+1,(i+1)*2);
				}
				break;
			default:
				System.out.println("\nOPCIÓN NO DISPONIBLE\n");
				break;
		
		
		}
		}while(opcion!=0);
		
		System.out.println("  ");	
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");
		
	}

}
