package hello;

import java.util.List;

import model.Cama;
import model.Cliente;
import model.Funcionario;

import java.util.LinkedList;

public class Model {

	private List<Carro> carros = new LinkedList<Carro>();
	private List<Quarto> quartos = new LinkedList<Quarto>();
	private List<Funcionario> funcionarios = new LinkedList<Funcionario>();
	private List<Cliente> clientes = new LinkedList<Cliente>();

	/* adição de elementos */
	public boolean addCliente(Cliente cliente) {
		if (cliente != null && !clientes.contains(cliente)) {
			clientes.add(cliente);
			return true;
		}
		return false;
	}

	public boolean addFuncionario(Funcionario func) {
		if (func != null && !funcionarios.contains(func)) {
			funcionarios.add(func);
			return true;
		}
		return false;
	}

	public boolean addQuarto(Quarto quarto) {
		if (quarto != null && !quartos.contains(quarto)) {
			quartos.add(quarto);
			return true;
		}
		return false;
	}

	public void addCarro(Carro carro) {
		carros.add(carro);
	}

	/* busca de elementos */
	public Funcionario buscarFuncionario(String cpf) {
		for (Funcionario f : funcionarios) {
			if (f.getCpf().equals(cpf)) {
				return f;
			}
		}
		return null;
	}

	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}

	public Quarto buscarQuarto(int numeroQuarto) {
		Quarto toReturn = null;
		for (Quarto quarto : quartos) {
			if (quarto.getNumero() == numeroQuarto) {
				toReturn = quarto;
				break;
			}
		}
		return toReturn;
	}

	public List<Quarto> buscarEspecificacao(EspecificacaoQuarto esp) {
		List<Quarto> quartosEncontrados = new LinkedList<Quarto>();

		for (Quarto quarto : quartos) {
			if (esp.comparar(quarto.getEspecificacao())) {
				quartosEncontrados.add(quarto);
			}
		}
		return quartosEncontrados;
	}

	public Carro buscarPlaca(String placa) {
		Carro selecionado = null;
		for (Carro carro : carros) {
			if (carro.getPlaca().equals(placa)) {
				selecionado = carro;
				break;
			}			
		}

		return selecionado;
	}

	public List<Carro> buscarEspecificacao(Especificacao esp) {
		List<Carro> carrosEncontrados = new LinkedList<Carro>();

		for (Carro carro : carros) {
			if (esp.comparar(carro.getEspc()))
				carrosEncontrados.add(carro);
		}

		return carrosEncontrados;

	}

	public List<Quarto> getQuartos() {
		return this.quartos;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public Funcionario buscarFuncionarioPorCpf(String cpf) {

		Funcionario selecionado = null;

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getCpf().equals(cpf)) {
				selecionado = funcionario;
				break;
			}
		}
		return selecionado;
	}

	public Funcionario buscarFuncionarioPorLogin(String login) {
		Funcionario selecionado = null;

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getLogin().equals(login)) {
				selecionado = funcionario;
				break;
			}
		}
		return selecionado;
	}

	public List<Quarto> buscarQuartoPorTipo(String tipo) {
		List<Quarto> quartosEncontrados = new LinkedList<Quarto>();
		
		for (Quarto quarto : quartos) {
			if (quarto.getEspecificacao().getQualidade().equals(tipo)) {
				quartosEncontrados.add(quarto);
			}
		}
		return quartosEncontrados;
	}

	public List<Quarto> buscarEspecificacao(String tipoCama, String qualidade) {
        List<Quarto> quartosEncontrados = new LinkedList<Quarto>();
		
		for (Quarto quarto : quartos) {
			boolean found = false;
			if (tipoCama.equalsIgnoreCase("qualquer")) {
				found = true;
				System.out.println("qualquer tipo de cama");
			} else
			for (Cama cama : quarto.getEspecificacao().getCama()) {
				
				if (cama.getTipo().equalsIgnoreCase(tipoCama)) {
					System.out.println(cama.getTipo() + " == " + tipoCama);	
					found = true;
				}
			}
			if (found) {
			   if (qualidade.equalsIgnoreCase("qualquer")) {
				   quartosEncontrados.add(quarto);
			   } else 
				if (quarto.getEspecificacao().getQualidade().equalsIgnoreCase(qualidade)) {
				  quartosEncontrados.add(quarto);
			   }
			}
		}
		return quartosEncontrados;
	}

}
