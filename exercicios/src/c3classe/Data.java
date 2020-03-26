package c3classe;

public class Data {
	
	String dia;
	String mes;
	String ano;
	
	String obterDataFormatada() {
		return String.format("%s/%s/%s", dia, mes, ano);
	}
	
	Data (String dia, String mes, String ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data () {
		dia = "01";
		mes = "01";
		ano = "1970";
	}

}
