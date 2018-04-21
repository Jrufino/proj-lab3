package model;

import java.util.Calendar;

public class Funcionario extends Pessoa {
	private String funcao;
	private Funcionario chefe;
	private Calendar dataContratacao;
	private double salario;

	Funcionario() {
	}

	public Funcionario(String nome, String cpf, String login, String senha, String email, String funcao,
			Funcionario chefe) {
		this.nome = nome;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.funcao = funcao;
		this.chefe = chefe;
	}

	public double getSalario() {
		return this.salario;
	}

	public String getFuncao() {
		return this.funcao;
	}

	public Funcionario getChefe() {
		return this.chefe;
	}

	public String getNome() {
		return nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return super.toString() + "funcionario: " + this.chefe;
	}

	public Calendar getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Calendar dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
}
