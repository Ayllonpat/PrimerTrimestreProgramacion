package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribir un programa que sirva para calcular el precio final de un producto. El cliente se lleva 4 
			unidades de un producto que cuesta 12,99 € y se le aplica un descuento del 3 % al precio total
		 */
		
		double precioProducto=12.99, resultadoPrecio=0.0, resultadoPrecioDescuento=0.0,
				resultadoPrecioFinal;
		int unidades=4, descuento=3, cien=100;
		
		System.out.println("/////////////////////////////////////////////");
		System.out.println("Bienvenidos, vamos a realizar el ejercicio 10.");
		System.out.println("/////////////////////////////////////////////");
		
		System.out.println("    ");
		
		System.out.println("Debemos calcular el precio final de 4 productos con valor de 12.99€ "
				+ "despues de aplicarle un 3%.");
		
		resultadoPrecio=precioProducto*unidades;
		
		resultadoPrecioDescuento=resultadoPrecio*(descuento/cien);
		
		resultadoPrecioFinal=resultadoPrecio-resultadoPrecioDescuento;
		
		System.out.printf("\nEl precio final será %.2f€.",resultadoPrecioFinal);
		
		System.out.println("\n");
		
		System.out.println("\nMuchas gracias por usar el programa :).");
		
		
		
		

	}

}
