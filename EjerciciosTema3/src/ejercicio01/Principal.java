package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implementar una clase que modele la cabecera de los exámenes de un centro escolar. La información sobre
			cada examen será el nombre de la asignatura, aula donde se realiza y un String con la fecha. Solo tendrá un
			método para imprimir adecuadamente dicha cabecera.
		 */
		
		Scanner sc=new Scanner(System.in);
		 
		String asignatura, fecha, aux;
		int aula;
		Cabecera a1;
		
		System.out.println("-----------------------------------------------");
		System.out.println("Bienvenidos al ejercicio 1.");
		System.out.println("-----------------------------------------------\n");
		
		System.out.println("Indique el nombre de la asignatura:\n");
		asignatura=sc.nextLine();

		System.out.println("Indique el aula en la que se realizará la prueba:\n");
		aux=sc.nextLine();
		aula=Integer.parseInt(aux);
		
		System.out.println("Indique la fecha en el formato XX/XX/XXXX:\n");
		fecha=sc.nextLine();
		
		a1=new Cabecera(asignatura, aula, fecha);
			
			a1.mostarDatos();
		
		System.out.println("\nMuchas gracias por su atención :)");

	}

}
