package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implementar un programa que contenga dos métodos en una clase “operaciones”: un método al que se le
			pase un número entero y diga si este es positivo o negativo y otro que diga si un número es par o 
			impar. La clase no debe tener ningún atributo. Se deben probar los métodos en el main.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		boolean res, res2;
		int num;
		
		Operaciones op= new Operaciones ();
		

		System.out.println("-----------------------------------------------");
		System.out.println("Bienvenidos al ejercicio 3.");
		System.out.println("-----------------------------------------------\n");
		 	
		
		System.out.println("Indique un número entero:");
		aux=sc.nextLine();
		num=Integer.parseInt(aux);

		res=op.calcularPositivoNegativo2(num);
		res2=op.calcularParImpar(num);
			
		op.mostrarResultado(res);
		op.mostrarResultadoPar(res2);
		
		System.out.println("\n-----------------------------------------------");
		System.out.println("Gracias por su atención :).");
		System.out.println("-----------------------------------------------");
		
	}

}
