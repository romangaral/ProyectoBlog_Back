package com.daw.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "comentarios")
public class Comentario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idComentario;

	private String texto;

	@Column(name = "fecha_comentario")
	@Temporal(TemporalType.DATE)
	private Date fechaComentario;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "id_entrada")
	private Entrada entrada;

	public Comentario() {
		super();
	}

	public Comentario(Long idComentario, String texto, Date fechaComentario, Usuario usuario, Entrada entrada) {
		super();
		this.idComentario = idComentario;
		this.texto = texto;
		this.fechaComentario = fechaComentario;
		this.usuario = usuario;
		this.entrada = entrada;
	}

	public Comentario(String texto, Date fechaComentario) {
		super();
		this.texto = texto;
		this.fechaComentario = fechaComentario;
	}

	public Long getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(Long idComentario) {
		this.idComentario = idComentario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getFechaSubida() {
		return fechaComentario;
	}

	public void setFechaSubida(Date fechaSubida) {
		this.fechaComentario = fechaSubida;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Entrada getEntrada() {
		return entrada;
	}

	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

}
