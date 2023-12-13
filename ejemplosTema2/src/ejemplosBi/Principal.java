package ejemplosBi;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random(System.nanoTime());
		
		int fil=0, col=0, hasta, desde, nNuevo;
		int[][]miTabla;
		String aux;
		
		System.out.println("Indique el número de filas:");
		
			aux=sc.nextLine();
			fil=Integer.parseInt(aux);
		
		System.out.println("Indique el número de columnas:");
		
			aux=sc.nextLine();
			col=Integer.parseInt(aux);
			
		System.out.println("Indique desde qué número quiere contar:");
			
			aux=sc.nextLine();
			desde=Integer.parseInt(aux);
		
		System.out.println("Indique hasta qué número quiere contar:");
			
			aux=sc.nextLine();
			hasta=Integer.parseInt(aux);
		
		miTabla= new int [fil][col];
		
		String asignaturas[]= {"PR", "LM", "BD", "ENT", "FOP" };
		
		for (int i = 0; i < asignaturas.length; i++) {
			
			System.out.print(asignaturas[i]+"\t");
		}
		
		System.out.println("\n--------------------------------------------");
		
		for (int i = 0; i < miTabla.length; i++) {
			for (int j = 0; j < miTabla[i].length; j++) {
				miTabla[i][j]=rnd.nextInt(hasta-desde+1)+desde;
				
				System.out.print(miTabla[i][j]+"\t");
			}
			System.out.println("");
		}
		
		//modificar un valor
		
		System.out.println("Diga fila a cambiar:");
		
			aux=sc.nextLine();
			fil=Integer.parseInt(aux)-1;
		
		System.out.println("Diga la columna:");
		
			aux=sc.nextLine();
			col=Integer.parseInt(aux)-1;
			
		System.out.println("Diga el nuevo número:");
		
			aux=sc.nextLine();
			nNuevo=Integer.parseInt(aux);
			
		miTabla[fil][col]=nNuevo;
		
		System.out.println("El nuevo número será "+miTabla[fil][col]);
		
		for (int i = 0; i < asignaturas.length; i++) {
			
			System.out.print(asignaturas[i]+"\t");
		}
		
		System.out.println("\n--------------------------------------------");
		
		for (int i = 0; i < miTabla.length; i++) {
			for (int j = 0; j < miTabla[i].length; j++) {
				System.out.print(miTabla[i][j]+"\t");
				}
			System.out.println("");
			}
		

	}

}
