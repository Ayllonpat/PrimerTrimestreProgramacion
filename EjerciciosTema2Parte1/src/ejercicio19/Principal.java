package ejercicio19;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar una “mini-calculadora”, que realice las siguientes operaciones: suma, resta,
			multiplicación, división y decir si un número es par o impar. Se hará con un menú, y se pedirá
			en cada caso del switch los datos necesarios para realizar las operaciones. Se valorarán las
			comprobaciones que se hagan sobre los datos introducidos (por ejemplo, no dividir por cero).
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String aux, par="par", impar="impar";
		int opcion, tope, cero=0;
		double num, total=0, multi=1;
		
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al ejercicio 19.");
		System.out.println("-----------------------------------");
				
				System.out.println("\nVamos a crear una mini calculadora.");
				
				do {
				
				System.out.println("\nDebe elegir una opción:");
				System.out.println("1.Sumar");
				System.out.println("2.Restar");
				System.out.println("3.Multiplicar");
				System.out.println("4.Dividir");
				System.out.println("5.Es par o impar");
				System.out.println("0.Cerrar");
				
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
	
				
					
				switch (opcion) {
				
					case 0:
						System.out.println("Cerrar");
						break;
				
					case 1:
						System.out.println("Indique la cantidad de números que desea sumar:");
						
						aux=sc.nextLine();
						tope=Integer.parseInt(aux);
						
						for(int i=1 ; i<=tope ; i++) {
							
						System.out.printf("Escriba el número %d:",i);
						
						aux=sc.nextLine();
						num=Integer.parseInt(aux);
						
						total=num+total;
						}
						System.out.printf("\nEl resultado es %.2f.\\n",total);
						break;
					case 2:
						System.out.println("Indique la cantidad de números que desea restar:");
						
						aux=sc.nextLine();
						tope=Integer.parseInt(aux)-1;
						
						for(int i=0 ; i<=tope ; i++) {
							
							System.out.printf("Escriba el número %d:\n",i+1);
						
							aux=sc.nextLine();
							num=Integer.parseInt(aux);
							
							if(i==cero){
								
								total+=num;
								}
							
							else{
								total-=num;
								
								}
							
						}
						
						System.out.printf("\nEl resultado es %.2f.\n",total);
						break;
					case 3:
						System.out.println("Indique la cantidad de números que desea multiplicar:");
						
						aux=sc.nextLine();
						tope=Integer.parseInt(aux)-1;
						
						for(int i=0 ; i<=tope ; i++) {
							
						System.out.printf("Escriba el número %d:",i+1);
						
						aux=sc.nextLine();
						num=Integer.parseInt(aux);
						
						if(i==cero){
							
							total=num*multi;
							}
						
						else{
							total=num*total;
							
							}
						}
						System.out.printf("\nEl resultado es %.2f.\n",total);
						break;
					case 4:
						System.out.println("Indique la cantidad de números que desea dividir:");
						aux=sc.nextLine();
						tope=Integer.parseInt(aux)-1;
						
						for(int i=0 ; i<=tope ; i++) {
							
						System.out.printf("Escriba el número %d:",i+1);
						
						aux=sc.nextLine();
						num=Integer.parseInt(aux);
						
						if(i==cero){
							
							total=num*multi;
							}
						
						else{
							total=total/num;
							
							}
						}
						System.out.printf("\nEl resultado es %.2f.\n",total);
						break;
						
					case 5:
						
						System.out.println("Indique el número que quiere saber si es par o impar:");
						
						aux=sc.nextLine();
						num=Integer.parseInt(aux);
						
						if (num%2==0) {
							System.out.printf("\nEl número es %s.\n",par);
						}else {
							System.out.printf("\nEl número es %s.\n",impar);
						}
						break;
						
					default:
						System.out.println("OPCIÓN NO DISPONIBLE");
						break;
				}
				}while(opcion!=0);
				
				System.out.println("  ");	
				System.out.println("-----------------------------------");
				System.out.println("Muchas gracias por su atención :).");
				System.out.println("-----------------------------------");

				
				

	}
}