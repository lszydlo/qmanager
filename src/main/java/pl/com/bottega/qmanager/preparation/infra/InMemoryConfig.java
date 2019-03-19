package pl.com.bottega.qmanager.preparation.infra;

import org.springframework.stereotype.Component;
import pl.com.bottega.qmanager.preparation.domain.Config;

@Component
public class InMemoryConfig implements Config {
	@Override
	public boolean isDemo() {
		return true;
	}
}
