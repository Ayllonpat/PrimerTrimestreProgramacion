package examenT3;

import java.util.Scanner;

public class Principal {

	public static final int tam = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Plataforma p; 
		Depositos d;
		Depositos lista = new Depositos(tam);
		int opcion;
		String aux;
		int tam, suma, litros;
		double altura, radio, costreFabrica;
		
		 
		
		do {
			menu();
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 0:
				System.out.println("Saliendo....");
				break;
				
			case 1:
				
				System.out.println("""
						 Indique si quiere:
						
							1.Crear una nueva lista
							2.Añadir a la existente
							
						-------------------------------------------------------------------------------
						""");
				
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
				
				switch(opcion) {
				
				case 0:
					System.out.println("Volviendo....");
					break;
				
				case 1:
					System.out.println("Indique cuantos depósitos quiere:");
					aux=sc.nextLine();
					tam=Integer.parseInt(aux);
					p=new Plataforma(args);
					p.generarLista();
					break;
					
				case 2:
					System.out.println("Indique cuantos depósitos quiere añadir:");
					aux=sc.nextLine();
					suma=Integer.parseInt(aux);
					break;
					
				default:
					System.out.println("OPCIÓN NO DISPONIBLE");
					break;
				}
				break;
				
				
			case 2:
				
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
				
				switch(opcion) {
				
				case 0:
					System.out.println("Volviendo....");
					break;
				
				case 1:
					break;
					
				case 2:
					break;
					
				default:
					System.out.println("OPCIÓN NO DISPONIBLE");
					break;
				}
				break;
				
			case 6:
				break;
				
			default:
				System.out.println("OPCIÓN NO DISPONIBLE");
				break;
			}

		}while(opcion!=0);

	}
	
	public static void menu(){
		System.out.println("""
				-------------------------------------------------------------------------------
				 BIENVENIDO AL SISTEMA
				-------------------------------------------------------------------------------
				
				 Indique que quiere hacer:
						
					1.Añadir depósitos al sistema
					2.Agregar información de los depósitos
					3.Mostrar precio venta del depósito elegido
					4.Mostrar total de litros
					5.Venta de petroleo por depósito //sub menu si solo uno o todos
					6.Mostrar depósitos por altura
					0.Salir
						
				-------------------------------------------------------------------------------
				""");
	}

	
}
