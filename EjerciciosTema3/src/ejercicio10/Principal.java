package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10.Este programa tendría otra serie de clases, pero por simplificar lo haremos solo con 3 clases. Crear un
		 programa que simule una máquina vendedora de tickets de metro. Tendremos que crear la clase Ticket
		(Clase POJO), la clase Maquina (donde estarán todos los métodos con funcionalidad) y la clase principal
		de prueba. Tendrá un menú donde se pueda:
		
		• Comprar uno o varios billetes.
		• Calcular el cambio a devolver.
		• Imprimir por pantalla el billete. Solo uno. Si se han comprado “x” debemos mostrar en el ticket el
		mensaje “válido para x personas”.
		• Opciones de operario: el operario que lleva el mantenimiento de la máquina, debe tener disponible
		un método que le ofrezca el saldo total de la recaudación de la máquina en ese día (no es necesario
		usar fechas) y otro método que pueda poner a cero el contador de saldo total.
		• Dentro de la opción de operario, también debe contar con la posibilidad de cambiar el precio de
		los billetes ya que estos suelen subir todos los años.
		• Las operaciones para el operario se harán solo si se introduce la contraseña adecuada antes de
		cualquier otra cosa, por lo que se debe tener el método comprobar contraseña.
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Bienvenidos al ejercicio 10");
		System.out.println("------------------------------------------------------------------------");
		
		String aux, fecha = null, destino = null;
		double precioU = 0;
		int opcion=0, opcion2=0, nPersonas = 0;
		Ticket t;
		Maquina m;
		m=new Maquina(nPersonas, precioU);
		t=new Ticket(nPersonas, precioU, fecha, destino);
		do {
			System.out.println("""
				
				 ------------------------------------------------------------
				|                                                            |
				|  Bienvenido a su sesión del  cajero del metro de Sevilla   |
				|                                                            |
				|------------------------------------------------------------|
				|                                                            |
				|   Opciones:                                                |
				|                                                            | 
				|	  1.Sacar billetes       2.Calcular cambio           |
				|                                                            |
				|	  3.Imprimir billete     4.Opciones mantenimiento    |
				|                                                      	     |
				|	  0.Salir                                            |
				|                                                            |
				 ------------------------------------------------------------
				""");
		
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion){
				
			case 0:
				System.out.println("\nCerrando...\n");
				break;
				
			case 1:
				
				do {
				System.out.println("""
						
						 ------------------------------------------------------------
						|                                                            |
						|  Indique que tipo de billete desea                         |
						|                                                            |
						|------------------------------------------------------------|
						|                                                            |
						|   Opciones:                                                |
						|                                                            | 
						|     1. SIN SALTOS 1.20€    2. UN SALTO 1.50€               |
						|                                                            |
						|     3. DOS SALTOS 1.75€    0.Salir                         |
						|                                                      	     |
						|                                                            |
						|                                                            |
						 ------------------------------------------------------------
						""");
				aux=sc.nextLine();
				opcion2=Integer.parseInt(aux);
				
				switch(opcion2){
					
				case 1:
					System.out.println("Indique cuantos billetes quiere:");
					aux=sc.nextLine();
					nPersonas=Integer.parseInt(aux);
					t.cantidadTicket(nPersonas);
					precioU=1.2;
					m.comprarTickets(nPersonas);
					
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				case 0:
					System.out.println("Volviendo...");
					break;
					
				default:
					System.out.println("OPCIÓN NO DISPONIBLE");
					break;
				
				}
				
				}while(opcion2!=0);
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			default:
				System.out.println("OPCIÓN NO DISPONIBLE");
				break;
			}
			
		}while(opcion!=0);
		
		System.out.println("""
				 ------------------------------------------------------------
				|                                                            |
				|  Muchas gracias por su atención, que pase un buen día      |
				|                                                            |
				 ------------------------------------------------------------
				""");
	}

}
