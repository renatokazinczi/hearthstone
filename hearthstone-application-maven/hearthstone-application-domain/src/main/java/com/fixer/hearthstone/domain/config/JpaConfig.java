package com.fixer.hearthstone.domain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.fixer.hearthstone.repository")
public class JpaConfig {

}
