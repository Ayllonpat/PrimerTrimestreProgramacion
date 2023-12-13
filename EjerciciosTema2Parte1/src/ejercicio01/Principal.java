package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Leer 2 números y determinar el mayor de ellos. Mejorar el programa mostrando también la
			posibilidad de que sean iguales.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int num1, num2;
		String aux;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 1.");
		System.out.println("-----------------------------------");
		
		System.out.println("Vamos a leer dos números y determinar cuál es mayor.");
		System.out.println("   ");
		System.out.println("Indique el número 1:");
		
		aux=sc.nextLine();
		num1=Integer.parseInt(aux);
		
		System.out.println("   ");
		System.out.println("Indique el número 2:");
		
		aux=sc.nextLine();
		num2=Integer.parseInt(aux);
		
		System.out.println("  ");	
		
		if (num1==num2) {
			
			System.out.println("Los dos números son iguales.");
	
			}else if (num1>num2){
			
			System.out.printf("El número 1, %d, es mayor.", num1);
			
				}else{
				System.out.printf("El número 2, %d, es mayor.", num2);
					}
			System.out.println("   ");	
			System.out.println("-----------------------------------");
			System.out.println("Muchas gracias por su atención :).");
			System.out.println("-----------------------------------");
			
		
		
		}
		
	}


