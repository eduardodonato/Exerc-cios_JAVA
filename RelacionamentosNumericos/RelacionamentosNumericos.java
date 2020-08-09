/*******************************************************************************
* 10) Escrever um programa que leia dois números inteiros e mostre todos os 
* relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis 
* são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
*******************************************************************************/

package exercicios2;

import java.util.Scanner;

public class RelacionamentosNumericos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com dois valores inteiros: ");
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		
			
		if (N1 > N2) {
			System.out.println(N1 + " É MAIOR QUE " + N2);
		}
		else {
			System.out.println(N2 + " É MAIOR QUE " + N1);
		}
		
		if (N1 == N2 ) {
			System.out.println(N1 + " é igual a " + N2);
		}
		else {
			System.out.println(N1 + " e "  + N2 + " São diferentes!"); 
		}
		
		
		

		/*boolean Igual=false, NaoIgual=false, Maior=false, Menor=false, MaiorOuIgual=false, MenorOuIgual=false;	
		
		if(PrimeiroNumero == SegundoNumero) Igual = true;
		if(PrimeiroNumero != SegundoNumero) NaoIgual = true;
		if(PrimeiroNumero > SegundoNumero) Maior = true;
		if(PrimeiroNumero < SegundoNumero) Menor = true;
		if(PrimeiroNumero >= SegundoNumero) MaiorOuIgual = true;
		if(PrimeiroNumero <= SegundoNumero) MenorOuIgual = true;

		System.out.println("\nIgual = "+Igual);
		System.out.println("Não Igual = "+NaoIgual);
		System.out.println("Maior = "+Maior);
		System.out.println("Menor = "+Menor);
		System.out.println("Maior ou igual = "+MaiorOuIgual);
		System.out.println("Menor ou igual = "+MenorOuIgual);
		*/
		sc.close();
	}

}
