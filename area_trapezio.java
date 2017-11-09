	package exercicio1;
	import java.util.Scanner;
	public class area_trapezio {

	
		private static Scanner dados;
		public static void main(String[] args){
		double basemaior,basemenor,area,altura;
		dados = new Scanner (System.in);
		//
		System.out.println("Quanto mede a Base Maior?");
			basemaior = dados.nextDouble();
		System.out.println("Quanto mede a Base Menor?");
			basemenor = dados.nextDouble();
		System.out.println("Quanto mede a Altura?");
			altura = dados.nextDouble();
		area=(basemaior+basemenor)*altura/2;
		System.out.printf("A área é " + area);
						
	}

}

