package fundamentos.Estudar;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Existem duas maneiras de adicionar na fila

		// As diferen�as entre add e o Offer -> aparecer�o quando a fila estiver cheia

		// TIPO 1:

		fila.add("Ana"); // retorna false
		// TIPO 2:
		fila.offer("Bia"); // Seria uma fila com tamanho limitado, Caso nao consiga add lan�a uma exce�ao
		fila.add("Carlos");
		fila.add("Daniel");
		fila.add("Rfaela");
		fila.add("Gui");

		// Metodos para pegar um elemento da fila (2 metodos)
		// (peek e element) V�o diferir quando a fila estiver fazia
		System.out.println(fila.peek()); // Fila tando vazia aqui retornar� null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Fila tando vazia aqui retornar� uma exce��o
		System.out.println(fila.element());

		System.out.println();

		/*
		 ********** Outros Metodos para FILA 1- fila.size(); - responsavel por retornar o tamanho
		 * da fila 2- fila.clear(); - responsavel por apagar a fila 3- fila.isEmpty();
		 * -responsavel para dizer se a fila esta ou nao vazia 4- fila.contains(..) -
		 * responsavel para saber se um determinado elemento esta na fila
		 */
		System.out.println(fila.poll()); // Responsavel por retornar o 1 elemento da fila J� REMOVENDO-O, at� que s�
											// retornar� null
		System.out.println();

		System.out.println(fila.remove());// Responsavel por retornar o 1 elemento da fila SEM REMOVE-LO, at� que s�
											// retornar� uma exe��o

	}
}
