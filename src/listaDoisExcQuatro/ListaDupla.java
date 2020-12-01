package listaDoisExcQuatro;

public class ListaDupla {
	private NodoDuplo inicio = null;
	private NodoDuplo fim = null;
	private NodoDuplo aux = null;
	
	public void inserirInicio(int num){
		NodoDuplo novo = new NodoDuplo();
		novo.num = num;
		if (inicio == null){
			//a lista est� vazia e o elemento ser� o primeiro e o �ltimo
			inicio = novo;
			fim = novo;
			novo.prox = null;
			novo.ant = null;
		}
		else
		{
			//a lista j� cont�m elementos e o novo elemento
			//ser� inserido no in�cio da lista
			novo.prox = inicio;
			inicio.ant = novo;
			novo.ant = null;
			inicio = novo;
		}
		System.out.println("Valor inserido com sucesso!!");
	}
	
	public void mostrarLista(){
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println();
			System.out.println("Mostrando toda a lista");
			aux = inicio;
			while (aux !=null){
				System.out.println(aux.num);
				aux =  aux.prox;
			}
		}
	}
	
	public void inserirFinal(int num){
		NodoDuplo novo = new NodoDuplo();
		novo.num = num;
		if (inicio == null){
			//a lista est� vazia e o elemento ser� o primeiro e o �ltimo
			inicio = novo;
			fim = novo;
			novo.prox = null;
			novo.ant = null;
		}
		else
		{
			//a lista cont�m elementos e o novo elemento
			//ser� inserido no fim da lista
			fim.prox = novo;
			novo.ant = fim;
			novo.prox = null;
			fim = novo;
			
		}
		System.out.println("N�mero inserido no fim da lista");
	}	
	
	public void removerNodo(int num){

		int achou = 0;
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			//a lista cont�m elementos e o elemento a ser
			//removido foi passado como par�metro
			aux = inicio;
			while (aux !=null){
				if (aux.num == num){
					achou++;
					//o n�mero foi encontrado na lista e ser� removido
					if (aux == inicio){
						inicio =  aux.prox;
						if (inicio != null){
							inicio.ant = null;
						}
						aux = inicio;
					}
					else if(aux == fim){
						fim = fim.ant;
						fim.prox = null;
						aux=  null;
					}
					else
					{
					      aux.ant.prox = aux.prox;
					      aux.prox.ant  = aux.ant;
					      aux = aux.prox; 
					}
				}
				else
				{
				    aux= aux.prox;	
				}
			}
		}	
		if (achou == 0){
			System.out.println("N�mero n�o encontrado");
		}
		else
		{
			System.out.println("N�mero "+num+" removido "+achou+" vezes");
		}
	  }
	
	public void mostrarIntersexListas(ListaDupla teste){
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println();
			System.out.println("Interseccao:");
			
			aux = inicio;
			teste.aux = teste.inicio;
			while (teste.aux !=null){
				
				while(aux != null) {
					
					if(aux.num == teste.aux.num) {
						
						System.out.println(aux.num);
						
					}
					aux =  aux.prox;
				}	
				
				teste.aux = teste.aux.prox;
			}
		}
	}
	
	public void mostrarDiferencaListas(ListaDupla teste){
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println();
			System.out.println("Diferenca:");
			
			aux = inicio;
			teste.aux = teste.inicio;
			
			while (teste.aux !=null){
				
				while(aux != null) {
					
					if(aux.num != teste.aux.num) {
						
						System.out.println(aux.num);
						
					}
					aux =  aux.prox;
				}	
				
				teste.aux = teste.aux.prox;
			}
		}
	}
	
	public void mostrarUniaoListas(ListaDupla teste){
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println();
			System.out.println("Uniao:");
			
			aux = inicio;
			while (aux !=null){
				System.out.println(aux.num);
				aux =  aux.prox;
			}
			
			teste.aux = teste.inicio;
			while (teste.aux !=null){
				System.out.println(teste.aux.num);
				teste.aux =  teste.aux.prox;
			}
		}
	}
}


