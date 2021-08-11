package br.com.hotelcompensa.service;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.hotelcompensa.entity.ClienteEntity;
import br.com.hotelcompensa.model.Cliente;
import br.com.hotelcompensa.repository.ClienteRepository;

@ApplicationScoped
public class ClienteService {

	private static final Logger LOG = Logger.getLogger(ClienteService.class);

	@Inject
	ClienteRepository repository;

	@Inject
	ObjectMapper mapper;

	public Cliente retornaClientePorId(Long id) {

		ClienteEntity entity = repository.findById(id);
		Cliente cliente = mapper.convertValue(entity, Cliente.class);

		return cliente;
	}

	public Response atualizar(Cliente cliente, Long id) {

		cliente.setId(id);
		ClienteEntity entity = repository.findById(id);
		entity.setCpf(cliente.getCpf());

		repository.persist(entity);
		
	
		return Response.ok("Cliente atualizado com sucesso").build();
	}

	public void criarCliente(Cliente cliente) {

		ClienteEntity entity = mapper.convertValue(cliente, ClienteEntity.class);
		try {
			repository.persist(entity);
		} catch (Exception e) {
			LOG.info("Erro ao salvar cliente" + e.getMessage());
		}

	}

	public List<Cliente> findAll() {
		List<ClienteEntity> listEntity = repository.listAll();
		List<Cliente> clientes = null;

		LOG.info("listEntity: " + listEntity);

		Cliente[] cliente = mapper.convertValue(listEntity, Cliente[].class);

		clientes = Arrays.asList(cliente);

		return clientes;
	}

}
