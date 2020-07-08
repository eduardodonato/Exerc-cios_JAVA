/* Escrever uma programa em que leia dois  valores para as vari�veis A e B, e 
efetuar as trocas dos valores de for ma que a vari�vel A passe a possuir o valor 
da vari�vel B e a vari�vel B passe a possuir o  valor da vari�vel A. Apresentar 
os valores trocados.  
 
Lembrando que temos que ter 3 vari �veis para que uma haja como vari�vel 
de armazenamento, ou seja, par a evitar que o valor original de a se perca � 
necess�rio associar a uma outra vari�vel (denominada usu almente de 
vari�vel auxiliar) tal valor, estabel ecer uma associa��o de a com o valor em b 
e, por �ltimo, associar b ao valor "salvo" na vari�vel auxili ar. /*/

package exercicios;

import java.util.Scanner;

public class TrocaDeValoresEmVariaveis {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor inteiro: ");
		int a = sc.nextInt();
		System.out.println("Entre com outro valor inteiro: ");
		int b = sc.nextInt();
		
		System.out.println("Voc� entrou com o valor de a = " + a);
		System.out.println("Voc� entrou com o valor de b = " + b);
		int aux = a;
		
		a = b;
		b = aux;
		System.out.println("O valor de a passa a ser =  " + a);
		System.out.println("O valor de b passa a ser =  " + b);
		
		
		
		sc.close();
		
	}
}
