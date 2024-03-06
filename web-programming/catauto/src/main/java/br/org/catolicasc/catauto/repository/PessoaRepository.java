package br.org.catolicasc.catauto.repository;

import org.springframework.data.repository.CrudRepository;

import br.org.catolicasc.catauto.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
