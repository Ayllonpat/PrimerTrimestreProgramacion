package ejemploticket;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreP, aux;
		int cantidad;
		double precioU, subTotal;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Diga el nombre del producto");
		
		nombreP=sc.nextLine();
		
		System.out.println("Diga la cantidad");
		
		aux=sc.nextLine();
		
		cantidad=Integer.parseInt(aux);
		
		System.out.println("Diga precio");
		
		aux=sc.nextLine();
		
		precioU=Double.parseDouble(aux);
		
		System.out.println("Bienvenido a la tienda");
		
		subTotal=cantidad*precioU;
		
		System.out.println("Producto\t\t\tCantidad\t\t\tPrecio Unitario\t\t\tPrecio");
		
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		System.out.println(nombreP+"\t\t\t\t"+cantidad+"\t\t\t\t"+precioU+"\t\t\t\t"+subTotal);
		
	}

}
