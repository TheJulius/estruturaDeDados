package listaDoisExcTres;

public class ListaDuplaCircular {
	private NodoDuplo inicio = null;
	private NodoDuplo fim = null;
	private NodoDuplo aux = null;
	
	public void inserirInicio(int num){
		
		NodoDuplo novo = new NodoDuplo();
		novo.num = num;
		if (inicio == null){
			//a lista está vazia e o elemento será o primeiro e o último
			inicio = novo;
			fim = novo;
			novo.prox = inicio;
			novo.ant = inicio;
		}
		else
		{
			//a lista já contém elementos e o novo elemento
			//será inserido no início da lista
			novo.prox = inicio;
			inicio.ant = novo;
			novo.ant = fim;
			fim.prox = novo;
			inicio = novo;
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
				aux =  aux.prox;
			}while (aux !=inicio);
		}
	}
	
	public void inserirFinal(int num){
	
		NodoDuplo novo = new NodoDuplo();
		novo.num = num;
		if (inicio == null){
			//a lista está vazia e o elemento será o primeiro e o último
			inicio = novo;
			fim = novo;
			novo.prox = inicio;
			novo.ant = inicio;
		}
		else
		{
			//a lista contém elementos e o novo elemento
			//será inserido no fim da lista
			fim.prox = novo;
			novo.ant = fim;
			fim = novo;
			fim.prox = inicio;
			inicio.ant = fim;	
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
		aux = inicio;
		int quantidade = 0;
		int contador = 0;
		//aqui
		do{
			quantidade++;
			aux = aux.prox;
		}while (aux!=inicio);
		//a lista contém elementos e o elemento a ser
		//removido foi passado como parâmetro
		do{
			if (aux.num == num){
				achou++;
				//o número foi encontrado na lista e será removido
				if (inicio == fim){
					inicio= null;
					//aqui
					fim = null;
				}
				else if (aux == inicio){
					inicio = aux.prox;
					inicio.ant = fim;
					fim.prox = inicio;
					aux = inicio;
				}
				else if(aux == fim){
					fim = fim.ant;
					fim.prox = inicio;
					inicio.ant = fim;
				}
				else
				{
					aux.ant.prox = aux.prox;
					aux.prox.ant = aux.ant;
					aux = aux.prox;
				}
			}
			else
			{
			    aux= aux.prox;	
			}
			contador++;
		}while (contador <=quantidade);
	}	
	if (achou == 0){
		System.out.println("Número não encontrado");
	}
	else
	{
		System.out.println("Número "+num+" removido "+achou+" vezes");
	}
  }

	public int MostrarMaiorElementoDaLista(){
		
		int maiorElemento = 0;
	
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			aux = inicio;
			do{
				if(aux.num > maiorElemento){
					maiorElemento = aux.num;
				}
				aux =  aux.prox;
			}while (aux !=inicio);
		}
		return maiorElemento;
	}
	
	public int MostrarMenorElementoDaLista(){
		
		int menorElemento = 99999999;
	
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			aux = inicio;
			do{
				if(aux.num < menorElemento){
					menorElemento = aux.num;
				}
				aux =  aux.prox;
			}while (aux !=inicio);
		}
		return menorElemento;
	}
	
	public double MostrarMediaAritmetica(){
		
		double mediaAritmetica = 0;
		double somatoria = 0;
		int cont = 0;
	
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			aux = inicio;
			do{
				somatoria += aux.num;
				cont ++;
				aux =  aux.prox;
			}while (aux !=inicio);
		}
		
		mediaAritmetica = somatoria / cont;
		
		return mediaAritmetica;
	}
}
