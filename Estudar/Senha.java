/*Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" 
e o algoritmo encerrado. Considere que a senha correta é o valor 2002*/
package fundamentos.Estudar;

import java.util.Scanner;

public class Senha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTRE COM A SUA SENHA DE ACESSO: ");
		int senha = sc.nextInt();

		while (senha != 2121) {

			System.out.println("Tente novamente!");
			senha = sc.nextInt();

		}
		System.out.println("Acesso permitido!");
		System.out.println("Seja bem vindo!");

		sc.close();
	}

}
