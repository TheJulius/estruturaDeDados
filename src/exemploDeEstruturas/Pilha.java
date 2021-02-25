package exemploDeEstruturas;

public class Pilha {
	private Nodo topo = null;
	private Nodo aux = null;
	
	
	public void push (int num){
		Nodo novo = new Nodo();
		 novo.num = num; 
		if (topo == null){
			// a lista estava vazia e o elemento ser� o primeiro e o �litmo
			topo = novo;
			novo.prox = null;
		}
		else
		{
			//a lista j� cont�m elementos e o novo elemento
			//ser� inserido no in�cio da lista
			novo.prox = topo;
			topo = novo;
		}
		System.out.println("N�mero inserido no topo da pilha!!");
	}
	public void mostrarPilha(){
		if (topo == null){
			//a lista est� vazia
			System.out.println("Pilha vazia");
		}
		else
		{
			//a lista cont�m elementos e estes ser�o mostrados
			//do in�cio ao fim
			System.out.println("Mostrando toda pilha");
			aux = topo;
			while(aux != null){
				System.out.println(aux.num);
				aux = aux.prox;
			}
		}
	}
	public void pop(){
	 if (topo == null){
			//a pilha est� vazia
			System.out.println("Pilha vazia");
		}
		else
		{
			topo = topo.prox;
		}
			
    }
	public void  esvaziarPilha (){
		if (topo == null){
			//a lista est� vazia
			System.out.println("Pilha vazia!!!");
		}
		else
		{
			//a lista ser� esvaziada
			topo = null;
			System.out.println("Pilha Esvaziada");
		}
 }

}
