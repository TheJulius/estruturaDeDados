package listaDoisExcCinco;

public class Main {

	public static void main(String[] args) {
		
		Lista l = new Lista();
		
//		l.inserirInicio(1);
//		l.inserirInicio(2);
//		l.inserirInicio(3);
//		l.inserirInicio(4);
//		l.inserirInicio(5);
//		
//		l.mostrarLista();

		l.inserir(1);
		l.inserir(2);
		l.inserir(3);
		l.inserir(4);
		l.inserir(5);
		
		l.inverter();
		l.print();

	}

}
