package listaDoisExcDois;

public class Nodo {
	private int codigo;
	private double preco;
	private int estoque;
	Nodo  prox;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Nodo getProx(){
		return this.prox;
	}
}