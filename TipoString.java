package fundamentos;

public class TipoString {
	public static void main(String[] args) {

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s +"!!!");
		System.out.println(s.startsWith("Boa"));                //A frase "Boa tarde" inicia com Boa??? Resposta ser� true 
		System.out.println(s.toLowerCase().startsWith("boa"));  // O correto aqui era dar "false" pois a frase inicia com "B" maiusculo. Contudo o 
															    //"toLowerCase transformar� tudo em minusculas 
		
		System.out.println(s.endsWith("tarde"));                // perguntando se a frase termina com "tarde",o resultado ser� false,
																//pois termina com !!
		
		System.out.println(s.equals("boa tarde"));               // comparando se � igual
		System.out.println(s.equalsIgnoreCase("boa tarde"));    // aqui ele ignorar� as letras maiusculas e minusculas 
	
		var nome = "Eduardo";
		var idade = 33; 
		var sobrenome = "Almeida Donato";
		
		System.out.println("O senhor: " + nome + "\nSobrenome: " + sobrenome + "\npossui " + idade + " anos" );
		System.out.println(" \n \n \n");
		
		String frase = String.format("O senhor: " + nome + "\nSobrenome: " + sobrenome + "\npossui " + idade + " anos");
		System.out.println(frase);                             // jogou toda a frase para dentro da variavel "frase"
		
		System.out.println(" \n \n \n");
		
		System.out.println("frase qualquer".contains("qual")); // verifica se existe a palavra "qual" dentro de "frase qualquer" 
		System.out.println("frase qualquer".indexOf("qual"));  //qual o incide da posi��o "qual" dentro da "frase qualquer". Lembra que ele conta 
															   // a partir do 0 zero.
		
		System.out.println("frase qualquer".substring(6));    // imprime a partir da 6 letra
		System.out.println("frase qualquer".substring(6,8));    // imprime a partir da 6 letra at� a 7 

	
	}

}
