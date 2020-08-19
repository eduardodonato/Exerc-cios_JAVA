package fundamentos.Estudar;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VetorParte2FEITOcomMAP {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos produtos deseja acrescentar: ");
		int n = sc.nextInt();

		Map<String, Double> produto = new HashMap<>(n);

		for (int i = 0; i < n; i++) {
			System.out.println("Entre com o nome do produto: ");
			String chave = sc.next();
			

			System.out.println("Entre com o valor do produto: ");
			double values = sc.nextDouble();

			produto.put(chave, values);

		}

		double precoMedio = 0;

		for (double p : produto.values()) {
			precoMedio += p / n;

		}

		System.out.println(precoMedio);
		System.out.println();

		sc.close();

	}

}