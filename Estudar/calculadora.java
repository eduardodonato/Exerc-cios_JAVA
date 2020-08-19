package fundamentos.Estudar;

import java.util.Scanner;

public class calculadora {
 public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Informe um numero: ");
	double num1 =  entrada.nextDouble();
	
	System.out.println("Informe a operação: ");
	String op =  entrada.next();
	
	System.out.println("Informe outro numero: ");
	double num2 =  entrada.nextDouble();
	
	
	
	
	
	double resultado = "+".equals(op) ? num1 + num2  : 0 ;
	//se "+" for igual a variavel op , pegue os dados de num1 e num 2, caso contrario o resultado é zero
	
	resultado = "-".equals(op) ? num1 - num2  : resultado ;
	resultado = "/".equals(op) ? num1 / num2  : resultado ;
	resultado = "*".equals(op) ? num1 * num2  : resultado ;
	resultado = "%".equals(op) ? num1 % num2  : resultado ;
	
	
	System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado );
	entrada.close();
 
	 
	 
	 
}
}
