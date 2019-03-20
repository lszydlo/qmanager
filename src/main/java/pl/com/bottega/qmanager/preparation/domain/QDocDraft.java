package pl.com.bottega.qmanager.preparation.domain;

import pl.com.bottega.qmanager.DomainEvent;
import pl.com.bottega.qmanager.preparation.domain.produces.QDocWasCreated;
import pl.com.bottega.qmanager.shared.AuthorId;
import pl.com.bottega.qmanager.shared.QDocId;

import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class QDocDraft {
	private QDocId id;
	private AuthorId authorId;
	private QDocNumber number;
	private String content;
	private String title;
	private boolean sent;

	@Transient
	List<DomainEvent> events = new ArrayList<>();

	QDocDraft(QDocNumber number, AuthorId authorId) {
		this.id = new QDocId();
		this.number = number;
		this.authorId = authorId;
		events.add(new QDocWasCreated(id, this.authorId, number.value()));
	}

	void update(String content) {

	}

	void send() {

	}
}
