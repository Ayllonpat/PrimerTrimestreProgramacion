package ejercicio10;

public class Maquina {
	
	String aux, fecha = null, destino = null;
	double precioU = 0;
	int opcion=0, nPersonas = 0;
	
	private int clave=1234;
	private double precioT;
	private int cambio;
	private Ticket t=new Ticket(nPersonas, precioU, fecha, destino);;
	
	public Maquina(int clave, double precioT) {
		super();
		this.clave = clave;
		this.precioT = precioT;
	}

	public Maquina(int clave) {
		super();
		this.clave = clave;
	}
	public double comprarTickets(int cantidadTickets) {
	t.cantidadTicket(nPersonas);
	precioT= cantidadTickets * t.getPrecioU();
	return precioT;
	
	
	
	}
}
