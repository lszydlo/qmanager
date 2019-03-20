package pl.com.bottega.qmanager.finder;

import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Component;
import pl.com.bottega.qmanager.preparation.domain.produces.QDocWasCreated;

@Component
@AllArgsConstructor
public class QDocFinderListener {

	private final QDocDao dao;

	@EventListener
	public void listenOn(QDocWasCreated event) {
		dao.save(new QDocReadModel(event));
	}

}
