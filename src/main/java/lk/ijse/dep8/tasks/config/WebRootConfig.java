package lk.ijse.dep8.tasks.config;

import org.hibernate.Hibernate;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}
