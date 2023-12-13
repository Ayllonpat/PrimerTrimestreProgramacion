package ejercicio01;

public class Producto {
	
	String nombre;
	double precioFabrica;
	int cantidadStock;
	double costeTransporte;
	boolean fragil;
	
	public Producto(String nombre, double precioFabrica, int cantidadStock, boolean fragil) {
		super();
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.cantidadStock = cantidadStock;
		this.fragil = fragil;
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

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public double getCosteTransporte() {
		return costeTransporte;
	}

	public void setCosteTransporte(double costeTransporte) {
		this.costeTransporte = costeTransporte;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioFabrica=" + precioFabrica + ", cantidadStock=" + cantidadStock
				+ ", fragil=" + fragil + "]";
	}


	public boolean  descifrarFragilidad() {
		if(cantidadStock==1) {
			fragil=true;
		}else {
			fragil=false;
		}
		
		return fragil;
		
	}
	
	

}
