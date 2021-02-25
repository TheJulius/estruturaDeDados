package exemploDeEstruturas;

public class TesteLista {

	public static void main(String[] args) {
		
		ListaDupla minhaLista2 = new ListaDupla();
		
		minhaLista2.inserirFinal(9);
		minhaLista2.inserirFinal(3);
		minhaLista2.inserirFinal(7);
		
		minhaLista2.mostraLista();
		
		minhaLista2.removerNodo(3);
		
		minhaLista2.mostraLista();
		
		Fila fila = new Fila(); //criando uma instância da classe Fila
		
		System.out.println("********FILA********");
		//inserindo, removendo e mostrando os elementos da fila
		fila.inserir(1);
		fila.inserir(8);
		fila.inserir(2);
		fila.inserir(5);
		fila.mostrarFila();
		fila.remover();
		System.out.println("Fila após a remoção de um elemento");
		fila.mostrarFila();
		
		Pilha pilha = new Pilha(); //criando uma instância da classe Pilha
		System.out.println("********PILHA********");
		//inserindo, removendo e mostrando os elementos da pilha
		pilha.push(3);
		pilha.push(10);
		pilha.push(8);
		pilha.mostrarPilha();
		pilha.pop();
		System.out.println("Pilha após a remoção de um elemento");
		pilha.mostrarPilha();	
	}
		
}
