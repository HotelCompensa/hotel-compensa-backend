package br.com.hotelcompensa.model;

public class Telefone {
	
	private Long id;
	private String ddd;
	private String telefone;
	private String flagTelefonePrincipal;
	private String tipoTelefone;
	
	
	public Telefone(Long id, String ddd, String telefone, String flagTelefonePrincipal, String tipoTelefone) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.telefone = telefone;
		this.flagTelefonePrincipal = flagTelefonePrincipal;
		this.tipoTelefone = tipoTelefone;
	}
	
	public Telefone() {
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getFlagTelefonePrincipal() {
		return flagTelefonePrincipal;
	}
	public void setFlagTelefonePrincipal(String flagTelefonePrincipal) {
		this.flagTelefonePrincipal = flagTelefonePrincipal;
	}
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
}
