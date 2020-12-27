package com.daw.models.entity;

import java.util.ArrayList;
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

	public Entrada() {
		super();
		comentarios = new ArrayList<Comentario>();
	}

	public Entrada(Long idEntrada, String titulo, String texto, int valoracion, Date fechaSubida, Usuario usuario,
			List<Comentario> comentarios) {
		super();
		this.idEntrada = idEntrada;
		this.titulo = titulo;
		this.texto = texto;
		this.valoracion = valoracion;
		this.fechaSubida = fechaSubida;
		this.usuario = usuario;
		this.comentarios = comentarios;
	}

	public Entrada(String titulo, String texto, int valoracion, Date fechaSubida, Usuario usuario) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.valoracion = valoracion;
		this.fechaSubida = fechaSubida;
		this.usuario = usuario;
		comentarios = new ArrayList<Comentario>();
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaSubida == null) ? 0 : fechaSubida.hashCode());
		result = prime * result + ((idEntrada == null) ? 0 : idEntrada.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + valoracion;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrada other = (Entrada) obj;
		if (fechaSubida == null) {
			if (other.fechaSubida != null)
				return false;
		} else if (!fechaSubida.equals(other.fechaSubida))
			return false;
		if (idEntrada == null) {
			if (other.idEntrada != null)
				return false;
		} else if (!idEntrada.equals(other.idEntrada))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (valoracion != other.valoracion)
			return false;
		return true;
	}

}
