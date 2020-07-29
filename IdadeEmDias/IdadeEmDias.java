/*******************************************************************************
* 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e 
* dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
* com 365 dias e mês com 30 dias.
*******************************************************************************/
package exercicios2;

import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Entre com o ano de seu nascimento: ");
		int Nascimento = In.nextInt();
		
		int Idade = 2020 - Nascimento;
		int MeioCalc = Idade * 365;
		
		System.out.println("Enter com o mês do seu aniversario de forma numérica: ");
		int Mes = In.nextInt();
		
		int IdadeMes = Mes * 30; 
		
		System.out.println("Entre com o dia do seu aniversario: ");
		int dia = In.nextInt();
		int Total = dia + IdadeMes + MeioCalc;
		System.out.println("Você tem " + Total + " Dias de vida!");
		
		
		
		
		In.close();
	}

}
