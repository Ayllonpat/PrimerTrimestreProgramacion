package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leer un número que será la cantidad de dinero que una persona quiere retirar de su cuenta
			bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad que se quiere retirar
			es mayor que el saldo de la cuenta y el nuevo saldo si se ha podido retirar.
		 */
		
		Scanner sc=new Scanner(System.in);
		String aux;
		double saldoInicial, dineroRetirar, saldoFinal;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 4.");
		System.out.println("-----------------------------------");
		
		System.out.println("\nDebemos mostrar si es posible sacar dinero de tu cuenta bancaría y si lo es, indicar el saldo restante.");
		
		System.out.println("Primero indique el saldo en su cuenta:");
		
		aux=sc.nextLine();
		saldoInicial=Double.parseDouble(aux);
		
		System.out.println("Ahora indique cuanto dinero quiere retirar:");
		
		aux=sc.nextLine();
		dineroRetirar=Double.parseDouble(aux);
		
		if(dineroRetirar>saldoInicial) {
			
			System.out.println("\nERROR: NO SE PUEDE RETIRAR MÁS DINERO DEL QUE HAY EN LA CUENTA");
		}else {
			saldoFinal=saldoInicial-dineroRetirar;
			System.out.printf("\nEl saldo restante será: %.2f€.\n",saldoFinal);
		}
		
		System.out.println("  ");	
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");
		

	}

}
