import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Entre com o valor da temperatura em grau Celsius: ");
		double C = sc.nextDouble();
		double F=(9* C+160) / 5;
		
		System.out.println(" A temperatura convertida para Fahrenheit é:" +F);
		
		sc.close();	
		
		
	}

}
