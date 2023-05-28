package com.ewolff.microservice.customer;

// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;

// @Configuration
// class SpringRestDataConfig extends RepositoryRestConfigurerAdapter {

// 	@Bean
// 	public RepositoryRestConfigurer repositoryRestConfigurer() {

// 		return new RepositoryRestConfigurerAdapter() {
// 			@Override
// 			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
// 				config.exposeIdsFor(Customer.class);
// 			}
// 		};
// 	}

// }
@Configuration
public class SpringRestDataConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Customer.class);
    }

    @Override
    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
        // Optional: Configure validating listener if needed
    }
}
