package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "estabelecimento", sequenceName = "SQ_TB_ESTABELECIMENTO", allocationSize = 1)
@Table(name = "TB_ESTABELECIMENTO")
public class Estabelecimento {
	
	@Id
	@GeneratedValue(generator = "estabelecimento", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_estabelecimento")
	private Integer id;
	
	@Column(name = "nm_estabelecimento", length = 250, nullable = false)
	private String nome;
	
	@Column(name = "nr_cnpj", precision = 12, nullable = false)
	private Long cnpj;
	
	//Constructors
	public Estabelecimento() {}

	public Estabelecimento(String nome, Long cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	
}//Estabelecimento
