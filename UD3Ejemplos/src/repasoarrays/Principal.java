package repasoarrays;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random(System.nanoTime());
		int tam, tam2=4, desde, hasta, elemento = 0, contCeros=0, 
				nuevoValor = 0, total = 0;
		//1. Declaración de arrays, varias formas				
		//a) Dando valores inicialmnete, inicializando
		//Como no damos el tamaño, el tamaño es diractemente
		//el número de elementos que ponemos
		int []lista= {2,3,6};//Tamaño?3 Ya se puede usar
		
		//b) declarando e instanciado en direfentes lineas
		
		//Primero se delcra, siempre primero
		
		int lista2[];
		//Todavía no se puede usar
		//necesito el tamaño, lo pido, 
		//tengo que declarar una variale al comienzo para guadarlo
		
		System.out.println("Diga el tamaño");
		tam=Leer.datoInt();
		//Instancio con ese tamaño
		
		lista2= new int [tam];//El tamaño es el leido, ya se puede usar
		
		//c) Todo en la misma línea, debemos tener el tamaño antes
		
		int [] lista3=new int [tam2];
		
		//El mejorrrrr el segundo, aunque puede que nos encontremos el primero
		
		//2. Cargar, rellenar array
		//Varias formas
		
		//a) Leyendo por teclado
		
		
		for (int i = 0; i < lista.length; i++) {
			lista[i]=Leer.datoInt();
		}
		
		//b) Aleatoriamente, necesitamos hasta y desde declarados
		//al principio
		//También necesito un ramdon, declarado arriba
		
		System.out.println("Diga desde");
		desde=Leer.datoInt();
		System.out.println("Diga hasta");
		hasta=Leer.datoInt();
		
		for (int i = 0; i < lista.length; i++) {
			lista[i]=r.nextInt(hasta-desde+1)+desde;
		}
		
		//c) Cascaporra style
		int lista4[] = {12, 3, 4, 6};
		
		//3 mostrar Array
		
		for (int i = 0; i < lista4.length; i++) {
			System.out.println("  "+lista4[i]);
		}
		
		//4 acceso a un elemento
		System.out.println("Indique el elemento qué desea cambiar:");
		elemento = Leer.datoInt()-1;
		System.out.println("Indique el nuevo valor: ");
		nuevoValor = Leer.datoInt();
		
		lista4[elemento] = nuevoValor;
		
		//5 sumamos elementos
		for (int i = 0; i < lista4.length; i++) {
			total += lista4[i];
		}
		
		//Operaciones variadas
		
		for (int i = 0; i < lista4.length; i++) {
			if(lista4[i]%2==0) {
				lista4[i]=lista4[i]*2;
			}
		}
		
		//Contar cuántos ceros hay, necesito contador arriba
		for (int i = 0; i < lista4.length; i++) {
			if(lista4[i]==0) {
				contCeros++;
			}
		}
		
	}

}
