/*******************************************************************************
* 30) Faça um programa para imprimir uma tabuada.

*******************************************************************************/

package fundamentos.Estudar;

import java.util.Scanner;

public class NumDe1A2000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Deseja tabuada de qual numero?");
		int N = sc.nextInt();
		
		for(int i = 0 ; i <=10 ; i++) {
			int res = N * i;
			System.out.printf("%d x %d = %d\n", N, i , res); 
		}
			
		
		sc.close();
		

	}

}

	


