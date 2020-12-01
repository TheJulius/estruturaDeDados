
public class main {

	public static void main(String[] args) {
		
		int n1 = 5, n2 = 3;
		
		Aritmetica calculo = new Aritmetica();
		
		System.out.println("Multiplicacao = " + calculo.multiplicacao(n1, n2));
		System.out.println("Soma = " +  calculo.soma(n1, n2));
		
		
		int n3 = 7;
		
		Primo primo = new Primo();
		
		if(primo.verificaPrimo(n3)) {
			System.out.println("Sim, e primo");
		} else {
			System.out.println("Nao e primo");
		}

	}

}
