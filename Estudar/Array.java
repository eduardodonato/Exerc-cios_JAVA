package fundamentos.Estudar;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];

		// Primeira maneira de inserir dados no array:
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		System.out.println(Arrays.toString(notasAlunoA));

		double totalAlunoA = 0;

		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA = totalAlunoA + notasAlunoA[i];
		}

		System.out.println(totalAlunoA / notasAlunoA.length);

		// SEGUNDA maneira de inserir dados no array:
		double totalAlunoB = 0;
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };

		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB = totalAlunoB + notasAlunoB[i];
		}

		System.out.println(totalAlunoB / notasAlunoB.length);

	}

}
