package com.app.proyecto.modelos;


import jakarta.persistence.*;

@Entity
@Table(name = "pelicula")
public class Pelicula {

	@Id
	private String imdbID;
    
    @Column(nullable = false)
    private String titulo;
    
    @Column(nullable = false)
    private String año;
    
    @Column(nullable = false)
    private String poster;
    
    @Column
    private Integer valoracion; // Cambiado de int a Integer


	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String year) {
		this.año = year;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	
}

