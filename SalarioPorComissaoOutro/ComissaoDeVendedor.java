/*/*************************************************************************
 * 3) Fa�a um programa para pagamento de comiss�o de vendedores de pe�as,
 *		levando-se em considera��o que sua comiss�o ser� de 5% do total da venda 
 *		e que voc� tem os seguintes dados:
 * 		- Identifica��o do vendedor
 * 		- C�digo da pe�a
 * 		- Pre�o unit�rio da pe�a
 * 		- Quantidade vendida
*************************************************************************/

package exercicios2;

import java.util.Scanner;

public class ComissaoDeVendedor {
	public static void main(String[] args) {
		Scanner In = new Scanner (System.in);
		
		System.out.println("Entre com o nome do vendedor: ");
		String Nome = In.next();
		
		System.out.println("Entre com o c�digo da pe�a: ");
		int CodigoPeca = In.nextInt();
		
		System.out.println("Ente com o valor unit�rio da pe�a: ");
		double ValorDaPeca = In.nextDouble();
		
		System.out.println("Entre com a quantidade de pe�as vendidas: ");
		int QtVendida = In.nextInt();
		
		double ComissaoVendedor = (ValorDaPeca * QtVendida) * 0.05;
		
		System.out.println("O vendedor: " + Nome + " ,vendeu este m�s " + QtVendida + " da pe�a de c�digo: " + CodigoPeca + " .Que custa R$ "
				+ ValorDaPeca + " Totalizando sua comiss�o o valor de R$ " + ComissaoVendedor + " .");
		
		
		
		In.close();
	}

}
