//Lifo - last in first out
package fundamentos.Estudar;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		 
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe");
		livros.push("O mar");  //Push retornará uma exceção caso o elemento q vc tentou add não for possivel por restrição de capacidade 
		livros.push("Don quixote");
		
		//Metodos para imprimir
		System.out.println(livros.peek()); //Imprimirá o ultipo a entrar
		System.out.println(livros.element());
		
		//metodos para remover
		
		System.out.println();
		System.out.println(livros.poll()); // vai removendo 1 por 1 de acordo com a entrada (retorna null caso não ache mais nada, os outros retornam uma exceção 
		System.out.println(livros.remove());
		System.out.println(livros.pop());
		
		
		/*livros.size());
		 * livros.clear());
		 livros.contains(o));
		 livros.isEmpty()  / pergunta se esta vazia (se sim true) se nao (false)
		*/
	}

}
