/*Ler dois valores (considere que n�o ser�o lidos valo res iguais) e 
escrever o maior dele s. */

package exercicios2;

import java.util.Scanner;

public class MaiorNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um n�mero: ");
		int Num1 = sc.nextInt();
		
		
		System.out.println("Entre com outro n�mero: ");
		int Num2 = sc.nextInt();
		
		if (Num1 > Num2) {
			System.out.println("\nO numero " + Num1 + " � o maior!");
		}
		else {
			System.out.println("\nO numero " + Num2 + " � o maior!");
		}
		
		sc.close();
	}

}
