package model;

import java.util.Calendar;

public abstract class Pessoa {
	protected String nome;
	protected Calendar dataNascimento;
	protected String cpf;
	protected String login;
	protected String senha;
	protected String email;

	abstract String getNome();

	abstract Calendar getDataNascimento();

	abstract String getCpf();

	abstract String getLogin();

	abstract String getSenha();

	abstract String getEmail();

	public String toString() {
		return "Pessoa[" + nome + ", data de nascimento: " + Calendar.DAY_OF_MONTH + "/" + Calendar.MONTH + "/"
				+ Calendar.YEAR + ", cpf: " + cpf + ", login: " + login + ", senha: " + senha + "]";
	}
}
