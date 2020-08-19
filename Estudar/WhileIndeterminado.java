//Programa só para quando voce digitar a palavra "sair"
package fundamentos.Estudar;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) throws Exception {
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a palavra mágica?");
		String senha = sc.next();

		while (!senha.equalsIgnoreCase("Abracadabra")) {
			System.out.println("Você digitou a senha errada!");
			if(contador >= 3){
			throw new Exception("Número maximo permitido de tentativas");
			}
			
			System.out.println("Tente novamente...");
			senha = sc.next();
			contador++;
			}
		

		System.out.println("Parabéns!!! Você acertou o enigma da palavra e poderá sair desse programa. Adeus!");
		System.out.printf("Você precisou de %d chances para acertar!", contador);

		sc.close();

	}
}