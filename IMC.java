package fundamentos.Exercicios;

import java.util.Scanner;

public class IMC {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Entre com o seu peso: ");
	 double peso = sc.nextDouble();
	 System.out.println("Entre com sua altura: ");
	 double altura = sc.nextDouble();
	 
	 double res = (peso / (altura * altura));
	 System.out.print("IMC = " + res);
	 sc.close();
	 
	 
	 
}
}
