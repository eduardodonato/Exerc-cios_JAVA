import java.util.Scanner;

/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/
public class UsuarioEsenha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Insira uma senha: ");
		String senha = sc.nextLine();

		while (senha.equalsIgnoreCase(nome)) {
			System.out.println("Sua senha não pode ser igual ao seu nome!");
			System.out.println("Favor digitar uma senha diferente: ");
			nome = sc.nextLine();
		}

		System.out.println("Senha aceita!");

		sc.close();
	}

}
