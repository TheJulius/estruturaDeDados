package listaDoisExcSete;

public class Main {

	public static void main(String[] args) {
		
		Lista l1 = new Lista();
		l1.inserirInicio(1);
		l1.inserirInicio(2);
		l1.inserirInicio(3);
		
		Lista l2 = new Lista();
		l2.inserirInicio(1);
		l2.inserirInicio(2);
		l2.inserirInicio(3);
		
		l1.mostrarLista();
		l2.mostrarLista();
		
		l1.verificarListasIguais(l2);
	
	}

}
