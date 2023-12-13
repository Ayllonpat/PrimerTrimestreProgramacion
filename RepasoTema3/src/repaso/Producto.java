package repaso;

public class Producto {
		
	private String nombre;
	private double precioFabrica;
	private int seccion;//1 alime, 2 elec, 3 ropa
	private boolean venta;
	
	public Producto(String nombre, double precioFabrica, int seccion, boolean venta) {
		super();
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.seccion = seccion;
		this.venta = venta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	public boolean isVenta() {
		return venta;
	}

	public void setVenta(boolean venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioFabrica=" + precioFabrica + ", seccion=" + seccion + ", venta="
				+ venta + "]";
	}
	
}
