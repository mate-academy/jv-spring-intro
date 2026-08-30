package mate.academy.spring.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages = "mate.academy.spring")
public class AppConfig {
    @Bean
    public DataSource getDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost/products?serverTimezone=UTC");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("1448");
        return basicDataSource;
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(getDataSource());
        Properties properties = new Properties();
        properties.put("show_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "create-drop");
        sessionFactoryBean.setHibernateProperties(properties);
        sessionFactoryBean.setPackagesToScan("mate.academy.spring");
        return sessionFactoryBean;
    }
}
