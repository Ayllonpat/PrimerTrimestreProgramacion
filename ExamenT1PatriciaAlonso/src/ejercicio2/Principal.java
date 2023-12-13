package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux, nombreCanción, reproducciones="Reproducciones", semanasTop5="Ganado por semana Top 5", ganadoTop5="Semanas Top 5", participantes="Nº Participantes", ganadoParticipante="Ganado porParticipante", total="Total";
		int numeroRepro, numeroSemanasTop5, nParticipantes, nLikes, iPhone=3000, cien=100;
		double dineroTop5, dineroRepro, dolaresReproduccion=0.004, dolaresPorSemanaTop5, porcentajeNLikes, dolaresLikes, dineroPorParticipante, totalGanado, totalIPhone;
		
		System.out.println("-------------------------------");
		System.out.println("Bienvenido al ejercicio 2.");
		System.out.println("-------------------------------");
		
		System.out.println("    ");		
		System.out.println("Vamos a crear un ticket para mostrar cuanto gana un artista y sus colaboradores por una canción.");
		
		System.out.println("   ");
		System.out.println("Indique el nombre de la canción:");
		
		nombreCanción=sc.nextLine();
		
		System.out.println("   ");
		System.out.println("Indique el número de reproducciones totales de la canción:");
		
		aux=sc.nextLine();
		numeroRepro=Integer.parseInt(aux);
		
		System.out.println("   ");
		System.out.println("Cuántas semanas ha estado en el Top5:");
		
		aux=sc.nextLine();
		numeroSemanasTop5=Integer.parseInt(aux);
		
		System.out.println("    ");
		System.out.println("Cuánto dinero($) paga Spotify por semana en el Top5:");
		
		aux=sc.nextLine();
		dolaresPorSemanaTop5=Double.parseDouble(aux);
		
		System.out.println("   ");
		System.out.println("Cuántas personas han participado en su creación:");
		
		aux=sc.nextLine();
		nParticipantes=Integer.parseInt(aux);
		
		System.out.println("   ");
		System.out.println("¿Y cuántos likes tiene?");
		
		aux=sc.nextLine();
		nLikes=Integer.parseInt(aux);
		
		System.out.println("   ");
		System.out.println("¿Y qué porcentaje le pagan por ellos?");
		
		aux=sc.nextLine();
		porcentajeNLikes=Double.parseDouble(aux);
		
		dineroRepro=dolaresReproduccion*numeroRepro;
		dineroTop5=numeroSemanasTop5*dolaresPorSemanaTop5;
		dolaresLikes=nLikes*(porcentajeNLikes*cien);
		totalGanado=dineroRepro+dineroTop5+dolaresLikes;
		dineroPorParticipante=totalGanado/nParticipantes;
		
		System.out.println("   ");
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t\t"+nombreCanción);
		System.out.println("----------------------------------------------------------------");
		System.out.println("    ");
		
		System.out.printf("\t\t\tCantidad\t\t\tGanado");
		System.out.println("   ");
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%s\t\t\t%d\t\t\t%.2f$", reproducciones, numeroRepro, dineroRepro);
		System.out.println("  ");
		System.out.printf("%s\t\t\t\t\t\t\t%.2f$",semanasTop5,dolaresPorSemanaTop5);
		System.out.printf("%s\t\t\t%d\t\t\t%.2f", ganadoTop5, numeroSemanasTop5, dineroTop5);
		
		
	}

}
