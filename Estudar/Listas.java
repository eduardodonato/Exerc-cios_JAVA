package fundamentos.Estudar;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Listas {

	public static void main(String[] args) {
	
		List <String> list = new ArrayList<>();
		                //na linha acima deu o nome da lista de list
		list.add("Maria");
		list.add("Alex");		
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");   //Adicionando Marco já na posição 2 da lista
	
		System.out.println(list.size()); //ver o tamanho da lista, no caso acima 5
	
		for (String x : list) {    ///For para imprimir a lista acima 
			System.out.println(x);
		}
		//list.remove("Anna"); //Remove um dado a partir da comparaçaõ de dados
		//list.remove(1); //Removera partir da posição 
		System.out.println("===================================");
		
		list.removeIf(x -> x.charAt(0) == 'M');   //Remove todo mundo que começa com a letra "M"
		//x -> x.charAt(0) == 'M' ---- isso é uma função lambida
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("===================================");
		System.out.println("Index of Bob" + list.indexOf("Bob")); //IndexOf serve para localizar a posição de um elemanto. Ira imprimir "Index of Bob: 1" 
		System.out.println("Index of Marco" + list.indexOf("Marco"));//Ira imprimir "Index of Marco: -1
		
		
		System.out.println("===================================");
		List<String> result= list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());  //Filtra a lista para todo mundo q começa com "A"
		
		/*List<String> result= list.stream().filter(x -> x.charAt(0) == 'A')
		- > essa linha ira filtrar todos os elementos que começam com A e devolver uma nova lista só com esses elementos
		  
		- > .collect(Collectors.toList()); // Essa parte serve para voltar ele pra ser uma lista
			forma que o java 8 conseguiu para dar compatibilidade do Stream com List
		*/
		
			for (String x : result) {
				System.out.println(x);
			}
		
			System.out.println("===================================");
			
			String name  = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); 
			//Esse comando acima ele ira pegar o primeiro comando e procurar a letra J, se não achar ele retornará nulo
			System.out.println(name);
		
		
	
	}

}
