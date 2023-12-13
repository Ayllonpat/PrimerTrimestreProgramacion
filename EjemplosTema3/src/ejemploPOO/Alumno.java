package ejemploPOO;

public class Alumno {
	
	//Atributos siempre primero
		//Clases que definen a los objetos no se les da valor a los atributos
		//sin private pueden acceder a ellos todos en el paquete
		private String nombre;
		private int edad;
		private double notaMedia;
		//private boolean matriculado;
		
		//Constructores
		
		//Para crear un objeto con valores
		//(parámetros o argumento)

		public Alumno(String nombre, int edad, double notaMedia) {
			this.nombre=nombre;
			this.edad=edad;
			this.notaMedia=notaMedia;
			//this.matriculado=matriculado;
		}
		
		public Alumno(String nombre, int edad) {
			this.nombre=nombre;
			this.edad=edad;
		}

		public Alumno() {
			// TODO Auto-generated constructor stub
		}
		
		//Métodos
		
		//Primer método para imprimir en bonito
		
		// public tipoResultado(int,string..si no devuelve nada es void) nombreMetodo (parámetros) {cuerpo}
		//parametro es aquello que quieres mostrar y no es un atributo
		
		public void mostrarDatos (String calle) {
			
			System.out.println("Los datos del alumno son:");
			System.out.println("Nombre: "+ nombre);
			System.out.println("Edad: "+ edad);
			System.out.println("Nota Media: "+notaMedia);
			System.out.println("Calle: "+calle);
		}
		
		//calcularMedia
		//insertarNota
		//darAlta
		//matricular
		//medirAsistencia
		//notificarFalta
}
