package ejemploFor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux, palabra;
		int tope;
		
		System.out.println("Diga la palabra a mostrar:");
		palabra=sc.nextLine();
		
		System.out.println("\nIndique cuantas vez la quiere mostrar:");
		aux=sc.nextLine();
		tope=Integer.parseInt(aux);
		
		//la variable i se declara siempre en el parentesis
		for(int i=0;        i<tope;                 i++) {
			//desde         hasta      de cuanto en cuanto se cuenta
			
			System.out.printf("\n%s", palabra);
		}

	}

}
