package exercicios;

import java.util.Scanner;

public class VendedorSalarioEcomissao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o nome do vendedor: ");
		String Nome = sc.next();

		System.out.println("Entre o salario do vendedor: ");
		double Salario = sc.nextDouble();

		System.out.println("Entre com o valor das vendas desse funcionario neste mês (em dinheiro): ");
		double TotalEmVendas = sc.nextDouble();

		double SalarioPorVendas = TotalEmVendas * 0.15;

		double TotalAReceber = Salario + SalarioPorVendas;

		System.out.printf("O vendedor %s, recebe R$ %.2f mensal e este mês receberá tambem %.2f pelas suas vendas.",
				Nome, Salario, SalarioPorVendas);
		System.out.printf("\nTotalizando o percentual R$ %.2f a receber este mês.", TotalAReceber);

		
		sc.close();

	}
}
