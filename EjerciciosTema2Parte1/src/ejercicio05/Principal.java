package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realiza un programa que calcule la potencia de un número, dado este y su exponente.
			Pueden ocurrir tres casos:
			* El exponente sea positivo, imprime resultado en pantalla.
			* El exponente sea 0, el resultado es 1.
			* El exponente sea negativo, el resultado es 1/potencia con el exponente positivo
		 */
			
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double base, exponente, resultado, exponente0=1, exponenteN, cero=0, resultadoDec, menosUno=-1;
		
		System.out.println("------------------------------------------");
		System.out.println("Bienvenidos al ejercicio 5.");
		System.out.println("------------------------------------------");
		
		System.out.println("\nDebemos crear un programa que nos permita calcular la potencia de un número y su exponente.");
		
		System.out.println("Indica el número:");
		
		aux=sc.nextLine();
		base=Double.parseDouble(aux);
		
		System.out.println("Indica el exponente:");
		
		aux=sc.nextLine();
		exponente=Double.parseDouble(aux);
		
		if (exponente==0) {
			
			System.out.printf("El resultado será %.2f.",exponente0);
			
		}else if (exponente < cero){
			
			exponenteN=exponente*menosUno;
			resultado=Math.pow(base,exponenteN);
			resultadoDec=1/resultado;
			System.out.printf("El resultado será %.2f.",resultado);
			
		}else{
			
			resultado=Math.pow(base, exponente);
			
			System.out.printf("El resultado es %.2f.",resultado);
			
			System.out.println("\n  ");	
			System.out.println("-----------------------------------");
			System.out.println("Muchas gracias por su atención :).");
			System.out.println("-----------------------------------");
			
			
		}
	}

}
