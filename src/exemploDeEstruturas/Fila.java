package exemploDeEstruturas;

public class Fila {
	private Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;
	
	public void inserir(int num){
		Nodo novo = new Nodo();
		novo.num = num;
		if (inicio == null){
			// a lista estava vazia e o elemento será o primeiro e o úlitmo
			inicio = novo;
			fim = novo;
			novo.prox = null;
		}
		else
		{
			// a lista já contém elementose o novo elemento será inserido
			//no fim da lista
			fim.prox = novo;
			fim = novo;
			fim.prox = null;
		}
		System.out.println("Número inserido na fila");
	}
	
	public void mostrarFila(){
		if (inicio == null){
			//a lista está vazia
			System.out.println("Fila vazia");
		}
		else
		{
			//a lista contém elementos e estes serão mostrados
			//do início ao fim
			System.out.println("Mostrando toda fila");
			aux = inicio;
			while(aux != null){
				System.out.print(aux.num+" ");
				aux = aux.prox;
			}
		}
		System.out.println();
	}
	public void remover(){
	 if (inicio == null){
			//a lista está vazia
			System.out.println("Fila vazia");
		}
		else
		{
			inicio = inicio.prox;
		}		
    }
	public void  esvaziarLista (){
		if (inicio == null){
			//a lista está vazia
			System.out.println("Fila vazia!!!");
		}
		else
		{
			//a lista será esvaziada
			inicio = null;
			System.out.println("Fila esvaziada");
		}
 }
	public Nodo getInicio(){
	 return this.inicio;
 }

}
