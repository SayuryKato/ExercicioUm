package entidade;

public class Entidade {
	public double largura;
	public double altura;
	
	public double areaRetangulo() {
		double area = altura * largura;
		return area;
	}
	public double perimetroRetangulo() {
		double perimetro = 2*(altura+largura);
		return perimetro;
	}
	public double diagonalRetangulo() {
		double diagonal = Math.sqrt(Math.pow(altura,2) + Math.pow(largura,2));
		return diagonal;
	}

}
