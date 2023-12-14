package repaso;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String aux, nombre;
		double precioFabrica;
		int seccion;
		boolean venta;
		int tam=0, tam2= 10;
		//No se instancia vacios
		
		Producto p;
		p=new Producto("Lechuga", 1.2, 1, true);
		Producto[] lista=new Producto[tam2];
		Tienda t;
		t=new Tienda(lista, tam, 3);
		
		
		//p.PrecioFabrica; no se puede llamar solo a un atributo sin getters o setters
		//p.getPrecioFabrica() p.setPrecioFabrica(); se deben utilizar asi
		
		p.getPrecioFabrica();
		
		//System.out.println(p.getPrecioFabrica());//sale el indicado por nosostros
		
		
		//como crear un nuevo atributo
		/*System.out.println("Diga precio");
		aux=sc.nextLine();
		precioFabrica=Double.parseDouble(aux);
		
		System.out.println(p.getPrecioFabrica());//indica el ya indicado anteriormente 
		//por lo que no se puede cambiar asi
		System.out.println(precioFabrica);//el nuevo (cambia el precio del anterior pero no esta
		//creando uno nuevo y no se usa para mostrar
		p=new Producto("Lechuga", precioFabrica, 1, true);//siempre se le debe llamar lo ultimo 
		//para crear un nuevo producto
		System.out.println(p.getPrecioFabrica());//ya lo hemos metido en el getter
	
		//cambiar un producto ya existente
		System.out.println("Diga precio");
		aux=sc.nextLine();
		precioFabrica=Double.parseDouble(aux);//queremos cambiar el precio
		System.out.println(p.getPrecioFabrica());//si no llamamos antes al getter 
		//sale el indicado por nosotros anteriormente
		p.setPrecioFabrica(precioFabrica);//debemos llamar al setter para guardar el nuevo precio
		System.out.println(p.getPrecioFabrica());//ya este getter muestra el nuevo precio guardado
		
		System.out.println(p.toString());//mostar todos los datos*/
		
		//------------------------------------------------------------------------------------------
		
		int opcion, lecturaVenta=0;
		
		System.out.println("\nBienvenido\n");
		
		do {
		System.out.println("1.Para agregar producto nuevo");
		System.out.println("2.Para mostrar lista\n");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch(opcion) {
		case 0:
			System.out.println("Usted está salienod..");
			break;
			
		case 1:
			System.out.println("Diga el nombre del producto:");
			nombre=sc.nextLine();
			System.out.println("Diga el precio:");
			aux=sc.nextLine();
			precioFabrica=Double.parseDouble(aux);
			System.out.println("Diga la sección");
			aux=sc.nextLine();
			seccion=Integer.parseInt(aux);
			System.out.println("Diga el estado en el que se encuentra(1 si esta en venta):");
			aux=sc.nextLine();
			lecturaVenta=Integer.parseInt(aux);
			
			if(lecturaVenta==1) {
				venta=true;
			}else{
				venta=false;
			}
			//a creando el producto antes
			//p=new Producto(nombre, precioFabrica, seccion, venta);
			//t.agregar(p);
			
			//b Instanciando directamente el producto
			t.agregar(new Producto(nombre, precioFabrica, seccion, venta));
			break;
			
		case 2:
			t.mostrarLista();
			break;
			
		default:
			System.out.println("OPCIÓN NO DISPONIBLE");
			break;
		}
		
		}while(opcion!=0);
	}
	
	
	

}
