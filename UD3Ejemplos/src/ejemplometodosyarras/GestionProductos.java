package ejemplometodosyarras;

import java.util.Arrays;

public class GestionProductos {

	
	private Producto [] lista;

	public GestionProductos(Producto[] lista) {
		super();
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}


	
	@Override
	public String toString() {
		return "GestionProductos [lista=" + Arrays.toString(lista) + "]";
	}

	/*Método que calcula la suma de todos los precios
	 * unitarios de todos los productos*/
	public double sumarPrecios () {
		double total=0;
		for (int i = 0; i < lista.length; i++) {
			total+=lista[i].getPrecioUnitario();
		}
		return total;
	}
	
	public double CalcularPrecioMedio () {
		double suma=0;
		suma=sumarPrecios();
		return suma/lista.length;
	}
	
	//Método que devuelve un array
	
	public Producto [] rebajarTodos (double descuento) {
		double cien=100.0;
		for (int i = 0; i < lista.length; i++) {
			lista[i].setPrecioUnitario(lista[i].getPrecioUnitario()-lista[i].getPrecioUnitario()*descuento/cien);
		}
		return lista;
	}
	
	
}
