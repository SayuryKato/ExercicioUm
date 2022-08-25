package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Entidade;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Entidade r1 = new Entidade();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Fala a altura ae: ");
		r1.altura = sc.nextDouble();
		
		System.out.println("Diga lá a largura: ");
		r1.largura = sc.nextDouble();

		System.out.printf("A area do retangulo é: %.2f", r1.areaRetangulo());
		System.out.printf("\nPerimetro do retangulo é: %.2f",r1.perimetroRetangulo());
		System.out.printf("\nDiagonal do retangulo is: %.2f", r1.diagonalRetangulo());
		
		sc.close();

	}

}
