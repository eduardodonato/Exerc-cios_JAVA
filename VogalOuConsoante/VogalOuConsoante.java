import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é vogal ou
consoante*/
public class VogalOuConsoante {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma letra: ");

		String[] vetor = new String[] { "a", "e", "i", "o", "u" };
		String letra = sc.nextLine();
		boolean eVogal = false;
		for (int i = 0; i < 4; i++) {
			if (letra.equalsIgnoreCase(vetor[i])) {
				eVogal = true;
			}
		}
		if (eVogal == true) {
			System.out.println("É vogal!");
		}
		else {
			System.out.println("É consoante!");
		}

		sc.close();
	}

}
