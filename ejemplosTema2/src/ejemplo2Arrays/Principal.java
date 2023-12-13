package ejemplo2Arrays;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int edades[];//declaramos array
		int tam, suma=0, op, leida;
		String aux;
		
		//pedimos tamaño
		System.out.println("Diga tamaño");
		
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		//instanciamos array
		edades=new int[tam];
		
		//vamos a rellenar con números leídos por teclado
		//System.out.println(tam);
		//System.out.println(edades.length);
		
		//tam=9;
		
		//System.out.println(tam);
		System.out.println(edades.length);
		
		//en los array hay que hacer un bucle diferente por cada operacion
		
		for (int i=0;i<edades.length;i++) {
			
			System.out.println("Introduzca edad");
			aux=sc.nextLine();
			edades[i]=Integer.parseInt(aux);
			
		}
		
		//mostrar
		for (int i=0;i<edades.length;i++) {
			System.out.println(edades[i]);
		}
		//sumar todos los elementos
			
		for (int i=0;i<edades.length;i++) {
			suma=edades[i]+suma;
		
		}
		System.out.println(suma);
		
		//mostrar un elemento elegido
		
		System.out.println("Diga posición a mostrar:");
		aux=sc.nextLine();
		op=Integer.parseInt(aux)-1;
		
		System.out.println(edades[op]);
		
		//modificar un valor elegido por el usuario
		
		System.out.println("Diga posición a cambiar");
		aux=sc.nextLine();
		op=Integer.parseInt(aux)-1;
		System.out.println("Diga nueva edad");
		aux=sc.nextLine();
		leida=Integer.parseInt(aux);
		
		edades[op]=leida;
	}

}
