package mate.academy.spring.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "mate.academy.spring")
public class AppConfig {
    private final Environment enviroment;

    @Autowired
    public AppConfig(Environment enviroment) {
        this.enviroment = enviroment;
    }

    @Bean
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(enviroment.getProperty("db.driver"));
        dataSource.setUrl(enviroment.getProperty("db.url"));
        dataSource.setUsername(enviroment.getProperty("db.username"));
        dataSource.setPassword(enviroment.getProperty("db.password"));
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean localSession = new LocalSessionFactoryBean();
        localSession.setDataSource(getDataSource());
        Properties properties = new Properties();
        properties.put("hibernate.show_sql", enviroment.getProperty("hibernate.show_sql"));
        properties.put("hibernate.hbm2ddl.auto", enviroment.getProperty("hibernate.hbm2ddl.auto"));
        localSession.setHibernateProperties(properties);
        localSession.setPackagesToScan("mate.academy.spring.model");
        return localSession;
    }
}
