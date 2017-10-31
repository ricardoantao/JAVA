package diadasbruxas;

import java.io.*;

public class diadasbruxas {

	public static void main(String[] args) throws IOException {
		

	

String C = "";
//Variaveis
System.out.println("Chegou o dia das bruxas");
System.out.println("Doce ou Travessura?");
InputStreamReader LerS = new InputStreamReader (System.in);
BufferedReader GuardaS = new BufferedReader (LerS);
C = GuardaS.readLine();
System.out.printf("Escolheu " + C + ".");


	}
}




