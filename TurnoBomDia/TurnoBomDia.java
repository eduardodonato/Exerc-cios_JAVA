import java.util.Scanner;

/*Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inv�lido!", conforme o caso.*/
public class TurnoBomDia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Em qual turno voc� estuda: " + "\nM - Matutino" + "\nV - Vespertino" + "\nN - Noturno");

		String op = sc.nextLine();

		if (op.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		} else if (op.equalsIgnoreCase("V")) {
			System.out.println("Noa tarde!");
		} else {
			System.out.println("Boa noite!");
		}

		sc.close();
	}

}
