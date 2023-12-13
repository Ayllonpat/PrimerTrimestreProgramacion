package ejercicio02;

public class Circulo {
	
	private double radio;
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	//en los metodos q no som de imprimir no se imprime
	
	public double mostarArea() {
		double area, dos=2;
		area=Math.PI*Math.pow(radio, dos);
		return area;
	}
	
	public double convertirAreaM2() {
		double diezmil=10000;
		return mostarArea()/diezmil;
	}


	}

