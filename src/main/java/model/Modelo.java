package model;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
	private List<Cliente> lClientes;
	private List<Funcionario> lFuncionarios;
	private List<Reserva> lReservas;
	private List<Quarto> lQuartos;

	// a cada req. funcional implementado:
	// faca os testes de classes de equivalencia (anote isso no codigo, quais s"ao
	// estas classes?)
	// valor limite se possivel
	public Modelo() {
		lClientes = new ArrayList<Cliente>();
		lFuncionarios = new ArrayList<Funcionario>();
		lReservas = new ArrayList<Reserva>();
		lQuartos = new ArrayList<Quarto>();
	}

	public void addCliente(Cliente cliente) {
		lClientes.add(cliente);
	}

	public void addFuncionario(Funcionario funcionario) {
		lFuncionarios.add(funcionario);
	}

	public void addQuarto(Quarto quarto) {
		lQuartos.add(quarto);
	}

	public void addReserva(Reserva reserva) {
		lReservas.add(reserva);
	}

	public void viewClientes() {
		for (Cliente c : lClientes)
			System.out.println(c);
	}

	public List<Cliente> getlClientes() {
		return lClientes;
	}

	public void setlClientes(List<Cliente> lClientes) {
		this.lClientes = lClientes;
	}

	public List<Funcionario> getlFuncionarios() {
		return lFuncionarios;
	}

	public void setlFuncionarios(List<Funcionario> lFuncionarios) {
		this.lFuncionarios = lFuncionarios;
	}

	public List<Reserva> getlReservas() {
		return lReservas;
	}

	public void setlReservas(List<Reserva> lReservas) {
		this.lReservas = lReservas;
	}

	public List<Quarto> getlQuartos() {
		return lQuartos;
	}

	public void setlQuartos(List<Quarto> lQuartos) {
		this.lQuartos = lQuartos;
	}

	public Cliente buscaCliente(String nome) {
		for (Cliente c : lClientes) {
			if (c.getNome().equals(nome))
				return c;
		}
		return null;
	}

	public Funcionario buscaFuncionario(String nome) {
		for (Funcionario f : lFuncionarios) {
			if (f.getNome().equals(nome))
				return f;
		}
		return null;
	}

	public Quarto buscaQuarto(int numero) {
		for (Quarto q : lQuartos) {
			if (q.getNumero() == numero)
				return q;
		}
		return null;
	}

	public List<Quarto> buscarQuartosDisponiveis() {
		List<Quarto> temp = new ArrayList<Quarto>();
		for (Quarto q : lQuartos) {
			if (q.isDisponibilidade()) {
				temp.add(q);
			}
		}
		return temp;
	}

	public List<Quarto> buscarQuartosIndisponiveis() {
		List<Quarto> temp = new ArrayList<Quarto>();
		for (Quarto q : lQuartos) {
			if (!q.isDisponibilidade()) {
				temp.add(q);
			}
		}
		return temp;
	}

}
