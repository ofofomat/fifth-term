package br.org.catolicasc.catauto.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@DataJpaTest
class PessoaTest {

	@Autowired
	private TestEntityManager em;

	@Test
	public void saveTest() {
		Pessoa p = createPessoa();
		assertNotNull(p.getId());
	}

	private Pessoa createPessoa() {
		Pessoa p = new Pessoa();
		System.out.println("Test");
		p.setNome("Leonardo Neto");
		em.getEntityManager().persist(p);
		return p;
	}

	@Test 
	public void listTest() {
	  createPessoa();
	  Query q = this.em.getEntityManager().createQuery("Select p from Pessoa p"); 
	  List<Pessoa> pessoas = q.getResultList();
	  assertFalse(pessoas.isEmpty()); 
	 }

}
