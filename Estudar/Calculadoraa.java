package fundamentos.Estudar;

import java.util.Scanner;

public class Calculadoraa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********** Bem vindo a Calculadora **************");
		System.out.println();
		System.out.println("Entre com o primeiro número da operação: ");
		double N1 = sc.nextDouble();
		System.out.println("Entre com a operação desejada: ");
		System.out.println("( - ) Subtração ");
		System.out.println("( + ) Adição");
		System.out.println("( * ) Multiplicação");
		System.out.println("( / ) Divisão");
		sc.hasNextLine();
		char op = sc.next().charAt(0);
		System.out.println("Entre com o segundo número da operação: ");
		double N2 = sc.nextDouble();
		
		if (op == '-') {
			System.out.println( N1-N2);
		}
		
		else if (op == '+') {
			System.out.println(N1 + N2);
		}
		else if (op == '*') {
			System.out.println(N1 * N2);
		}
		else if (op == '/') {
			System.out.println(N1/N2);
		}
		else {
			System.out.println("Operação inválida!");
		}
		
		
		sc.close();

		
	}
}