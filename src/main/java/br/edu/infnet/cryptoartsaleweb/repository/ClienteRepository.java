package br.edu.infnet.cryptoartsaleweb.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.cryptoartsaleweb.model.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
