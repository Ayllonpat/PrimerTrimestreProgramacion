package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * En tiempos de sequía hay que cuidar el agua de las piscinas y muchas engañan según su forma.
		Calcula y muestra en pantalla el volumen de dos piscinas:
		- Piscina olímpica (50 m de largo por 21 de ancho) y 2,50 de profundidad.
		- Piscina circular de 1,80 de profundidad y 12 metros de radio.
		¿Cuánto costará llenar cada una si el metro cúbico cuesta 1,80 €?

		 */
		
		int a1=21, a2=50;
		float a3=2.5f, resultado1=0f, a5=1.80f, a6=3.14f, precioM=1.8f, precio1=0f, precio2=0f ;
		int a4=12;
		
		System.out.println("Bienvenidos al programa, vamos a realizar el ejercicio 2");
		// TODO Auto-generated method stub
		
		System.out.println("Tenemos que calcular el volumen de dos piscinas. "
				+ "La primera tiene un largo de 50 metros, 21 de ancho y "
				+ "2.5 de profundidad.");
		
		resultado1=a3*a1*a2;
		
		System.out.printf("Debemos multiplicar los tres datos y el resultado"
				+ "sería %.0f m3. \n",resultado1);
		
		double  resultado2=0;
		
		System.out.println("La siguiente piscina es circular y cuenta con un radio"
				+ "de 12 metros y 1.80 de profundidad.");
		
		resultado2=a6*a4*a5;
		
		System.out.printf("Debemos multiplicar los dos datos por pi y el resultado sería %.2f m3."
				+ "",resultado2);
		
		System.out.printf("\nTambién debemos calcular el precio");
		
		precio1=resultado1*precioM;
		precio2=(float) (resultado2*precioM);
		
		System.out.printf("La primera piscina valdría %.2f€ y la segunda %.2f€.", precio1, precio2);


	}

}
