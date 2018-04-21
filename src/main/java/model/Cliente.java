package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cliente extends Pessoa {
	private Calendar dataCadastro;
	private DateFormat dateFormat;

	public Cliente() {
	}

	public Cliente(String nome, String cpf, String email, Calendar dataNascimento) {

		setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));

		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.setDataCadastro(Calendar.getInstance());
		this.dataNascimento = dataNascimento;
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

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public DateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

}
