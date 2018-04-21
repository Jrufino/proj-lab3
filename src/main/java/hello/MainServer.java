package hello;

import static spark.Spark.*;

import model.Cama;
import model.Funcionario;

public class MainServer {

	final static Model model = new Model();

	public static void main(String[] args) {

		// Get port config of heroku on environment variable
		ProcessBuilder process = new ProcessBuilder();
		Integer port;
		if (process.environment().get("PORT") != null) {
			port = Integer.parseInt(process.environment().get("PORT"));
		} else {
			port = 8080;
		}
		port(port);

		// Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarCarros();

		inicializarQuartos();

		inicializarFuncionarios();

		Controller controller = new Controller(model);

		controller.buscarQuarto();
		
		controller.buscarQuartosPorTipo();
		
		//controller.buscarCarro();

		controller.buscarFuncionarioPorCpf();

		controller.buscarCarroPorPlaca();

	}

	private static void inicializarFuncionarios() {
		model.addFuncionario(
				new Funcionario("José Paulo", "123", "josep", "paulo", "josepaulo@hotel.com", "gerente", null));

		model.addFuncionario(new Funcionario("Ana Maria", "1234", "anam", "ana", "ana@hotel.com", "atendente", null));

		model.addFuncionario(
				new Funcionario("Fabricio Nunes", "343", "fabricio", "f", "fabricio@hotel.com", "porteiro", null));

	}

	public static void inicializarCarros() {
		model.addCarro(new Carro("AAA-1111", new Especificacao("gol", "vw", "verde")));
	}

	public static void inicializarQuartos() {
		Cama camasSimples[] = new Cama[2];
		camasSimples[0] = new Cama("solteiro", false);
		camasSimples[1] = new Cama("solteiro", false);

		Cama maisCamas[] = new Cama[3];
		maisCamas[0] = new Cama("solteiro", false);
		maisCamas[1] = new Cama("solteiro", false);
		maisCamas[2] = new Cama("casal", false);

		Cama camasLuxo[] = new Cama[2];
		camasLuxo[0] = new Cama("casal", false);

		// arCond, frigo wifi
		model.addQuarto(new Quarto(1, new EspecificacaoQuarto(camasSimples, "simples", "true", "false", "true")));
		model.addQuarto(new Quarto(2, new EspecificacaoQuarto(maisCamas, "simples", "false", "false", "false")));
		model.addQuarto(new Quarto(3, new EspecificacaoQuarto(camasSimples, "simples", "true", "false", "true")));
		model.addQuarto(new Quarto(3, new EspecificacaoQuarto(camasLuxo, "luxo", "true", "true", "true")));
	}
}
