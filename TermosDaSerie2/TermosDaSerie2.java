import java.util.Scanner;

/*Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Fa�a um programa que
calcule o valor de H com N termos.
*/
public class TermosDaSerie2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("At� que n�mero quer que rode: ");
		int n = sc.nextInt();
		int numerador = 1;
		int denominador = 1;
		double resultado = 0;

		while (denominador < n) {
			denominador = denominador + 1;
			System.out.println(numerador + " / " + denominador);
			resultado = resultado + numerador / denominador;

		}
		System.out.println("O resultado total �: " + resultado);

		sc.close();
	}

}
