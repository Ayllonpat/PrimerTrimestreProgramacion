package ejercicio01;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un array de tipo String, inicializarlo en la propia definición con el nombre de 5 personas y
			mostrarlo por la pantalla mediante un bucle for.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String nombre []= {"Patty","Luca","Marco","Valeria","Iván"};
		String aux;
		int opcion, tam=5, numeros[];
		int hasta=99, desde=1;
		
		numeros= new int [tam];
		
		Random rnd=new Random(System.nanoTime());
	 
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 1.");
		System.out.println("-----------------------------------");
		
		do {
		
		System.out.println("Escriba 0 para cerrar y 1 para continuar");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		
				for(int i=0;i<nombre.length;i++) {
					System.out.println(nombre[i]+"\n");}
				
				for(int i=0; i<numeros.length; i++){
					
					numeros[i]=rnd.nextInt(hasta-desde+1)+desde;
					System.out.println(numeros[i]);
				}
		
		}while(opcion!=0);
		
		System.out.println("  ");	
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");
		
		
	}
}
