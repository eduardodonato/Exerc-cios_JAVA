/*Escrever um programa que leia o nome de um vendedor, o seu  sal�rio fixo e o 
total de vendas efetuadas por ele no m�s (em dinheir o). Sabendo que este 
vendedor ganha 15% de comiss�o  sobre suas vendas efetuadas, informar o 
seu nome, o sal�rio fixo e sal�rio no fi nal do m�s.*/ 

package exercicios;

import java.util.Scanner;

public class VendedorDados {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Entre com o nome do vendedor: ");
	String Nome = sc.next();
	
	System.out.println("Entre o salario do vendedor: ");
	double Salario = sc.nextDouble();
	
	System.out.println("Entre com o valor das vendas desse funcionario neste m�s (em dinheiro): ");
	double TotalEmVendas = sc.nextDouble();
	
	double SalarioPorVendas = TotalEmVendas * 0.15;
	
	double TotalAReceber = Salario + SalarioPorVendas;
	
	System.out.printf("O vendedor %s, recebe R$ %.2f mensal e este m�s receber� tambem %.2f pelas suas vendas.", Nome, Salario, SalarioPorVendas);
	System.out.printf("\nTotalizando o percentual R$ %.2f a receber este m�s.", TotalAReceber);
	
	
	
	
	
	
	
	
	sc.close();
	
	
	
	}
}
