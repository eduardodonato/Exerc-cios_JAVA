
package exercicios;

import java.util.Scanner;

public class PrecoCusto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor de custo da mercadoria: ");
		double ValorDeCusto = sc.nextDouble();
		
		System.out.println("Entre com o valor do percentual a ser acrescido no preço de custo da mercadoria: ");
		double Percentual = sc.nextDouble();
		
		
		double ValorFinal = ValorDeCusto + (ValorDeCusto * Percentual/100);
		
		System.out.println("O valor final a pagar pela mercadoria é de R$ " + ValorFinal);
		
		
		sc.close();
	}

}
