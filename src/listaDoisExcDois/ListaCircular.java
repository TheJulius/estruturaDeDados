package listaDoisExcDois;

public class ListaCircular {
	private Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;
	private Nodo anterior = null;
	
	public void mostrarLista(){
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println("Mostrando toda a lista");
			aux = inicio;
			do{
				System.out.println();
				System.out.println("Codigo: " + aux.getCodigo() + " / " + "Preco: " + aux.getPreco() + " / " + "Estoque: " + aux.getEstoque());
				aux = aux.prox;
			}while (aux !=inicio);
		}
	}
	
	public void mostrarEstoqueMaiorQueCem(){
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println();
			System.out.println("Mostrando toda a lista com estoque maior que 100");
			aux = inicio;
			do{
				
				if(aux.getEstoque() > 100) {
					System.out.println();
					System.out.println("Codigo: " + aux.getCodigo() + " / " + "Preco: " + aux.getPreco() + " / " + "Estoque: " + aux.getEstoque());	
				}
				
				aux = aux.prox;
				
			}while (aux !=inicio);
		}
	}
	
	public void inserirInicio(int codigo, double preco, int estoque){
		Nodo novo = new Nodo();
		
		novo.setCodigo(codigo);
		novo.setPreco(preco);
		novo.setEstoque(estoque);
		
		if (inicio == null){
			//a lista está vazia e o elemento será o primeiro e o último
			inicio = novo;
			fim = novo;
			fim.prox = inicio;
		}
		else
		{
			//a lista já contém elementos e o novo elemento
			//será inserido no início da lista
			novo.prox = inicio;
			inicio = novo;
			fim.prox = inicio;
		}
		System.out.println("Valor inserido com sucesso!!");
	}
	
	public void inserirFinal(int codigo, double preco, int estoque){
		Nodo novo = new Nodo();
		
		novo.setCodigo(codigo);
		novo.setPreco(preco);
		novo.setEstoque(estoque);
		
		if (inicio == null){
			//a lista está vazia e o elemento será o primeiro e o último
			inicio = novo;
			fim = novo;
			fim.prox = inicio;
		}
		else
		{
			//a lista contém elementos e o novo elemento
			//será inserido no fim da lista
			fim.prox = novo;
			fim = novo;
			fim.prox = inicio;
		}
		System.out.println("Número inserido no fim da lista");
	}	
	public void removerNodo(int codigo){
		int achou = 0;
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			//a lista contém elementos e o elemento a ser
			//removido foi passado como parâmetro
			aux = inicio;
			anterior = null;
			do{
				if (aux.getCodigo() == codigo){
					achou++;
					//o número foi encontrado na lista e será removido
					if (inicio == fim){
						inicio= null;
					}
					if (aux == inicio){
						inicio = aux.prox;
						fim.prox = inicio;
						aux = inicio;
					}
					else if(aux == fim){
						fim = anterior;
						fim.prox = inicio;
						aux = aux.prox;
					}
					else
					{
						anterior.prox = aux.prox;
						aux = aux.prox;
					}
				}
				else
				{
					anterior = aux;
				    aux= aux.prox;	
				}
			
			}while (aux !=inicio);
		}	
		if (achou == 0){
			System.out.println("Número não encontrado");
		}
		else
		{
			System.out.println("Número "+codigo+" removido "+achou+" vezes");
		}
	  }
	
	public void aplicarDesconto(int desconto) {
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println("Mostrando toda a lista");
			aux = inicio;
			do{
				if(desconto != 0) {
					aux.setPreco(aux.getPreco() * desconto/100 + aux.getPreco());
					
				}
				aux = aux.prox;
			}while (aux !=inicio);
		}
		
	}
}

