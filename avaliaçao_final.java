package avalia�ao_final;
import java.util.Scanner;
public class avalia�ao_final {

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
    	System.out.println("A avalia�ao final do aluno � "+ notafinal +" e est� aprovado");
    else
    	System.out.println("A avalia�ao final do aluno � "+notafinal +" e est� reprovado");
    
 	
}}
