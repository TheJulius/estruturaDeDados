package listaDoisExcNove;

public class Lista {
	private Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;
	private Nodo anterior = null;
	private int contador = 0;
	
	public void inserirInicio(String nome, double salario){
		
		if (contador == 8) {
			System.out.println("Numero maximo de funcionarios atingido");
		} else {
			Nodo novo = new Nodo();
			novo.setNome(nome);
			novo.setSalario(salario);
			if (inicio == null){
				//a lista est� vazia e o elemento ser� o primeiro e o �ltimo
				inicio = novo;
				fim = novo;
				novo.prox = null;
				contador ++;
			}
			else
			{
				//a lista j� cont�m elementos e o novo elemento
				//ser� inserido no in�cio da lista
				novo.prox = inicio;
				inicio = novo;
				contador ++;
			}
			System.out.println("Valor inserido com sucesso!!");	
		}
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
				System.out.println();
				System.out.println(aux.getNome());
				System.out.println(aux.getSalario());
				aux = aux.prox;
			}
		}
	}
	
	public void removerNodo(String nome){
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
				if (aux.getNome() == nome){
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
			System.out.println("O "+nome+" removido "+achou+" vezes");
		}
	  }
	
	public String MostrarMaiorElementoDaLista(){
		
		double maiorElemento = 0;
		String nome = null;
	
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			aux = inicio;
			do{
				if(aux.getSalario()> maiorElemento){
					maiorElemento = aux.getSalario();
					nome = aux.getNome();				}
				aux =  aux.prox;
			}while (aux != null);
		}
		return nome;
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
				somatoria += aux.getSalario();
				cont ++;
				aux =  aux.prox;
			}while (aux !=null);
		}
		
		mediaAritmetica = somatoria / cont;
		
		return mediaAritmetica;
	}
	
	public void MostrarQuantidadeDeFuncionariosAcimaDeX(double x){
		
		int cont = 0;
	
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			aux = inicio;
			do{
				if(aux.getSalario()> x){
					cont ++;
				}
				aux =  aux.prox;
			}while (aux !=null);
		}
		
		if (cont == 0) {
			System.out.println();
			System.out.println("Nenhum funcionario ganha acima do valor informado");
			
		} else {
			System.out.println();
			System.out.println("Quantidade de funcionario que ganham acima de " + x + " : " + cont);
		}
	}
}