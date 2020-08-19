// Programa para adicionar ou remover unidade (hora, minuto, dia) a uma data  


package fundamentos.Estudar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoDatas {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date DATA1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(DATA1));
		
		Calendar NOMEQQ = Calendar.getInstance();
		
		NOMEQQ.setTime(DATA1);
		// nomeei a operação de NOMEQQ, chamei a operação setTime e passe a minha data
		// q ta com o nome de DATA1 como parametro
		
		NOMEQQ.add(Calendar.HOUR_OF_DAY, 4);
		// Na linha acima, chamamos calendario e adicionamos "hora do dia" e
		//somamos 4 horas a ela 
		
		
		
		DATA1 = NOMEQQ.getTime();
		
		//chamando a função
		
		System.out.println(sdf.format(DATA1));

	}

}
