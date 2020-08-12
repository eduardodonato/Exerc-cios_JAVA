package exercicios2;

import java.util.Scanner;

public class TelefonistaEstudar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("O cliente possui plano telefonico de 100 minutos por R$ 50,00");
		System.out.println("Quantos minutos este cliente gastou esse mês: ");
		//Cada min que exceder a franquia custa R$ 2,00
		int ConsumoMes = input.nextInt();
		
		
		if (ConsumoMes> 100) {
			int Gasto = 50 + (ConsumoMes - 100) * 2;
			System.out.println("O cliente deverá pagar o valor de: " + Gasto);
		}
		else {
			System.out.println("O cliente deverá pagar o valor de R$50,00");
		}
		
			
		input.close();
	}

}
