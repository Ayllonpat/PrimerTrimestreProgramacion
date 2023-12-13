package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que escriba el precio de un producto en una compra, una vez descontado el tanto
		por ciento de descuento, dando nosotros en la declaración de las variables el precio inicial de un
		producto y el tanto por ciento que se va a descontar. Ojo, el cálculo del tanto por ciento lo debe hacer
		el programa no el usuario, por ejemplo, se debe usar 20 y no 0.2.
		descuento= 20 %; y no descuento=0.2;

		 */
		
		double precioInicial=38.99, descuento=40, porcentajeRestar=0, resultado1=0 ;
		
		System.out.println("/////////////////////////////////////////////");
		System.out.println("Bienvenidos, vamos a realizar el ejercicio 6.");
		System.out.println("/////////////////////////////////////////////");
		
		System.out.println("    ");
		
		System.out.printf("Debemos calcular el precio final de un producto solo con el precio inicial, %.2f€, y el porcentaje"
				+ ", %.0f%%.", precioInicial, descuento);
		
		System.out.println("\n  ");
		
		System.out.println("Primero debemos calculcular el porcentaje del precio inicial que vamos a restar.");
		
		porcentajeRestar=precioInicial*descuento/100;
		
		System.out.println("    ");
		
		System.out.printf("El resultado sería %.2f€.", porcentajeRestar);
		
		System.out.println("    ");
		
		System.out.println("\nAhora vamos a calcular el precio final.");
		
		System.out.println("    ");
		
		System.out.printf("Restamos el precio inicial, %.2f€, y y el %.0f%%, %.2f€.", precioInicial, descuento, porcentajeRestar  );
		
		resultado1=precioInicial-porcentajeRestar;
		
		System.out.println("\n     ");
		
		System.out.printf("El resultado sería %.2f€.", resultado1);
		
		System.out.println("\n   ");
		
		System.out.println("********************************************");
		
		System.out.println("   ");
		
		System.out.println("Nos despedimos, gracias por su atención. :)");

	}

}
