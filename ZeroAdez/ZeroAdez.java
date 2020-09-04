/*Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inv�lido e continue pedindo at� que o
usu�rio informe um valor v�lido.*/

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
