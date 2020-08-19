package fundamentos.Estudar;

public class Foreach {
	public static void main(String[] args) {

		double[] notas = { 9.9, 8.7, 7.2, 9.4 };

		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}

		
		
		System.out.println();
		// Uso do foreach abaixo:

		for (double x : notas) {
			System.out.print(x + " ");
		}

	}

}
