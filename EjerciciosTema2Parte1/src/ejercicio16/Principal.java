package ejercicio16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Un trabajador necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
		Si trabaja 40 horas o menos se le paga 16 euros por hora, si trabaja más de 40 horas se le paga
		16 euros por cada una de las primeras 40 horas y 20 euros por cada hora extra. El programa
		deberá pedir al usuario el número de horas trabajadas por el obrero en total y mostrar el salario
		que le corresponde.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int horas, resultado=0, tope=40, dineroHora1=16, dineroHora2=20, dineroHoraN=0, opcion;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 16.");
		System.out.println("-----------------------------------");
		
		do {
		
		System.out.println("Escriba 0 para cerrar y 1 para continuar");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
		
			case 0:
				break;
			case 1:

				System.out.println("\nDebemos calcular el salario semanal:");
				
				System.out.println("\nIndique el número de horas trabajadas:");
				
				aux=sc.nextLine();
				horas=Integer.parseInt(aux);
				
				if (horas<=tope) {
					
					resultado=horas*dineroHora1;
				
				}
				
				if (horas>tope) {
					
					for(int i=0; i<tope; i++) {
						
						dineroHoraN=tope*dineroHora1;
						
					}
					resultado=dineroHoraN+((horas-tope)*dineroHora2);
				}
				System.out.printf("\nEl trabajador cobrará %d€.", resultado);
		}
		}while(opcion!=0);
				
				System.out.println("\n  ");	
				System.out.println("-----------------------------------");
				System.out.println("Muchas gracias por su atención :).");
				System.out.println("-----------------------------------");
				
	
	
	}

}
