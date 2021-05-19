package br.com.hotelcompensa.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.hotelcompensa.entity.ClienteEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ClienteRepository implements PanacheRepository<ClienteEntity>{

}
