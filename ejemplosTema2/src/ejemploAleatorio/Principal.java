package ejemploAleatorio;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int valorEntero=(int)Math.floor( Math.random()*6+1);
		
		//int valorEntero = (int)Math.floor(Math.random()*(N-M+1)+M); 
		//double valorAleatorio = Math.random()*(N-M)+M;
		
		Random num=new Random(System.nanoTime());
		
		int hasta, desde, tope;
		int ale;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Indica hasta qué n vamos a contar:");
		aux=sc.nextLine();
		hasta=Integer.parseInt(aux);
		
		System.out.println("Indica desde qué n vamos a contar:");
		aux=sc.nextLine();
		desde=Integer.parseInt(aux);
		
		System.out.println("Indica hasta qué cantidad de n vamos a contar:");
		aux=sc.nextLine();
		tope=Integer.parseInt(aux);
		
		for (int i=0; i<tope; i++){
			
			ale=num.nextInt(hasta-desde+1)+desde;
			
			System.out.println(ale);
		}
		
		
		//num.nextInt();
		
		//for (int i=0; i<5; i++);


	}

}
