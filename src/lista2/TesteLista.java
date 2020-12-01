package lista2;

public class TesteLista {

	public static void main(String[] args) {
		
		ListaDupla minhaLista2 = new ListaDupla();
		
		minhaLista2.inserirFinal(9);
		minhaLista2.inserirFinal(3);
		minhaLista2.inserirFinal(7);
		
		minhaLista2.mostraLista();
		
		minhaLista2.removerNodo(3);
		
		minhaLista2.mostraLista();
		
		
	}
}
