
package exercicios;

import java.util.Scanner;

public class OperadoresAritmeticos {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print(" Digite  o primeiro n�mero: ");
		int a = entrada.nextInt();
		System.out.print(" Digite  o segundo n�mero: ");
		int b = entrada.nextInt();

		int soma = a + b;
		int mult = a * b;
		int div = a / b;
		int sub = a - b;

		System.out.println("O resultado da soma dos numeros " + a + " e " + b + " � : " + soma);
		System.out.println("O resultado da multiplica��o dos numeros " + a + " e " + b + " � : " + mult);
		System.out.println("O resultado da divis�o dos numeros " + a + " e " + b + " � : " + div);
		System.out.println("O resultado da subtra��o dos numeros " + a + " e " + b + " � : " + sub);

		entrada.close();
	}

}