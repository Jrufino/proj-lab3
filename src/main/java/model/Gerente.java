package model;

import java.util.List;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, String login, String senha, String email, String funcao,
			Funcionario chefe) {
		super(nome, cpf, login, senha, email, funcao, chefe);
	}

	public boolean setRealizarManutencaoQuarto(List<Quarto> quartos, Quarto quartoSelecionado) {
		System.out.println("Interditar quarto para manutencao ..");
		for (Quarto q : quartos) {
			if (q.equals(quartoSelecionado)) {
				if (quartoSelecionado.isOcupado()) {
					System.out.println("O quarto " + q.getNumero() + " n�o pode ser"
							+ "colocado em manuten��o pois esta ocupado ou indispon�vel.");
					return false;
				} else {
					quartoSelecionado.setDisponibilidade(false);
					System.out.println("O Quarto " + q.getNumero() + " foi colado em manuten��o.");
					return true;
				}
			}
		}
		return false;
	}

	public boolean setLiberarQuartoManutencao(List<Quarto> quartos, Quarto quartoSelecionado) {
		System.out.println("Liberar quarto para manutencao ..");
		for (Quarto q : quartos) {
			if (q.equals(quartoSelecionado)) {
				if (q.isDisponibilidade()) {
					System.out.println("Quarto j� encontra-se dispon�vel para reserva, "
							+ " portanto n�o pode ser liberado para reserva.");
					return false;
				} else {
					quartoSelecionado.setDisponibilidade(true);
					System.out.println("Quarto " + q.getNumero() + " esta em manuten��o.");
					return true;
				}
			}
		}
		return false;
	}

	public boolean agendaCliente(List<Quarto> quartos, Quarto quartoSelecionado, Cliente clienteLuiz) {
		System.out.println("Agendando cliente em quarto ..");
		for (Quarto q : quartos) {
			if (q.equals(quartoSelecionado)) {
				if (q.isDisponibilidade()) {
					q.reservarCliente(clienteLuiz);
					return true;
				} else {
					quartoSelecionado.setDisponibilidade(true);
					System.out.println("Quarto " + q.getNumero() + " n�o esta dispon�vel para ser reservado.");
					return false;
				}
			}
		}
		return false;

	}

}
