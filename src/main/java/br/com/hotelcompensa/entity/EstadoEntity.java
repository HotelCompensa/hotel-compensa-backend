package br.com.hotelcompensa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "ESTADO")
public class EstadoEntity extends PanacheEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ID")
	public Long id;

	@Column(name = "DESCRICAO")
	public String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
