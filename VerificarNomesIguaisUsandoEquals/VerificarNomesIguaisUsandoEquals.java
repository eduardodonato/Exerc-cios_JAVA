/*Entrar com dois nomes e verificar se os dois são iguais, se sim mostrar 
mensagem "Nomes Iguais", senã o mostrar mensagem "Nomes 
Diferentes*/

package exercicios2;

import java.util.Scanner;

public class VerificarNomesIguaisUsandoEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String Nome1 = sc.next();
		
		System.out.println("Digite outro nome: ");
		String Nome2 = sc.next();
		
		if (!Nome1.equalsIgnoreCase(Nome2)){
			System.out.println("Nomes Diferentes!");
		}
			else {
				System.out.println("Nomes Iguais!");
				sc.close();
			}
		}
		
		
	}


