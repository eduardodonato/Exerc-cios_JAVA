package exercicios;

import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o nome do aluno: ");
		String nome = sc.next();
		
		System.out.println("Entre com o valor da 1� nota do aluno: ");
		double nota = sc.nextDouble();
		
		System.out.println("Entre com o valor da 2� nota do aluno: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Entre com o valor da 3� nota do aluno: ");
		double nota3 = sc.nextDouble();
		
		
		double media = (nota + nota2 + nota3)/3;
		
		System.out.printf("A m�dia do aluno %s foi de %.2f.", nome, media);
		
		
		sc.close();
	}

}
