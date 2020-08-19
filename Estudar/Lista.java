package fundamentos.Estudar;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		
		
		//Pode ser decladaro o Array list de dois tipo
		// tipo 1 :
		
		//ArrayList<UsuarioParaLista> lista = new ArrayList<>() ;
		
		// tipo 2:
		List<UsuarioParaLista> lista = new ArrayList<>() ;
		
		
		
		UsuarioParaLista u1 = new UsuarioParaLista("Ana");
		
		lista.add(u1);
		lista.add(new UsuarioParaLista("Carlos"));
		lista.add(new UsuarioParaLista("Lia"));
		lista.add(new UsuarioParaLista("Bia"));
		lista.add(new UsuarioParaLista("Cecilia"));
		
		//Imprimira conforme a ordem de inser��o
		for (UsuarioParaLista x : lista ) {
			System.out.println(x);
		}
		
		//Para obter um elemento atraves de um Id.: 
		//Obs. Para funcionar tive que implementar o metodo toString na classe UsuarioParaLista
		System.out.println();
		System.out.println(lista.get(3));
		
		//Para remover:
		
		lista.remove(1);
		System.out.println();
		for (UsuarioParaLista x : lista ) {
			System.out.println(x);
		}
		
		//Outro forma de remover � atraves de um objeto: A saida dele sera apenas "true" afirmando que foi feita a remo��o
		/*
		 System.out.println();
		 
		System.out.println(lista.remove(new UsuarioParaLista("Cecilia")));
		for (UsuarioParaLista x : lista ) {
			System.out.println(x);
		}
		*/
		//Contudo caso deseja que retorne (n�o verdadeiro ou falso) mas que retorne o objeto que vc excluiu, faz assim:
		
		System.out.println();
		
		/*atente que na linha de baixo quando colocar o lista.rem... vai abrir varias op�oes dentre elas a op��o de boolen
		que retornar� apenas verdadeiro ou falso, mas nesse caso temos que escolher o op��o que ele aceita um inteiro 
		(que � o indice dentro da lista) e retornar� um usuario*/  
		
		System.out.println("Removido --->" + lista.remove(1));
		for (UsuarioParaLista x : lista ) {
			System.out.println(x);
		}
		
		//Para saber se tem ou nao alguem na lista faz assim: 
		System.out.println();;
		System.out.println("Tem...?  --> " + lista.contains(new UsuarioParaLista("Bia"))); 
		
		for (UsuarioParaLista x : lista ) {
			System.out.println(x);
		}
		
		
		
	}

}
