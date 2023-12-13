package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que simule un inicio de sesión leyendo por teclado el nombre del 
			usuario y la contraseña y comprobando si esos coinciden con unos guardados en unas 
			variables inicializadas por vosotros al comienzo del programa.

		 */
		
		Scanner sc=new Scanner(System.in);
		
		String aux, contrasenyaG="fbrd", contrasenya, usuarioG="patty", usuario;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 8.");
		System.out.println("-----------------------------------");

		System.out.println("Vamos a simular un inicio de sesión.");
		
		System.out.println("\nIndiqué el nombre de usuario:");
		usuario=sc.nextLine();
		System.out.println("Indique la contraseña:");
		contrasenya=sc.nextLine();
		
		
		if(usuario.equals(usuarioG)) {
			System.out.println("El usuario es correcto.");
		}else{
			System.out.println("El usuario no es correcto.");
			
		}if(contrasenya.equals(contrasenyaG)){
			System.out.println("Ha iniciado sesión.");
		}else{
			System.out.println("La contraseña no es correcta.");
		}
		
		System.out.println("   ");	
		System.out.println("-----------------------------------");
		System.out.println("Muchas gracias por su atención :).");
		System.out.println("-----------------------------------");
		

	}

}
