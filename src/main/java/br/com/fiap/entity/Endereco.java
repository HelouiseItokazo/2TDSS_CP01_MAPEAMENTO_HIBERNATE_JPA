package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "endereco", sequenceName = "SQ_TB_ENDERECO", allocationSize = 1)
@Table(name = "TB_ENDERECO")
public class Endereco {
	
	@Id
	@GeneratedValue(generator = "endereco", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_end")
	private Integer id;
	
	@Column(name = "ds_logradouro", length = 250, nullable = false)
	private String logradouro;
	
	@Column(name = "ds_complemento", length = 250)
	private String complemento;
	
	@Column(name = "nm_bairro", length = 150, nullable = false)
	private String bairro;
	
	@Column(name = "nr_cep", precision = 8, nullable = false)
	private Integer cep;
	
	//Constructors
	public Endereco() {}

	public Endereco(String logradouro, String complemento, String bairro, Integer cep) {
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro="
				+ bairro + ", cep=" + cep + "]";
	}
	
}//Endereco
