package br.com.hotelcompensa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name="TELEFONE")
public class TelefoneEntity extends PanacheEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "DDD")
	private String ddd;
	
	@Column(name = "TELEFONE")
	private String telefone;
	
	@Column(name = "FLAG_TEL_PRINCIPAL")
	private String flagTelefonePrincipal;
	
	@Column(name = "TIPO_TELEFONE")
	private String tipoTelefone;
	
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
