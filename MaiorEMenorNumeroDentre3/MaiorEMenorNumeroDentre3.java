/*******************************************************************************
* 20) Escrever um programa declarando tr�s vari�veis do tipo inteiro (a, b e c). Ler um valor
* maior que zero para cada vari�vel (se o valor digitado n�o � v�lido, mostrar mensagem e ler
* novamente). Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo
* menor.
*******************************************************************************/
package exercicios2;

import java.util.Scanner;

public class MaiorEMenorNumeroDentre3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = -1;
		int B = -1;
		int C = -1;
		int MaiorValor = 0;
		int MenorValor = 0;
		System.out.println("Entre com 3 valores positivos: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		while (A <= 0) {
			System.out.println("Entre com um valor positivo para A: ");
			A = sc.nextInt();
		}
		while (B <= 0) {
			System.out.println("Entre com um valor positivo para B: ");
			B = sc.nextInt();
		}
		while (C <= 0) {
			System.out.println("Entre com um valor positivo para C: ");
			C = sc.nextInt();
		}

		if (A > B && A > C) {
			System.out.println("O MAIOR � A");
			MenorValor = A;
		} else if (B > A && B > C) {
			System.out.println("O MAIOR � B");
			MenorValor = B;
		} else if (C > A && C > B) {
			System.out.println("O MAIOR � C");
			MenorValor = C;
		}

		if (A < B && A < C) {
			System.out.println("O MENOR � A");
			MaiorValor = A;
		} else if (B < A && B < C) {
			System.out.println("O MENOR � B");
			MaiorValor = B;
		} else if (C < A && C < B) {
			System.out.println("O MENOR � C");
			MaiorValor = C;
		}

		int Res1 = MenorValor * MaiorValor;
		int Res2 = MenorValor / MaiorValor;
		System.out.println("O resultado do maior valor lido multiplicado" + "pelo maior valor lido �: " + Res1);
		System.out.println("O resultado do maior valor lido dividido" + "pelo maior valor lido �: " + Res2);

		sc.close();

	}
}
