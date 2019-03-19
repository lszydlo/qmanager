package pl.com.bottega.qmanager.preparation.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
class JavaConfig {


	@Bean
	@Scope(scopeName = "prototype")
	public NumberGenerationPolicy numberGenerationPolicy(Config config) {
		return new NumberGenerationPolicy(config.isDemo());
	}

}
