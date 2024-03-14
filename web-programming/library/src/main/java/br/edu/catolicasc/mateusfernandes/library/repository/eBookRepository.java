package br.edu.catolicasc.mateusfernandes.library.repository;

import br.edu.catolicasc.mateusfernandes.library.model.eBook;
import org.springframework.data.repository.CrudRepository;

public interface eBookRepository extends CrudRepository<eBook, Long> {
}
