/*/*************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 **/

package exercicios2;

import java.util.Scanner;

public class EstoqueMedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com a quantidade mínima das peças em estoque: ");
		int QUANTIDADE_MINIMA = sc.nextInt();
		
		System.out.println("Entre com a quantidade máxima de peças em estoque: ");		
		
		int QUANTIDADE_MAXIMA = sc.nextInt();
		
		
		int ESTOQUE_MEDIO = (QUANTIDADE_MINIMA + QUANTIDADE_MAXIMA) / 2;
		
		System.out.println("A quantidade média do produto em seu estoque é de: " + ESTOQUE_MEDIO);
		
		sc.close();
	}
}
