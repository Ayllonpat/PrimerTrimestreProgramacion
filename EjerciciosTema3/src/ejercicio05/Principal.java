package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Cuando era pequeño me mandaban a copiar determinadas frases cuando hacía algo mal para no olvidarlo.
		Realizar un programa que lea un texto del teclado y un número entero y muestre en pantalla dicho texto
		una cantidad de veces igual al número introducido. La clase se puede llamar "Copiado".
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String frase, aux;
		int numeroCopiado;
		Copiado a1;
		
		a1=new Copiado();
		
		System.out.println("-----------------------------------------------");
		System.out.println("Bienvenidos al ejercicio 5.");
		System.out.println("-----------------------------------------------\n");
		
		System.out.println("Escriba la frase que desea copiar:");
		frase=sc.nextLine();
		System.out.println("Indique la cantidad de veces que desea copiarla:");
		aux=sc.nextLine();
		numeroCopiado=Integer.parseInt(aux);
		
		System.out.println("  ");
		
		a1.Copiar(frase, numeroCopiado);
		
		System.out.println("\n-----------------------------------------------");
		System.out.println("Gracias por su atención :).");
		System.out.println("-----------------------------------------------");

	}
}