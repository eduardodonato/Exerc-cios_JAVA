import java.util.Scanner;

/*Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o
aceite a senha igual ao nome do usu�rio, mostrando uma mensagem
de erro e voltando a pedir as informa��es.*/
public class UsuarioEsenha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Insira uma senha: ");
		String senha = sc.nextLine();

		while (senha.equalsIgnoreCase(nome)) {
			System.out.println("Sua senha n�o pode ser igual ao seu nome!");
			System.out.println("Favor digitar uma senha diferente: ");
			nome = sc.nextLine();
		}

		System.out.println("Senha aceita!");

		sc.close();
	}

}
