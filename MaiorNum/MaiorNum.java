/*Ler dois valores (considere que não serão lidos valo res iguais) e 
escrever o maior dele s. */

package exercicios2;

import java.util.Scanner;

public class MaiorNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um número: ");
		int Num1 = sc.nextInt();
		
		
		System.out.println("Entre com outro número: ");
		int Num2 = sc.nextInt();
		
		if (Num1 > Num2) {
			System.out.println("\nO numero " + Num1 + " é o maior!");
		}
		else {
			System.out.println("\nO numero " + Num2 + " é o maior!");
		}
		
		sc.close();
	}

}
