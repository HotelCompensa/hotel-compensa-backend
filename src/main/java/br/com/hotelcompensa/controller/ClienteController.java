package br.com.hotelcompensa.controller;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import br.com.hotelcompensa.model.Cliente;
import br.com.hotelcompensa.service.ClienteService;

@Path("/api/v1/clientes")
@ApplicationScoped
public class ClienteController {

	@Inject
	ClienteService service;

	@GET
	@Path("/{id}")
	public Cliente listarPorId(@PathParam Long id) {
		return service.retornaClientePorId(id);

	}
	
	@PUT
	@Transactional
	@Path("/atualizar/{id}")
	public Response atualizar(Cliente cliente, @PathParam Long id) {
		return service.atualizar(cliente, id);

	}
	
	@GET
	public List<Cliente> listarTodos() {
		return service.findAll();

	}

	@POST
	@Path("/criar")
	@Transactional
	public void criar(Cliente cliente) {
		service.criarCliente(cliente);

	}

	

}
