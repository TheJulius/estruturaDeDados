package exemploDeEstruturas;

public class Fila {
	private Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;
	
	public void inserir(int num){
		Nodo novo = new Nodo();
		novo.num = num;
		if (inicio == null){
			// a lista estava vazia e o elemento ser� o primeiro e o �litmo
			inicio = novo;
			fim = novo;
			novo.prox = null;
		}
		else
		{
			// a lista j� cont�m elementose o novo elemento ser� inserido
			//no fim da lista
			fim.prox = novo;
			fim = novo;
			fim.prox = null;
		}
		System.out.println("N�mero inserido na fila");
	}
	
	public void mostrarFila(){
		if (inicio == null){
			//a lista est� vazia
			System.out.println("Fila vazia");
		}
		else
		{
			//a lista cont�m elementos e estes ser�o mostrados
			//do in�cio ao fim
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
			//a lista est� vazia
			System.out.println("Fila vazia");
		}
		else
		{
			inicio = inicio.prox;
		}		
    }
	public void  esvaziarLista (){
		if (inicio == null){
			//a lista est� vazia
			System.out.println("Fila vazia!!!");
		}
		else
		{
			//a lista ser� esvaziada
			inicio = null;
			System.out.println("Fila esvaziada");
		}
 }
	public Nodo getInicio(){
	 return this.inicio;
 }

}
