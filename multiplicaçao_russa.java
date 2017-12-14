package multiplicaçao_russa;

import java.util.Scanner;

public class multiplicaçao_russa {

	public static void main(String[] args) {		
		
		{int X, X1, Y, Y1, T; 
		Scanner LerS=new Scanner (System.in); 
		System.out.println("Digite o Primeiro Número "); 
		X=LerS.nextInt(); 
		System.out.println("Digite o Segundo Número "); 
		Y=LerS.nextInt(); 
		X1=X; Y1=Y; T=0; 
		while (X1>=1) {if (X1%2!=0) T=T+Y1; 
		X1=(X1/2); 
		Y1=Y1*2;} 
		System.out.printf("%d",T);
		}}}
		
