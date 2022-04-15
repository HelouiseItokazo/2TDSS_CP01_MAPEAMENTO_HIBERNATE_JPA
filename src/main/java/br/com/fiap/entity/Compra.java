package br.com.fiap.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "compra", sequenceName = "SQ_TB_COMPRA", allocationSize = 1)
@Table(name = "TB_COMPRA")
public class Compra {
	
	@Id
	@GeneratedValue(generator = "compra", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_compra")
	private Integer id;
	
	@Column(name = "vl_total_compra", precision = 12, scale = 2)
	private BigDecimal valor;
	
	//Constructors
	public Compra() {}

	public Compra(BigDecimal valor) {
		this.valor = valor;
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", valor=" + valor + "]";
	}
	
}//Compra
