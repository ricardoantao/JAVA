package media;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double numero1,numero2,numero3,media;
		System.out.println("Qual a nota 1?");
		numero1 = dados.nextDouble();
		System.out.println("Qual a nota 2?");
		numero2 = dados.nextDouble();
		System.out.println("Qual a nota 3?");
		numero3 = dados.nextDouble();
		media = (numero1+numero2+numero3)/3;
		System.out.printf("A média é " + media);
				
		

	}

}