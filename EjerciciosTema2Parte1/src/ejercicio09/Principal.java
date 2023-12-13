package ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Calcular el precio por entrar en el cine, pidiendo el número de entradas y el precio. Pedir el 
			día de la semana y si es miércoles (día del espectador) se aplicará un descuento del 30 % al 
			total
		 */
		Scanner sc=new Scanner(System.in);
		
		String aux, lunes="lunes", martes="martes", miercoles="miércoles", jueves="jueves", viernes="viernes", sabado="sábado", domingo="domingo", dia;
		double precioEn, cantidadEn, descuento=30, cien=100, total, totalD;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 9.");
		System.out.println("-----------------------------------");

		System.out.println("Vamos a calcular del precio de ir al cine.");
		
		System.out.println("Indica el precio de una entrada en el cine");
		aux=sc.nextLine();
		precioEn=Double.parseDouble(aux);
		System.out.println("\nIndica el número de entradas a comprar");
		aux=sc.nextLine();
		cantidadEn=Double.parseDouble(aux);
		System.out.println("\nIndica el día de la semana (en minúsculas) que va a ir:");
		dia=sc.nextLine();
		
		total=precioEn*cantidadEn;
		
		if(dia.equals(miercoles)){
			totalD=(descuento/cien)*total;
			System.out.printf("En total pagará %.2f€.",totalD);
		}else if(dia.equals(lunes)){
			System.out.printf("En total pagará %.2f€.",total);
		}else if(dia.equals(martes)){
			System.out.printf("En total pagará %.2f€.",total);
		}else if(dia.equals(jueves)){
			System.out.printf("En total pagará %.2f€.",total);
		}else if(dia.equals(viernes)){
			System.out.printf("En total pagará %.2f€.",total);
		}else if(dia.equals(sabado)){
			System.out.printf("En total pagará %.2f€.",total);
		}else if(dia.equals(domingo)){
			System.out.printf("En total pagará %.2f€.",total);
		}
		
		System.out.println("\n   ");	
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");
		
		

	}

}
