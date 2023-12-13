package ejemploCrud;

public class CrudProducto {
	
	private Producto[] lista;

	public void add(Producto p, int posicion) {
		lista[posicion]=p;
		//no es buena idea pedir la posicion
	}
		
	//public void editPrecio
	
	public Producto[] findAll;
		
	public Producto findById(String codigo) {
		
		int i=0;
		boolean encontrado=false;
		//el bucle para al encontrarlo
		while (i<lista.length && !encontrado) {
			Producto deLista=lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado=true;
			else
				i++;
		}
	
	if(encontrado)
		return lista[i];//se devuelve el producto buscado
	else
		return null;
	}
	
}

