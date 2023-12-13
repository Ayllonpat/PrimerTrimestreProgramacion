package ejercicio05;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un programa que realice lo siguiente: 
			• Solicitar al usuario que introduzca por teclado el tamaño del array.
			• Declarar y definir el array de enteros.
			• Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.
			• Mostrar por pantalla la suma de todos los elementos.
			• Mostrar el mayor y el menor guardados en el array.
			• Modificar un valor elegido por el usuario.
		 */
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random(System.nanoTime());
		
		String aux;
		int tam, hasta, desde, numeros[], opcion, total=0, ale, mayor=0, menor=0;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 5.");
		System.out.println("-----------------------------------");
		
		do {
			System.out.println("""
					
					Indique qué quiere hacer:
					
					1.Continuar
					0.Cerrar
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 0:
				System.out.println("Cerrar");
				break;
				
			case 1:
			
				System.out.println("Indique el tamaño del array:\n");
				
				aux=sc.nextLine();
				tam=Integer.parseInt(aux);
				
				numeros=new int [tam];
				
				System.out.println("Indique desde que número quiere contar:\n");
				
				aux=sc.nextLine();
				desde=Integer.parseInt(aux)+1;
				
				System.out.println("Indique hasta que número quiere contar:\n");
				
				aux=sc.nextLine();
				hasta=Integer.parseInt(aux)+1;
				
				for(int i=0;i<numeros.length;i++) {
					
					numeros[i]=rnd.nextInt(hasta-desde+1)+desde;
					
					if(i==0) {
						 mayor=numeros[i];
						}
					if(mayor<numeros[i]) {
						mayor=numeros[i];
						}
					
					if(i==0) {
						 menor=numeros[i];
						}
					if(menor>numeros[i]) {
						menor=numeros[i];
						}
					
					System.out.printf("%d.%d\n",i+1,numeros[i]);
					
					total=total+numeros[i];
					
				}
				
				System.out.printf("\nLa suma es %d.\n",total);
				
				System.out.println("\nEl mayor número es:"+mayor);
				System.out.println("El menor es:"+menor);
				
				
				/*
				 * for
				 * if(numeros[i]==0)
				 * numCeros++;
				 */
					
					
			break;
			
			default:
				System.out.println("OPCIÓN NO DISPONIBLE");
			break;
			}
		}while(opcion!=0);

	}

}
