package com.app.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.proyecto.modelos.Pelicula;
import com.app.proyecto.repositorio.PeliculaRepository;

@Service
public class PeliculaServiceImpl implements PeliculaService{

	@Autowired
	private PeliculaRepository repository;
	
	@Override
	public List<Pelicula> listarTodasLasPeliculas() {
		return repository.findAll();
	}
	
	@Override
	public Pelicula buscarPelicula(String imdbID) {
		return (Pelicula) repository.buscarPelicula(imdbID);
	}

	@Override
	public List<Pelicula> mostrarPeliculaPorNombre(String titulo) {
		return repository.buscarPorTitulo(titulo);
	}

	@Override
	public List<String> recibirAños() {
		// TODO Auto-generated method stub
		return repository.listarAños();
	}
	
	@Override
	public List<Integer> recibirValoraciones() {
		// TODO Auto-generated method stub
		return repository.listarValoraciones();
	}

	@Override
	public List<Pelicula> buscarPorAño(String año) {
		return repository.buscarPorAño(año);
	}
	
	@Override
	public List<Pelicula> buscarPorValoracion(int valoracion) {
		// TODO Auto-generated method stub
		return repository.buscarPorValoracion(valoracion);
	}

	@Override
    public void actualizarValoracion(String imdbID, int valoracion) {
		repository.actualizarValoracion(imdbID, valoracion);
    }

}
