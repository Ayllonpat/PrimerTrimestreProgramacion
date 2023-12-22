package repasoExamenA;

import java.util.Arrays;

public class Inmobiliaria {
	
	private Pisos[] listado;
	private int numPisos;

	public Inmobiliaria(Pisos[] listado, int numPisos) {
		super();
		this.listado = listado;
		this.numPisos = numPisos;
	}

	
	
	public Pisos[] getListado() {
		return listado;
	}



	public void setListado(Pisos[] listado) {
		this.listado = listado;
	}



	public int getNumPisos() {
		return numPisos;
	}



	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	

	@Override
	public String toString() {
		return "Inmobiliaria [listado=" + Arrays.toString(listado) + ", numPisos=" + numPisos + "]";
	}

	public void agregar(Pisos p) {
		listado[numPisos]=p;
		numPisos++;
		
	}
	
	public void mostrarLista() {
		for (int i = 0; i < numPisos; i++) {
			System.out.println(listado[i]);
		}
	}
}
