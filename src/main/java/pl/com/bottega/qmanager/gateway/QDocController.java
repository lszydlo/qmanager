package pl.com.bottega.qmanager.gateway;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import pl.com.bottega.qmanager.finder.QDocReadModel;
import pl.com.bottega.qmanager.finder.QDocFinder;
import pl.com.bottega.qmanager.preparation.CreateQDocCommand;
import pl.com.bottega.qmanager.preparation.PreparationService;

@RestController
@AllArgsConstructor
public class QDocController {

	private final PreparationService preparationService;
	private final QDocFinder finder;

	@PostMapping("/qdocs")
	public ResponseEntity<Void> createQDocDraft(@RequestBody CreateQDocCommand command, UriComponentsBuilder builder) {
		Long id = preparationService.handle(command);
		UriComponents uriComponents = builder.path("/{id}").buildAndExpand(id);
		return ResponseEntity.created(uriComponents.toUri()).build();
	}

	@GetMapping("/qdocs/{id}")
	public QDocReadModel get(@PathVariable String id) {
		return finder.getQDocDraft();
	}


}
