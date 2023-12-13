package eurovision;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random (System.nanoTime());
		
		String nombresPaisesFinal []= {"Albania", "Alemania","Australia", "Austria","Chipre", "Croacia", "Eslovenia",
				"España", "Estonia", "Finlandia"};
		


		int votosFinal[][];
		
		int opcion, hasta=12, desde=1, cero=0, colFinal=10, filFinal=10, totalVotosFinal=0, mayor=0, num=0;	
		votosFinal= new int [filFinal][colFinal];
		
		
		System.out.println("------------------------");
		System.out.println("BIENVENIDOS A EUROVISIÓN");
		System.out.println("------------------------");
		
		do {
			
			System.out.println("""
					
					0 - Salir
					1 - Ver Países de la final
					2 - Ver votos de final
					3 - Ver votos totales final
					4 - Ganador
					""");
			System.out.println("¿Qué desea ver?");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 1:
					
					System.out.println("""
							
							Estos son los paises que se presentan este año a la semifinal de Eurovisión:
							
								-Albania
								-Alemania								
								-Australia
								-Austria
								-Chipre
								-Croacia
								-Eslovenia
								-España								
								-Estonia
								-Finlandia	
							""");
					
					
					
					break;
					
				case 2:
					
					
					for (int i = 0; i < votosFinal.length; i++) {
						
						for (int j = 0; j < votosFinal[i].length; j++) {
							
							votosFinal[i][j]=rnd.nextInt(hasta - desde + 1) + desde;
				
						}
					
						System.out.println("");
		
					}
					
					for (int i = 0; i < nombresPaisesFinal.length; i++) {
						
						System.out.print(nombresPaisesFinal[i] + " \t\t");
					
					
					}
					
					System.out.println("\n-----------------------------------------------------------------------------------------"
							+ "------------------------------------------------------------------------------------------------------"
							+ "-------------------------------------------");
					System.out.println("");
					
					for (int i = 0; i < votosFinal.length; i++) {
						
						for (int j = 0; j < votosFinal[i].length; j++) {
							
							System.out.print(votosFinal[i][j] + " \t\t\t");
							
						}
						
						System.out.println("");
						
					}
					break;
					
				
				case 3:
					for (int i = 0; i < nombresPaisesFinal.length; i++) {
						
						System.out.print(nombresPaisesFinal[i] + " \t\t");
					
					
					}
					
					System.out.println("\n-----------------------------------------------------------------------------------------"
							+ "------------------------------------------------------------------------------------------------------"
							+ "-------------------------------------------");
					System.out.println("");
					for (int i = 0; i < votosFinal.length; i++) {
						
						for (int j = 0; j < votosFinal[i].length; j++) {
							
							totalVotosFinal+=votosFinal[j][i];
							
							num=totalVotosFinal;

							if(num==votosFinal[j][i]) {
								mayor=totalVotosFinal;
								}
							if(mayor>totalVotosFinal) {
								mayor=votosFinal[j][i];
								}
							mayor=totalVotosFinal;
						}
					
						
					System.out.print(totalVotosFinal + " \t\t\t");
					totalVotosFinal=0;
					
					}
					
					System.out.println("");
		
					break;
				
					
				case 4:
					
					
					
					System.out.println("El ganador tiene un total de " + mayor + " votos.\n");
					break;
					
		
					
				case 0:
					System.out.println("Saliendo...");
					System.out.println("");
					break;
				
				default:
					System.out.println("Opción no válida");
					System.out.println("");
					break;
			
			
			}
			
			
		}while(opcion!=cero);
	}

}
