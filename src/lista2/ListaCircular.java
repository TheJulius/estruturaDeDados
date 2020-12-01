package lista2;

public class ListaCircular {
	private Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;
	private Nodo anterior = null;
	
	public void inserirInicio(int num){
		Nodo novo = new Nodo();
		novo.num = num;
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
	
	public void mostraLista(){
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println("Mostrando toda a lista");
			aux = inicio;
			do{
				System.out.println(aux.num);
				aux = aux.prox;
			}while (aux !=inicio);
		}
	}
	public void inserirFinal(int num){
		Nodo novo = new Nodo();
		novo.num = num;
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
	public void removerNodo(int num){
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
				if (aux.num == num){
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
			System.out.println("Número "+num+" removido "+achou+" vezes");
		}
	  }
	}

