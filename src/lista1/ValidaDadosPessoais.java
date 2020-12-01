package lista1;

public class ValidaDadosPessoais {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void deletaNome(String nome) {
		this.nome = null;
	}
	
	public void deletaEndereco(String endereco) {
		this.endereco = null;
	}
	
	public void deletaTelefone(String telefone) {
		this.telefone = null;
	}
}
