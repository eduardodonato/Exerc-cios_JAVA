//Lifo - last in first out
package fundamentos.Estudar;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		 
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe");
		livros.push("O mar");  //Push retornar� uma exce��o caso o elemento q vc tentou add n�o for possivel por restri��o de capacidade 
		livros.push("Don quixote");
		
		//Metodos para imprimir
		System.out.println(livros.peek()); //Imprimir� o ultipo a entrar
		System.out.println(livros.element());
		
		//metodos para remover
		
		System.out.println();
		System.out.println(livros.poll()); // vai removendo 1 por 1 de acordo com a entrada (retorna null caso n�o ache mais nada, os outros retornam uma exce��o 
		System.out.println(livros.remove());
		System.out.println(livros.pop());
		
		
		/*livros.size());
		 * livros.clear());
		 livros.contains(o));
		 livros.isEmpty()  / pergunta se esta vazia (se sim true) se nao (false)
		*/
	}

}
