package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

import model.Funcionario;

public class Controller {

	private Model model;

	public Controller(Model model) {
		this.model = model;
	}

	public void buscarQuarto() {
		get("/quartos/:tipo", (req, res) -> {

			List<Quarto> quartosEncontrados = model.buscarQuartoPorTipo(req.params(":tipo"));
			return new Gson().toJson(quartosEncontrados);
		});
	}
	
	public void buscarQuartosPorTipo() {
		get("/quarto/:tipoCama/:qualidade", (req, res) -> {

			String tipoCama = req.params(":tipoCama");
			String qualidade = req.params(":qualidade");				

			List<Quarto> quartosEncontrados = model.buscarEspecificacao(tipoCama, qualidade);
			return new Gson().toJson(quartosEncontrados);
		});
	}
	
	
//	public void buscarQuartosPorTipo() {
//		get("/quarto/:tipo/:arcond/:frig/:wifi", (req, res) -> {
//
//			EspecificacaoQuarto esp = new EspecificacaoQuarto(null, req.params(":tipo"), req.params(":arcond"),
//					req.params(":frig"), req.params(":wifi"));
//
//			List<Quarto> quartosEncontrados = model.buscarEspecificacao(esp);
//			return new Gson().toJson(quartosEncontrados);
//		});
//	}

	public void buscarFuncionarioPorCpf() {
		get("/funcionario/:cpf", (req, res) -> {

			Funcionario funcionario = model.buscarFuncionarioPorCpf(req.params(":cpf"));
			return new Gson().toJson(funcionario);

		});
	}

	public void buscarCarro() {
		get("/carro/:modelo/:marca/:cor", (req, res) -> {

			Especificacao espec = new Especificacao(req.params(":modelo"), req.params(":marca"), req.params(":cor"));
			List<Carro> carrosEncontrados = model.buscarEspecificacao(espec);
			return new Gson().toJson(carrosEncontrados);

		});
	}

	public void buscarCarroPorPlaca() {
		get("/carroPlaca/:placa", (req, res) -> {

			Carro carro = model.buscarPlaca(req.params(":placa"));
			return new Gson().toJson(carro);

		});

	}

}
