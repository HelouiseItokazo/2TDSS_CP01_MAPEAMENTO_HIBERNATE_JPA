package br.com.fiap.entity;

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

import br.com.fiap.enumeration.SituacaoVisao;

@Entity
@SequenceGenerator(name = "usuario", sequenceName = "SQ_TB_USUARIO", allocationSize = 1)
@Table(name = "TB_USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(generator = "usuario", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_usuario")
	private Integer id;
	
	@Column(name = "nm_cpf", unique = true, precision = 11)
	private Long cpf;
	
	@Column(name = "ds_nome_completo", length = 250, nullable = false)
	private String nomeCompleto;
	
	@Column(name = "dt_nascimento", nullable = false)
	private LocalDate dataNascimento;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "st_visao", length = 100, nullable = false)
	private SituacaoVisao situacaoVisao;
	
	@Column(name = "ds_email", length = 250, nullable = false)
	private String email;
	
	@Column(name = "nm_usuario", length = 50, nullable = false)
	private String nomeUsuario;
	
	//TODO Criptografar
	@Column(name = "ds_senha", length = 50, nullable = false)
	private String senha;
	
	@Column(name = "st_cadastro", nullable = false)
	private Boolean situacaoCadastro;
	
	@Column(name = "dt_cadastro", nullable = false)
	private LocalDate dataCadastro;
	
	@Column(name = "dt_atualizacao")
	private LocalDate dataAtualizacao;
		
	//Constructors
	public Usuario() {}

	public Usuario(Long cpf, String nomeCompleto, LocalDate dataNascimento, SituacaoVisao situacaoVisao,
			String email, String nomeUsuario, String senha, Boolean situacaoCadastro, LocalDate dataCadastro) {
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.situacaoVisao = situacaoVisao;
		this.email = email;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.situacaoCadastro = situacaoCadastro;
		this.dataCadastro = dataCadastro;
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public SituacaoVisao getSituacaoVisao() {
		return situacaoVisao;
	}

	public void setSituacaoVisao(SituacaoVisao situacaoVisao) {
		this.situacaoVisao = situacaoVisao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getSituacaoCadastro() {
		return situacaoCadastro;
	}

	public void setSituacaoCadastro(Boolean situacaoCadastro) {
		this.situacaoCadastro = situacaoCadastro;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", cpf=" + cpf + ", nomeCompleto=" + nomeCompleto + ", dataNascimento="
				+ dataNascimento + ", situacaoVisao=" + situacaoVisao + ", email=" + email + ", nomeUsuario="
				+ nomeUsuario + ", senha=" + senha + ", situacaoCadastro=" + situacaoCadastro + ", dataCadastro="
				+ dataCadastro + ", dataAtualizacao=" + dataAtualizacao + "]";
	}
	
}//Usuario
