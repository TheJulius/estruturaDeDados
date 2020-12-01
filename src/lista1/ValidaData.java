package lista1;

public class ValidaData {
	
	 public static boolean isDataValida(int dia, int mes, int ano) {
		 //fe no pai, que o codigo sai kkkk
		 
		 if((mes <= 0 && mes > 12) && (dia <= 0 || dia > 31) && (ano <= 1 || ano > 2021) ) {
			 return false;
		 } else {
			 if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
				 return false;
			 }else {
				 if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 31 || dia >= 0)) {
					 return false;
				 } else {
					 if((ano % 400 != 0) && (mes == 2) && (dia > 28)) {
						 return false;
					 }else {
						 if ((mes == 2) && (dia > 29)) {
							 return false;
						 } else {
							 return true;
						 }
					 }
					 
				 }
				 
			 }
		 }
	 }
	 
	 public static boolean ValidaDataString(String data) {
		 
		 String[] dataExploded = data.split("/", 4);
		 
		 int dia = Integer.parseInt(dataExploded[0]);
		 
		 int mes = Integer.parseInt(dataExploded[1]);
		 
		 int ano = Integer.parseInt(dataExploded[2]);
		 
		 if(!isDataValida(dia, mes, ano)) {
			 return false;
		 } else {
			 return true;
		 }
	 }
	 
	 public static String EscreveData(String data) {
		 
		 String[] dataExploded = data.split("/", 4);
		 
		 int dia = Integer.parseInt(dataExploded[0]);
		 
		 int mes = Integer.parseInt(dataExploded[1]);
		 
		 int ano = Integer.parseInt(dataExploded[2]);
		 
		 switch (mes) {
		  case 1:
		    return  dia + " de Janeiro de " + ano;
		  case 2:
			return  dia + " de Fevereiro de " + ano; 	
		  case 3:
			return  dia + " de Março de " + ano; 	
		  case 4:
			return  dia + " de Abril de " + ano; 	
		  case 5:
			return  dia + " de Maio de " + ano; 	
		  case 6:
			return  dia + " de Junho de " + ano; 	
		  case 7:
			return  dia + " de Julho de " + ano; 	
		  case 8:
			return  dia + " de Agosto de " + ano; 
		  case 9:
			return  dia + " de Setembro de " + ano; 	
		  case 10:
			return  dia + " de Outubro de " + ano;	
		  case 11:
			return  dia + " de Novembro de " + ano; 	
		  case 12:
			return  dia + " de Dezembro de " + ano; 
		  default:
			return  dia + " de fevereiro de " + ano;
		}
	 }
 
}
