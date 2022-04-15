package br.com.fiap.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fiap.enumeration.BandeiraCartao;

@Entity
@SequenceGenerator(name = "cartaoCredito", sequenceName = "SQ_TB_CARTAO_CREDITO", allocationSize = 1)
@Table(name = "TB_CARTAO_CREDITO")
public class CartaoCredito {
	
	@Id
	@GeneratedValue(generator = "cartaoCredito", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_cartao")
	private Integer id;
	
	@Column(name = "nr_cartao", precision = 16)
	private Long numeroCartao;
	
	@Column(name = "dt_validade", precision = 4)
	private Integer mesEAnoValidade;
	
	@Column(name = "nr_cvv", precision = 3)
	private Integer cvv;
	
	@Enumerated
	@Column(name = "ds_bandeira", length = 50)
	private BandeiraCartao bandeira;
	
	//Constructors
	public CartaoCredito() {}

	public CartaoCredito(Long numeroCartao, Integer mesEAnoValidade, Integer cvv, BandeiraCartao bandeira) {
		this.numeroCartao = numeroCartao;
		this.mesEAnoValidade = mesEAnoValidade;
		this.cvv = cvv;
		this.bandeira = bandeira;
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public Integer getMesEAnoValidade() {
		return mesEAnoValidade;
	}

	public void setMesEAnoValidade(Integer mesEAnoValidade) {
		this.mesEAnoValidade = mesEAnoValidade;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public BandeiraCartao getBandeira() {
		return bandeira;
	}

	public void setBandeira(BandeiraCartao bandeira) {
		this.bandeira = bandeira;
	}
	
	@Override
	public String toString() {
		return "CartaoCredito [id=" + id + ", numeroCartao=" + numeroCartao + ", mesEAnoValidade=" + mesEAnoValidade
				+ ", cvv=" + cvv + ", bandeira=" + bandeira + "]";
	}
	
}//CartaoCredito
