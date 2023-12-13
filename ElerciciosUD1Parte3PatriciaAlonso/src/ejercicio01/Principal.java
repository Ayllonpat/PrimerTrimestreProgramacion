package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * El precio final de venta de un automóvil nuevo para un comprador es la suma total de: el coste de fabricación 
		del vehículo, el porcentaje de la ganancia del vendedor y los impuestos estatales aplicables (sobre el coste de 
		fabricación). Pedir por teclado la ganancia del vendedor que se quiere en porcentaje en cada coche, el % de 
		impuesto y el coste de fabricación y diseñar un programa para calcular el precio final de un automóvil e 
		imprimirlo por pantalla. 
		 */
		
		Scanner sc=new Scanner(System.in);
		
		double porcentajeGanancia=0.0, impuestos=0.0, costeFabricacion=0.0, ganancia=0.0, porcentajeImpuestos=0.0, precioImpuestos=0.0, precioFinal=0.0;
		int cien=100; 
		String aux;
		
		System.out.println("-----------------------------");
		System.out.println("Bienvenido al ejercicio 1");
		System.out.println("-----------------------------");
		
		System.out.println("Introduzca el coste de fabricación:");
		
		aux =sc.nextLine();
		
		costeFabricacion=Double.parseDouble(aux);
		
		System.out.println("Introduzca el porcentaje de los impuestos:");
		
		aux =sc.nextLine();
		
		porcentajeImpuestos=Double.parseDouble(aux);
		
		System.out.println("Introduzca el porcentaje de ganancia deseado:");
		
		aux =sc.nextLine();
		
		porcentajeGanancia=Double.parseDouble(aux);
		
		impuestos=costeFabricacion*(porcentajeImpuestos/cien);
		
		ganancia=costeFabricacion*(porcentajeGanancia/cien);
		
		precioFinal=costeFabricacion+impuestos+ganancia;
		
		//precioFinal=(costesFabricacion*(porcentajeImpuestos/cien))+(costeFabricacion*(porcentajeGanancia/cien))+costeFabricacion
		
		System.out.printf("El precio final del producto será %.2f€ y el vendedor tendrá una ganancia de %.2f€.", precioFinal, ganancia );
		
		System.out.println("\n-----------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------");
		
		
		

	}

}
