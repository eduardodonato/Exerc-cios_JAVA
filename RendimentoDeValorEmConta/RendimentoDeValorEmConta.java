/*Fa�a um programa que receba um valor que foi deposit ado e exiba o valor
com rendimento ap�s um m�s. 
Considere fixo o juro da poupan�a em 0.70 % a. m. */

package exercicios;

import java.util.Scanner;

public class RendimentoDeValorEmConta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor que foi depositado: ");
		double ValorDep = sc.nextDouble();
		
		double Correcao = (ValorDep * 0.70)/100;
		System.out.println("O valor depositado render� " + Correcao + "por m�s.");
				
		
		
		sc.close();
	}

}
