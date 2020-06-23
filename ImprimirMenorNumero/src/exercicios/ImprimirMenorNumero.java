

package exercicios;

import java.util.Scanner;

public class ImprimirMenorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int Num1 = sc.nextInt();
		
		System.out.println("Digite outro numero: ");
		int Num2 = sc.nextInt();

		if (Num1 < Num2) {
			System.out.printf("O numero %d é menor que o numero %d", Num1, Num2);
		} else if (Num1 > Num2) {
			System.out.printf("O numero %d é menor que o numero %d", Num2, Num1);
		}

		sc.close();
	}

}
