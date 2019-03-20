package pl.com.bottega.qmanager.ioc;

public class Firma {

	Prezes prezes = new Prezes(new Jurek());
	private Komputer komputer = new Komputer();

	void wyświadczUsługę() {

		prezes.pracuj(komputer);
	}


}
