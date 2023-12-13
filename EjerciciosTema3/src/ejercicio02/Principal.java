package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hacer un programa que calcule el área de un círculo en cm2.
		 *  Debemos tener la clase Círculo, con un solo
			atributo llamado radio. En el main, debemos crear un objeto tipo Círculo y llamar a dicho método. 
			Mejorar
			el programa añadiendo a la clase Círculo otro método que calcule el área del círculo en m2.
		 */
		 
		Scanner sc=new Scanner(System.in);
		
		double radio, area, areaM2;
		String aux;
		Circulo a1;
		
		System.out.println("-----------------------------------------------");
		System.out.println("Bienvenidos al ejercicio 2.");
		System.out.println("-----------------------------------------------\n");
		 
		System.out.println("Indique el radio(cm):\n");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		
		a1=new Circulo(radio);
			area=a1.mostarArea();
			areaM2=a1.convertirAreaM2();
			
			System.out.printf("El area del circulo es: %.2f cm2.\n", area);
			System.out.printf("El area del circulo es: %.2f m2.",areaM2);
			
		System.out.println("\n-----------------------------------------------");
		System.out.println("Gracias por su atención.");
		System.out.println("-----------------------------------------------");

	}

}
