package ejemploMenuCompleto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aux;
		int opcion, tope=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Refranero Semanal\n");
		
		do {
			
			System.out.println("0. Para salir");
			System.out.println("1. Lunes");
			System.out.println("2. Martes");
			System.out.println("3. Miércoles");
			System.out.println("4. Jueves");
			System.out.println("5. Viernes");
			System.out.println("6. Sábado");
			System.out.println("7. Domingo");
			
			System.out.println("\nDiga un número:");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
			
				case 1:
					System.out.println("Lunes a mediodia");
					break;
					
				case 2:
					System.out.println("Martes a mediodia");
					break;
					
				case 3:
					System.out.println("Miércoles a mediodia");
					break;
					
				case 4:
					System.out.println("Jueves a mediodia");
					break;
					
				case 5:
					System.out.println("Viernes a mediodia");
					break;
					
				case 6:
					System.out.println("Sábado a mediodia");
					break;
					
				case 7:
					System.out.println("Domingo a mediodia");
					break;
					
				case 0:
					System.out.println("Hasta luego.");
					break;
				
				default:
					System.out.println("OPCIÓN NO VALIDA");
					break;
			}
						
		}while(opcion!=tope);

		}
	
	}
	
