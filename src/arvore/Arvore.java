package arvore;

public class Arvore {
	
	public int num;
	public Arvore dir,esq;
	
	Arvore aux; //o objeto aux é um objeto auxiliar

	public static Arvore inserir(Arvore aux, int num){
		if (aux == null){
			aux = new Arvore();
			aux.num = num;
			aux.esq = null;
			aux.dir = null;
		}
		else{
			if (num < aux.num){
				aux.esq = inserir(aux.esq,num);
			}
			else{
				aux.dir = inserir(aux.dir,num);
			}
		}
		return aux;
	}
	
	public static int consultar(Arvore aux, int num, int achou){
		if (aux !=null && achou == 0){
			if (aux.num == num){
				achou = 1;
			}
			else if (num < aux.num)
					achou = consultar(aux.esq,num,achou);
				else
					achou = consultar(aux.dir,num,achou);	
		}
		return achou;
	}
	
	public static void mostrarEmOrdem(Arvore aux){
		if (aux!=null){	
			mostrarEmOrdem(aux.dir);
			System.out.print(aux.num+" ");
			mostrarEmOrdem(aux.esq);	
		}
	}
	
	public static Arvore remover(Arvore aux, int num){
		Arvore p, p2;
		if (aux.num == num){
			if (aux.esq == aux.dir){
				//o elemento a ser removido não tem filhos
				return null;
			}
			else if(aux.esq == null){
				//o elemento a ser removido não tem filho
				//para esquerda
				return aux.dir;
			}
			else if (aux.dir == null){
				//o elemento a ser removido não tem filho
				//para direita
				return aux.esq;
			}
			else{
				//o elemento a ser removido tem filhos
				//para ambos os lados
				p2 = aux.dir;
				p = aux.dir;
				while (p.esq !=null){
					p=p.esq;
				}
				p.esq = aux.esq;
				return p2;
			}
		}
		else if (aux.num < num){
			aux.dir = remover(aux.dir,num);
		}
		else{
			aux.esq = remover(aux.esq,num);
		}
	
		return aux;
	}
	
	public static void prefixadoAEsquerda(Arvore aux) {
	    if(aux != null){
	        System.out.print(aux.num + " ");
	        prefixadoAEsquerda(aux.esq);
	        prefixadoAEsquerda(aux.dir);
	    }
	}
	
	public static void prefixadoADireita(Arvore aux) {
	    if(aux != null){
	        System.out.print(aux.num + " ");
	        prefixadoADireita(aux.dir);
	        prefixadoADireita(aux.esq);
	    }
	}
	
	public static void posfixadoAEsquerda(Arvore aux) {
	    if(aux != null){
	      posfixadoAEsquerda(aux.esq);
	      posfixadoAEsquerda(aux.dir);
	        System.out.print(aux.num + " ");
	    }
	}
	
	public static void posfixadoADireita(Arvore aux) { 
	    if(aux != null){
	      posfixadoADireita(aux.dir);
	      posfixadoADireita(aux.esq);
	        System.out.print(aux.num + " ");
	    }
	}
	
	public static void centralAEsquerda(Arvore aux){ //nao tenho certeza se e isso
		if (aux!=null){	
			centralADireita(aux.esq);
			System.out.print(aux.num+" ");
			centralADireita(aux.dir);	
		}
	}
	
	public static void centralADireita(Arvore aux){ //nao tenho certeza se e isso
		if (aux!=null){	
			centralADireita(aux.dir);
			System.out.print(aux.num+" ");
			centralADireita(aux.esq);	
		}
	}
	
	public static void maiorNumero(Arvore aux){
		if (aux!=null){	
			maiorNumero(aux.dir);
			System.out.print(aux.num+" ");
			maiorNumero(aux.dir);
		}
	}
	
	public static void menorNumero(Arvore aux){
		if (aux!=null){
			menorNumero(aux.esq);
			System.out.print(aux.num+" ");
			menorNumero(aux.esq);
		}
	}
	
	public static int contador(Arvore aux){
		if (aux!=null){
			
			int cont = 0;
			
			contador(aux.dir);
			cont++;
			contador(aux.esq);
			cont++;
			
			return cont;
		} else {
			return 0;
		}
	}
	
	public static void numerosPares(Arvore aux){
		if (aux!=null){	
			numerosPares(aux.dir);
			if(aux.num % 2 == 0) {
				System.out.print(aux.num+" ");
			}
			numerosPares(aux.esq);	
		}
	}
}
