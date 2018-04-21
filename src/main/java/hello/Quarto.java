package hello;

public class Quarto {

	private int numero;
	private EspecificacaoQuarto especificacao;

	public Quarto() {
	}

	public Quarto(int numero, EspecificacaoQuarto esp) {
		this.numero = numero;
		this.especificacao = esp;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public EspecificacaoQuarto getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(EspecificacaoQuarto especificacao) {
		this.especificacao = especificacao;
	}

}
