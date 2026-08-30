package mate.academy.spring.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("mate.academy.spring")
public class AppConfig {
    private final Environment environment;

    @Autowired
    public AppConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public DataSource dataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(environment.getProperty("db.driver"));
        basicDataSource.setUrl(environment.getProperty("db.url"));
        basicDataSource.setUsername(environment.getProperty("db.username"));
        basicDataSource.setPassword(environment.getProperty("db.password"));
        return basicDataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean getSessionFactory() {
        var entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        Properties properties = new Properties();
        properties.setProperty("hibernate.show_sql",
                environment.getProperty("hibernate.show_sql"));
        properties.setProperty("hibernate.hbm2ddl.auto",
                environment.getProperty("hibernate.hbm2_ddl.auto"));
        entityManagerFactoryBean.setJpaProperties(properties);
        entityManagerFactoryBean.setPersistenceProvider(new HibernatePersistenceProvider());
        entityManagerFactoryBean.setPackagesToScan("mate.academy.spring.model");
        return entityManagerFactoryBean;
    }
}
