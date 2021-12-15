package com.github.NorIce0.cuestionadosguedapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.NorIce0.cuestionadosguedapp.entities.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	Categoria findByNombre(String nombre);

	boolean existsByNombre(String nombre);

	Categoria findById(int id);
}