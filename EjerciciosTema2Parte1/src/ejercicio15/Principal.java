package ejercicio15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *Se desea realizar un programa que gestione las notas de un alumno del centro. Para ello, se 
			necesita leer las notas de las 6 asignaturas de un solo alumno y mostrar por pantalla al final, 
			la nota media y el número de suspensos que tiene. No usar una variable para cada nota, ni es 
			necesario mostrar las notas de cada asignatura, solo la media y el número de suspensos.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int tope=1, nSuspensos=0, cinco=5, opcion;
		double notaB=0, notaA, notaM ;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 15.");
		System.out.println("-----------------------------------");
		
		do {
		
		System.out.println("Escriba 0 para cerrar y 1 para continuar");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
		
			case 0:
				break;
			case 1:
				System.out.println("\nDebemos calcular la nota media de un alumno y mostrar los suspensos que tiene:");
				
				System.out.println("\nIndique el número de asignaturas:");
				
				aux=sc.nextLine();
				tope=Integer.parseInt(aux);
								
				
				for(int i=0; i<tope; i++) {
					
					System.out.println("Indique una de las notas");
					aux=sc.nextLine();
					notaA=Double.parseDouble(aux);
					
					
					if (notaA<cinco){
					
						nSuspensos++;			

				}
					notaB=notaA+notaB;
					
				}
				
				notaM=notaB/tope;
				
				System.out.printf("Su nota media es de %.2f y tiene %d suspensos.", notaM, nSuspensos);
				
				break;
		}
		}while(opcion!=0);
		
				System.out.println("  ");	
				System.out.println("-----------------------------------");
				System.out.println("Muchas gracias por su atención :).");
				System.out.println("-----------------------------------");
				
		
		}
	}


	


