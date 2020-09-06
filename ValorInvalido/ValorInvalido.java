
/*Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inv�lido e continue pedindo at� que o
usu�rio informe um valor v�lido.*/
import java.util.Scanner;

public class ValorInvalido {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um valor entre 0 a 10: ");
		int valor = sc.nextInt();
		
		if(valor < 0 && valor > 10) {
			System.out.println("Valor invalido, tente novamente: ");
			valor = sc.nextInt();
			
		}
		else {
			System.out.println("O valor digitado foi  " + valor);
		}

		sc.close();
	}

}
