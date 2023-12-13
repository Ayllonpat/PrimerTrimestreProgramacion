package ejemploWhile;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int base=1, tope;
		
		System.out.println("Indique hasta que número quiere que muestre");
		
		aux=sc.nextLine();
		tope=Integer.parseInt(aux);
		
		while (base<=tope) {
			System.out.println(base);
			base++;
			}
		
		//parte 2
		
		String aux2;
		int base2=1, tope2=0;

		System.out.println("Indique un número, cero para parar.");
		
		aux2=sc.nextLine();
		base2=Integer.parseInt(aux2);
		
		while (base2!=tope2) {
			System.out.println(base2);
			System.out.println("Diga otro número:");
			aux2=sc.nextLine();
			base2=Integer.parseInt(aux2);
		
				
			
			
		}
	}

}
