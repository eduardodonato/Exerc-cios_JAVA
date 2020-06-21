/*Escrever um programa para determinar o consumo médio de um automóvel 
sendo fornecida a distância total percorri da pelo automóvel e o total de 
combustível gasto. */


package exercicios;

import java.util.Scanner;

public class ConsumoMedioAutomovel {
	public static void main(String[] args) {

	System.out.println("Informe a distância total percorrida: ");
	Scanner sc = new Scanner (System.in);
	double distancia = sc.nextDouble();
		
	System.out.println("Informe o total de combustivel gasto: ");
	double gasto = sc.nextDouble();
	
	double ConsumoM = distancia / gasto; 
	System.out.println("O consume médio do automóvel foi de: " + ConsumoM + ".");
	
	sc.close();
	
	}
}