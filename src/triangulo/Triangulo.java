package triangulo;

public class Triangulo extends FigurasGeometricas{

	// tipos compostos a,b,c,cor
	private double a;
	private double b;
	private double c;
	private String cor;

	public double calcularArea() {

		double p;// processamento de dados
		p = (this.getA() + this.getB() + this.getC()) / 2.0;
		double area;// processamento de dados
		area = Math.sqrt(p * ((p - this.getA()) * (p - this.getB()) * (p - this.getC())));
		System.out.printf("Resultado = %.2f %n", area);

		return area;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
