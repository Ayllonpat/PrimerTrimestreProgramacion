package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1=50;
		
		double euroalibra=0.87, resultado1=0, libraaeuro=1.15;
		
		System.out.println("Bienvenidos al programa, vamos a realizar el ejercicio 5.");
		
		System.out.printf("Debemos hacer el cambio de 50 euros a libras, el cambio "
				+ "de euros a libras es %.2f. \n" , euroalibra*a1 );
		
		resultado1=a1*euroalibra;
		
		System.out.printf("Al realizar el cambio nos da, %.0f libras."  ,resultado1);
		
		System.out.printf("\nUna libra equivale a %.2f. ", libraaeuro);

	}

}
