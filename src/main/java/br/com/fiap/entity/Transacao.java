package br.com.fiap.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fiap.enumeration.StatusTransacao;

@Entity
@SequenceGenerator(name = "transacao", sequenceName = "SQ_TB_TRANSACAO", allocationSize = 1)
@Table(name = "TB_TRANSACAO")
public class Transacao {
	
	@Id
	@GeneratedValue(generator = "transacao", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_transacao")
	private Integer id;
	
	@Column(name = "dt_transacao", nullable = false)
	private LocalDate dataTransacao;
	
	@Column(name = "st_parcelado", nullable = false)
	private Boolean ehParcelado;
	
	@Column(name = "nr_parcelas", precision = 2)
	private Integer quantidadeParcelas;
	
	@Column(name = "vl_parcelas", precision = 12, scale = 2)
	private BigDecimal valorParcelas;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "st_transacao", length = 100, nullable = false)
	private StatusTransacao statusTransacao;
	
	@Column(name = "vl_total_cartao", precision = 12, scale = 2)
	private BigDecimal valorTotal;
	
	//Constructors
	public Transacao() {}
	
	public Transacao(LocalDate dataTransacao, Boolean ehParcelado, Integer quantidadeParcelas, BigDecimal valorParcelas,
			StatusTransacao statusTransacao, BigDecimal valorTotal) {
		this.dataTransacao = dataTransacao;
		this.ehParcelado = ehParcelado;
		this.quantidadeParcelas = quantidadeParcelas;
		this.valorParcelas = valorParcelas;
		this.statusTransacao = statusTransacao;
		this.valorTotal = valorTotal;
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(LocalDate dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public Boolean getEhParcelado() {
		return ehParcelado;
	}

	public void setEhParcelado(Boolean ehParcelado) {
		this.ehParcelado = ehParcelado;
	}

	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(Integer quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public BigDecimal getValorParcelas() {
		return valorParcelas;
	}

	public void setValorParcelas(BigDecimal valorParcelas) {
		this.valorParcelas = valorParcelas;
	}

	public StatusTransacao getStatusTransacao() {
		return statusTransacao;
	}

	public void setStatusTransacao(StatusTransacao statusTransacao) {
		this.statusTransacao = statusTransacao;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Transacao [id=" + id + ", dataTransacao=" + dataTransacao + ", ehParcelado=" + ehParcelado
				+ ", quantidadeParcelas=" + quantidadeParcelas + ", valorParcelas=" + valorParcelas
				+ ", statusTransacao=" + statusTransacao + ", valorTotal=" + valorTotal + "]";
	}
	
}//Transacao
