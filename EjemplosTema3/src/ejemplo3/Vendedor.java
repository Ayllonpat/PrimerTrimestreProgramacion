package ejemplo3;

public class Vendedor {
	
	private String nombre;
	private double ventas;
	private int cantVehiculos;
	
	//genarate constructor
	
	public Vendedor(String nombre, double ventas, int cantVehiculos) {
		this.nombre = nombre;
		this.ventas = ventas;
		this.cantVehiculos = cantVehiculos;
	}
	
	//genarate getters and stters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public int getCantVehiculos() {
		return cantVehiculos;
	}

	public void setCantVehiculos(int cantVehiculos) {
		this.cantVehiculos = cantVehiculos;
	}

	//generate to Strings
	
	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", ventas=" + ventas + ", cantVehiculos=" + cantVehiculos + "]";
	}
	
	
	
	

}
