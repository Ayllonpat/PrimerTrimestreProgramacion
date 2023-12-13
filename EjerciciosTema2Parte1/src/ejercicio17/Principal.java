package ejercicio17;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que calcule el salario mensual de un vendedor. Este será el resultado de 
			un sueldo fijo 1000€ mensuales más un porcentaje de las ventas realizadas. Lo que se cobra 
			por ventas se calculará mediante el 20 % de lo vendido en total al mes.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion;
		
		do {
		System.out.println("Escriba 0 para cerrar y 1 para continuar");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
		
			case 0:
				break;
			case 1:
				
				break;
		}
		}while(opcion!=0);
	}
}


