

package exercicios;

import java.util.Scanner;

public class RealParaDolar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da cota��o atual do Dolar: ");
		double Cotacao = sc.nextDouble();
		
		System.out.println("Informe qual o valor de Dolares que voc� possui: ");
		double Dolar = sc.nextDouble();
		
		double Real = Dolar * Cotacao; 
		
		System.out.println("Voc� possui $" + Real + " Reais em d�lares");
		
		
		
		sc.close();
	}

}
