package com.daw.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;

	private String nombre;
	private String apellido;
	private String email;

	@Temporal(TemporalType.DATE)
	private Date fechaAlta;
	
	@OneToMany(mappedBy="usuario",fetch=FetchType.EAGER,cascade= CascadeType.ALL, orphanRemoval=true)
	private List<UsuarioRol> roles;
	
	@OneToMany(mappedBy="usuario",fetch=FetchType.EAGER,cascade= CascadeType.ALL, orphanRemoval=true)
	private List<Entrada> entradas ;
	
	@OneToMany(mappedBy="usuario",fetch=FetchType.EAGER,cascade= CascadeType.ALL, orphanRemoval=true)
	private List<Comentario> comentarios;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

}
