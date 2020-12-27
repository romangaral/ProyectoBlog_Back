package com.daw.models.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "entradas")
public class Entrada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEntrada;
	
	private String titulo;
	private String texto;
	private int valoracion;
	
	@Column(name = "fecha_subida")
	@Temporal(TemporalType.DATE)
	private Date fechaSubida;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "entrada")
	private List<Comentario> comentarios;

	public Long getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(Long idEntrada) {
		this.idEntrada = idEntrada;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public Date getFechaSubida() {
		return fechaSubida;
	}

	public void setFechaSubida(Date fechaSubida) {
		this.fechaSubida = fechaSubida;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	

}
