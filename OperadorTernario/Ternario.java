package fundamentos;

public class Ternario {
	public static void main(String[] args) {
		
		
		double media = 5.6;
		//String resultadoParcial = media >=5.0 ? "em recuperação. " : "Reprovado.";
		String resultadoFinal = media >= 7.0? "Aprovado." : "em ecuperação.";
		System.out.println("O ALUNO ESTÁ " + resultadoFinal);
		
	}

}
