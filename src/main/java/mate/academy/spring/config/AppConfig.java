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
    @Autowired
    private Environment environment;

    @Bean
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(
                environment.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(
                environment.getProperty("spring.datasource.url"));
        dataSource.setUsername(
                environment.getProperty("spring.datasource.username"));
        dataSource.setPassword(
                environment.getProperty("spring.datasource.password"));
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(getDataSource());
        sessionFactoryBean.setHibernateProperties(getAdditionalProperties());
        sessionFactoryBean.setPackagesToScan("mate.academy.spring.model");
        return sessionFactoryBean;
    }

    private Properties getAdditionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("show_sql",
                environment.getProperty("hibernate.show-sql"));
        properties.setProperty("hibernate.hbm2ddl.auto",
                environment.getProperty("hibernate.ddl-auto"));
        return properties;
    }
}
