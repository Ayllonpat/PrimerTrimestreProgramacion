package ejemplo01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		String aux;
		int edad=0;
		//no se una nextLine para números
		double precio=0.0;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("¿Cuál es tu nombre?");

		nombre=sc.nextLine();
		
		System.out.println(nombre);
		
		System.out.println("¿Tu edad?");
		
		aux=sc.nextLine();
		
		edad=Integer.parseInt(aux);
		//crea una cadena
		
		System.out.println("Tu edad es "+21+" años");
		
		
		System.out.println("¿Cuál es el precio?");
		
		aux=sc.nextLine();
		
		precio=Double.parseDouble(aux);
		
		System.out.println("El precio es " +precio+"€");
		
	}

}
