package br.com.hotelcompensa.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.hotelcompensa.dto.ClienteDTO;
import br.com.hotelcompensa.dto.EnderecoDTO;
import br.com.hotelcompensa.dto.TelefoneDTO;
import br.com.hotelcompensa.entity.ClienteEntity;
import br.com.hotelcompensa.repository.ClienteRepository;

@ApplicationScoped
public class ClienteService {

	@Inject
	ClienteRepository repository;

	public List<ClienteDTO> findAll() {

		List<ClienteEntity> entity = repository.listAll();

		ArrayList<ClienteDTO> clientes = new ArrayList<ClienteDTO>();

		for (int i = 0; i < entity.size(); i++) {

			ClienteDTO cliente = new ClienteDTO();
			cliente.setId(entity.get(i).getId());
			cliente.setCpf(entity.get(i).getCpf());
			cliente.setDataNascimento(entity.get(i).getDataNascimento());
			cliente.setEmail(entity.get(i).getEmail());
			cliente.setNome(entity.get(i).getNome());
			cliente.setSobrenome(entity.get(i).getSobrenome());
			cliente.setSexo(entity.get(i).getSexo());

			cliente.setTelefone(new TelefoneDTO(entity.get(i).getTelefone().getId(),
					entity.get(i).getTelefone().getDdd(), entity.get(i).getTelefone().getTelefone(),
					entity.get(i).getTelefone().getFlagTelefonePrincipal(),
					entity.get(i).getTelefone().getTipoTelefone()));

			cliente.setEndereco(
					new EnderecoDTO(entity.get(i).getEndereco().getId(), entity.get(i).getEndereco().getCep(),
							entity.get(i).getEndereco().getLogradouro(), entity.get(i).getEndereco().getNumero(),
							entity.get(i).getEndereco().getComplemento(), entity.get(i).getEndereco().getBairro(),
							entity.get(i).getEndereco().getCidade(), entity.get(i).getEndereco().getEstado()));

			clientes.add(cliente);
		}

		return clientes;

	}

	public ClienteDTO findById(Long id) {

		ClienteEntity entity = repository.findById(id);

		ClienteDTO cliente = new ClienteDTO();
		cliente.setId(entity.getId());
		cliente.setCpf(entity.getCpf());
		cliente.setDataNascimento(entity.getDataNascimento());
		cliente.setEmail(entity.getEmail());
		cliente.setNome(entity.getNome());
		cliente.setSobrenome(entity.getSobrenome());
		cliente.setSexo(entity.getSexo());

		cliente.setTelefone(new TelefoneDTO(entity.getTelefone().getId(), entity.getTelefone().getDdd(),
				entity.getTelefone().getTelefone(), entity.getTelefone().getFlagTelefonePrincipal(),
				entity.getTelefone().getTipoTelefone()));

		cliente.setEndereco(new EnderecoDTO(entity.getEndereco().getId(), entity.getEndereco().getCep(),
				entity.getEndereco().getLogradouro(), entity.getEndereco().getNumero(),
				entity.getEndereco().getComplemento(), entity.getEndereco().getBairro(),
				entity.getEndereco().getCidade(), entity.getEndereco().getEstado()));

		return cliente;

	}

}
