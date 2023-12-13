package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa para calcular y mostrar por pantalla el sueldo de un trabajador. Se deben pedir
		todos los datos necesarios por teclado. El sueldo se calcula multiplicando las horas trabajadas por el
		precio de la hora "normal" más las horas extras por el precio al que se paga una hora extra (mayor que
		una normal).
		 */
		
		double sueldoHora=0.0, sueldoHoraExtra=0.0, horasNormalesTrabajadas=0.0,
				horasExtrasTrabajadas=0.0, sueldo=0.0;
		String nombreTrabajador;
		String aux;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("-----------------------------");
		System.out.println("Bienvenido al ejercicio 6");
		System.out.println("-----------------------------");
		
		System.out.println("¿Cuál es el nombre del trabajador?");
		
		nombreTrabajador=sc.nextLine();
		
		System.out.println(nombreTrabajador);
		
		System.out.println("¿Cuántas horas normales ha trabajado?");
		
		aux=sc.nextLine();
		
		horasNormalesTrabajadas=Double.parseDouble(aux);
		
		System.out.println("¿Cuánto se cobra por hora?");
		
		aux=sc.nextLine();
		
		sueldoHora=Double.parseDouble(aux);
		
		System.out.println("¿Y horas extras?");
		
		aux=sc.nextLine();
		
		horasExtrasTrabajadas=Double.parseDouble(aux);
		
		System.out.println("¿Cuánto se cobra por hora extra?");
		
		aux=sc.nextLine();
		
		sueldoHoraExtra=Double.parseDouble(aux);
		
		sueldo=horasNormalesTrabajadas*sueldoHora+horasExtrasTrabajadas*sueldoHoraExtra;

		System.out.printf("El trabajador tendrá un sueldo de %.2f€", sueldo);
		

	}

}
