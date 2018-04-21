package model;

import java.util.Date;
//bootstrap themes
public class Reserva {
	private Cliente autorReserva;
	private Date dataCriacao;
	private Date dataDeInicioPrevisto;
	private Date dataDeTerminoPrevisto;
	private Quarto[] quartosReservados;
	private double valorCustos;
	private double valorDescontos;
	private double valorPagamento;
	private Date dataPagamento;
	private Cliente[] hospedesAssociados;

	private Reserva(Cliente autorReserva) {
		this.autorReserva = autorReserva;
	}

	public Cliente getAutorReserva() {
		return autorReserva;
	}

	public void setAutorReserva(Cliente autorReserva) {
		this.autorReserva = autorReserva;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataDeInicioPrevisto() {
		return dataDeInicioPrevisto;
	}

	public void setDataDeInicioPrevisto(Date dataDeInicioPrevisto) {
		this.dataDeInicioPrevisto = dataDeInicioPrevisto;
	}

	public Date getDataDeTerminoPrevisto() {
		return dataDeTerminoPrevisto;
	}

	public void setDataDeTerminoPrevisto(Date dataDeTerminoPrevisto) {
		this.dataDeTerminoPrevisto = dataDeTerminoPrevisto;
	}

	public Quarto[] getQuartosReservados() {
		return quartosReservados;
	}

	public void setQuartosReservados(Quarto[] quartosReservados) {
		this.quartosReservados = quartosReservados;
	}

	public double getValorCustos() {
		return valorCustos;
	}

	public void setValorCustos(double valorCustos) {
		this.valorCustos = valorCustos;
	}

	public double getValorDescontos() {
		return valorDescontos;
	}

	public void setValorDescontos(double valorDescontos) {
		this.valorDescontos = valorDescontos;
	}

	public double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Cliente[] getHospedesAssociados() {
		return hospedesAssociados;
	}

	public void setHospedesAssociados(Cliente[] hospedesAssociados) {
		this.hospedesAssociados = hospedesAssociados;
	}

}
