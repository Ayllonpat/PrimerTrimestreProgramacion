package ejercicio10;

public class Ticket {
	
	
	
	private int nPersonas=0;
	private double precioU;
	private String fecha;	
	private String destino;

	
	public Ticket(int nPersonas, double precioU, String fecha, String destino) {
		super();
		this.nPersonas = nPersonas;
		this.precioU = precioU;
		this.fecha = fecha;
		this.destino = destino;
	}

	public int getnPersonas() {
		System.out.println("Indique");
		return nPersonas;
	}

	public void setnPersonas(int nPersonas) {
		this.nPersonas = nPersonas;
	}

	public double getPrecioU() {
		return precioU;
	}

	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public int elegirNumeroPersonas(int nPersonas) {
		
		return nPersonas;
	}
	
	public int cantidadTicket(int nPersonas) {
		int cantidadTicket = 0;
		nPersonas=cantidadTicket;
		return cantidadTicket;
		
	}

}
