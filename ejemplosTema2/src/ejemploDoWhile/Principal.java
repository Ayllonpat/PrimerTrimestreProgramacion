package ejemploDoWhile;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int base, tope=0;
		
		System.out.println("Diga un número, cero para acabar.");
		aux=sc.nextLine();
		base=Integer.parseInt(aux);
		
		if(base==tope) {
			
		}else{
		
		do {
			System.out.println(base);
			System.out.println("Diga otro número:");
			aux=sc.nextLine();
			base=Integer.parseInt(aux);
			
			
		}while(base!=tope);
	}
		
		
			
	}

}
