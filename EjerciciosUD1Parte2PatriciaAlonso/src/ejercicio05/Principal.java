package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ¿Qué saldo tendré al final del año en el banco si he abierto una cuenta pago de mantenimiento un 1 %
		del saldo con la que la abrí inicialmente al año y tengo unos intereses del 3 % del saldo inicial? Hacer
		un programa que calcule esto y lo muestre por pantalla leyendo por teclado el saldo inicial con el que
		se quiere abrir la cuenta.
		 */
		
		String aux;
		int cien=100;
		double saldoInicial=0.0, mantenimiento=1.0, intereses=3.0, costeMantenimiento=0.0,
				costeIntereses=0.0, saldoFinal=0.0, porcentajeMantenimiento=1.0, porcentajeIntereses=0.0 ;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("-----------------------------");
		System.out.println("Bienvenido al ejercicio 5");
		System.out.println("-----------------------------");
		
		System.out.println("¿Con qué saldo inicial has abierto la cuenta?");
		
		aux=sc.nextLine();

		saldoInicial=Double.parseDouble(aux);
		
		porcentajeMantenimiento=mantenimiento/cien;
		
		porcentajeIntereses=intereses/cien;
		
		costeMantenimiento=saldoInicial*porcentajeMantenimiento;
		
		costeIntereses=saldoInicial*porcentajeIntereses;
		
		saldoFinal=saldoInicial-costeMantenimiento+costeIntereses;
		
		System.out.printf("Tu saldo a final de año será: %.2f€",saldoFinal);
		
		

	}

}
