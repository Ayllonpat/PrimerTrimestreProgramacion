package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que calcule el espacio recorrido por un objeto que se mueve a velocidad constante. El 
		objeto, por ejemplo, zapatilla de una madre hacia el hijo, ha recorrido un espacio inicial de 5.5 m y se mueve 
		a una velocidad constante de 3.2 m/s. Vosotros debéis dar un valor al tiempo que el objeto está en movimiento. 
		La ecuación usada es: 
		espacio= espacioInicial + velocidad*tiemp
		 */
		
		double espacio=0.0, espacioInicial=5.5, velocidad=3.2, tiempo=0.0;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("-----------------------------");
		System.out.println("Bienvenido al ejercicio 2");
		System.out.println("-----------------------------");
		
		System.out.println("¿Cuánto tiempo está la zapatilla en movimiento (en segundos)?");
		
		aux=sc.nextLine();
		
		tiempo=Double.parseDouble(aux);
		
		espacio= espacioInicial + velocidad*tiempo;
		
		System.out.printf("La zapailla recorrera %.2fm.", espacio);
		
		System.out.println("\n");
		
		System.out.println("Muchas gracias por su atención :).");
		
		
		

	}

}
