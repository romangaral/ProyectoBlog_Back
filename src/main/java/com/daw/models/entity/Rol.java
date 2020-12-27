package com.daw.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRol;

	private String tipo;
	
	@OneToMany(mappedBy="rol",fetch=FetchType.EAGER,cascade= CascadeType.ALL, orphanRemoval=true)
	private List<UsuarioRol> usuarios;

	public Long getIdrol() {
		return idRol;
	}

	public void setIdrol(Long idrol) {
		this.idRol = idrol;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

}
