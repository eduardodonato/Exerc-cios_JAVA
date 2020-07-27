/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma 
dúzia, e R$ 1,00 se forem compradas pelo meno s 12. Escreva um 
programa que leia o número de maçãs compradas, calcule e escreva o 
custo total da compra. */ 


package exercicios2;

import java.util.Scanner;

public class CustoDasMaçâs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas maçãs você pretende comprar? ");
		
		int Qt = sc.nextInt();
		
		if( Qt >= 12 ) {
			double Total = Qt * 1.00;
			System.out.println("Total a pagar R$ " + Total + " .");
		}
		else if (Qt <12) {
			double Total = Qt * 1.30;
			System.out.println("Total a pagar R$ " + Total + " .");
		}
		
		
		
		sc.close();
	}

}
