package listaDoisExcNove;

public class Nodo {
	private double  salario;
	private String nome;

	Nodo  prox;
	
	public Nodo getProx(){
		return this.prox;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}