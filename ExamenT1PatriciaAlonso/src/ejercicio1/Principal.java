package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double yarda=0.9144, altura, radio, radioCuadrado, alturaEnMetros, radioEnMetros, volumen, litros ;
		int metroCubico=1000;
		
		System.out.println("--------------------------------");
		System.out.println("Bienvenido al ejercicio 1.");
		System.out.println("--------------------------------");
		
		System.out.println("    ");
		
		System.out.println("Vamos a calcular el volumen en litros del cilindro seleccionado.");
		System.out.println("    ");
		System.out.println("Indique la altura (en yardas) de este:");
		
		aux=sc.nextLine();
		altura=Double.parseDouble(aux);
		
		alturaEnMetros=altura*yarda;
		
		System.out.println("    ");
		System.out.println("Ahora indique el radio (en yardas):");
		
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		
		radioEnMetros=radio*yarda;
		
		radioCuadrado=Math.pow(radio,2);
		volumen=Math.PI*radioCuadrado*altura;
		litros=metroCubico*volumen;
		
		System.out.println("    ");
		System.out.printf("El cilindro tendrá un volumen de %.2fm3 y contendrá un total de %.2fl.",volumen,litros);
		
		System.out.println("    ");
		System.out.println("    ");
		
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");
		

	}

}
