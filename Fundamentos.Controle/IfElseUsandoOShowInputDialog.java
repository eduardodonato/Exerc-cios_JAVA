package fundamentos.Controle;

import javax.swing.JOptionPane;

public class IfElseUsandoOShowInputDialog {
	public static void main(String[] args) {
		
// saber se o numero � par ou impar pelo resto da divis�o
		
		
		String valor = JOptionPane.showInputDialog( "Infome um numero: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			 System.out.println("Numero Par");
		}
			 else {
				 System.out.println("Numero Impar!"); 
			 }
		
	}

}
