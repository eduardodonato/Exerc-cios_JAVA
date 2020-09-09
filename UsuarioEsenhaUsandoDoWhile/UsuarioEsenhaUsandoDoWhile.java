
/*
 * Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a
 * senha igual ao nome do usu�rio, mostrando uma mensagem de erro e voltando a
 * pedir as informa��es.
 */
import java.util.Scanner;

public class UsuarioEsenhaUsandoDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Insira uma senha: ");

		String senha = sc.nextLine();

		while (nome.equalsIgnoreCase(senha)) {
			System.out.println("Insira uma senha diferente do seu nome: ");
			senha = sc.nextLine();
		}
		sc.close();
	}
}
