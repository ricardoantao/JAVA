package leia;

import java.util.Scanner;

public class MaiorNumeroIguais {

		public static void main(String[] args) {
			Scanner dados = new Scanner(System.in);
			double numero_1, numero_2;
			System.out.println("Qual o primeiro n�mero?");
			numero_1 = dados.nextDouble();
			System.out.println("Qual o segundo n�mero?");
			numero_2 = dados.nextDouble();
			if (numero_1 > numero_2) 
				System.out.print("O Maior N�mero � " + numero_1);
			else if (numero_2 > numero_1) 
				System.out.print("O Maior N�mero � " + numero_2);
				else
			System.out.print("Os n�meros s�o iguais");	
		}	
	}