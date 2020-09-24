import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o número que você deseja ver a tabuada: ");
		int n = sc.nextInt();

		System.out.println("**********TABUADA DE " + n + " **********");
		int calc = 0;
		for (int i = 0; i <= 10; i++) {
			calc = n * i;
			System.out.println(n + " x " + i + " = " + calc);
		}

		sc.close();
	}
}
