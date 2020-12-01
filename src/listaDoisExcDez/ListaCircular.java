package listaDoisExcDez;

import java.util.Random;

public class ListaCircular {
	private Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;
	private Nodo anterior = null;
	
	public void iniciarLista(){
		
		int cont = 0;
		
		Random gerador = new Random();
		
		do {
			Nodo novo = new Nodo();
			novo.num = gerador.nextInt();
			if (inicio == null){
				//a lista est� vazia e o elemento ser� o primeiro e o �ltimo
				inicio = novo;
				fim = novo;
				fim.prox = inicio;
				cont ++;
			}
			else
			{
				//a lista j� cont�m elementos e o novo elemento
				//ser� inserido no in�cio da lista
				novo.prox = inicio;
				inicio = novo;
				fim.prox = inicio;
				cont ++;
			}
			System.out.println("Valor inserido com sucesso!!");
		} while(cont != 100);
	}
	
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
				System.out.println(aux.num);
				aux = aux.prox;
			}while (aux !=inicio);
		}
	}
	public void inserirFinal(int num){
		Nodo novo = new Nodo();
		novo.num = num;
		if (inicio == null){
			//a lista est� vazia e o elemento ser� o primeiro e o �ltimo
			inicio = novo;
			fim = novo;
			fim.prox = inicio;
		}
		else
		{
			//a lista cont�m elementos e o novo elemento
			//ser� inserido no fim da lista
			fim.prox = novo;
			fim = novo;
			fim.prox = inicio;
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
			anterior = null;
			do{
				if (aux.num == num){
					achou++;
					//o n�mero foi encontrado na lista e ser� removido
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
			System.out.println("N�mero n�o encontrado");
		}
		else
		{
			System.out.println("N�mero "+num+" removido "+achou+" vezes");
		}
	  }
	}

