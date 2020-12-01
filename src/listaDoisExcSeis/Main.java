package listaDoisExcSeis;

public class Main {

	public static void main(String[] args) {
		
		ListaDupla ld1 = new ListaDupla();
		ld1.inserirInicio(1);
		ld1.inserirInicio(2);
		ld1.inserirInicio(3);
		ld1.inserirInicio(4);
		ld1.inserirInicio(5);
		
		ld1.mostrarLista();
		
		ListaDupla ld2 = new ListaDupla();
		ld2.inserirInicio(6);
		ld2.inserirInicio(7);
		ld2.inserirInicio(8);
		
		ld2.mostrarLista();
		
		System.out.println("////////");
		
		ld1.concatenarListas(ld1,ld2);
		
		ld1.mostrarLista();
	}

}
