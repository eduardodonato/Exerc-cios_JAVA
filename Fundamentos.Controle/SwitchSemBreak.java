package fundamentos.Controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "laranja";
		
		switch (faixa.toLowerCase()) { // para nao precisar se preocupar com maiuscula ou minuscula
		//Para cada cor de faixa eseprada colocaremos um caso diferente para ser tratado:
		case "preta":
			System.out.println("Mais perigoso / negão");
		case "marrom": 
			System.out.println("Segundo mais perigoso");
		
		case "roxa":
			System.out.println("Cara de trouxa");
		case "verde":
			System.out.println("Esperançoso");
		case "laranja":
			System.out.println("cravo");
		default: 
			System.out.println("sabe de nada");
	// como não tem um break quando entra no primeiro caso ele imprimirá todos os outros abaixo		 
		}

	}
}

