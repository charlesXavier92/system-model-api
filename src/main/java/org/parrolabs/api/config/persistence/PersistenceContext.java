package org.parrolabs.api.config.persistence;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"org.parrolabs.api"})
public class PersistenceContext {
	@Configuration
	@Profile("default")
	@PropertySource({"classpath:persistence.properties"})
	static class PersistenceDefaultConfig{}
	
}
