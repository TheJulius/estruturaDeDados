package listaDoisExcTres;

public class Main {

	public static void main(String[] args) {
		
		ListaDuplaCircular ldc = new ListaDuplaCircular();
		
		ldc.inserirInicio(1);
		ldc.inserirInicio(2);
		ldc.inserirInicio(3);
		ldc.inserirInicio(4);
		ldc.inserirInicio(5);
		ldc.inserirInicio(6);
		ldc.inserirInicio(10);
		
		System.out.println();
		System.out.println("Maior Elemento da Lista: " + ldc.MostrarMaiorElementoDaLista());
		System.out.println();
		System.out.println("Menor Elemento da Lista: " + ldc.MostrarMenorElementoDaLista());
		System.out.println();
		System.out.println("Media Aritmetica: " + ldc.MostrarMediaAritmetica());

	}

}
