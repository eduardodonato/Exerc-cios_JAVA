package exercicios;

import java.util.Scanner;

public class RecebaDoisNumESome {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print( " Digite  o primeiro n�mero: ");
		int a = entrada.nextInt();
		System.out.print( " Digite  o segundo n�mero: ");
		int b = entrada.nextInt();
		int soma = a + b;
		
		System.out.println("O resultado da soma dos numeros " + a +  " e " + b + " � : " + soma);
		
		
		
		
		
		entrada.close();
	}
		

}
