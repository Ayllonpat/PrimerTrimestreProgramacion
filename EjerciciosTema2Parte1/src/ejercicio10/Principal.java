package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Mostrar en pantalla un menú de un cine con 4 salas y las películas que se proyectan en cada
			una. Se debe leer la sala deseada y mostrar:
			a. Un mensaje con el precio de la entrada, que será diferente en cada sala (por ejemplo,
			sala vip, sala 3D, sala normal y sala para niños).
			b. Pedir el número de entradas.
			c. Calcular el precio final y mostrarlo.
		 */

		Scanner sc=new Scanner(System.in);
		
		String aux, salaVip="Sala Vip", sala3D="Sala 3D", salaNormal="Sala Normal", salaNinyos="Sala Niños";
		double precioVip=19.5, precio3D=12, precioNormal=7.5, precioNinyos=4, total;
		int opcion, cantidadEn;
		
		System.out.println("------------------------------------------");
		System.out.println("Bienvenidos al ejercicio 11.");
		System.out.println("------------------------------------------");
		
		System.out.println("Debemos elegir que película ver:");
		
		System.out.println("\nEstas son las péliculas y la sala en las que se encuentran:");
		
		System.out.printf("\n1.%s - %.2f€.",salaVip, precioVip);
		System.out.printf("\n2.%s - %.2f€.",sala3D, precio3D);
		System.out.printf("\n3.%s - %.2f€.",salaNormal, precioNormal);
		System.out.printf("\n4.%s - %.2f€.",salaNinyos, precioNinyos);
		
		System.out.println("\n\nIndique la sala deseada(1-4):");
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		System.out.println("\nAhora indique la cantidad de entradas:");
		aux=sc.nextLine();
		cantidadEn=Integer.parseInt(aux);
		
		switch (opcion) {
			case 1:
				total=precioVip*cantidadEn;
				System.out.printf("\nPagará un total de %.2f€.",total);
				break;
			
			case 2:
				total=precio3D*cantidadEn;
				System.out.printf("\nPagará un total de %.2f€.",total);
				break;
				
			case 3:
				total=precioNormal*cantidadEn;
				System.out.printf("\nPagará un total de %.2f€.",total);
				break;
				
			case 4:
				total=precioNinyos*cantidadEn;
				System.out.printf("\nPagará un total de %.2f€.",total);
				break;
		}
		
		System.out.println("\n   ");	
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");
		
	}
	

}
