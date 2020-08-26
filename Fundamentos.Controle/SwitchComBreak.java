package fundamentos.Controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner(System.in);
		System.out.println("Informe a nota: ");
		
		String conceito = "";
		int nota = entrada.nextInt();
		
		switch (nota) {
		
		case 10: case 9:
			conceito = "A";
			break;
					
			
		case 8: case 7:
			conceito = "B";
			break;
		
		case 6: case 5:
			conceito = "C";
			break;
			
		case 4: case 3:
			conceito = "D";
			break;
			
		case 2: case 1: case 0:
			conceito = "E";
			break;
		
		default:
				conceito = "Não encontrado!";
				break; //como esse é o ultimo ele nao precisa desse break.args A nao ser que vc 
				       // nao o coloque na ultima posiçao
		}
			
					
			System.out.println("Conceito é " + conceito);
			
			entrada.close();
	}
	

}
