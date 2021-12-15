package com.github.NorIce0.cuestionadosguedapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.NorIce0.cuestionadosguedapp.entities.Respuesta;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Integer> {

}
