package fundamentos.Exercicios;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Entre com a temperatura em graus Celsius: ");
		
		double celsius = sc.nextDouble();
		
		double res = celsius * 1.8 +32;
		
		System.out.println("A temperatura " + celsius + "em grau celsius, corresponde a " + res + " em Fahrenheit");
		
		sc.close();
		
		
	}

}
