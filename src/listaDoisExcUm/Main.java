package listaDoisExcUm;

public class Main {

	public static void main(String[] args) {
		
		ListaDupla ld = new ListaDupla();
		
		ld.inserirInicio(1);
		ld.inserirInicio(2);
		ld.inserirInicio(3);
		ld.inserirInicio(4);
		
		System.out.println();
		System.out.println("A lista tem um total de " + ld.retornaTamanhoDaLista() + " nodos");
		
		ld.retornaTamanhoDaListaIgualQueVal(1);

	}

}
