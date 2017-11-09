package exercicio1;
import java.util.Scanner;
public class area_cirfunferencia {

	
	public static void main(String[] args){
	double area,raio;
	Scanner dados = new Scanner (System.in);
	//
	System.out.println("Qual o raio?");
	raio= dados.nextDouble();
	area=(3.14*raio*raio);
	System.out.printf("A área é " + area);
	
	
}}
