package br.com.hotelcompensa.service;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

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

	@Transactional
	public void criarCliente(Cliente cliente) {
		ClienteEntity entity = mapper.convertValue(cliente, ClienteEntity.class);

		repository.persist(entity);

	}

	public List<Cliente> findAll() {
		List<ClienteEntity> listEntity = repository.listAll();
		
		LOG.info("listEntity: "  + listEntity);
		

		Cliente[] cliente = mapper.convertValue(listEntity, Cliente[].class);
		
		List<Cliente> clientes = Arrays.asList(cliente);

		return clientes;
	}

}
