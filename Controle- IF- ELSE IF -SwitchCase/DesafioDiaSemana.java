package fundamentos.Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digie o nome do dia da semana... ");
		String dia = entrada.next();

		if (dia.equals("domingo")) {
			System.out.println(1);
		}

		// ou if(dia.equalsIgnoreCase("domingo"){

		else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (dia.equalsIgnoreCase("terça")) {
			System.out.println(3);
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		} else if (dia.equalsIgnoreCase("Sabado")) {
			System.out.println(7);
		}

		entrada.close();
	}
}
