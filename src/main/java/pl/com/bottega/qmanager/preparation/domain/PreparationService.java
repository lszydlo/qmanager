package pl.com.bottega.qmanager.preparation.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.com.bottega.qmanager.preparation.domain.consumes.CreateQDocCommand;
import pl.com.bottega.qmanager.preparation.domain.consumes.UpdateContentCommand;
import pl.com.bottega.qmanager.shared.AuthorId;

@AllArgsConstructor
@Service
public class PreparationService {

	private QDocDraftRepo repo;
	private NumberGenerationPolicy policy;
	private CurrentUserProvider userProvider;

	public Long handle(CreateQDocCommand command) {

		AuthorId authorId  = userProvider.getId();
		QDocNumber number = policy.generate(command.QDocType());
		QDocDraft draft = new QDocDraft(number, authorId);
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
