package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Cualquier cálculo de áreas, volúmenes, uso de fórmulas de física o matemáticas, etc.
		 */
		Scanner sc=new Scanner(System.in);
		
		String aux;
		Double areaCirculo=0.0, areaCuadrado=0.0, volumenPiscina=0.0, radio=0.0, ladoCuadrado=0.0, anchoPiscina=0.0,
				largoPiscina=0.0, profundidadPiscina=0.0;
	
		
		
		System.out.println("-----------------------------");
		System.out.println("Bienvenido al ejercicio 4");
		System.out.println("-----------------------------");
		
		System.out.println("Primero vamos a calcular el area de un círculo, ¿cuál es su radio (cm)?");
		
		aux =sc.nextLine();
		
		radio=Double.parseDouble(aux);
		
		areaCirculo=radio*Math.PI;
		
		System.out.printf("El area del circulo es de %.2fcm2.",areaCirculo);
		
		System.out.println("\n");
		
		System.out.println("Ahora vamos a calcular el area de un cuadrado, ¿cuántos centimetros mide su lado?");
		
		aux =sc.nextLine();
		
		ladoCuadrado=Double.parseDouble(aux);
		
		areaCuadrado=ladoCuadrado*ladoCuadrado;
		
		System.out.printf("El area del cuadrado es de %.2fcm2.", areaCuadrado);
		
		System.out.println("\n");
		
		System.out.println("Ahora vamos a calcular el volumen de la Piscina en metros");
		
		System.out.println("¿Cuál es el ancho de la piscna?");
		
		aux =sc.nextLine();
		
		anchoPiscina=Double.parseDouble(aux);
		
		System.out.println("¿Cuál es el largo de la piscna?");
		
		aux =sc.nextLine();
		
		largoPiscina=Double.parseDouble(aux);
		
		System.out.println("¿Cuál es la profundidad de la piscna?");
		
		aux =sc.nextLine();
		
		profundidadPiscina=Double.parseDouble(aux);
		
		volumenPiscina=(anchoPiscina*largoPiscina)*profundidadPiscina;
		
		System.out.printf("El volumen de la piscina es de %.2fm3.", volumenPiscina);
		
		System.out.println("-----------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------");
		

	}

}
