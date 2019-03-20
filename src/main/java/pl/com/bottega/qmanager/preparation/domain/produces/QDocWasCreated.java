package pl.com.bottega.qmanager.preparation.domain.produces;

import lombok.Value;

@Value
public class QDocWasCreated {

	String title;
	Long id;
	Long authorId;
	String number;

}
