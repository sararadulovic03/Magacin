package magacin;

import java.util.Iterator;

import magacin.interfejs.specifikacijainterfejsa;

public class Klasa implements specifikacijainterfejsa {
	<<<<<<<HEAD
	private Magacin magacin;=======
	private Magacin magacin;>>>>>>>refs/heads/implementacijainterfejsa

	public Klasa(Magacin magacin) {
		this.magacin = magacin;
	}

	@Override
	public void dodajArtikal(Artikl artikl) {
		if (magacin.getArtikli().contains(artikl)) {
			for (Artikl a : magacin.getArtikli()) {
				if (a.equals(artikl)) {
					try {
						a.setKolicina(a.getKolicina() + 1);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			magacin.getArtikli().add(artikl);
		}

	}

	@Override
	public void izbaciArtikal(Artikl artikl) {
		try {
			if (magacin.getArtikli().contains(artikl)) {
				magacin.getArtikli().remove(artikl);
			} else {
				throw new Exception("Artikl ne postoji");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Artikl pronadjiArtikl(int sifra){
		for(Artikl a: magacin.getArtikli()) {
			if(a.getSifra()==sifra) {
				return a;
			}
		}
		return null;
	}
}