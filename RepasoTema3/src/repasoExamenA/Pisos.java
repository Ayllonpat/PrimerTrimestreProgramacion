package repasoExamenA;

public class Pisos {
	
	private String direccion;
	private int metros2;
	private int estado;
	private double precioVentaDueño;
	private int id;
	
	public Pisos(String direccion, int metros2, int estado, double precioVentaDueño, int id) {
		super();
		this.direccion = direccion;
		this.metros2 = metros2;
		this.estado = estado;
		this.precioVentaDueño = precioVentaDueño;
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getMetros2() {
		return metros2;
	}

	public void setMetros2(int metros2) {
		this.metros2 = metros2;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getPrecioVentaDueño() {
		return precioVentaDueño;
	}

	public void setPrecioVentaDueño(double precioVentaDueño) {
		this.precioVentaDueño = precioVentaDueño;
	}

	@Override
	public String toString() {
		return "Pisos [direccion=" + direccion + ", metros2=" + metros2 + ", estado=" + estado + ", precioVentaDueño="
				+ precioVentaDueño + "]";
	}
	
	
	

}
