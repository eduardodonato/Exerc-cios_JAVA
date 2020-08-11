/*Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e 
cr�dito. Ap�s, calcula r e escrever o saldo atual (saldo atual = saldo - 
d�bito + cr�dito). Tamb�m testar se  saldo atual for maior ou igual a 
zero escrever a men sagem 'Saldo Positivo', sen �o escrever a 
mensagem 'Saldo Negativo'.  */


package exercicios2;

import java.util.Scanner;

public class SaldoBancario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o n�mero da sua conta sem o digito: ");
		int NumeroDaConta = sc.nextInt();
		
		System.out.println("Entre com o seu saldo: ");
		double Saldo = sc.nextDouble();
		
		System.out.println("Insira o valor d�bitado: ");
		double Debito = sc.nextDouble();
		
		System.out.println("Insira o valor que predente cr�ditar: ");
		double Credito = sc.nextDouble();
		
		double SaldoAtual = (Saldo - Debito) + Credito;
		System.out.println("O saldo atual da conta " + NumeroDaConta + " � de R$ " + SaldoAtual + " .");
		
		if (SaldoAtual >= 0) {
			System.out.println("Saldo Positivo!");
		}
		else {
			System.out.println("Saldo negativo!");
		}
		
		
		sc.close();
	}

}
