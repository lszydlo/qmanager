package pl.com.bottega.qmanager.preparation.domain.consumes;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.com.bottega.qmanager.preparation.domain.QDocType;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
public class CreateQDocCommand {

	@NotEmpty
	private String qDocType;


	public QDocType QDocType() {
		return QDocType.valueOf(qDocType);
	}

}
