package fundamentos.Estudar;

import java.util.Scanner;

public class Calculadoraa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********** Bem vindo a Calculadora **************");
		System.out.println();
		System.out.println("Entre com o primeiro n�mero da opera��o: ");
		double N1 = sc.nextDouble();
		System.out.println("Entre com a opera��o desejada: ");
		System.out.println("( - ) Subtra��o ");
		System.out.println("( + ) Adi��o");
		System.out.println("( * ) Multiplica��o");
		System.out.println("( / ) Divis�o");
		sc.hasNextLine();
		char op = sc.next().charAt(0);
		System.out.println("Entre com o segundo n�mero da opera��o: ");
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
			System.out.println("Opera��o inv�lida!");
		}
		
		
		sc.close();

		
	}
}