package triangulo;

import java.util.ArrayList;

public class Grafico {
	ArrayList<FigurasGeometricas> triangulos = new ArrayList<FigurasGeometricas>();
	private double coordenadasX;
	private double coordenadasY;

	public String distanciaEntreEemento(Triangulo x, Triangulo y) {
		double distanciaX = 0.0;
		double distanciaY = 0.0;

		if (this.existenciaElemento(x, y)) {
			distanciaX = x.getGrafico().coordenadasX - y.getGrafico().coordenadasX;
			distanciaY = x.getGrafico().getCoordenadasY() - y.getGrafico().getCoordenadasY();
		}

		return "(" + distanciaX + "," + distanciaY + ")";
	}

	private boolean existenciaElemento(Triangulo x, Triangulo y) {

		boolean existe = false;

		for (FigurasGeometricas t : triangulos) {
			if (t == x) {
				existe = true;
				System.out.println("Existe triangulo x");
			} else if (t == y) {
				System.out.println("Existe triangulo y");
				existe = true;

			}
		}

		return existe;
	}

	public double getCoordenadasX() {
		return coordenadasX;
	}

	public void setCoordenadasX(double coordenadasX) {
		this.coordenadasX = coordenadasX;
	}

	public double getCoordenadasY() {
		return coordenadasY;
	}

	public void setCoordenadasY(double coordenadasY) {
		this.coordenadasY = coordenadasY;
	}

	public ArrayList<FigurasGeometricas> getTriangulos() {
		return triangulos;
	}

	public void setTriangulos(ArrayList<FigurasGeometricas> triangulos) {
		this.triangulos = triangulos;
	}

}
