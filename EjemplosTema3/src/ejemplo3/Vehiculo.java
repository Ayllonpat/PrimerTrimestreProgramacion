package ejemplo3;

public class Vehiculo {
	
	private int precio;
	private int numRuedas;
	private String nombre; 
	
	public Vehiculo(String nombre, int precio, int numRuedas) {
		this.nombre=nombre;
		this.precio=precio;
		this.numRuedas=numRuedas;
	}
	
	public Vehiculo() {}

		public String getNombre () {
			return nombre;
		}
		
		public void setNombre (String nombre) {
			this.nombre=nombre;
		}
		
		public int getPrecio() {
			return precio;
		}
		
		public void setPrecio(int precio) {
			this.precio=precio;
		}
		
		public int getNumRuedas() {
			return numRuedas;
		}
	
		public void setNumRuedas(int numRuedas) {
			this.numRuedas=numRuedas;
		}
	
}
