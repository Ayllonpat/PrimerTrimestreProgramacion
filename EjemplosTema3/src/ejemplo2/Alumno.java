package ejemplo2;

public class Alumno {
	
	private String nombre;
	private double notaPro;
	private double notaBD;
	
	
	public Alumno(String nombre, double notaPro, double notaBD) {
		this.nombre=nombre;
		this.notaPro=notaPro;
		this.notaBD=notaBD;
	}
		
	public Alumno() {
		
		}
	public double notaMedia() {
		
		double notaMedia, dos=2.0;
		
		notaMedia=(notaPro+notaBD)/dos;
		return notaMedia;
	}
	
	public void mostrarDatos (double notaMedia) {
		
		System.out.println("La nota media es: "+ notaMedia);
		}

	}
	

