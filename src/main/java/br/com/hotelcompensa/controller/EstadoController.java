package br.com.hotelcompensa.controller;

import java.util.List;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import br.com.hotelcompensa.entity.EstadoEntity;
import br.com.hotelcompensa.service.EstadoService;

@Path("/api/v1/estados")
@ApplicationScoped
public class EstadoController {

	@Inject
	EstadoService service;

	@GET
	public List<EstadoEntity> listarEstados() {

		return service.findAll();

	}

}
