package br.edu.catolicasc.mateusfernandes.library.repository;

import br.edu.catolicasc.mateusfernandes.library.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
