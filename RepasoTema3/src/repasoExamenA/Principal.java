package repasoExamenA;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int opcion=1;
		String aux;
		
		String direccion;
		int metros2;
		int estado;
		double precioVentaDueño;
		int id=1;
		Pisos p, p1;
		Pisos[] lista=new Pisos[id];
		Inmobiliaria in ;
		p1 = new Pisos("Asfa", 83, 2, 349875.23, id++);
		in= new Inmobiliaria(lista, id);
		
		//in.agregar(p1);
		
		
		do {
			mostrarMenu(opcion);
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			case 1:
				
				System.out.println("Indique la dirección:");
				direccion=sc.nextLine();
				System.out.println("Indique los metros cuadrados:");
				aux=sc.nextLine();
				metros2=Integer.parseInt(aux);
				System.out.println("Indique el estado 1.nuevo, 2.seminuevos 3.a reformar:");
				aux=sc.nextLine();
				estado=Integer.parseInt(aux);
				System.out.println("Indique el precio desaeado por el deuño:");
				aux=sc.nextLine();
				precioVentaDueño=Double.parseDouble(aux);
				id++;
				
				p=new Pisos(direccion, metros2, estado, precioVentaDueño, id);
				in.agregar(p);
				break;
			case 2:
				in.mostrarLista();
				break;
			}
		}while(opcion != 0);
		
		

	}
	
	/**
	 * sdfasdfasdf
	 * @param a sdgfsdfgfsd
	 * @return sdfgsdfgsdfg
	 */
	

	public static String mostrarMenu(int opcion) {
		System.out.println("""
				---------------------------------------------------------
				BIENVENIDO A LA INMOBILIARIA DE 1ºDAM
				---------------------------------------------------------
				
				Seleccione qué desea hacer:
				
					1.Agregar un nuevo piso
					2.Calcular precio final del piso deseado
					3.Buscar nuevos pisos
					4.Cambiar precio deseado por el dueño
					5.Calcular precio por m2 del piso deseado
					6.Calcular precio venta todos los pisos SEMINUEVOS
					7.Calcular cuánto ganaría cada vendedor modo socialismo
				""");
		return "";
	}
}
