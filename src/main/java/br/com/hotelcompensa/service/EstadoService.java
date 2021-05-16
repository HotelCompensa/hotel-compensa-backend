package br.com.hotelcompensa.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.hotelcompensa.entity.EstadoEntity;
import br.com.hotelcompensa.repository.EstadoRepository;

@ApplicationScoped
public class EstadoService {

	@Inject
	EstadoRepository repository;


	public List<EstadoEntity> findAll() {
		return repository.listAll();

	}

	public EstadoEntity listarPorId(Long id) {
		return repository.findById(id);

	}
}
