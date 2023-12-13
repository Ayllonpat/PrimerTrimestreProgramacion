package ejercicio18;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Haga un programa de la interfaz de un cajero automático. Tendrá las opciones, ver saldo, 
			retirar dinero, comprar entradas e ingresar dinero. En cada opción se pedirán los datos 
			necesarios y se realizarán las operaciones adecuadas. El coste de las entradas se debe restar al 
			saldo de dicha cuenta. La cuenta será creada por nosotros con un saldo inicial concreto.
		 */
		Scanner sc=new Scanner(System.in);
		
		String aux, verSaldo="Ver saldo", retirarDinero="Retirar dinero", comprarEntradas="Comprar entradas", ingresarDinero="Ingresar dinero";
		double saldo, retiro, compra, ingreso, precioEntradas=150, saldoInicial=18500.72;
		int opcion;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 18.");
		System.out.println("-----------------------------------");
		
		System.out.println("Escriba 0 para cerrar y 1 para continuar");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
		
			case 0:
				break;
			case 1:
				System.out.println("Vamos a crear la interfaz de un cajero");
				
				System.out.println("\nElija una opción:");
				
				System.out.println("\n1.Ver saldo.");
				System.out.println("2.Retirar dinero.");
				System.out.println("3.Comprar entradas");
				System.out.println("4.Ingresar dinero.");
				
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
				
				switch (opcion) {
				
				case 1:
					System.out.printf("Su saldo actual es de %.2f€.",saldoInicial);
					break;
					
				case 2:
					
					System.out.println("Indique el saldo total que desea retirar:");
					aux=sc.nextLine();
					retiro=Integer.parseInt(aux);
				//tengo q poner if por si el dinero a retirar es mayor al saldo
					saldo=saldoInicial-retiro;
					
					System.out.printf("\nEl saldo restante será %.2f€", saldo);
					break;
					
				case 3:
					System.out.println("Indique la cantidad de entradas a comprar:");
					aux=sc.nextLine();
					compra=Integer.parseInt(aux);
					
					saldo=saldoInicial-compra*precioEntradas;
					
					System.out.printf("\nEl saldo restante será %.2f€", saldo);
					break;
					
				case 4:
					System.out.println("Indique el saldo total que desea ingresar:");
					aux=sc.nextLine();
					ingreso=Integer.parseInt(aux);
					
					saldo=saldoInicial+ingreso;
					
					System.out.printf("\nEl saldo final será %.2f€", saldo);
					break;
				
				}
				break;
			
		}
		
		

	}

}
