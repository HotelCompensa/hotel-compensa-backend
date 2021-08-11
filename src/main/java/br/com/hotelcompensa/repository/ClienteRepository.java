package br.com.hotelcompensa.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.hotelcompensa.entity.ClienteEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ClienteRepository implements PanacheRepositoryBase<ClienteEntity, Long> {

	public List<ClienteEntity> findBySexo(char sexo) {
		return list("sexo", sexo);
	}
	
	public void updateById(ClienteEntity entity,Long id) {
		 updateById(entity, id);
	}


}
