/*Ler o nome de 2 times e o número de gols marcados na partida (para 
cada time). Escrever o nome do vencedor.  Caso não haja vencedor 
deverá ser impressa a palavra EMP ATE. */

package exercicios2;

import java.util.Scanner;

public class ResultadoFutebol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva o nome do time: ");
		String Time1 = sc.next();
		System.out.println("Escreva o nome do outro time: ");
		String Time2 = sc.next();
		
		System.out.println("Quantos gols o time " + Time1 + " marcou?: ");
		int GolsTime1 = sc.nextInt();
		
		
		System.out.println("Quantos gols o time " + Time2 + " marcou?: ");
		int GolsTime2 = sc.nextInt();
		
		if (GolsTime1 > GolsTime2) {
			System.out.println(Time1 + " Ganhou!");
		}
		else if(GolsTime1 == GolsTime2) {
			System.out.println("JOGO EMPATADO!");
		}
		else {
			System.out.println("Vitória do " + Time2 + "!");
		}
	
		sc.close();

	}

}
