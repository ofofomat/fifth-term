package br.org.catolicasc.catauto.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
class AutomovelTest {

	@Autowired
	private TestEntityManager em;

	@Test
	public void saveTest() {
		Automovel automovel = new Automovel();
		automovel.setPlaca("455-556");
		em.persist(automovel);
		assertNotNull(automovel.getId());
	}
}
