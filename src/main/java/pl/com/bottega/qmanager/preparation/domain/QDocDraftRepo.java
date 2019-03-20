package pl.com.bottega.qmanager.preparation.domain;

import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Repository;
import pl.com.bottega.qmanager.DomainEvent;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@AllArgsConstructor
class QDocDraftRepo {

	private final ApplicationEventPublisher publisher;
	private final QDocDraftDao dao;
	private final EventStore eventStore;


	@Transactional
	void save(QDocDraft draft) {
		dao.save(draft);
		eventStore.append(draft.events);
		publishEvents(draft);
	}

	private void publishEvents(QDocDraft draft) {
		List<DomainEvent> events = draft.events;
		for (DomainEvent event : events) {
			publisher.publishEvent(event);
		}
	}

	QDocDraft load(Long id) {
		return null;
	}
}
