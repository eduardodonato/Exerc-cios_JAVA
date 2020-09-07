import java.util.Scanner;

/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/
public class ValidacaoDeDados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira seu nome: ");
		String nome = sc.nextLine();
		while (nome.length() <= 3) {
			System.out.println("Insira um nome maior: ");
			nome = sc.nextLine();
		}

		System.out.println("Insira sua idade: ");
		int idade = sc.nextInt();
		while (idade < 0 || idade > 150) {
			System.out.println("Insira uma idade válida: ");
			idade = sc.nextInt();
		}
		System.out.println("Insira seu salário: ");
		double salario = sc.nextDouble();
		while (salario < 0) {
			System.out.println("Insira um salario válido: ");
			salario = sc.nextDouble();
		}
		System.out.println("Insira seu sexo: (m/f)");
		char sexo = sc.next().charAt(0);
		while (sexo != 'M' && sexo != 'F') {
			System.out.println("O caractere informado esta incorreto. Favor inserir: SEXO: (M/F): ");
			sexo = sc.next().charAt(0);
		}
		System.out.println("Insira seu estado civil: 's', 'c', 'v', 'd'");
		char eCivil = sc.next().charAt(0);
		while (eCivil != 's' && eCivil != 'c' && eCivil != 'v' && eCivil != 'd') {
			System.out.println(
					"O caractere informado esta incorreto. Favor inserir dentre as opções: 's', 'c', 'v', 'd'");
			eCivil = sc.next().charAt(0);
		}

		System.out.println("Nome inserido com sucesso!");
		System.out.println("Idade inserida com sucesso!");
		System.out.println("Salario inserido com sucesso!");
		System.out.println("Sexo inserido com sucesso!");
		System.out.println("Estado civil inserido com sucesso!");
		sc.close();
	}
}
