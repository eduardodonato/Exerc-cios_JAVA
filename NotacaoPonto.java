package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3;                     // double � tipo primitivo, por isso fica roxo
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhor");      // essa fu�ao trocar� o "X" pelo "Senhor"
		s = s.toUpperCase();               // essa fun��o servir� para colocar todas as letras maiusculas 
		s = s.concat("!!!");               // mesma fun��o do "+" concatena�ra as "!!!" ao final da frase  
		
		System.out.println(a);
		System.out.println(s);            /* aqui s� poder� imprimir resultados do tipo string, se colocar para imprimir o "a" dar� erro.
		                                     contudo, poder� concatenar varias dessas fun��es na mesma linha do print (sendo todos do mesmo tipo,
		                                     exemplo String */ 
		 
		
	}

}
