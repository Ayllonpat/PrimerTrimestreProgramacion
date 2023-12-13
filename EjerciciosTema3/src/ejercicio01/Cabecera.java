package ejercicio01;

public class Cabecera {
	
	private String fecha;
	private String asignatura;
	private int aula;
	
	public Cabecera(String asignatura, int aula, String fecha) {
		this.asignatura=asignatura;
		this.aula=aula;
		this.fecha=fecha;
	}
	
	
	public void mostarDatos () {
		
		System.out.printf("""
				--------------------------------------------------------
				Asignatura: %s   Aula: %d    fecha: %s
				--------------------------------------------------------
				""",asignatura, aula,  fecha);
	
	}
		
	
}
