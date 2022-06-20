package lk.ijse.dep8.tasks.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
public class JPAConfig {



    public JndiObjectFactoryBean dataSource(){
        JndiObjectFactoryBean jndiDataSource = new JndiObjectFactoryBean();
        jndiDataSource.setJndiName("java:comp/env/jdbc/pool");
        return jndiDataSource;

    }
}
