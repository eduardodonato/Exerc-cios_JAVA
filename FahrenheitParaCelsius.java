package fundamentos.Exercicios;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o valor da temperatura em Fahrenheit: ");
		double temp = sc.nextDouble();
		double res = (temp -32) / 9;
		System.out.println("A temperatura em graus Fahrenheit correspondente a  " + temp + " resultará em " + res + " em graus Celsius");
		sc.close();
	}

}
