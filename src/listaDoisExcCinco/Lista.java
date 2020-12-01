package listaDoisExcCinco;

public class Lista {
	private static Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;
	private Nodo anterior = null;
	
	public void printInvertido(Nodo nodo) {
	    if (nodo != null) {
	        printInvertido(nodo.getProx());
	        System.out.print(nodo.getNum() + " ");
	    }
	}
	
	public void inverter() {
	    Nodo prev = null;
	    Nodo next = null;
	    Nodo current = inicio;
	    
	    System.out.println();
	    System.out.println("Mostrando a lista invertida");
	    while (current != null) {
	        next = current.getProx();
	        current.setProx(prev);
	        prev = current;
	        current = next;
	    }
	    inicio = prev;
	}
	
	public static void print() {

	    if (inicio == null) {
	        System.out.println("Nada a exibir - a lista está vazia!");
	    } else {
	        Nodo aux = inicio;
	        while (aux != null) {
	            System.out.print(aux.getNum() + " ");
	            aux = aux.getProx();
	        }
	    }
	}
	
	public void inserir(int e) {
	    //criar um novo Nodo
	    Nodo novo = new Nodo();
	    novo.setNum(e);    //inserindo elemento
	    novo.setProx(null); //depois dele não vem ninguém

	    if (inicio == null) {
	        inicio = novo; //aponto para o novo nodo
	    } else {     //ja tem gente na lista ai precisa percorrer até chegar na null
	        Nodo aux = inicio; //joga o aux no inicio
	        while (aux.getProx() != null) {
	            aux = aux.getProx();
	        }
	        aux.setProx(novo);
	    }
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
			while (aux !=null){
				if (aux.num == num){
					achou++;
					//o número foi encontrado na lista e será removido
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
			System.out.println("Número não encontrado");
		}
		else
		{
			System.out.println("Número "+num+" removido "+achou+" vezes");
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
				System.out.println(aux.num);
				aux = aux.prox;
			}
		}
	}
	}
