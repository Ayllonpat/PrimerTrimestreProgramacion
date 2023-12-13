package ejemplosCondicionales01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int num1=0, num2=0, tope=5;
		String aux;
		
		System.out.println("Indique el primer número:");
		
		aux=sc.nextLine();
		num1=Integer.parseInt(aux);
		
		//System.out.println("Indique el segundo número:");
		
		//aux=sc.nextLine();
		//num2=Integer.parseInt(aux);
		
		if(num1>=tope) {
			System.out.println("Aprobado");
		}else {
			//el if puede ir solo pero el else siempre necesita un if
			System.out.println("Suspenso");
		}
				
		System.out.println("Adiós");
		

	}

}
