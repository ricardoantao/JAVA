package Sexta;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
	
int n1=1;
int i, n2;
Scanner dados = new Scanner (System.in);
System.out.println("Até que número?");
		n2 = dados.nextInt();
for(i=2;i<=n2;i++)
n1=n1+i;
		
System.out.println("A soma dos "+n2+" primeiros números é: "+n1);
	
}}
