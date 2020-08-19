package fundamentos.Estudar;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapas {
	public static void main(String[] args) {
		
		
	//O map contem dois tipos Map<K, V> , dai substituiremos as letras K e V pelos tipos desejados... vejamos abaixo 
	 
	// assim :    Map<Integer, String> usuario = new HashMap<Integer, String>();  OU: 	
	 Map<Integer, String> usuario = new HashMap<>();
	 
	 usuario.put(1, "Roberto"); //Serve para incluir bem como incluir no lugar de outra coisa (Substituir)
	 usuario.put(1, "Ricardo");
	 usuario.put(20, "Ricardo");
	 usuario.put(3, "Rafaela");
	 usuario.put(1, "Rebeca");

	System.out.println(usuario.size());
	System.out.println("O mapa esta vazio? " + usuario.isEmpty());
	System.out.println(usuario.keySet()); //Retornara o conjunto das chaves, nesse caso os Integers AS MATRICULAS - EM ORDEM CRESCENTE
	System.out.println(usuario.values()); // ASSIM COMO O DE CIMA, PEGA APENAS OS VALORES, NO CASO DESSE PROGRAMA OS USUAIORS
	System.out.println(usuario.entrySet());  //Pega chave e valor ao mesmo tempo
	
	System.out.println();
	
	System.out.println("Contem a matricula de numnero 20? " + usuario.containsKey(20));
	System.out.println("Contem o usuario Rebeca? " + usuario.containsValue("Rebeca"));
	
	System.out.println();
	System.out.println(usuario.get(3)); //pegar um usuario pela sua chave
	
	System.out.println();
	
	//PARA REMOVER:
	
	System.out.println(usuario.remove(1));
	//possuimos outro tipo de usuario.remove onde pede a chave e o nome do elemento, se bater os dois ele remove, senao ele retornará falso, exemplo:
	
	
	System.out.println("O usuario de numero e registro removido? " + usuario.remove(20, "Bill")); //O resultado vai ser falso, pois o usuario q possui a chave 20 não se chama Bill 
	
	
	
	
	//Outra maneira de percorrer os valres e imprimir todos as chaves e/ou todos os usuarios pode-se usr um for
	
	
	for (int chave: usuario.keySet()) {  // FOR para imprimir as chaves
		System.out.println(chave);
	}
	System.out.println();
	for(String nomes : usuario.values()) {
		System.out.println(nomes);         // FOR para imprimir os nomes
	}
	
	for(Entry<Integer, String> usuario2: usuario.entrySet()) {//USANDO O ENTRY da biblioteca java.util.map (Azul). No lugar de usuario2 sera qq apelido
		System.out.print("Pegue a chave " + usuario2.getKey() + " ==> ");
		System.out.println("Pegue o usuario " + usuario2.getValue());
	}
	
	
	
	
	
	}
	

}
