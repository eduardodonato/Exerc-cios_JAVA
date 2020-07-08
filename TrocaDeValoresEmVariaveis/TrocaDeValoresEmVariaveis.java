/* Escrever uma programa em que leia dois  valores para as variáveis A e B, e 
efetuar as trocas dos valores de for ma que a variável A passe a possuir o valor 
da variável B e a variável B passe a possuir o  valor da variável A. Apresentar 
os valores trocados.  
 
Lembrando que temos que ter 3 vari áveis para que uma haja como variável 
de armazenamento, ou seja, par a evitar que o valor original de a se perca é 
necessário associar a uma outra variável (denominada usu almente de 
variável auxiliar) tal valor, estabel ecer uma associação de a com o valor em b 
e, por último, associar b ao valor "salvo" na variável auxili ar. /*/

package exercicios;

import java.util.Scanner;

public class TrocaDeValoresEmVariaveis {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor inteiro: ");
		int a = sc.nextInt();
		System.out.println("Entre com outro valor inteiro: ");
		int b = sc.nextInt();
		
		System.out.println("Você entrou com o valor de a = " + a);
		System.out.println("Você entrou com o valor de b = " + b);
		int aux = a;
		
		a = b;
		b = aux;
		System.out.println("O valor de a passa a ser =  " + a);
		System.out.println("O valor de b passa a ser =  " + b);
		
		
		
		sc.close();
		
	}
}
