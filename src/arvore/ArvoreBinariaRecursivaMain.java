package arvore;

import java.util.*;

public class ArvoreBinariaRecursivaMain {
	//definindo a classe que representar�
	//cada elemento da �rvore bin�ria
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Arvore raiz = null;//a �rvore est� vazia, logo, o objeto raiz tem valor nulo
		int op=0,achou,numero;
		
		while (op!=16){
			System.out.println("Menu de op��es");
			System.out.println("1- Inserir na �rvore");
			System.out.println("2- Consultar um n� da �rvore");
			System.out.println("3- Consultar toda a �rvore em ordem");
			System.out.println("4- Excluir um n� da �rvore");
			System.out.println("5- Consultar toda a �rvore em ordem");
			System.out.println("6- Consultar toda a Arvore Pre-fixada a Esquerda");
			System.out.println("7- Consultar toda a Arvore Pre-fixada a Direita");
			System.out.println("8- Consultar toda a Arvore Pos-fixada a Esquerda");
			System.out.println("9- Consultar toda a Arvore Pos-fixada a Direita");
			System.out.println("10- Consultar toda a Arvore Centralizada a Esquerda");
			System.out.println("11- Consultar toda a Arvore Centralizada a Direita");
			System.out.println("12- Mostrar Maior Numero");
			System.out.println("13- Mostrar Menor Numero");
			System.out.println("14- Mostrar Quantidade de elementos");
			System.out.println("15- Mostrar Elementos Pares");
			System.out.println("Digite op��o");
			op = entrada.nextInt();
			
			if (op==1){
				System.out.println("Digite n�mero a ser inserido na �rvore");
				numero = entrada.nextInt();
				raiz = Arvore.inserir(raiz,numero);
				System.out.println("N�mero inserido na �rvore");
			}
			
			if (op==2){ 
				if (raiz == null){
					System.out.println("�rvore vazia");
				}
				else{
					//a �rvore cont�m elementos
					System.out.println("Digite elemento a ser consultado");
					numero = entrada.nextInt();
					achou = 0;
					achou = Arvore.consultar(raiz,numero,achou);
					if (achou==0){
						System.out.println("N�mero n�o encontrado na �rvore");
					}
					else{
						System.out.println("N�mero encontrado na �rvore");
					}
				}
			}
			
			if (op == 3){
				if (raiz==null){
					System.out.println("�rvore vazia");
				}
				else{
					//a arvore cont�m elementos e estes ser�o
					//mostrados em ordem
					System.out.println("Listando todos os elementos da �rvore em ordem");
					Arvore.mostrarEmOrdem(raiz);
				}
				System.out.println();
					
			}
		  
			
			if (op == 4){
			  if (raiz == null){
				  System.out.println("�rvore vazia");
			  }
			  else{
				  System.out.println("Digite o n�mero que deseja excluir");
				  numero =  entrada.nextInt();
				  achou = 0;
				  achou = Arvore.consultar(raiz,numero,achou);
				  if (achou == 0){
					  System.out.println("N�mero n�o encontrado na �rvore");
				  }
				  else{
					  raiz = Arvore.remover(raiz,numero);
					  System.out.println("N�mero excluido da �rvore");
				  }
			  }
		  }
		  
			if (op == 5){
			  if (raiz == null){
				  System.out.println("�rvore vazia");
			  }
			  else
			  {
				  raiz = null;
				  System.out.println("�rvore esvaziada");
			  }
		  }
			if (op == 6){
				if (raiz==null){
					System.out.println("�rvore vazia");
				}
				else{

					System.out.println("Arvore Pre-fixada a Esquerda");
					Arvore.prefixadoAEsquerda(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 7){
				if (raiz==null){
					System.out.println("�rvore vazia");
				}
				else{

					System.out.println("Arvore Pre-fixada a Direita");
					Arvore.prefixadoADireita(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 8){
				if (raiz==null){
					System.out.println("�rvore vazia");
				}
				else{

					System.out.println("Arvore Pos-fixada a Esquerda");
					Arvore.posfixadoAEsquerda(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 9){
				if (raiz==null){
					System.out.println("�rvore vazia");
				}
				else{

					System.out.println("Arvore Pos-fixada a Direita");
					Arvore.posfixadoADireita(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 10){
				if (raiz==null){
					System.out.println("�rvore vazia");
				}
				else{
				
					System.out.println("Arvore Centralizada a Direita");
					Arvore.centralAEsquerda(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 11){
				if (raiz==null){
					System.out.println("�rvore vazia");
				}
				else{

					System.out.println("Arvore Centralizada a Direita");
					Arvore.centralADireita(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 12){
				if (raiz==null){
					System.out.println("�rvore vazia");
				}
				else{

					System.out.println("Maior Numero");
					Arvore.maiorNumero(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 13){
				if (raiz==null){
					System.out.println("�rvore vazia");
				}
				else{

					System.out.println("Menor Numero");
					Arvore.menorNumero(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 14){
				if (raiz==null){
					System.out.println("�rvore vazia");
				}
				else{

					System.out.println("Quantidade de Elementos");
					System.out.println(Arvore.contador(raiz));
				}
				System.out.println();
					
			}
			
			if (op == 15){
				if (raiz==null){
					System.out.println("�rvore vazia");
				}
				else{

					System.out.println("Elementos Pares");
					Arvore.numerosPares(raiz);
				}
				System.out.println();
					
			}
			
		}
		
		entrada.close();
	}
}