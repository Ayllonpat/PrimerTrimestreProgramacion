package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hacer un programa que “imite” un cutre ticket de un McDonals que solo vende un tipo de hamburguesas, 
		un tipo de patatas y un tipo de refrescos. Se debe pedir por teclado las cantidades de cada uno y el precio de 
		una unidad y calcular el total de la venta, leer la cantidad entregada para pagar y el cambio.
		* Quién lo atendió: Vuestro nombre
		* Fecha: (usando un String, no el tipo fecha de java)
		* Patatas medianas: Precio 
		* Bebida mediana: precio
		* Hamburguesa Mc Royal: Precio
		* Total a pagar: Suma de los 3 precios.
		* Entregado: Cantidad entregada
		* Cambio: Cambio a devolver
		Se deben usar las variables y operaciones adecuadas y guardar todos los datos intermedios en variable
				 */
		
		String trabajador, fecha, aux, producto1 = "Patatas" ,producto2="Bebidas", producto3="Hamburguesas", precioTotal="Total";
		double precioPatatas=0.0, precioBebida=0.0, precioHamburguesa=0.0, total=0.0, cantidadEntregada=0.0, cantidadCambio=0.0, 
				cambio=0.0, totalPatatas=0.0, totalBebida=0.0, totalHamburguesa=0.0 ;
		int cantidadPatatas=0, cantidadBebidas=0, cantidadHamburguesa=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println("Bienvenido al ejercicio 3");
		System.out.println("-----------------------------");
		
		System.out.println("Buenos días, ¿quién está atendiendo?");
		
		trabajador=sc.nextLine();
		
		System.out.println("Indique la fecha xx/xx/xx");
		
		fecha=sc.nextLine();
		
		System.out.println("¿Cuántas patatas quiere?");
		
		aux=sc.nextLine();
		
		cantidadPatatas=Integer.parseInt(aux);
		
		System.out.println("¿Cuánto cuesta una unidad de patatas?");
		
		aux=sc.nextLine();
		
		precioPatatas=Double.parseDouble(aux);
		
		System.out.println("¿Y cuántas bebidas?");
		
		aux=sc.nextLine();
		
		cantidadBebidas=Integer.parseInt(aux);
		
		System.out.println("¿Cuánto cuesta una unidad de bebida?");
		
		aux=sc.nextLine();
		
		precioBebida=Double.parseDouble(aux);
		
		System.out.println("¿Y cuántas hamburguesas?");
		
		aux=sc.nextLine();
		
		cantidadHamburguesa=Integer.parseInt(aux);
		
		System.out.println("¿Cuánto cuesta una unidad de hamburguesa?");
		
		aux=sc.nextLine();
		
		precioHamburguesa=Double.parseDouble(aux);
		
		totalPatatas=cantidadPatatas*precioPatatas;
		
		totalBebida=cantidadBebidas*precioBebida;
		
		totalHamburguesa=cantidadHamburguesa*precioHamburguesa;
		
		total=totalPatatas+totalBebida+totalHamburguesa;
		
		System.out.printf("El total a pagar será: %.2f€.", total);
		
		System.out.println("\n");
		
		System.out.println("¿Cuánto dinero ha sido entregado por el cliente?");
		
		aux=sc.nextLine();
		
		cantidadEntregada=Double.parseDouble(aux);
		
		cantidadCambio=cantidadEntregada-total;
		
		System.out.printf("Se le deberá devolver al cliente: %.2f€.", cantidadCambio);
		
		System.out.println("\n");
		
		System.out.println("Muchas gracias, a continuación se imprimirá el ticket.");
		
		System.out.println("\n");
		
		System.out.println("\t\t\t\tMCDONALS\t\t\t\t");
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.printf("Trabajador:%s\t\t\t\t\t\tFecha:%s",trabajador,fecha);
		
		System.out.println("\n");
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Producto\t\tCantidad\t\tPrecio Unidad\t\tTotal");
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.printf("%s\t\t\t %d\t\t\t %.2f€\t\t\t %.2f€", producto1, cantidadPatatas, precioPatatas, totalPatatas);
		
		System.out.println("\n");
		
		System.out.printf("%s\t\t\t %d\t\t\t %.2f€\t\t\t %.2f€", producto2, cantidadBebidas, precioBebida, totalBebida);
		
		System.out.println("\n");
		
		System.out.printf("%s\t\t %d\t\t\t %.2f€\t\t\t %.2f€", producto3, cantidadHamburguesa, precioHamburguesa, totalHamburguesa);
		
		System.out.println("\n-------------------------------------------------------------------------------");
		
		System.out.printf("%s\t\t\t\t\t\t\t\t\t%.2f€",precioTotal,total);
		
		System.out.printf("\nEntregado\t\t\t\t\t\t\t\t%.2f€",cantidadEntregada);
		
		System.out.printf("\nCambio\t\t\t\t\t\t\t\t\t%.2f€",cantidadCambio);
		
		System.out.println("\n-------------------------------------------------------------------------------");
		
		System.out.println("\t\t\tGRACIAS POR VENIR A MCDONALS");
	}

}
