package listaDoisExcQuatro;

public class Main {

	public static void main(String[] args) {
		
		ListaDupla ld1 = new ListaDupla();
		ld1.inserirInicio(1);
		ld1.inserirInicio(2);
		ld1.inserirInicio(3);
		ld1.inserirInicio(5);
		
		ListaDupla ld2 = new ListaDupla();
		ld2.inserirInicio(3);
		ld2.inserirInicio(4);
		ld2.inserirInicio(5);
		
		
		ld1.mostrarLista();
		
		ld2.mostrarLista();
		
		ld1.mostrarUniaoListas(ld2);
		
		ld1.mostrarDiferencaListas(ld2);
		
		ld1.mostrarIntersexListas(ld2);
		
	}
}
