package com.fixer.hearthstone.domain.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
    private static String dbUrl = "jdbc:mysql://localhost/Hearthstone?createDatabaseIfNotExist=true&characterEncoding=utf8&useConfigs=maxPerformance&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static String username = "root";
    private static String password = "admin";

    @Bean
    public DataSource dataSource() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return new DriverManagerDataSource(dbUrl, username, password);
    }
}
