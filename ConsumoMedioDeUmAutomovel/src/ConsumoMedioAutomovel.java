/*Escrever um programa para determinar o consumo m�dio de um autom�vel 
sendo fornecida a dist�ncia total percorri da pelo autom�vel e o total de 
combust�vel gasto. */


package exercicios;

import java.util.Scanner;

public class ConsumoMedioAutomovel {
	public static void main(String[] args) {

	System.out.println("Informe a dist�ncia total percorrida: ");
	Scanner sc = new Scanner (System.in);
	double distancia = sc.nextDouble();
		
	System.out.println("Informe o total de combustivel gasto: ");
	double gasto = sc.nextDouble();
	
	double ConsumoM = distancia / gasto; 
	System.out.println("O consume m�dio do autom�vel foi de: " + ConsumoM + ".");
	
	sc.close();
	
	}
}