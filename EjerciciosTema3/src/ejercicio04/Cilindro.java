package ejercicio04;

public class Cilindro {
	
	private double radio;
	private double altura;
	
	public Cilindro(double radio, double altura) {
		this.radio=radio;
		this.altura=altura;
	}
	
	public double calcularCilindro() {
		double volumen, area, dos=2;
		area=Math.PI*Math.pow(radio, dos);
		volumen=area*altura;
		return volumen;
	}
	
	public void mostrarCilindro(double volumen) {
		System.out.printf("\nEl volumen del cilindro es de %.2f cm3.\n", volumen);
	}

}
