/*Ler 3 valores (A, B e C) representando as med idas dos lados de um 
tri�ngulo e escrever se formam  ou n�o um tri�ngulo. 
OBS: para formar um tri�ngulo, o valor de cada lado deve ser 
menor que a soma dos outros 2  lados. */

package exercicios2;

import java.util.Scanner;

public class FormaTriangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as 3 medidas do triangulo: ");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
	
		if (A + B <= C) {
			System.out.println("Pode ser um triangulo");
		}
		else if( A + C <= B)
			System.out.println("Pode ser um triangulo");
		
		else if (B + C <= A) {
		System.out.println("Pode ser um triangulo");
		}
		else {
			System.out.println("N�O pode ser um triangulo");
		sc.close();
		}
	
 }
}