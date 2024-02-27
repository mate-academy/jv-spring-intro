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
public class ApplicationConfig {
    @Autowired
    private Environment environment;

    @Bean
    public DataSource getDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(environment.getProperty("spring.db.driver"));
        basicDataSource.setUrl(environment.getProperty("spring.db.url"));
        basicDataSource.setUsername(environment.getProperty("spring.db.username"));
        basicDataSource.setPassword(environment.getProperty("spring.db.password"));
        return basicDataSource;
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(getDataSource());

        Properties properties = new Properties();
        properties.put("hibernate.show_sql", environment.getProperty("show_sql"));
        properties.put("hibernate.hbm2ddl.auto", environment.getProperty("hbm2ddl.auto"));
        sessionFactoryBean.setHibernateProperties(properties);

        sessionFactoryBean.setPackagesToScan("mate.academy.spring.model");
        return sessionFactoryBean;
    }
}
