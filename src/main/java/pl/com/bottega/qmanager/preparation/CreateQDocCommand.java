package pl.com.bottega.qmanager.preparation;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
public class CreateQDocCommand {

	@NotEmpty
	private String qdocType;



}
