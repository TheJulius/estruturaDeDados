package listaDoisExcDois;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ListaCircular lc = new ListaCircular();
		
		lc.inserirInicio(1, 225.5, 10);
		lc.inserirInicio(2, 250.5, 5);
		lc.inserirFinal(3, 1000, 12312312);
		
		lc.mostrarLista();
		
		System.out.println();
		System.out.println("Quantos porcento de desconto gostaria de aplicar nos produtos?");
		lc.aplicarDesconto(in.nextInt());
		
		lc.mostrarLista();
		
		lc.mostrarEstoqueMaiorQueCem();

		in.close();
		
	}

}
