package numeros3;
import java.util.Scanner;
public class numeros3 {

	public static void main1(String[] args) {}

			public static void main(String[] args) {
				Scanner dados = new Scanner(System.in);
				double numero1, numero2,numero3;
				System.out.println("Qual o numero 1?");
				numero1 = dados.nextDouble();
				System.out.println("Qual o numero 2?");
				numero2 = dados.nextDouble();
				System.out.println("Qual o numero 3?");
				numero3 = dados.nextDouble();
				if (numero1 > numero2) 
					System.out.println("O Maior Numero é " + numero1);
				else if (numero2 > numero1) 
					System.out.println("O Maior Numero é " + numero2);
				if (numero1 < numero3 > numero2)
					System.out.println("O Maior Numero é " + numero3);
					else
				System.out.print("Os numeros são iguais!");	
			}	
		}