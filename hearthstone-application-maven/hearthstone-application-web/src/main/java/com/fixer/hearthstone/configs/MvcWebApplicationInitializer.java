package com.fixer.hearthstone.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.fixer.hearthstone.Services.TransactionService;
import com.fixer.hearthstone.domain.config.DataSourceConfig;
import com.fixer.hearthstone.domain.config.JpaConfig;
import com.fixer.hearthstone.domain.config.SpringConfigurationJpa;

public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
       return /*null*/ new Class[] { DataSourceConfig.class, JpaConfig.class, SpringConfigurationJpa.class, TransactionService.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
       return new Class[] { MvcWebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
       return new String[] { "/" };
    }
}
