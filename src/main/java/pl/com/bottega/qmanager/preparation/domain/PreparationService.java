package pl.com.bottega.qmanager.preparation.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.com.bottega.qmanager.preparation.domain.consumes.CreateQDocCommand;
import pl.com.bottega.qmanager.preparation.domain.consumes.UpdateContentCommand;

@AllArgsConstructor
@Service
public class PreparationService {

	private QDocDraftRepo repo;
	private NumberGenerationPolicy policy;


	public Long handle(CreateQDocCommand command) {

		QDocNumber number = policy.generate(command.QDocType());
		QDocDraft draft = new QDocDraft(number);
		return repo.save(draft);
	}

	public void handle(UpdateContentCommand command) {

		QDocDraft draft = repo.load(command.getId());
		draft.update(command.getContent());
		repo.save(draft);
	}

	public void handle(SendToVerificationCommand command) {

		QDocDraft draft = repo.load(command.getId());
		draft.send();
		repo.save(draft);
	}


}
