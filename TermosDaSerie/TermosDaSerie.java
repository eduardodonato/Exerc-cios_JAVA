import java.util.Scanner;

/*Fa�a um programa que mostre os n termos da S�rie a seguir:
o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
Imprima no final a soma da s�rie.*/
public class TermosDaSerie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerador = 0;
		int denominador = -1;
		System.out.println("At� que n�mero quer que rode: ");
		int n = sc.nextInt();
		while (numerador < n) {
			numerador = numerador + 1;
			denominador = denominador + 2;
			System.out.println(numerador + " / " + denominador);

		}
		sc.close();
	}

}
