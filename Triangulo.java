package fundamentos.Exercicios;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		System.out.println("Entre com o valor da base: ");
		Scanner sc = new Scanner (System.in);
		double base = sc.nextDouble();
		
		System.out.println("Entre com o valor da altura: ");
		double altura = sc.nextDouble();
		
		double resultado = ((base * altura) /2);
		System.out.println("O valor da area do triangulo é: " + resultado);
		sc.close();
		
		
		
	}

}
