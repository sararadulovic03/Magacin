package magacin;

import java.time.LocalDate;

public class KucnaHemija extends Artikl {

	private LocalDate rokTrajanja;

	public KucnaHemija(String naziv, int sifra, String opis, int kolicina, LocalDate roktrajanja) {
		super(naziv, sifra, opis, kolicina);
		this.rokTrajanja = roktrajanja;
	}

	public LocalDate getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(LocalDate rokTrajanja) throws Exception {
		if(rokTrajanja.isBefore(LocalDate.now())) {
			throw new Exception("Rok trajanja ne sme da bude iz proslosti");
		}
		this.rokTrajanja = rokTrajanja;
	}

}
