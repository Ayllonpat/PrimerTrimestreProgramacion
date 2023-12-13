package ejercicio09;

import java.util.Random;

public class Boleto {
	
	

	private int boleto;

	public int getBoleto() {
		return boleto;
	}

	public void setBoleto(int boleto) {
		this.boleto = boleto;
	}

	public Boleto(int boleto) {
		this.boleto = boleto;
		// TODO Auto-generated constructor stub
	}

	public void salir() {
		System.out.println("Cerrando..");
	}
	
	public int elegirDecimo() {
		System.out.println("Indique el número del 00001 al 99999 para"
				+ "el boleto deseado:");
		return boleto;
	}
	
	public void mostrarDecimo(int boleto) {
		
		System.out.println("El boleto elegido es: "+boleto);
		if(boleto>99999){
			System.out.println("Opción no valida");
		}else if(boleto<10000){
			System.out.println("Opción no valida");
		}else {
			
		}
	}
	
	public int elegirDecimoAlt(){
		Random rnd=new Random(System.nanoTime());
		int desde=1, hasta=99999;
		int boletoAlt = rnd.nextInt(hasta-desde+1)+desde;
		
		return boletoAlt;
	}
	
	public void mostrarDecimoAlt(int boleto) {
			
			System.out.println("El boleto elegido es: "+boleto);
	}

	public int elegirBoletoGanador() {
		Random rnd=new Random(System.nanoTime());
		int desde=00001, hasta=99999, boletoGanador;
		boletoGanador=rnd.nextInt(hasta-desde+1)+desde;
		return boletoGanador;
	}
	
	public void mostrarBoletoGanador(int boletoGanador) {
		
		System.out.println("El boleto ganador es: "+boletoGanador);
	}
	
	public boolean compararBoletos(int boletoGanador, int boletoAlt) {
		boolean ganador;
		if(boleto==boletoGanador) {
			ganador=true;
		}else if(boletoAlt==boletoGanador) {
			ganador=true;
		}else {
			ganador=false;
		}
		return ganador;
	}
	
	public void mostrarComparacion(boolean ganador) {
		if (ganador==true) {
			System.out.println("Felicidades, ha ganado.\n");
		}else {
			System.out.println("Lo sentimos, ha perdido.");
		}
	}
	
	public void mostrarGanador(int boleto) {
		
	}
	

}
