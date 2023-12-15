package repaso;

import java.util.Arrays;

public class Tienda {
	
	private Producto[] listado;
	private int numProductos;
	private int numTrabajadores;
	
	public Tienda(Producto[] listado, int numProductos, int numTrabajadores) {
		super();
		this.listado = listado;
		this.numProductos = numProductos;
		this.numTrabajadores = numTrabajadores;
	}

	public Producto[] getListado() {
		return listado;
	}

	public void setListado(Producto[] listado) {
		this.listado = listado;
	}

	public int getNumProductos() {
		return numProductos;
	}

	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}

	public int getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	@Override
	public String toString() {
		return "Tienda [listado=" + Arrays.toString(listado) + ", numProductos=" + numProductos + ", numTrabajadores="
				+ numTrabajadores + "]";
	}
	//VERBO EN INFINITIVO, sin ñ o tildes, que indique q hace el método, la segunda palabra
	//empieza en mayuscula y la primera en miníscula, SIEMPRE
	
	public void agregar(Producto p) {//no hace falta darle la posicion en la que se guarda el producto
		listado[numProductos]=p;
		numProductos++;
	}
	
	public Tienda() {
		
	}
	
	public void mostrarLista() {
		for (int i = 0; i < numProductos; i++) {//no puedes llamar al listado.lenght pq sino salen los productos nulos
			//por lo que se añade el atributo numero productos
			
			System.out.println(listado[i]); //es un producto
		}
	}
	
	
	
	public Producto[] buscarBySeccion(int seccion) {
		//boolean encontrado; solos si estamos buscando una unidad
		int index=0;
		
		Producto[] listaEncontrados=new Producto[numProductos];//se crea un nuevo
		//array para comparar los arrays y recorrer la lista
		
		while(index<numProductos) {//while(index<numProductos&&!encontrado) parar al encontrarlo
			if(listado[index].getSeccion()==seccion) {
				listaEncontrados[index]=listado[index];				
			}
			index++;
		}
		return listaEncontrados;
	}
	
	public void mostrarLista2(Producto[] ListaProductos) {
		for (int i = 0; i < listado.length; i++) {//no puedes llamar al listado.lenght pq sino salen los productos nulos
			//por lo que se añade el atributo numero productos
			if(listado[i]!=null) {
			System.out.println(listado[i]);} //es un producto}
		}
	}
}
