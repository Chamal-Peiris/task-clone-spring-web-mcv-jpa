package lk.ijse.dep8.tasks.config;

import lk.ijse.dep8.tasks.WebAppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackageClasses = WebAppInitializer.class)
@Configuration
@EnableWebMvc
public class WebAppConfig {
}
