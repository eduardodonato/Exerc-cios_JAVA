package fundamentos.Estudar;

import java.util.Scanner;

public class DesafioMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre a quantidade de linhas: ");
		int L = sc.nextInt();
		System.out.println("Entre com a quantidade de colunas: ");
		int C = sc.nextInt();
		int[][] Matriz = new int[L][C];

		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz[i].length; j++) {
				Matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Entre com o numero que deseja pesquisar: ");
		int X = sc.nextInt();

		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz[i].length; j++) {
				if (Matriz[i][j] == X) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + Matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + Matriz[i - 1][j]);
					}
					if (j < Matriz[i].length - 1) {
						System.out.println("Right: " + Matriz[i][j + 1]);
					}
					if (i < Matriz.length - 1) {
						System.out.println("Down: " + Matriz[i + 1][j]);
					}
				}

			}
		}
		sc.close();
	}
}
