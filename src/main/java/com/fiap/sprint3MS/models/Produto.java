package com.fiap.sprint3MS.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {

	public Produto() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private long idProduto;
	
	@Column(name = "vl_preco")
	private double valorPreco;
	
	@Column(name = "vl_tamanho")
	private double valorTamanho;
	
	@Column(name = "nm_produto")
	private String nomeProduto;
	
	@Column(name = "dt_alteracao")
	private Date dtAlteracao;

	@Column(name = "dt_cadastro")
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
