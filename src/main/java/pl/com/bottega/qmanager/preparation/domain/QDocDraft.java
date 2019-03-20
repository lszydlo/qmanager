package pl.com.bottega.qmanager.preparation.domain;

class QDocDraft {
	private Long id;
	private Long authorId;
	private QDocNumber number;
	private String content;
	private String title;
	private boolean sent;


	QDocDraft(QDocNumber number) {
		this.number = number;
	}

	void update(String content) {

	}

	void send() {

	}
}
