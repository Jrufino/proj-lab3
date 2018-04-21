package control;

import java.util.Calendar;
import java.util.Date;

import model.Cliente;
import model.Funcionario;
import model.Modelo;
import model.Quarto;
import model.Reserva;

public class Main {

	public static void main(String[] args) {
		Modelo modelo = new Modelo();

		Cliente clientePaulo = new Cliente("Paulo Carvalho", "245", "emailpaulo@fatec.sp.gov.br",
				Calendar.getInstance());
		Cliente clienteLuiz = new Cliente("Luiz", "345", "emailluiz@fatec.sp.gov.br", Calendar.getInstance());

		Quarto quartoNormal1 = null;
		Quarto quartoNormal2 = null;
		Quarto quartoNormal3 = null;
		Quarto quartoNormal4 = null;

		Quarto quartoLuxo1 = null;
		Quarto quartoLuxo2 = null;
		Quarto quartoLuxo3 = null;
		Quarto quartoLuxo4 = null;

		Funcionario funcionarioSergio = new Funcionario("Fabio", "22", "funcFabio", "123", "fabio@hotel.com", "gerente",
				null);
		Funcionario funcionarioMaria = new Funcionario("Maria", "224", "funcMaria", "1234", "maria@hotel.com",
				"atendente", funcionarioSergio);
		Funcionario funcionarioPedro = new Funcionario("Pedro", "2212", "funcPedro", "12356", "pedro@hotel.com",
				"atendente", funcionarioSergio);

		modelo.addCliente(clientePaulo);
		modelo.addCliente(clienteLuiz);

		modelo.addQuarto(quartoNormal1);
		modelo.addQuarto(quartoNormal2);
		modelo.addQuarto(quartoNormal3);
		modelo.addQuarto(quartoNormal4);
		modelo.addQuarto(quartoLuxo1);
		modelo.addQuarto(quartoLuxo2);
		modelo.addQuarto(quartoLuxo3);
		modelo.addQuarto(quartoLuxo4);

		modelo.addFuncionario(funcionarioSergio);
		modelo.addFuncionario(funcionarioMaria);
		modelo.addFuncionario(funcionarioPedro);

		Calendar future = Calendar.getInstance();
		future.setTime(new Date());
		future.add(Calendar.DATE, 4);
		//Reserva r = new Reserva(1, clientePaulo, quartoNormal1, funcionarioPedro, Calendar.getInstance(), future);

		modelo.viewClientes();
		System.out.println(quartoNormal1);

	}
}