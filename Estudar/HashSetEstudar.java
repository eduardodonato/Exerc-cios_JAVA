package fundamentos.Estudar;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEstudar {

	// Quando aparece uns erros (grifos amarelos (apaerta CTRL + 1 e utiliza a opçao
	// de SuppressWarnings
	@SuppressWarnings({ "rawtypes", "unchecked" })

	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		// Collections não suportam tipos primitivos, assim ele tira converter
		conjunto.add(1.2); // Aqui ele converte de double para Double
		conjunto.add(true); // boolean --> Boolean
		conjunto.add("Teste");
		conjunto.add(1); // int --> Integer
		// conjunto.add('x');

		System.out.println("Tamanho = " + conjunto.size());

		conjunto.add("teste"); // como é igual a um elemnto q já tem, o conjunto ficará do mesmo tamanho

		System.out.println("Tamanho = " + conjunto.size());

		System.out.println(conjunto.remove("teste"));
		System.out.println("Tamanho = " + conjunto.size());

		System.out.println(conjunto.contains(1.2));
		System.out.println(conjunto.contains(5));

		// pode ser feito da maneira abaixo tb

		Set numeros = new HashSet();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		System.out.println(numeros);
		System.out.println(conjunto);

		// para fazer a uniao entre os conjuntos

		conjunto.addAll(numeros);
		System.out.println(conjunto);

		// par fazer a intercesao

		conjunto.retainAll(numeros);
		System.out.println(conjunto);

		// para limapr o conjunto

		conjunto.clear();
		System.out.println(conjunto);

		// ***************************************************************************

		/*
		 * Existem duas maneiras de se usar um HashSet; 1- Colocando varios tipos dentro
		 * dessa lista 2- Identificando o tipo que ira ser colocado e assim nao
		 * permitindo a inclusao de outros
		 * 
		 * exemplos dos dois tipos abaixo
		 */

		// Tipo 1: Lista com varios tipos:

		Set QualquerNome = new HashSet();

		// Tipo 2: Lista com obrigatoriamente 1 tipo

		Set<String> lista = new HashSet<String>();
		// Ou apenas
		Set<String> lista2 = new HashSet<>();
		// Sem ser necessario colocar o tipo "String" 2 vezes

		System.out.println();

		Set<String> candidatos = new HashSet<>();
		candidatos.add("Ana");
		candidatos.add("Carlos");
		candidatos.add("Lucca");
		candidatos.add("José");
		candidatos.add("Lucca");
		for (String x : candidatos) {
			System.out.println(x);
		}

		// Dessa maneira será impresso a lista dos candidados, NÃO NA ORDEM QUE ESTA AI
		// EM CIMA
		// Para que seja impresso na ordem em que foi inserido, bem como evitar
		// duplicação, usa-se um TreeSet
		// Tnato o TreeSet como o HashSet deve ser importada as bibliotecas, vide acima
		Set<String> candidatos2 = new TreeSet<>();
		candidatos2.add("Ana2");
		candidatos2.add("Carlos2");
		candidatos2.add("Lucca2");
		candidatos2.add("José2");
		candidatos2.add("Ana2");

		System.out.println();
		for (String y : candidatos2) {
			System.out.println(y);
		}

		// De igual modo, caso queria criar uma coleção, nao podemos usar tipos
		// primitivos (Dara errro) Exemplo

		// Set <int> numeros = new HashSet<>();

		// para criar a lista de inteiros devemos usar

		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		System.out.println();
		for (Integer x : nums)
			System.out.println(x);

	}

}
