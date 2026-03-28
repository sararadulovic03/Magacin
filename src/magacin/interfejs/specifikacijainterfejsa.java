package magacin.interfejs;

import magacin.Artikl;

public interface specifikacijainterfejsa {
	
	public void dodajArtikal(Artikl artikl);
	public void izbaciArtikal(Artikl artikl);
	public Artikl pronadjiArtikl(int sifra) throws Exception;
}
