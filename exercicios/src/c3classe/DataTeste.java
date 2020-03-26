package c3classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		var data1 = new Data("26", "08", "2001");
		
//		data1.dia = "26";
//		data1.mes = "08";
//		data1.ano = "2001";
		
		var data2 = new Data("19", "10", "1981");
		
//		data2.dia = "19";
//		data2.mes = "10";
//		data2.ano = "1981";
	
//		System.out.printf("%s/%s/%s\n", data1.dia, data1.mes, data1.ano);
//		System.out.printf("%s/%s/%s", data2.dia, data2.mes, data2.ano);
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		
		var padrao = new Data();
		
		System.out.println(padrao.obterDataFormatada());
		
	}

}
