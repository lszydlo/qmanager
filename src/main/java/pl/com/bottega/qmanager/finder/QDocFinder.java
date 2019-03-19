package pl.com.bottega.qmanager.finder;

import org.springframework.stereotype.Service;

@Service
public class QDocFinder {

	public QDocReadModel getQDocDraft() {
		return new QDocReadModel();
	}
}
