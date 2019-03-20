package pl.com.bottega.qmanager.ioc;

public class Prezes {


	private Asystent jurek;

	public Prezes(Asystent jurek) {
		this.jurek = jurek;
	}

	public void pracuj(Komputer komputer) {
		if(komputer.niedziała()) {
			// jurek.napraw(komputer);
			jurek.obsłuż(new KomputerNieDziała());
		}
	}

}
