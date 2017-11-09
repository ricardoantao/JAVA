package media;

public class SALARIO {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double salario, percentagem, salarioatualizado, persal;
		System.out.println("Qual o Salario?");
		salario = dados.nextDouble();
		System.out.println("Qual a percentagem do aumento?");
		percentagem = dados.nextDouble();
		persal = salario*(percentagem*0.01);
		salarioatualizado = salario+persal;
		System.out.printf("Salario Atualizado = " + salarioatualizado);

	}

}
