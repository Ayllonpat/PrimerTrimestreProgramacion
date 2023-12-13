package ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 9. Crear un programa que gestione un sorteo de lotería. La lotería de Navidad se realiza sobre números que
			van desde el 00001 al 99999 (no tendremos en cuenta series). Para facilitar, tendremos solo la clase Sorteo
			y la principal para probar todo. El programa debe hacer lo siguiente:
			• Comprar un décimo (eligiendo el número por teclado).
			• Comprar un décimo generado por la máquina (aleatorio).
			• Hacer sorteo (generará aleatoriamente el número premiado).
			• Comprobar si nuestro décimo está premiado devolviendo un boolean.
			• Mostrar si eres ganador o no.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int opcion;
		int boleto=0, boletoGanador=0;
		boolean ganador=true;
		String aux;
		Boleto s;
		int boletoAlt=0;
		
		s=new Boleto(boleto);
		
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("BIENVENIDO AL EJERCICIO 9.");
		System.out.println("-----------------------------------------------------------\n");
		
		System.out.println("¡Bienvenido a la lotería!");
		do {
		
		System.out.println("""
				
				Elija que desea hacer:
				
					1.Elegir décimo a comprar.
					2.Comprar décimo aleatorio.
					3.Realizar sorteo.
					4.Comprobar si nuestro décimo está premiado
					5.Mostrar si has ganado.
					0.Salir.
				""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				
			case 0:			
				s.salir();
				break;
			
			case 1:
				boleto=s.elegirDecimo();
				aux=sc.nextLine();
				boleto=Integer.parseInt(aux);
				s.mostrarDecimo(boleto);
				break;
				
			case 2:
				boletoAlt=s.elegirDecimoAlt();
				s.mostrarDecimoAlt(boletoAlt);
				break;
				
			case 3:
				boletoGanador=s.elegirBoletoGanador();
				s.mostrarBoletoGanador(boletoGanador);
				break;
				
			case 4:
				ganador=s.compararBoletos(boletoGanador, boletoAlt);
				break;
				
			case 5:
				s.mostrarComparacion(ganador);
				break;
				
			default:
				System.out.println("OPCIÓN NO DISPONIBLE");
				break;
			}
			
		}while(opcion!=0);
		
		System.out.println("\n-----------------------------------------------------------");
		System.out.println("Muchas gracias por su atención");
		System.out.println("-----------------------------------------------------------");
		
	}

}
