/*Ler um valor e escrever se é positivo ou negativo (considere o  valor zero 
como positivo)*/
package exercicios2;

import java.util.Scanner;

public class PositivoOuNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int Num = sc.nextInt();
		
		if (Num >= 0) {
			System.out.println("O número informado é positivo");
			
		}
		else {
			System.out.println("O número informado é negativo");
			
		}
		
		sc.close();
	
	
	}
	

}
