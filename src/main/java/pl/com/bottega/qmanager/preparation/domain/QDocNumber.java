package pl.com.bottega.qmanager.preparation.domain;

import lombok.EqualsAndHashCode;

import java.util.regex.Pattern;

@EqualsAndHashCode
class QDocNumber {

	private final String value;

	QDocNumber(String value) {
		if (Pattern.matches(".*", value)) {
			this.value = value;
		} else {
			throw new RuntimeException();
		}
	}

	public String value() {
		return value;
	}
}
