package br.edu.catolicasc.catobile.repository;

import org.springframework.data.repository.CrudRepository;
import br.edu.catolicasc.catobile.model.Automobile;

public interface AutomobileRepository extends CrudRepository<Automobile, Long>{
}
