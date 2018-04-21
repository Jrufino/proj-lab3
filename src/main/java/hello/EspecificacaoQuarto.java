package hello;

import model.Cama;

public class EspecificacaoQuarto {

	private Cama cama[];
	private String qualidade;
	private String temArCondicionado;
	private String temFrigobar;
	private String temWifi;

	public EspecificacaoQuarto() {
	}

	public EspecificacaoQuarto(Cama cama[], String tipo, String temArCondicionado, String temFrigobar, String temWifi) {
		this.cama = cama;
		this.qualidade = tipo;
		this.temArCondicionado = temArCondicionado;
		this.temFrigobar = temFrigobar;
		this.temWifi = temWifi;
	}


	public Cama[] getCama() {
		return cama;
	}

	public void setCama(Cama[] cama) {
		this.cama = cama;
	}

	public String getQualidade() {
		return qualidade;
	}

	public void setQualidade(String tipo) {
		this.qualidade = tipo;
	}

	public String isTemArCondicionado() {
		return temArCondicionado;
	}

	public void setTemArCondicionado(String temArCondicionado) {
		this.temArCondicionado = temArCondicionado;
	}

	public String isTemFrigobar() {
		return temFrigobar;
	}

	public void setTemFrigobar(String temFrigobar) {
		this.temFrigobar = temFrigobar;
	}

	public String isTemWifi() {
		return temWifi;
	}

	public void setTemWifi(String temWifi) {
		this.temWifi = temWifi;
	}

	public boolean comparar(EspecificacaoQuarto especificacao) {

		if (this.qualidade.equals(especificacao.qualidade) && this.isTemArCondicionado().equals(especificacao.temArCondicionado)
				&& this.isTemFrigobar().equals(especificacao.temFrigobar)
				&& this.isTemWifi().equals(especificacao.temWifi)) {
			return true;
		}
		return false;
	}

}
