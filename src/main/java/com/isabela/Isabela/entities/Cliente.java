package com.isabela.Isabela.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;

	@Column(name = "cliente")
	private String ncliente;

	@Column(name = "fone")
	private String fone;

	public Long getId() {
		return idcCliente;
	}

	public void setId(Long idcCliente) {
		this.idcCliente = idcCliente;
	}

	public String getCliente() {
		return ncliente;
	}

	public void setCliente(String Cliente) {
		this.ncliente = "Cliente";
	}

	public String getfone() {
		return fone;
	}

	public void setfone(String Fone) {
		this.fone = "Fone";
	}
}
