//Programa s� para quando voce digitar a palavra "sair"
package fundamentos.Estudar;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) throws Exception {
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a palavra m�gica?");
		String senha = sc.next();

		while (!senha.equalsIgnoreCase("Abracadabra")) {
			System.out.println("Voc� digitou a senha errada!");
			if(contador >= 3){
			throw new Exception("N�mero maximo permitido de tentativas");
			}
			
			System.out.println("Tente novamente...");
			senha = sc.next();
			contador++;
			}
		

		System.out.println("Parab�ns!!! Voc� acertou o enigma da palavra e poder� sair desse programa. Adeus!");
		System.out.printf("Voc� precisou de %d chances para acertar!", contador);

		sc.close();

	}
}