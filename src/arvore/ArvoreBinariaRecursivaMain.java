package arvore;

import java.util.*;

public class ArvoreBinariaRecursivaMain {
	//definindo a classe que representará
	//cada elemento da árvore binária
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Arvore raiz = null;//a árvore está vazia, logo, o objeto raiz tem valor nulo
		int op=0,achou,numero;
		
		while (op!=16){
			System.out.println("Menu de opções");
			System.out.println("1- Inserir na árvore");
			System.out.println("2- Consultar um nó da árvore");
			System.out.println("3- Consultar toda a árvore em ordem");
			System.out.println("4- Excluir um nó da árvore");
			System.out.println("5- Consultar toda a árvore em ordem");
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
			System.out.println("Digite opção");
			op = entrada.nextInt();
			
			if (op==1){
				System.out.println("Digite número a ser inserido na árvore");
				numero = entrada.nextInt();
				raiz = Arvore.inserir(raiz,numero);
				System.out.println("Número inserido na árvore");
			}
			
			if (op==2){ 
				if (raiz == null){
					System.out.println("Árvore vazia");
				}
				else{
					//a árvore contém elementos
					System.out.println("Digite elemento a ser consultado");
					numero = entrada.nextInt();
					achou = 0;
					achou = Arvore.consultar(raiz,numero,achou);
					if (achou==0){
						System.out.println("Número não encontrado na árvore");
					}
					else{
						System.out.println("Número encontrado na árvore");
					}
				}
			}
			
			if (op == 3){
				if (raiz==null){
					System.out.println("Árvore vazia");
				}
				else{
					//a arvore contém elementos e estes serão
					//mostrados em ordem
					System.out.println("Listando todos os elementos da árvore em ordem");
					Arvore.mostrarEmOrdem(raiz);
				}
				System.out.println();
					
			}
		  
			
			if (op == 4){
			  if (raiz == null){
				  System.out.println("Árvore vazia");
			  }
			  else{
				  System.out.println("Digite o número que deseja excluir");
				  numero =  entrada.nextInt();
				  achou = 0;
				  achou = Arvore.consultar(raiz,numero,achou);
				  if (achou == 0){
					  System.out.println("Número não encontrado na árvore");
				  }
				  else{
					  raiz = Arvore.remover(raiz,numero);
					  System.out.println("Número excluido da árvore");
				  }
			  }
		  }
		  
			if (op == 5){
			  if (raiz == null){
				  System.out.println("Árvore vazia");
			  }
			  else
			  {
				  raiz = null;
				  System.out.println("Árvore esvaziada");
			  }
		  }
			if (op == 6){
				if (raiz==null){
					System.out.println("Árvore vazia");
				}
				else{

					System.out.println("Arvore Pre-fixada a Esquerda");
					Arvore.prefixadoAEsquerda(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 7){
				if (raiz==null){
					System.out.println("Árvore vazia");
				}
				else{

					System.out.println("Arvore Pre-fixada a Direita");
					Arvore.prefixadoADireita(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 8){
				if (raiz==null){
					System.out.println("Árvore vazia");
				}
				else{

					System.out.println("Arvore Pos-fixada a Esquerda");
					Arvore.posfixadoAEsquerda(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 9){
				if (raiz==null){
					System.out.println("Árvore vazia");
				}
				else{

					System.out.println("Arvore Pos-fixada a Direita");
					Arvore.posfixadoADireita(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 10){
				if (raiz==null){
					System.out.println("Árvore vazia");
				}
				else{
				
					System.out.println("Arvore Centralizada a Direita");
					Arvore.centralAEsquerda(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 11){
				if (raiz==null){
					System.out.println("Árvore vazia");
				}
				else{

					System.out.println("Arvore Centralizada a Direita");
					Arvore.centralADireita(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 12){
				if (raiz==null){
					System.out.println("Árvore vazia");
				}
				else{

					System.out.println("Maior Numero");
					Arvore.maiorNumero(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 13){
				if (raiz==null){
					System.out.println("Árvore vazia");
				}
				else{

					System.out.println("Menor Numero");
					Arvore.menorNumero(raiz);
				}
				System.out.println();
					
			}
			
			if (op == 14){
				if (raiz==null){
					System.out.println("Árvore vazia");
				}
				else{

					System.out.println("Quantidade de Elementos");
					System.out.println(Arvore.contador(raiz));
				}
				System.out.println();
					
			}
			
			if (op == 15){
				if (raiz==null){
					System.out.println("Árvore vazia");
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