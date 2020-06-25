package triangulo;

import java.util.Scanner;

public class ProgramApp {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Digite os lados do triangulo x");

		FigurasGeometricas tx = new Triangulo();

		System.out.println("lado 1");
		double _1dado = s.nextDouble();
		tx.setA(_1dado);
		System.out.println("lado2");
		double _2dado = s.nextDouble();
		tx.setB(_2dado);
		System.out.println("lado3");
		double _3dado = s.nextDouble();
		tx.setC(_3dado);
		double dadoProcessadoHeap;
		dadoProcessadoHeap = tx.calcularArea();

		Scanner sr = new Scanner(System.in);
		System.out.println("Digite os lados do triangulo y");

		FigurasGeometricas ty = new Triangulo();

		System.out.println("lado 1");
		double _1dadoY = sr.nextDouble();
		ty.setA(_1dadoY);
		System.out.println("lado2");
		double _2dadoY = sr.nextDouble();
		ty.setB(_2dadoY);
		System.out.println("lado3");
		double _3dadoY = sr.nextDouble();
		ty.setC(_3dadoY);
		double dadoProcessadoHeap1;
		dadoProcessadoHeap1 = ty.calcularArea();

		Grafico grafico = new Grafico();
		tx.setGrafico(grafico);
		ty.setGrafico(grafico);
		grafico.getTriangulos().add(ty);
		grafico.getTriangulos().add(tx);

	}

}
