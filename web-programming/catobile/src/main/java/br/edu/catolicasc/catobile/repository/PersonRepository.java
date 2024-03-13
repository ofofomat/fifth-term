package br.edu.catolicasc.catobile.repository;

import org.springframework.data.repository.CrudRepository;
import br.edu.catolicasc.catobile.model.Person;
public interface PersonRepository extends CrudRepository<Person, Long>{
}
