package exercicio1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args){
		
		Scanner dados = new Scanner(System.in);
		double C1,C2,H;
		System.out.print("Teorema de Pitágoras\n");
		System.out.println("Qual o cateto 1?");
		C1=dados.nextDouble();
		System.out.println("Qual o cateto 2?");
		C2=dados.nextDouble();
		H=Math.sqrt(Math.pow(C1,  2) + Math.pow(C2, 2));
		System.out.printf("A Hipotenusa é " + H);	
				
		
		
		
		
		
		
		
		
		
		
		
	}

}


