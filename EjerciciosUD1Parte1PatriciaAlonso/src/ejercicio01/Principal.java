package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Declarar 3 variables de tipo entero (int) con valores 3, 5, 9. Sumarlas guardando el resultado en una
		nueva variable. Restar 1 a dicha variable, almacenando en una variable diferente. Imprimir el resultado
		almacenado en esa variable por la salida estándar.

		 */
		
		int a1=3, a2=5, a3=9, a4=1;
		int result1=0, result2=0;
		
		System.out.println("Bienvenidos al programa, vamos a sumar 3, 5 y 9");
		
		result1=a1+a2+a3;
		
		System.out.println("El resultado de esta suma es " +result1);
		System.out.println("Ahora vamos a restarle 1");
		
		result2=result1-a4;
		
		System.out.println("El resultado final es " +result2);
				

	}

}
