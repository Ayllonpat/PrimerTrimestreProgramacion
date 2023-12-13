package usoarraysparametros;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int desde, hasta, tam;
		
		Listas listado=new Listas();
		int [] lista;
		System.out.println("Diga tamaño de la lista");
		tam=Leer.datoInt();
		
		lista=new int [tam]; 
		System.out.println("Diga desde");
		desde=Leer.datoInt();
		System.out.println("Diga hasta");
		hasta=Leer.datoInt();
		
		listado.rellenarAle(desde, hasta, lista);
		
		listado.mostrarLista(lista);
		System.out.println();
		listado.mostrarLista(listado.trucarLista(lista));
	}

}
