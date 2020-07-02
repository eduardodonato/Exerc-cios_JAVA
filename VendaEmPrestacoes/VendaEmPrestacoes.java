package exercicios;

import java.util.Scanner;

public class VendaEmPrestacoes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor da compra: ");
		double valorCompra = entrada.nextDouble();
		
		System.out.println("Entre com a quantidade de prestações desejadas: ");
		int qtPrestacoes = entrada.nextInt();
		
		Double valorPrestacoes = valorCompra / qtPrestacoes;
		
		System.out.println("O valor das prestações serão " + qtPrestacoes +"x" + " de R$ : " + valorPrestacoes);
		entrada.close();
	}

}
