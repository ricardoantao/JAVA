package media;
 
import java.util.Scanner;

public class paralelipipedo {

		public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double comprimento,altura,largura,volume;
		System.out.println("Qual � o comprimento?");
		comprimento = dados.nextDouble();
		System.out.println("Qual � a altura?");
		altura = dados.nextDouble();
		System.out.println("Qual � a largura?");
		largura = dados.nextDouble();
		volume = comprimento*largura*altura;
		System.out.printf("O volume � " + volume);

	}

}