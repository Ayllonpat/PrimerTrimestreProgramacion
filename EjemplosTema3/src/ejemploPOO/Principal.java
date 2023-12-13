package ejemploPOO;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String nombre, aux;
		int edad;
		double notaMedia;
		Alumno a1;
		Alumno a2;
		Alumno a3;
		
	//instanciamos un objeto con valores
		
		System.out.println("Diga el nombre:");
		nombre=sc.nextLine();
		
		System.out.println("Diga la edad");
		aux=sc.nextLine();
		edad=Integer.parseInt(aux);
		
		System.out.println("Diga la nota media");
		aux=sc.nextLine();
		notaMedia=Double.parseDouble(aux);
		
		a1=new Alumno(nombre, edad, notaMedia);
		System.out.println();
		
			a1.mostrarDatos("Virgen de Luján");
		
		a2=new Alumno(nombre, edad);
		System.out.println();
		
		a3=new Alumno();
		
		
		/*
		 * Alumnoa2;
		 * a2=new Alumno();
		 */
		
		//System.out.println(a1.nombre);
	}

}
