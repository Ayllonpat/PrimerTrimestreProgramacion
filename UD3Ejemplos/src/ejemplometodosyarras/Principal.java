package ejemplometodosyarras;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaro variables 

		GestionProductos gp;
		Producto p1;
		Producto p2;
		int tam=10;
		double descuento;
		//Instancio dos objetos
		p1= new Producto ("1a", "Atún", 1.50,true);
		p2= new Producto ("2b", "Pan de molde", 4.50,true);
		Producto [] listado= {p1, p2};

		gp= new GestionProductos(listado);
		
		System.out.printf("La suma de todos los precios es: %.2f euros\n", gp.sumarPrecios());
		System.out.printf("El precio medio es: %.2f euros\n\n", gp.CalcularPrecioMedio());
		
		System.out.println("Los precios sin rebajar");
		System.out.println(gp.getLista());
		
		System.out.println("Los precios rebajados");
		System.out.println("¿Cuánto quieres rebajar?");
		descuento=Leer.datoDouble();
		
		gp.rebajarTodos(descuento);
		System.out.println(gp.getLista());
		
	}

}
