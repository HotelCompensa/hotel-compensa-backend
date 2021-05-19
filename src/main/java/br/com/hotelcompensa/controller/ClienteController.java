package br.com.hotelcompensa.controller;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import br.com.hotelcompensa.dto.ClienteDTO;
import br.com.hotelcompensa.service.ClienteService;

@Path("/api/v1/clientes")
@ApplicationScoped
public class ClienteController {

	@Inject
	ClienteService service;

	

	@GET
	public List<ClienteDTO> listarClientes() {
		return service.findAll();

	}

}
