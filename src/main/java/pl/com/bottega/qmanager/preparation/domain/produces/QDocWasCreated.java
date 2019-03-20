package pl.com.bottega.qmanager.preparation.domain.produces;

import lombok.Value;
import pl.com.bottega.qmanager.DomainEvent;
import pl.com.bottega.qmanager.shared.AuthorId;
import pl.com.bottega.qmanager.shared.QDocId;

@Value
public class QDocWasCreated implements DomainEvent {

	QDocId id;
	AuthorId authorId;
	String number;

}
