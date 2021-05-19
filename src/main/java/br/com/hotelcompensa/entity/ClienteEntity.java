package br.com.hotelcompensa.entity;

 
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name="CLIENTE")
public class ClienteEntity extends PanacheEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "SOBRENOME")
	private String sobrenome;
	
	@Column(name = "DATA_NASCIMENTO")
	private LocalDateTime dataNascimento;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "SEXO")
	private char sexo;
	
	@OneToOne
	@JoinColumn(name = "ID_TELEFONE")
	private TelefoneEntity telefone;
	
	@OneToOne
	@JoinColumn(name = "ID_ENDERECO")
	private EnderecoEntity endereco;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public TelefoneEntity getTelefone() {
		return telefone;
	}
	public void setTelefone (TelefoneEntity telefone) {
		this.telefone = telefone;
	}
	public EnderecoEntity getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}
	
}