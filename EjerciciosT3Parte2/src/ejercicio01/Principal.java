package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica). En esta
			clase se debe tener el método para calcular el precio de coste, que será el precio de fábrica más un porcentaje
			pasado como parámetro que será el coste en el transporte.
			En una clase Tienda, con un array de productos como atributo se podrá:
			- Listar datos de todos los productos.
			- Comprobar si un producto del array es “frágil” o no, mediante un método que devuelva un tipo boolean.
			- Añadir un producto a la lista pasando como parámetro un producto.
			- Calcular la cantidad invertida por la tienda en comprar todos los productos, es decir, la suma de todos los
			precios de fábrica.
			- Calcular el PVP, Precio de Venta al Público, que será un porcentaje, dado como parámetro, sumado al precio
			de coste.
			- Calcular las posibles ganancias cuando se hayan vendido todos los productos, es decir, la suma de todos los
			precios de venta al público menos la suma de todos los precios de fábrica.
			Crear un main de prueba con un menú donde se pueda hacer todo esto.
		 */
		Scanner sc=new Scanner(System.in); 
		
		String aux;
		int opcion = 0, cantidadStock = 0, posicion = 0;
		Producto p, p1, p2, p3;
		Tienda t;
		boolean fragil = false;
		String nombre = null;
		double precioFabrica = 0;
		
		p=new Producto(nombre, precioFabrica, cantidadStock, fragil);
		
		p.descifrarFragilidad();
		
		
		p1=new Producto("arroz", 10, 7, fragil);
		p2=new Producto("arroz", 10, 7, fragil);
		p3=new Producto("arroz", 10, 7, fragil);
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Bienvenido al ejercicio 1");
		System.out.println("---------------------------------------------------------------\n");
		
		
		do {
			System.out.println("""
					
					 ------------------------------------------------------------
					|                                                            |
					|  Bienvenido al menu de la tienda:                          |
					|                                                            |
					|------------------------------------------------------------|
					|                                                            |
					|   Opciones:                                                |
					|                                                            | 
					|	  1.Ver listado de los productos(precio de fábrica)      |
					|                                                            |
					|	  2.Añadir productos                                     |
					|                                                            |
					|     3.Dinero invertido por la empresa                      |
					|                                                      	     |
					|	  0.Salir                                                |
					|                                                            |
					 ------------------------------------------------------------
					""");
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch(opcion) {
		
		case 0:
			System.out.println("Saliendo...");
			break;
			
		case 1:
			t=new Tienda(null);
			t.mostrarProductos(posicion);
			
			break;
			
		case 2:
			break;
			
		case 3:
			break; 
			
		default:
			System.out.println("OPCIÓN NO DISPONIBLE");
			break;
		}
				

		}while(opcion !=0);
	}
}
