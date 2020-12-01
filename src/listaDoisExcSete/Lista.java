package listaDoisExcSete;

public class Lista {
	private Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;
	private Nodo anterior = null;
	
	public void verificarListasIguais(Lista b){
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println();
			System.out.println("Verificando listas...");
			aux = inicio;
			b.aux = inicio;
			
			while (aux !=null){

				while (aux !=null){
					
					if(aux.num != b.aux.num) {
						System.out.println("As listas sao diferentes");
					} else {
						System.out.println("Ate aqui deu boa...");
					}
					
					b.aux = b.aux.prox;
					aux = aux.prox;
				}
			
			}
		}
	}
	
	public void inserirInicio(int num){
		Nodo novo = new Nodo();
		novo.num = num;
		if (inicio == null){
			//a lista est� vazia e o elemento ser� o primeiro e o �ltimo
			inicio = novo;
			fim = novo;
			novo.prox = null;
		}
		else
		{
			//a lista j� cont�m elementos e o novo elemento
			//ser� inserido no in�cio da lista
			novo.prox = inicio;
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
				aux = aux.prox;
			}
		}
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
			anterior = null;
			while (aux !=null){
				if (aux.num == num){
					achou++;
					//o n�mero foi encontrado na lista e ser� removido
					if (aux == inicio){
						inicio = aux.prox;
						aux = inicio;
					}
					else if(aux == fim){
						anterior.prox = null;
						fim = anterior;
						aux=  null;
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
	}