package examenT3;

public class Depositos {
	
	Principal pv;
	
	private double altura;
	private double radio;
	private int litros;
	private double costreFabrica;
	
	public Depositos(double altura, double radio, int litros, double costreFabrica) {
		super();
		this.altura = altura;
		this.radio = radio;
		this.litros = litros;
		this.costreFabrica = costreFabrica;
	}

	public Depositos(int tam) {
		// TODO Auto-generated constructor stub
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public double getCostreFabrica() {
		return costreFabrica;
	}

	public void setCostreFabrica(double costreFabrica) {
		this.costreFabrica = costreFabrica;
	}

	@Override
	public String toString() {
		return "Depositos [altura=" + altura + ", radio=" + radio + ", litros=" + litros + ", costreFabrica="
				+ costreFabrica + "]";
	}
	
	public double calcularVolumen() {
		double volumenCilindro;
		volumenCilindro= getAltura()*getRadio();
		return volumenCilindro;
				}

	public static Principal toArray(String[] strings) {
		// TODO Auto-generated method stub
		return null;
	}
	public void añadirDesposito() {
		System.out.println("Depositos [altura=" + getAltura() + ", radio=" + getRadio() + ", litros=" + getLitros() + ", costreFabrica="
				+ getLitros() +"]");
	}
}
