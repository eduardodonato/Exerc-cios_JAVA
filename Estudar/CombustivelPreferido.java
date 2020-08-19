/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência
 * de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido 
 * (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário
 *  informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código
 *   (até que seja válido). O programa será encerrado quando o código informado for o número 
 *   4. *   Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram
cada tipo de combustível, conforme exemplo.*/
package fundamentos.Estudar;

import java.util.Scanner;

public class CombustivelPreferido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gasolina = 0; 
		int alcool = 0;
		int diesel = 0;
		


		System.out.println("*********************************************");
		System.out.println("Entre com o combustivel de sua preferencia: ");
		System.out.println("*********************************************");
		System.out.println();

		System.out.println("Para Alcool       Digite (1) ");
		System.out.println("Para Diesel       Digite (2) ");
		System.out.println("Para Gasolina     Digite (3) ");

		int Escolha = sc.nextInt();
		
		while ( Escolha != 4 ){
			if (Escolha == 1) {
				gasolina = gasolina + 1;
			}
			else if (Escolha == 2) {
				alcool= alcool + 1;
			}
			else if (Escolha == 3) {
				diesel = diesel + 1;
			}
			Escolha = sc.nextInt();
		}
		
		System.out.println("Obrigado pela disponibilidade e atenção!");
		System.out.println("Alcool = " + alcool);
		System.out.println("Gasolina = " + gasolina);
		System.out.println("Diesel = " + diesel);
		System.out.println("******************** Volte sempre! **********************\n");
		sc.close();
		
	}

}
