package mate.academy.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "mate.academy.spring")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
