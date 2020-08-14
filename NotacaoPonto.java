package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3;                     // double é tipo primitivo, por isso fica roxo
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhor");      // essa fuçao trocará o "X" pelo "Senhor"
		s = s.toUpperCase();               // essa função servirá para colocar todas as letras maiusculas 
		s = s.concat("!!!");               // mesma função do "+" concatena´ra as "!!!" ao final da frase  
		
		System.out.println(a);
		System.out.println(s);            /* aqui só poderá imprimir resultados do tipo string, se colocar para imprimir o "a" dará erro.
		                                     contudo, poderá concatenar varias dessas funções na mesma linha do print (sendo todos do mesmo tipo,
		                                     exemplo String */ 
		 
		
	}

}
