package com.app.proyecto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.proyecto.modelos.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, String>{

	
	@Query("SELECT p FROM Pelicula p WHERE p.titulo LIKE %:titulo%")
    List<Pelicula> buscarPorTitulo(@Param("titulo") String titulo);
	
	@Query("SELECT DISTINCT p.año FROM Pelicula p")
    List<String> listarAños();
	
	@Query("SELECT DISTINCT p.valoracion FROM Pelicula p")
    List<Integer> listarValoraciones();
	
	@Query("SELECT p FROM Pelicula p WHERE p.año = :año")
	List<Pelicula> buscarPorAño(@Param("año") String año);

	@Query("SELECT p FROM Pelicula p WHERE p.valoracion = :valoracion")
	List<Pelicula> buscarPorValoracion(@Param("valoracion") int valoracion);
	
	@Transactional
	@Modifying
    @Query("UPDATE Pelicula p SET p.valoracion = :valoracion WHERE p.imdbID = :imdbID")
    void actualizarValoracion(@Param("imdbID") String imdbID, @Param("valoracion") int valoracion);

	@Query("SELECT p FROM Pelicula p WHERE p.imdbID = :id")
	Pelicula buscarPelicula(@Param("id") String id);


}
