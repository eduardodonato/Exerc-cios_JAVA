/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/

import java.util.Scanner;

public class ZeroAdez {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um valor entre 0 a 10: ");

		int valor = sc.nextInt();

		while(valor < 0 || valor > 10) {
			System.out.println("Valor invalido, tente novamente: ");
			valor = sc.nextInt();
		
		}
	
		System.out.println("A nota digitada foi: " + valor);
		sc.close();

	}

}
