/*Faça um programa que leia 5 números e informe a soma e a média
dos números*/

import java.util.Scanner;

public class SomaEmediaDeNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vet[] = new int[5];
		int soma = 0;
		int res = 0;
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Insira um número: ");
			vet[i] = sc.nextInt();
			soma = soma +  vet[i];
		}
		res = soma / vet.length;

		System.out.println(res);
		sc.close();
	}
}
