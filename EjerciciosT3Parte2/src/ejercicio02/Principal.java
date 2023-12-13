package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero estilo hotel para que tenga caché.
			Debemos gestionar mi “minihotel” y para ello, debemos crear la clase Habitación, una clase Hotel con una
			lista de Habitaciones y una clase principal de prueba para gestionar el hotel (realmente habría algunas clases
			más, como serían Cliente, Productos, etc. Pero no entraremos en eso).
			Podemos poner todos los métodos en la clase Hotel. Se podrá hacer lo siguiente:
			- Agregar una habitación a la lista (cuyos atributos serán tipo, precio, qué servicios extra tiene, String con el
			nombre de cliente asignado, número de días contratados, si está limpia, etc.)
			- Ver si está ocupada o no.
			- Calcular precio final según número de días, servicios extra contratados y consumo del minibar.
			- Mostrar factura.
			- Aquellos métodos que se quieran añadir.
			Crear un main de prueba
		 */
		
		Habitacion h1, h2;
		Hotel o;
		Habitacion []lista= {h1, h2};
		int tam=5;
		
		h1=new Habitacion();
		o=new Hotel();

	}

}
