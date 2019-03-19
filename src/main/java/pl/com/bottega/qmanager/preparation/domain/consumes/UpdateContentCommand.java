package pl.com.bottega.qmanager.preparation.domain.consumes;

import lombok.Data;

@Data
public class UpdateContentCommand {

	private Long id;
	private String content;
}
