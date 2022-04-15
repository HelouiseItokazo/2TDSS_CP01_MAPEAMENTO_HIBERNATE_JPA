package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fiap.enumeration.Uf;



@Entity
@SequenceGenerator(name = "cidade", sequenceName = "SQ_TB_CIDADES", allocationSize = 1)
@Table(name = "TB_CIDADES")
public class Cidade {
	
	@Id
	@GeneratedValue(generator = "cidade", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_cidade")
	private Integer id;
	
	@Column(name = "nm_cidade", length = 250)
	private String cidade;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "id_uf", length = 2)
	private Uf uf;
	
	public Cidade(String cidade, Uf uf) {
		this.cidade = cidade;
		this.uf = uf;
	}

	//Constructors
	public Cidade() {}
	
	
	
	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Cidade [id=" + id + ", cidade=" + cidade + ", uf=" + uf + "]";
	}
	
}//Cidade
