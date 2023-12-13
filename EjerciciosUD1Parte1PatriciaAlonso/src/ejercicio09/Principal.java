package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A mi padre le gusta medir la capacidad de las personas que admite un lugar o evento en “el número de
	Navas (mi pueblo)”, en este caso, Navas sería una unidad de medida de número de personas que habría
	en un lugar, por ejemplo, si mi pueblo tiene 1500 habitantes, en un campo de futbol de 15000
	espectadores, cabrían “10 Navas”.
	Calcular el número de Navas que entrarían en el Camp Nou, en el concierto de U2 del estadio olímpico
	donde asistieron 65000 personas y en el teatro del colegio, que tiene 600 localidades.
		 */
		
		double navas=1500.0, campNou=65000.0, teatro=600.0, navasCampNou=0.0, navasTeatro=0.0;
		
		System.out.println("/////////////////////////////////////////////");
		System.out.println("Bienvenidos, vamos a realizar el ejercicio 9.");
		System.out.println("/////////////////////////////////////////////");		
		
		System.out.println("   ");
		
		System.out.printf("En este ejercicio debemos calcular cuantas navas, %.0f personas, caben en el Camp Nou"
				+ " y en un teatro del colegio.", navas);
		
		System.out.println("\n ");
		
		System.out.printf("En el Camp Nou caben %.0f personas así que hay que dividirlo entre %.0f para calcular cuentas "
				+ "navas caben.", campNou, navas);
		
		System.out.println("\n   ");
		
		navasCampNou=campNou/navas;
		
		System.out.printf("En total sería una cantidad de %.2f navas.", navasCampNou);
		
		System.out.println("\n");
		
		System.out.println("****************************************************************************************");
		
		System.out.println("   ");
		
		System.out.printf("Para calcular las navas en el teatro, %.0f plazas, se debe hacer la misma operación.", teatro);
		
		System.out.println("\n");
		
		navasTeatro=teatro/navas;
		
		System.out.printf("El resultado sería un toal de %.2f navas.", navasTeatro);
		
		System.out.println(" \n    ");
		
		System.out.println("****************************************************************************************");
		
		System.out.println("   ");
		
		System.out.println("Nos despedimos, gracias por su atención. :)");
		

	}

}
