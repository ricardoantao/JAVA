package exercicio1;

import java.util.Scanner;

public class exercicio2 {

		public static void main(String[] args) {
	
	Scanner dados = new Scanner(System.in);
	Double F,C;
	System.out.println("Qual a temperatura em Fahrenheit?");
	F=dados.nextDouble();
	C=(F-32)/1.8;
	System.out.printf("A temperatura em Celsius é " + C);
	
	
	
	
}}
