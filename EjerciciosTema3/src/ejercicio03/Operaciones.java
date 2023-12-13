package ejercicio03;

public class Operaciones {
	
	
	/*
	 * 	public boolean calcularPositivoNegativo1(int num) {
	
			if(num>=0) {
				return true;
			}else{
				return false;
			}
		}
		
	 */
	public boolean calcularPositivoNegativo2(int num) {

		boolean res;
		if(num>=0) {
			res=true;
		}else{
			res=false;
		}
		return res;
	}
	
	public void mostrarResultado (boolean res) {
		
		if (res=true) {
			System.out.println("El número es positivo.");
		}else{
			System.out.println("El número es negativo.");
		}
	}
	
	public boolean calcularParImpar(int num) {
		boolean res2;
		if(num%2==0) {
			res2=true;
		}else{
			res2=false;
		}
		return res2;
		
	}
	public void mostrarResultadoPar(boolean res2) {
		
		if (res2=true) {
			System.out.println("El número es par.");
		}else{
			System.out.println("El número es impar.");
		}
	}
	

}
