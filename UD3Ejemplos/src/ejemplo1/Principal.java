package ejemplo1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n, nombre="Luismi";
		int edad;
		double notaMedia;
		String calle;
		Alumno a1;

		//Instanciamos un objeto con valores
		
		System.out.println("Diga el nombre");
		n=Leer.dato();
		System.out.println("Diga edad");
		edad=Leer.datoInt();
		System.out.println("Diga nota media");
		notaMedia=Leer.datoDouble();
		System.out.println("Diga la calle donde vive ahora");
		calle=Leer.dato();
				
		a1=new Alumno (n, edad, notaMedia);

		a1.mostrarDatos(calle);
		
	}

}
