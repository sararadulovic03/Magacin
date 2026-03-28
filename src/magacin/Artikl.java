package magacin;

import java.util.Objects;

public class Artikl {
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;

	public Artikl(String naziv, int sifra, String opis, int kolicina) {
		super();
		this.naziv = naziv;
		this.sifra = sifra;
		this.opis = opis;
		this.kolicina = kolicina;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) throws Exception {
		if(naziv==null || naziv.isEmpty()) {
			throw new Exception("Naziv ne sme biti prazan");
		}
		this.naziv = naziv;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) throws Exception {
		if(sifra<=0) {
			throw new Exception("Sifra mora da bude veca od 0");
		}
		this.sifra = sifra;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) throws Exception {
		if(opis==null || opis.isEmpty()) {
			throw new Exception("Opis ne sme biti prazan");
		}
		this.opis = opis;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) throws Exception {
		if(kolicina<0) {
			throw new Exception("Kolicina mora da bude veca od 0");
		}
		this.kolicina = kolicina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikl other = (Artikl) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& sifra == other.sifra;
	}

	@Override
	public String toString() {
		return "Artikl [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}

	
	
}
