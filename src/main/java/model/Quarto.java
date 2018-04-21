package model;

import java.util.ArrayList;
import java.util.List;

public class Quarto {
	public static final boolean ocupado = true;
	public static final boolean livre = !ocupado;

	private String nome;
	private int numero;
	private String qualidade;
	private boolean disponibilidade;
	private boolean ocupacao;
	private List<Cliente> clientesHospedados = null;

	public List<Cama> camas;

	public Quarto(int n, String tipo, Cama camasSolteiro, boolean disponibilidade, boolean ocupacao) {
		this.numero = n;
		this.qualidade = tipo;
		this.disponibilidade = disponibilidade;
		this.ocupacao = ocupacao;

	}

	public Quarto(int n, String tipo, List<Cama> camasSolteiro, boolean disponibilidade, boolean ocupacao) {
		this.numero = n;
		this.qualidade = tipo;
		this.camas = new ArrayList<Cama>();

		for (int i = 0; i < camasSolteiro.size(); i++) {
			this.camas.add(camasSolteiro.get(i));
		}

		this.disponibilidade = disponibilidade;
		this.ocupacao = ocupacao;

	}

	public boolean isOcupado() {
		return this.ocupacao;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getQualidade() {
		return qualidade;
	}

	public void setQualidade(String qualidade) {
		this.qualidade = qualidade;
	}

	public String getTipoCama() {
		String s = "";
		for (Cama c : camas)
			s += c.getTipo() + ",";
		return s;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public boolean isocupacao() {
		return ocupacao;
	}

	public void setocupacao(boolean ocupacao) {
		this.ocupacao = ocupacao;
	}

	public String toString() {
		return "numero: " + numero + ", qualidade: " + qualidade + ", tipoCama: " + camas.get(0).getTipo()
				+ ", disponibilidade: " + disponibilidade + ", ocupacao: " + ocupacao;
	}

	public void reservarCliente(Cliente clienteLuiz) {
		setocupacao(true);
		if (clientesHospedados == null)
			clientesHospedados = new ArrayList<Cliente>();

		clientesHospedados.add(clienteLuiz);
	}

}
