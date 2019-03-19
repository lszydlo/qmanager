package pl.com.bottega.qmanager.preparation;

import lombok.Data;

@Data
public class UpdateContentCommand {

	private Long id;
	private String content;
}
