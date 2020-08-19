package fundamentos.Estudar;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada (){
	
	return String.format("%d/%d/%d\n", dia, mes, ano);
	
	
	} 
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970; 
				
		
	}
	
	Data (int diaContrutor, int mesContrutor, int anoContrutor){
		dia = diaContrutor;
		mes = mesContrutor;
		ano = anoContrutor;
	}
	
	void imprimirDataFormatada () {
		System.out.print(obterDataFormatada() );
		
	}

}
