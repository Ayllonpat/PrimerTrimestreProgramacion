package ejercicio11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa dirigido por menús que solicite el peso de una persona, y escriba por
			pantalla su peso en cualquier planeta del Sistema Solar. Las equivalencias son las siguientes
			(basta con multiplicar el peso de la persona en la tierra por la constante de equivalencia):
			
			PLANETA Mercurio Venus Tierra Marte Júpiter Saturno Urano Neptuno
			
			EQUIVALENCIA 0.38 0.91 1.00 0.38 2.53 1.06 0.92 1.2
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String aux, mercurio="Mercurio", venus="Venus", tierra="Tierra", marte="Marte", jupiter="Júpiter", saturno="Saturno",
				urano="Urano", neptuno="Neptuno";
		double equiMerc=0.38, equiVenus=0.91, equiTierra=1.0, equiMarte=0.38, equiJupi=2.53, equiSatu=1.06, equiUra=0.92,
				equiNeptu=1.2, nuestroPeso, pesoPlaneta;
		int opcion;
		
		System.out.println("------------------------------------------");
		System.out.println("Bienvenidos al ejercicio 11.");
		System.out.println("------------------------------------------");
		
		System.out.println("\nDebemos crear un programa que nos permita calcular nuestro peso en cualquier "
				+ "planeta del Sistema Solar.");
		
		System.out.println("\nPara ello primero debe indicar su peso(kg):");
		
		aux=sc.nextLine();
		nuestroPeso=Double.parseDouble(aux);
		
		System.out.println("Ahora elija en que planeta quiere sabes su peso:");
		
		System.out.printf("\n1.%s",mercurio);
		System.out.printf("\n2.%s",venus);
		System.out.printf("\n3.%s",tierra);
		System.out.printf("\n4.%s",marte);
		System.out.printf("\n5.%s",jupiter);
		System.out.printf("\n6.%s",saturno);
		System.out.printf("\n7.%s",urano);
		System.out.printf("\n8.%s",neptuno);
		
		
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
			case 1:
				pesoPlaneta=equiMerc*nuestroPeso;
				System.out.printf("\nSu peso en el planeta elegído es de %.2fkg.",pesoPlaneta);
				break;
				
			case 2:
				pesoPlaneta=equiVenus*nuestroPeso;
				System.out.printf("\nSu peso en el planeta elegído es de %.2fkg.",pesoPlaneta);
				break;
			
			case 3:
				pesoPlaneta=equiTierra*nuestroPeso;
				System.out.printf("\nSu peso en el planeta elegído es de %.2fkg.",pesoPlaneta);
				break;
				
			case 4:
				pesoPlaneta=equiMarte*nuestroPeso;
				System.out.printf("\nSu peso en el planeta elegído es de %.2fkg.",pesoPlaneta);
				break;
				
			case 5:
				pesoPlaneta=equiJupi*nuestroPeso;
				System.out.printf("\nSu peso en el planeta elegído es de %.2fkg.",pesoPlaneta);
				break;
				
			case 6:
				pesoPlaneta=equiSatu*nuestroPeso;
				System.out.printf("\nSu peso en el planeta elegído es de %.2fkg.",pesoPlaneta);
				break;
				
			case 7:
				pesoPlaneta=equiUra*nuestroPeso;
				System.out.printf("\nSu peso en el planeta elegído es de %.2fkg.",pesoPlaneta);
				break;
				
			case 8:
				pesoPlaneta=equiNeptu*nuestroPeso;
				System.out.printf("\nSu peso en el planeta elegído es de %.2fkg.",pesoPlaneta);
				break;
				
			default:
				System.out.println("\nOpción no disponible.");
				break;
		}
				
		System.out.println("\n   ");	
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");
				
				
		
		
		}

	}


