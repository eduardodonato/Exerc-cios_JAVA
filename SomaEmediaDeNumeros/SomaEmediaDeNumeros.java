/*Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia
dos n�meros*/

import java.util.Scanner;

public class SomaEmediaDeNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vet[] = new int[5];
		int soma = 0;
		int res = 0;
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Insira um n�mero: ");
			vet[i] = sc.nextInt();
			soma = soma +  vet[i];
		}
		res = soma / vet.length;

		System.out.println(res);
		sc.close();
	}
}
