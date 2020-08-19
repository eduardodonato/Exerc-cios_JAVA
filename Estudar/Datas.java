package fundamentos.Estudar;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Datas {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat tipo1 = new SimpleDateFormat ("dd/MM/YY"); 
		SimpleDateFormat tipo2 = new SimpleDateFormat ("dd/MM/YY HH:mm:ss");
		
		Date a1 = tipo1.parse("18/05/2020");
		Date a2 = tipo2.parse("18/05/2020 00:35:05");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		Date x3 = Date.from(Instant.parse("2020-05-18T01:05:00Z"));
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println("**************************************");
		 
		System.out.println("a1: " + tipo2.format(a1));
		System.out.println("a2: " + tipo2.format(a2));
		
		System.out.println("**************************************");
		
		System.out.println("X1: " + tipo2.format(x1));
		System.out.println("X2: " + tipo2.format(x2));
		
		System.out.println("**************************************");
		System.out.println("X3: " + tipo2.format(x3));
	}

}
