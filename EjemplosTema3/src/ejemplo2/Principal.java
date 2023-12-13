package ejemplo2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String nombre, aux;
		double notaPro, notaBD, notaMedia;
		Alumno a1, a2;
		
		System.out.println("Diga el nombre:");
		nombre=sc.nextLine();
		
		System.out.println("Diga la nota de programación:");
		aux=sc.nextLine();
		notaPro=Double.parseDouble(aux);
		
		System.out.println("Diga la nota de base de datos:");
		aux=sc.nextLine();
		notaBD=Double.parseDouble(aux);
		
		a1=new Alumno(nombre, notaPro, notaBD);
			
			notaMedia=a1.notaMedia();
			a1.mostrarDatos(notaMedia);
		
		a2=new Alumno();
		
		

	}

}
