/*As ma��s custam R$ 1,30 cada se forem compradas menos de uma 
d�zia, e R$ 1,00 se forem compradas pelo meno s 12. Escreva um 
programa que leia o n�mero de ma��s compradas, calcule e escreva o 
custo total da compra. */ 


package exercicios2;

import java.util.Scanner;

public class CustoDasMa��s {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas ma��s voc� pretende comprar? ");
		
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
