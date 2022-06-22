package lk.ijse.dep8.tasks;

import lk.ijse.dep8.tasks.config.AppConfig;
import lk.ijse.dep8.tasks.config.JPAConfig;
import lk.ijse.dep8.tasks.config.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManagerFactory;

@SpringJUnitConfig({TestConfig.class,JPAConfig.class, AppConfig.class})
@ActiveProfiles("test")
public class EntityManageFactoryTest {

    @Autowired
    private EntityManagerFactory emf;

    @Test
    public void testEntityManager(){
        System.out.println(emf);
        assertNotNull(emf);
    }
}
