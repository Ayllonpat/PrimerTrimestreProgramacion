package ejercicio01;

public class Tienda {
	
	private Producto []lista;

	public Tienda(Producto[] lista) {
		super();
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
	public void mostrarProductos(int posicion) {
		System.out.println("Producto---PrecioF---Stock---Fragil");
		for(int i=0;i<lista.length;i++) {
			posicion=i;
			System.out.println(getLista());
		}
	}

}
