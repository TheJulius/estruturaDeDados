package exemploDeEstruturas;

public class Pilha {
	private Nodo topo = null;
	private Nodo aux = null;
	
	
	public void push (int num){
		Nodo novo = new Nodo();
		 novo.num = num; 
		if (topo == null){
			// a lista estava vazia e o elemento será o primeiro e o úlitmo
			topo = novo;
			novo.prox = null;
		}
		else
		{
			//a lista já contém elementos e o novo elemento
			//será inserido no início da lista
			novo.prox = topo;
			topo = novo;
		}
		System.out.println("Número inserido no topo da pilha!!");
	}
	public void mostrarPilha(){
		if (topo == null){
			//a lista está vazia
			System.out.println("Pilha vazia");
		}
		else
		{
			//a lista contém elementos e estes serão mostrados
			//do início ao fim
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
			//a pilha está vazia
			System.out.println("Pilha vazia");
		}
		else
		{
			topo = topo.prox;
		}
			
    }
	public void  esvaziarPilha (){
		if (topo == null){
			//a lista está vazia
			System.out.println("Pilha vazia!!!");
		}
		else
		{
			//a lista será esvaziada
			topo = null;
			System.out.println("Pilha Esvaziada");
		}
 }

}
