package ejercicio08;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Haz un programa que calcule la longitud de una circunferencia de radio 3 metros y el área de un círculo
		de radio 5.2 metros. Puedes hacer infinidad de ejercicios como este con fórmulas matemáticas como
		áreas, volúmenes, teoremas (Pitágoras, por ejemplo), etc.
		 */
		
		double radioC1=3f, radioC2=5.2f, pi=3.14f, longitudC1=0f, areaC2=0f, diametroC1=0f, multiplicarR=2f;
		
		System.out.println("/////////////////////////////////////////////");
		System.out.println("Bienvenidos, vamos a realizar el ejercicio 8.");
		System.out.println("/////////////////////////////////////////////");		
		
		System.out.println("   ");
		
		System.out.printf("Lo primero que debemos calcular es la longitud de una circunferncia (C1) con %.0fm de radio.", radioC1);
		
		System.out.println("\n");
		
		System.out.printf("Para calcularla debemos culcular el diámetro de la circunferencia(multiplicando el radio por %.0f).",multiplicarR);
		
		diametroC1=radioC1*multiplicarR;
		
		System.out.println("\n");
		
		System.out.printf("Una vez calculado, multiplicamos el resultado, %.2fm, por pi, %.2f.", diametroC1, pi);
		
		System.out.println("\n");
		
		longitudC1=diametroC1*pi;
		
		System.out.printf("La longitud de C1 sería %.2fm.", longitudC1);
		
		System.out.println("\n");
		
		System.out.println("********************************************");
		
		System.out.println("   ");
		
		System.out.printf("El segundo problema que debemos resolver nos pide calcular el area de otra circunferencia (C2) de %.2fm de radio.", radioC2);
		
		System.out.println("\n");
		
		System.out.printf("Para calcularla debemos multiplicar su radio, %.2fm, por pi, %.2f.", radioC2, pi);
		
		System.out.println("\n");
		
		areaC2=radioC2*pi;
		
		System.out.printf("El resultado sería %.2fm2.", areaC2);
		
		System.out.println(" \n    ");
		
		System.out.println("********************************************");
		
		System.out.println("   ");
		
		System.out.println("Nos despedimos, gracias por su atención. :)");

	}

}
