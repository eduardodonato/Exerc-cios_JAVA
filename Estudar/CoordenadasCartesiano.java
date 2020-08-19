/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada 
 * de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. 
 * O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA 
 * (nesta situação sem escrever mensagem alguma).*/

package fundamentos.Estudar;

import java.util.Scanner;

public class CoordenadasCartesiano {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a coordenada de X ");
		double x = sc.nextDouble();
		System.out.println("Informe a coordenada de X ");
		double y = sc.nextDouble();
		
		if ( x < 0 && y > 0 ) {
			System.out.println("Quadrante 1");
		}
		else if ( x > 0 && y > 0 ) {
			System.out.println("Quadrante 2");
		}
		else if ( x < 0 && y < 0 ) {
			System.out.println("Quadrante 3");
		}				
		else if ( x > 0 && y < 0 ) {
			System.out.println("Quadrante 4");
		}
		else if ( x == 0 && y == 0 ) {
			System.out.println("Origem");
		}
	
		
		sc.close();
	}
}
