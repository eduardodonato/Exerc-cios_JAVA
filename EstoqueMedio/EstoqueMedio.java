/*/*************************************************************************
 *  1-)Fa�a um programa para calcular o estoque m�dio de uma pe�a, sendo que:
 *  ESTOQUE M�DIO = (QUANTIDADE_M�NIMA + QUANTIDADE_M�XIMA) / 2.
 **/

package exercicios2;

import java.util.Scanner;

public class EstoqueMedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com a quantidade m�nima das pe�as em estoque: ");
		int QUANTIDADE_MINIMA = sc.nextInt();
		
		System.out.println("Entre com a quantidade m�xima de pe�as em estoque: ");		
		
		int QUANTIDADE_MAXIMA = sc.nextInt();
		
		
		int ESTOQUE_MEDIO = (QUANTIDADE_MINIMA + QUANTIDADE_MAXIMA) / 2;
		
		System.out.println("A quantidade m�dia do produto em seu estoque � de: " + ESTOQUE_MEDIO);
		
		sc.close();
	}
}
