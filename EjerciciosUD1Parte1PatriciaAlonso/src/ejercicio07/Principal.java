package ejercicio07;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Mi coche nuevo consume un montón. Dicen las indicaciones técnicas que 7,5 litros a los 100 km pero
		no me fío. Realizar un programa que nos ayude a calcular el dinero gastado en gasolina en un viaje.
		Para ello, podemos inicializar una variable con los kilómetros recorridos y otra con el precio por litro
		de gasolina.
		 */
		
		double consumoLitros=7.5f, distanciaConsumo=100, precioGasolinaL=3.063, distanciaRecorrida=155, litrosConsumidosViaje=0, dineroGastadoViaje=0 ;
		
		System.out.println("/////////////////////////////////////////////");
		System.out.println("Bienvenidos, vamos a realizar el ejercicio 7.");
		System.out.println("/////////////////////////////////////////////");
		
		System.out.println(" \n   ");
		
		System.out.printf("Debemos calcular cuanto dinero hemos gastado en gasolina en un viaje  de %.0fkm.",distanciaRecorrida);
		
		System.out.println(" \n   ");
		
		System.out.printf("El precio de la gasolina es de %.3f€ y consumimos %.2fL por cada %.0fkm recorridos.", precioGasolinaL, consumoLitros, distanciaConsumo);
		
		System.out.println(" \n    ");
		
		System.out.printf("Primero debemos calcular cuantos litros cuesta recorrer los %.0fkm.",distanciaRecorrida);
		
		litrosConsumidosViaje=(consumoLitros*distanciaRecorrida)/distanciaConsumo; 
		
		System.out.println(" \n    ");
		
		System.out.printf("El resultado sería %.2fL.", litrosConsumidosViaje );
		
		System.out.println(" \n    ");
		
		System.out.printf("Una vez resuelto esto debemos calcular cuento nos costaría este viaje.");
		
		dineroGastadoViaje=litrosConsumidosViaje*precioGasolinaL;
		
		System.out.println(" \n    ");
		
		System.out.printf("El resultado final sería %.3f€.", dineroGastadoViaje);
		
		System.out.println(" \n    ");
		
		System.out.println("********************************************");
		
		System.out.println("   ");
		
		System.out.println("Nos despedimos, gracias por su atención. :)");

	}

}
