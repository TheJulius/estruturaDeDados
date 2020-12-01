package lista1;

public class ValidaDadosERenda {
	
	private String nomeCompleto;
	private int anoNascimento;
	private double rendaMensal;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	
	public void deletaNome(String nome) {
		this.nomeCompleto = null;
	}
	
	public void deletaAnoNascimento(int anoNascimento) {
		this.anoNascimento = 0;
	}
	
	public void deletaAnoNascimento(double rendaMesal) {
		this.rendaMensal = 0;
	}
	
	
	
	public static int QtdClientesRendaAcimaDaMedia(double[] renda) {
		
		int soma = 0;
		
		for(int i = 0; i < renda.length; i++) {
			
		soma+=renda[i];
			
		}
		
		double rendaMedia = soma / renda.length;
		
		int contador = 0;
		
		for(int i = 0; i < renda.length; i++) {
			
			if(renda[i] > rendaMedia) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public static int QtdClientesNascidosEntre1980e2000(int[] anoNascimento) {
			
			int contador = 0;
			
			for(int i = 0; i < anoNascimento.length; i++) {
				
				if(anoNascimento[i] >= 1980 || anoNascimento[i] <= 2000  ) {
					contador++;
				}
			}
			
			return contador;
		}

}
