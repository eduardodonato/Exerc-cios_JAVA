/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma 
mensagem que diga se ela  poder� ou n�o votar este ano (n�o � 
necess�rio considerar o dia  nem o m�s em que a pessoa nasceu). */


package exercicios2;

import java.util.Scanner;

public class PodeVotar {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o ano atual: ");
		int AnoAtual = sc.nextInt();
		
		System.out.println("Entre com o ano de nascimento da pessoa: ");
		int AnoNascimento = sc.nextInt();
		
		if (AnoAtual - AnoNascimento >= 16) {
			System.out.println("Pode Votar!");
		}
		else {
			System.out.println("N�o pode Votar!");
		}
			
		
		sc.close();
		
	}
	

}
