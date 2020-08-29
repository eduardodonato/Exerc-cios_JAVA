package fundamentos.Exercicios;

import java.util.Scanner;

public class QuadradoEcubo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		
		double numero = sc.nextDouble();
		

		double quadrado = Math.pow(numero, 2);
		double cubo = Math.pow (numero ,3);
		
		System.out.println("O valor do quadrado do numero inserido é: "+ quadrado);
		System.out.println("O valor do cubo do numero inserido é: "+ cubo);
		
		
		sc.close();
	}

}
