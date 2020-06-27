
package exercicios;

import java.util.Scanner;

public class RealParaDolar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da cotação atual do Dolar: ");
		double Cotacao = sc.nextDouble();
		
		System.out.println("Informe o valor em Dolares que você possui: ");
		double Dolar = sc.nextDouble();
		
		double Real = Dolar * Cotacao; 
		
		System.out.printf("Você possui R$ %.2f reais em dólares", Real);
		
		
		
		sc.close();
	}

}
