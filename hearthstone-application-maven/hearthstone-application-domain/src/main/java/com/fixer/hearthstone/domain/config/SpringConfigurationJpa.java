package com.fixer.hearthstone.domain.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configurable
@EnableTransactionManagement
public class SpringConfigurationJpa {

    @Bean
       public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
          LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
          em.setDataSource(dataSource);
          em.setPackagesToScan(new String[] { "com.fixer.hearthstone.domain" });

          JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
          em.setJpaVendorAdapter(vendorAdapter);
          em.setJpaProperties(additionalProperties());

          return em;
       }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }

    Properties additionalProperties() {
          Properties properties = new Properties();
          //properties.setProperty("hibernate.show_sql", "true");
          properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
          properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
          return properties;
       }
}
