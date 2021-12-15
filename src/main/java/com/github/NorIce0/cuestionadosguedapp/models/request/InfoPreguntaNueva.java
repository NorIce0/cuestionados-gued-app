package com.github.NorIce0.cuestionadosguedapp.models.request;

import java.util.List;

import com.github.NorIce0.cuestionadosguedapp.entities.Respuesta;

public class InfoPreguntaNueva {
	public String enunciado;
	public List<Respuesta> opciones;
	public Integer categoriaId;
}
