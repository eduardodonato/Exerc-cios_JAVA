/*Escreva um programa para ler  o raio de um circulo, calcular e escrever a sua 
área. (pR²) 
Calculo: área= PI*(raio²) */ 

package exercicios;

import java.util.Scanner;

public class RaioCirculo {
	public static void main(String[] args) {
		final double Pi = 3.1415;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor do raio do circulo: ");
		double Raio = sc.nextDouble();
		
		double Calculo = Pi*(Raio * Raio);
		//double Calculo2 = Pi *Math.pow(Raio,2);
		System.out.println("O valor da área é: " + Calculo);
		
		
		sc.close();
		
	}

}
