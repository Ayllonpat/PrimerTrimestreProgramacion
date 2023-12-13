package ejercicio02;

import java.util.Arrays;

public class Hotel {
	
	private Habitacion[] lista;

	public Hotel(Habitacion[] lista) {
		super();
		this.lista = lista;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Hotel [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void mostrarMenu() {
		System.out.println("""
				-----------------------------------------------------------
				   Bienvenido al minihotel
				-----------------------------------------------------------
					
					1.Ver habitaciones
					2.
					3.
					4.
					5.
				""");
	}
	
	public void listarHabitaciones() {
		for (int i =0;i<lista.length;i++) {
			if(lista[i] != null) {
				System.out.println(lista[i]);
			}
		}
	}
	
	public void agregarHabitacion(Habitacion h) {
		lista[nHabitaciones]=h;
		numHabitaciones++;
	}
	
	public Habitacion findById(int id) {
		
		boolean encontrado = false;
		int i=0;
		
		while (i<lista.length && !encontrado){
			
		}
		return null;
	}
	
	public boolean comprobarOcupado(Habitacion h) {
	
	boolean result;
	
	if (h.isOcupada()) {
		result=true;
	}else {
		result = false;
	}
	return result;
}
	public void imprimirOcupado(Habitacion h) {
		if(h.isOcupada()) {
			System.out.println("La habitación esta ocupada");
		}else {
			System.out.println("La habitación esta libre.");
		}
	}

}
