package numeros3;

import java.util.Scanner;

public class numeros3 {

	public static void main(String[] args) 
	{{
Scanner Ler = new Scanner (System.in);
double numero1,numero2,numero3;
double max=0;
System.out.println("Qual o 1� n�mero?");
numero1 = Ler.nextDouble();
System.out.println("Qual o 2� n�mero?");
numero2 = Ler.nextDouble();
System.out.println("Qual o 3� n�mero?");
numero3 = Ler.nextDouble();
if (numero1>numero2)
	max=numero1;
	else
		max=numero2;
		if(max < numero3)
			max=numero3;
			
System.out.println("M�ximo: "+max);		
		
}}}