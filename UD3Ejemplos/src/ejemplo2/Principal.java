package ejemplo2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		double notaPro, notaBD;
		double media=0.0;
		Alumno a;
		
		System.out.println("Diga nombre");
		nombre=Leer.dato();
		System.out.println("Diga nota de programación");
		notaPro=Leer.datoDouble();
		System.out.println("Diga nota de base de datos");
		notaBD=Leer.datoDouble();
		
		a=new Alumno (nombre, notaPro, notaBD);
		
		
		
		media=a.calcularMedia();
		
		a.mostrarMedia(media);
		
		
		
		//System.out.println(a.calcularMedia());
		
		
	}

}
