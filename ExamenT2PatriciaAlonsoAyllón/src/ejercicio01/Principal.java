package ejercicio01;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			Random rnd=new Random(System.nanoTime());
			
			String aux;
			int hasta, desde, suma=0, media=0, tam=10, cien=100, porcentaje=0, opcion, numero[], cinco=5, 
					total5=0, totalHasta=0, menor=0, pos, cantSuma;
			
			System.out.println("-------------------------------------------");
			System.out.println("Bienvenido al examen del TEMA 2.");
			System.out.println("-------------------------------------------");
			
			do {
			
			System.out.println("""
					
					Elija que desea hacer:
					
					1.Tirar un dado
					0.Cerrar
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
				switch(opcion) {
				
				case 0:
					System.out.println("\nCerrando...\n");
					break;
				
				case 1:
					
					System.out.printf("Debe realizar %d tiradas de un dado, elíjalo:\n\n",tam);
					System.out.println("Indique desde qué número empieza:");
					
					aux=sc.nextLine();
					desde=Integer.parseInt(aux);
					
					System.out.println("Indique el último número de este:");
					
					aux=sc.nextLine();
					hasta=Integer.parseInt(aux);
					
					numero= new int [tam];
					
					System.out.println("   ");
					System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------");
					
					for(int i=0;i<numero.length;i++) {
						
						System.out.printf(" Tirada %d \t",i+1);
					}
					
					System.out.println("\n");
					
					for(int i=0;i<numero.length;i++) {
						
					
						numero[i]=rnd.nextInt(hasta-desde+1)+desde;
						System.out.printf("   %d \t\t ",numero[i]);
						
						if(numero[i]<cinco) {
							
							total5=total5+1;
							
						}
						suma=suma+numero[i];
						media=suma/tam;
						
						if(numero[i]==hasta) {
							totalHasta=totalHasta+1;
							
						}
						porcentaje=(totalHasta*cien)/tam;
					}	
					for(int i=0;i<numero.length;i++) {
						
						if(i==0) {
							 menor=numero[i];
							}
						if(menor>numero[i]) {
							menor=numero[i];
							}
					}
					System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("\n\n-El total de las tiradas es %d.",suma);
					System.out.printf("\n\n-La media total es %d.",media);
					System.out.printf("\n\n-Hay un total de %d números menores a %d.",total5, cinco);
					System.out.printf("\n\n-El porcentaje de máxima tirada %d%%.",porcentaje);
					System.out.printf("\n\n-El número más pequeño ha sido %d.\n\n",menor);
					System.out.println("--------------------------------------------------------------------------------");
					System.out.printf("""
							
							Indique si quiere sumar alguna cantidad a alguna de las tiradas:
							
							1.Sí
							2.No
							""");
					
					aux=sc.nextLine();
					opcion=Integer.parseInt(aux);
					
					switch(opcion) {
					
					case 1:
						System.out.println("\nIndique a cuál quiere sumar:");
						
						aux=sc.nextLine();
						pos=Integer.parseInt(aux)-1;
						
						for(int i=0;i<numero.length;i++) {
							
							if(pos==i) {
								System.out.println("\nIndique la cantidad que desea sumar:");
								
								aux=sc.nextLine();
								cantSuma=Integer.parseInt(aux);
								
								numero[i]=numero[i]+cantSuma;
								
								System.out.printf("El total de la tirada %d es de %d.\n", pos+1, numero[i]);					}
							
						}
						
						break;
					case 2:
						System.out.println("Continuando...");
						break;
					default:
						System.out.println("OPCIÓN NO DISPONIBLE");
						break;
					
					}
					
					
					break;
					
				default:
					System.out.println("OPCIÓN NO DISPONIBLE");
					break;
					}
				
			}while(opcion!=0);
	}

}
