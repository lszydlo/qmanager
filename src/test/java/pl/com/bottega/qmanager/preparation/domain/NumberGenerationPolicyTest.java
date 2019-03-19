package pl.com.bottega.qmanager.preparation.domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NumberGenerationPolicyTest {

	@Test
	public void should_generate_demo_number() {
		NumberGenerationPolicy policy = new NumberGenerationPolicy(true);

		QDocNumber number = policy.generate(QDocType.QP);

		Assertions.assertThat(number).isEqualTo(new QDocNumber("DEMO/123"));
	}
}