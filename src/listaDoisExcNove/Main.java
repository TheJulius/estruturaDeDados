package listaDoisExcNove;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Informe um salario a ser comparado: ");
		double salario = in.nextDouble();
		
		Lista l = new Lista();
		l.inserirInicio("Julio", 5000);
		l.inserirInicio("Jose", 4000);
		l.inserirInicio("Joselito", 3000);
		
		l.mostrarLista();
		
		System.out.println();
		System.out.println("Maior Salario: " + l.MostrarMaiorElementoDaLista()); 
		
		System.out.println();
		System.out.println("Media de Salarios: " +  l.MostrarMediaAritmetica());
		
		l.MostrarQuantidadeDeFuncionariosAcimaDeX(salario);
		
		in.close();
	}

}
