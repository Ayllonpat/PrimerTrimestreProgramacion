package ejercicio12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implementar un programa que calcule el índice de masa corporal (IMC) de una persona y diga
			en qué estado se encuentra dependiendo del resultado, según la tabla. El IMC se calcula
			dividiendo el peso de una persona en kg entre la altura en metros al cuadrado, es decir:
			
			IMC= peso/altura2
			VALOR IMC Diagnóstico
			< 16 Criterio de ingreso en hospital
			de 16 a 17 infrapeso
			de 17 a 18 bajo peso
			de 18 a 25 peso normal (saludable)
			de 25 a 30 sobrepeso (obesidad de grado I)
			de 30 a 35 sobrepeso crónico (obesidad de grado II)
			de 35 a 40 obesidad premórbida (obesidad de grado III)
			>40 obesidad mórbida (obesidad de grado IV)
		 */

		Scanner sc=new Scanner(System.in);
		
		String aux;
		double peso, altura, elevado=2, altura2, ingreso=16, infrapeso=17, bajopeso=18, pesoNormal=25, sobrepeso=30, sobrepesoCro=35, obesidad=40;
		int resultado, option;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 12.");
		System.out.println("-----------------------------------");
		
		System.out.println("Vamos a calcular el índice de masa corporal.");
		
		System.out.println("Indique su peso(kg):");
		aux=sc.nextLine();
		peso=Double.parseDouble(aux);
		
		System.out.println("Indique su altura(m):");
		aux=sc.nextLine();
		altura=Double.parseDouble(aux);
		
		altura2=Math.pow(altura,elevado);
		resultado=(int) (peso/altura2);
		
		switch (resultado) {
			case 15:
				System.out.printf("Su IMC es de %s y se encuentra en criterio de ingreso en hospital.\n",resultado);
				break;
			case 16:
				System.out.printf("Su IMC es de %s y se encuentra en infrapeso.\n",resultado);
				break;
			case 17:
				System.out.printf("Su IMC es de %s y se encuentra en bajo peso.\n",resultado);
				break;
			case 18:
				System.out.printf("Su IMC es de %s y se encuentra en bajo peso.\n",resultado);
				break;
			case 19:
				System.out.printf("Su IMC es de %s y se encuentra en peso normal (saludable).\n",resultado);
				break;
			case 20:
				System.out.printf("Su IMC es de %s y se encuentra en peso normal (saludable).\n",resultado);
				break;
			case 21:
				System.out.printf("Su IMC es de %s y se encuentra en peso normal (saludable).\n",resultado);
				break;
			case 22:
				System.out.printf("Su IMC es de %s y se encuentra en peso normal (saludable).\n",resultado);
				break;
			case 23:
				System.out.printf("Su IMC es de %s y se encuentra en peso normal (saludable).\n",resultado);
				break;
			case 24:
				System.out.printf("Su IMC es de %s y se encuentra en peso normal (saludable).\n",resultado);
				break;
			case 25:
				System.out.printf("Su IMC es de %s y se encuentra en peso normal (saludable).\n",resultado);
				break;
			case 26:
				System.out.printf("Su IMC es de %s y se encuentra en sobrepeso (obesidad de grado I).\n",resultado);
				break;
			case 27:
				System.out.printf("Su IMC es de %s y se encuentra en sobrepeso (obesidad de grado I).\n",resultado);
				break;
			case 28:
				System.out.printf("Su IMC es de %s y se encuentra en sobrepeso (obesidad de grado I).\n",resultado);
				break;
			case 29:
				System.out.printf("Su IMC es de %s y se encuentra en sobrepeso (obesidad de grado I).\n",resultado);
				break;
			case 30:
				System.out.printf("Su IMC es de %s y se encuentra en sobrepeso (obesidad de grado I).\n",resultado);
				break;
			case 31:
				System.out.printf("Su IMC es de %s y se encuentra en sobrepeso crónico (obesidad de grado II).\n",resultado);
				break;
			case 32:
				System.out.printf("Su IMC es de %s y se encuentra en sobrepeso crónico (obesidad de grado II).\n",resultado);
				break;
			case 33:
				System.out.printf("Su IMC es de %s y se encuentra en sobrepeso crónico (obesidad de grado II).\n",resultado);
				break;
			case 34:
				System.out.printf("Su IMC es de %s y se encuentra en sobrepeso crónico (obesidad de grado II).\n",resultado);
				break;
			case 35:
				System.out.printf("Su IMC es de %s y se encuentra en sobrepeso crónico (obesidad de grado II).\n",resultado);
				break;
			case 36:
				System.out.printf("Su IMC es de %s y se encuentra en obesidad premórbida (obesidad de grado III).\n",resultado);
				break;
			case 37:
				System.out.printf("Su IMC es de %s y se encuentra en obesidad premórbida (obesidad de grado III).\n",resultado);
				break;
			case 38:
				System.out.printf("Su IMC es de %s y se encuentra en obesidad premórbida (obesidad de grado III).\n",resultado);
				break;
			case 39:
				System.out.printf("Su IMC es de %s y se encuentra en obesidad premórbida (obesidad de grado III).\n",resultado);
				break;
			case 40:
				System.out.printf("Su IMC es de %s y se encuentra en obesidad premórbida (obesidad de grado III).\n",resultado);
				break;
			case 41:
				System.out.printf("Su IMC es de %s y se encuentra en obesidad mórbida (obesidad de grado IV).\n",resultado);
				break;
			default:
				System.out.println("OPCIÓN NO DISPONIBLE");		
		}
		
		System.out.println("  ");	
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");
		
	}

}
