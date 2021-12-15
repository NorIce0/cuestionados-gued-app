package com.github.NorIce0.cuestionadosguedapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.NorIce0.cuestionadosguedapp.entities.Pregunta;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {

	Pregunta findById(int id);

	Pregunta findByEnunciado(String enunciado);
}
