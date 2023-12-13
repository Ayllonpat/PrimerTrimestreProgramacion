package ejemplo3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Vehiculo a1;
		String nombre, aux, nombreNuevo;
		int precio, precioNuevo;
		int numRuedas;
		int ventas;
		int cantVehiculos;
		Vendedor v;
		
		System.out.println("Indique el nombre del vehiculo");
		nombre=sc.nextLine();
		System.out.println("Indique el precio");
		aux=sc.nextLine();
		precio=Integer.parseInt(aux);
		System.out.println("Indique la cantidad de ruedas");
		aux=sc.nextLine();
		numRuedas=Integer.parseInt(aux);
		
		
		a1=new Vehiculo(nombre, precio, numRuedas);
	
		System.out.println("Indique el nuevo nombre");
		nombreNuevo=sc.nextLine();
		a1.setNombre(nombreNuevo);
		
		System.out.println("Indique el nuevo precio");
		aux=sc.nextLine();
		precioNuevo=Integer.parseInt(aux);
		a1.setPrecio(precioNuevo);
		
		System.out.println(a1);
		
		System.out.println(nombre);
		
		//System.out.println(a1.nombre);
		
		System.out.println(a1.getNombre());
		System.out.println(a1.getPrecio());
		
		
		System.out.println("Indique el nombre del vendedor");
		nombre=sc.nextLine();
		System.out.println("Indique el numero de ventas");
		aux=sc.nextLine();
		ventas=Integer.parseInt(aux);
		System.out.println("Indique la cantidad de vehiculos vendidos");
		aux=sc.nextLine();
		cantVehiculos=Integer.parseInt(aux);
		
		v=new Vendedor(nombre, ventas, cantVehiculos);
		
		System.out.println("Indique el nuevo nombre");
		nombreNuevo=sc.nextLine();
		a1.setNombre(nombreNuevo);
		
		System.out.println(a1.getNombre());
		
	}

}
