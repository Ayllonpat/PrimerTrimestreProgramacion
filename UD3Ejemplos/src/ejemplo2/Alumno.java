package ejemplo2;

public class Alumno {

	private String nombre;
	private double notaPro;
	private double notaBD;
	
	public Alumno (String nombre, double notaPro, double notaBD) {
		this.nombre=nombre;
		this.notaPro=notaPro;
		this.notaBD=notaBD;
	}
	
	public double calcularMedia () {

		double dos=2.0;
		return (notaPro+notaBD)/dos;
	}
	
	public void mostrarMedia (double media) {
		System.out.println("La nota media de "+nombre+ " es: "+media);
	}
}
