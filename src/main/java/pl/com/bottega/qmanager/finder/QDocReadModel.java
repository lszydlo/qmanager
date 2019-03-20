package pl.com.bottega.qmanager.finder;

import lombok.Data;
import pl.com.bottega.qmanager.preparation.domain.produces.QDocWasCreated;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class QDocReadModel {


	@Id
	private Long id;
	private String number;
	private String author;
	private String title;
	private String type;
	private String status;
	private LocalDate creation;
	private LocalDate modification;

	public QDocReadModel(QDocWasCreated event) {
		this.id = event.getId();
	}
}
