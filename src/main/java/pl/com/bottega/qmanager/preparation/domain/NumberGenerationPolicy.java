package pl.com.bottega.qmanager.preparation.domain;

class NumberGenerationPolicy {
	private boolean isDemo;

	NumberGenerationPolicy(boolean isDemo) {
		this.isDemo = isDemo;
	}

	QDocNumber generate(QDocType qDocType) {
		if (isDemo) {
			return new QDocNumber("DEMO/" + "123");
		} else {
			return new QDocNumber("123");
		}
	}
}
