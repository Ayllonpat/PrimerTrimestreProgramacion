package ejemplo1Arrays;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int tam=4, lugar, edad, opcion;
		String aux;
		
		//Primera forma
		
		int edades[];
		
		edades=new int[tam];
		
		//Segunda forma
		
		int edades2[]=new int [tam];
		
		//Tercera forma, inicializando con valores
		
		int edades3[]= {20,18,21};
		
		//Guardar valores
		
		System.out.println("Indique el lugar en el que quiere guardar");
		aux=sc.nextLine();
		lugar=Integer.parseInt(aux)-1;
		
		System.out.println("Indique la edad que quiere guardar");
		aux=sc.nextLine();
		edad=Integer.parseInt(aux);
		
		edades[lugar]=edad;
		
		System.out.println("Indique que lugar quiere ver 1-4:");
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
		case 1:
			System.out.println(edades[0]);
			break;
		case 2:
			System.out.println(edades[1]);
			break;
		case 3:
			System.out.println(edades[2]);
			break;
		case 4:
			System.out.println(edades[3]);
			break;
		default:
			break;
		}
		

	}

}
