/*/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 *		levando-se em consideração que sua comissão será de 5% do total da venda 
 *		e que você tem os seguintes dados:
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida
*************************************************************************/

package exercicios2;

import java.util.Scanner;

public class ComissaoDeVendedor {
	public static void main(String[] args) {
		Scanner In = new Scanner (System.in);
		
		System.out.println("Entre com o nome do vendedor: ");
		String Nome = In.next();
		
		System.out.println("Entre com o código da peça: ");
		int CodigoPeca = In.nextInt();
		
		System.out.println("Ente com o valor unitário da peça: ");
		double ValorDaPeca = In.nextDouble();
		
		System.out.println("Entre com a quantidade de peças vendidas: ");
		int QtVendida = In.nextInt();
		
		double ComissaoVendedor = (ValorDaPeca * QtVendida) * 0.05;
		
		System.out.println("O vendedor: " + Nome + " ,vendeu este mês " + QtVendida + " da peça de código: " + CodigoPeca + " .Que custa R$ "
				+ ValorDaPeca + " Totalizando sua comissão o valor de R$ " + ComissaoVendedor + " .");
		
		
		
		In.close();
	}

}
