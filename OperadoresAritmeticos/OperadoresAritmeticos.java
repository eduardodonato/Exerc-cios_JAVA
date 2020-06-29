
package exercicios;

import java.util.Scanner;

public class OperadoresAritmeticos {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print(" Digite  o primeiro número: ");
		int a = entrada.nextInt();
		System.out.print(" Digite  o segundo número: ");
		int b = entrada.nextInt();

		int soma = a + b;
		int mult = a * b;
		int div = a / b;
		int sub = a - b;

		System.out.println("O resultado da soma dos numeros " + a + " e " + b + " é : " + soma);
		System.out.println("O resultado da multiplicação dos numeros " + a + " e " + b + " é : " + mult);
		System.out.println("O resultado da divisão dos numeros " + a + " e " + b + " é : " + div);
		System.out.println("O resultado da subtração dos numeros " + a + " e " + b + " é : " + sub);

		entrada.close();
	}

}