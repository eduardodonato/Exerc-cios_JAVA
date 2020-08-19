package fundamentos.Estudar;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Existem duas maneiras de adicionar na fila

		// As diferenças entre add e o Offer -> aparecerão quando a fila estiver cheia

		// TIPO 1:

		fila.add("Ana"); // retorna false
		// TIPO 2:
		fila.offer("Bia"); // Seria uma fila com tamanho limitado, Caso nao consiga add lança uma exceçao
		fila.add("Carlos");
		fila.add("Daniel");
		fila.add("Rfaela");
		fila.add("Gui");

		// Metodos para pegar um elemento da fila (2 metodos)
		// (peek e element) Vão diferir quando a fila estiver fazia
		System.out.println(fila.peek()); // Fila tando vazia aqui retornará null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Fila tando vazia aqui retornará uma exceção
		System.out.println(fila.element());

		System.out.println();

		/*
		 ********** Outros Metodos para FILA 1- fila.size(); - responsavel por retornar o tamanho
		 * da fila 2- fila.clear(); - responsavel por apagar a fila 3- fila.isEmpty();
		 * -responsavel para dizer se a fila esta ou nao vazia 4- fila.contains(..) -
		 * responsavel para saber se um determinado elemento esta na fila
		 */
		System.out.println(fila.poll()); // Responsavel por retornar o 1 elemento da fila JÁ REMOVENDO-O, até que só
											// retornará null
		System.out.println();

		System.out.println(fila.remove());// Responsavel por retornar o 1 elemento da fila SEM REMOVE-LO, até que só
											// retornará uma exeção

	}
}
