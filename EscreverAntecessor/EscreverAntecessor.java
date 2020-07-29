/*Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela ) 
o seu antecessor. */
package exercicios2;

import java.util.Scanner;

public class EscreverAntecessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int Num = sc.nextInt();
		int Aux = Num-1;
		System.out.println("O número que antecede " + Num + " é " + Aux + "." );
		
		//Ou diretamente no print     System.out.printf(" Antecessor de %s = %s ", num ,( num - 1 ));  
		
		sc.close();
	}

}
