package br.com.hotelcompensa.controller;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import br.com.hotelcompensa.model.Cliente;
import br.com.hotelcompensa.service.ClienteService;

@Path("/api/v1/clientes")
@ApplicationScoped
public class ClienteController {

	@Inject
	ClienteService service;

	@GET
	@Path ("/{id}")
	public Cliente listarClientePorId(@PathParam Long id) {
		return service.retornaClientePorId(id);

	}
	

	@GET
	public List<Cliente> listarClientes() {
		return service.findAll();

	}

}
