
package exercicios;

import java.util.Scanner;

public class RendimentoDeValorEmConta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor que foi depositado: ");
		double ValorDep = sc.nextDouble();

		double Correcao = (ValorDep * 0.70);
		double ValorFinal = ValorDep + Correcao;
		System.out.println("O valor depositado renderá " + Correcao + " por mês.");
		System.out.printf("Valor corrigido após um més será %.2f " , ValorFinal);

		sc.close();
	}

}
