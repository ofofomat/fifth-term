package br.org.catolicasc.catauto.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.org.catolicasc.catauto.model.Automovel;

@SpringBootTest
public class AutomovelRepositoryTest {

	@Autowired
	private AutomovelRepository automovelRepository;

	@Test
	public void saveTest() {
		Automovel automovel = new Automovel();
		automovel.setPlaca("455-559");
		automovelRepository.save(automovel);	
		assertNotNull(automovel.getId());
	}
	
	@Test
	public void listTest() {
		assertNotNull(automovelRepository.findAll().iterator().hasNext());
	}
}
