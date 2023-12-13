package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que calcule el volumen de un cilindro. Vosotros debéis decidir qué método usar y
			qué valores pasarle. Se debe tener la clase Cilindro.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double volumen, altura, radio;
		Cilindro a1;
		
		System.out.println("-----------------------------------------------");
		System.out.println("Bienvenidos al ejercicio 4.");
		System.out.println("-----------------------------------------------\n");
		
		System.out.println("Indique el radio del cilindro:");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		System.out.println("\nIndique la altura del clindro:");
		aux=sc.nextLine();
		altura=Double.parseDouble(aux);
		
		a1=new Cilindro(radio, altura);
			volumen=a1.calcularCilindro();
			a1.mostrarCilindro(volumen);
			
		System.out.println("\n-----------------------------------------------");
		System.out.println("Gracias por su atención :).");
		System.out.println("-----------------------------------------------");
			
		

	}

}
