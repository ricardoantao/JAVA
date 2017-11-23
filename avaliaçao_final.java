package avaliaçao_final;
import java.util.Scanner;
public class avaliaçao_final {

	public static void main(String[] args) {
	
	int cognitivo, atitudes;
	String nomealuno;
	double notafinal;
    Scanner dados = new Scanner (System.in);
    System.out.println("Qual o nome do Aluno?");
    nomealuno =dados.next();
    System.out.println("Qual o valor Cognitivo?");
    cognitivo=dados.nextInt();
    System.out.println("Qual o valor das Atitudes?");
    atitudes=dados.nextInt();
    notafinal= (int) (cognitivo*0.60+atitudes*0.40);
    if (notafinal>=10)
    	System.out.println("A avaliaçao final do aluno é "+ notafinal +" e está aprovado");
    else
    	System.out.println("A avaliaçao final do aluno é "+notafinal +" e está reprovado");
    
 	
}}
