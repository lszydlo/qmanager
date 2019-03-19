package pl.com.bottega.qmanager.preparation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PreparationService {


	private QDocDraftRepo repo;


	public Long handle(CreateQDocCommand command) {
		QDocDraft draft = new QDocDraft();
		return repo.save(draft);
	}

	public void handle(UpdateContentCommand command) {

		QDocDraft draft = repo.load(command.getId());
		draft.update(command.getContent());
		repo.save(draft);
	}


}
