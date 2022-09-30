package com.fiap.sprint3MS.models;

import java.util.Date;

public class ProdutoModel {

	private long idProduto;
	private double valorPreco;
	private double valorTamanho;
	private String nomeProduto;
	private Date dtAlteracao;
	private Date dtCadastro;

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public double getValorPreco() {
		return valorPreco;
	}

	public void setValorPreco(double valorPreco) {
		this.valorPreco = valorPreco;
	}

	public double getValorTamanho() {
		return valorTamanho;
	}

	public void setValorTamanho(double valorTamanho) {
		this.valorTamanho = valorTamanho;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Date getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
	
}
