package br.com.hotelcompensa.dto;

 
import java.time.LocalDateTime;

public class ClienteDTO {
	
	private Long id;
	private String nome;
	private String sobrenome;
	private LocalDateTime dataNascimento;
	private String email;
	private String cpf;
	private char sexo;
	private EnderecoDTO endereco;
	private TelefoneDTO telefone;
	
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
	public TelefoneDTO getTelefone() {
		return telefone;
	}
	public void setTelefone(TelefoneDTO telefone) {
		this.telefone = telefone;
	}
	public EnderecoDTO getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
}