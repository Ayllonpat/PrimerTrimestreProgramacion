package ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Calcular el precio final de una compra de un solo producto, pidiendo por teclado el precio 
			del producto, la cantidad que se lleva y el porcentaje de descuento que se le aplica, pero solo 
			si el total es mayor de 100 €. Si no es superior, se mostrará el mensaje "No hay descuento".
		 */

		Scanner sc=new Scanner(System.in);
		
		String aux, producto;
		double cien=100, precioP, cantidad, totalP, cienD=100, porcentajeD, resulPor, totalD;
		                           
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 7.");
		System.out.println("-----------------------------------");

		System.out.println("Vamos a calcular si tenemos descuento en una compra o no.");
		
		System.out.println("\nIndique el nombre del producto:");
		producto=sc.nextLine();
		System.out.println("\nIndique el precio del producto");
		aux=sc.nextLine();
		precioP=Double.parseDouble(aux);
		System.out.println("\nIndique la cantidad que se va a llevar:");
		aux=sc.nextLine();
		cantidad=Double.parseDouble(aux);
		System.out.println("\nIndique que descuento se aplica:");
		aux=sc.nextLine();
		porcentajeD=Double.parseDouble(aux);
		
		totalP=precioP*cantidad;
		
		if(totalP<cien) {
			System.out.println("No hay descuento");
			
		}else{
			resulPor=porcentajeD/cienD;
			totalD=resulPor*totalP;
			System.out.printf("Se le cobrará un total de %.2f€.",totalD);
		}
		
		System.out.println("\n ");	
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");
		
		
	}

}
