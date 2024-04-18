package com.app.proyecto.services;

import java.util.List;

import com.app.proyecto.modelos.Pelicula;

public interface PeliculaService {

	public List<Pelicula> listarTodasLasPeliculas();
	
	public Pelicula buscarPelicula(String imdbID);

	public List<Pelicula> mostrarPeliculaPorNombre(String titulo);
	
	public List<String> recibirAños();
	
	public List<Integer> recibirValoraciones();
	
	public List<Pelicula> buscarPorAño(String año);
	
	public List<Pelicula> buscarPorValoracion(int valoracion);
	
	public void actualizarValoracion(String imdbID, int valoracion);
}
