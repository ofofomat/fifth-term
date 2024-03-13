package br.edu.catolicasc.catobile.repository;


import br.edu.catolicasc.catobile.model.Automobile;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutomobileTest {

    @Autowired
    private AutomobileRepository automobileRepository;

    @Test
    public void saveTest() {
        Automobile auto = new Automobile();
        auto.setLicensePlate("4444-1");
        automobileRepository.save(auto);
        Assert.assertNotNull(auto.getId());
    }
}
