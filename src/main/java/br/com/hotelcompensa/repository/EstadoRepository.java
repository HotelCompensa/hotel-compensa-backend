package br.com.hotelcompensa.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.hotelcompensa.entity.EstadoEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class EstadoRepository implements PanacheRepository<EstadoEntity> {
  
}
