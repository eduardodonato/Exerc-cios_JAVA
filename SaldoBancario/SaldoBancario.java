/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e 
crédito. Após, calcula r e escrever o saldo atual (saldo atual = saldo - 
débito + crédito). Também testar se  saldo atual for maior ou igual a 
zero escrever a men sagem 'Saldo Positivo', sen ão escrever a 
mensagem 'Saldo Negativo'.  */


package exercicios2;

import java.util.Scanner;

public class SaldoBancario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número da sua conta sem o digito: ");
		int NumeroDaConta = sc.nextInt();
		
		System.out.println("Entre com o seu saldo: ");
		double Saldo = sc.nextDouble();
		
		System.out.println("Insira o valor débitado: ");
		double Debito = sc.nextDouble();
		
		System.out.println("Insira o valor que predente créditar: ");
		double Credito = sc.nextDouble();
		
		double SaldoAtual = (Saldo - Debito) + Credito;
		System.out.println("O saldo atual da conta " + NumeroDaConta + " é de R$ " + SaldoAtual + " .");
		
		if (SaldoAtual >= 0) {
			System.out.println("Saldo Positivo!");
		}
		else {
			System.out.println("Saldo negativo!");
		}
		
		
		sc.close();
	}

}
