/* Programa que recebe N tamanhos referente a altura de pessoas e calcula a média entre elas. Usando Vetor*/

package fundamentos.Estudar;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a quantidade de alutras: ");
		int N = sc.nextInt();
		double[] VET = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Alimentar o vetor com dados: ");  //primeiro for para encrementar o vetor com as alturas inseridas
			VET[i] = sc.nextDouble();

		}

		double soma = 0  ;
		for (int i = 0; i < N; i++) { //segundo for para somar todas as posiçoes do vetor
			soma = soma + VET[i];
		}
		double media = soma /N;
		System.out.println(media);
		sc.close();
	}

}