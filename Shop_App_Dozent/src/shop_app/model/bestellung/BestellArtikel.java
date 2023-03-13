package shop_app.model.bestellung;

import shop_app.model.artikel.Artikel;

public class BestellArtikel {
	private Artikel artikel;
	private int menge;
	private double zwischen_brutto;
	private double zwischen_netto;
	
	public BestellArtikel(Artikel artikel, int menge) {
		this.artikel = artikel;
		this.menge = menge;
		this.zwischen_brutto = this.artikel.getBrutto() * menge;
		this.zwischen_netto = this.artikel.getNetto() * menge;
	}

	public Artikel getArtikel() {
		return artikel;
	}

	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
		this.zwischen_brutto = this.artikel.getBrutto() * this.menge;
		this.zwischen_netto = this.artikel.getNetto() * this.menge;
	}

	public double getZwischen_brutto() {
		return zwischen_brutto;
	}

	public double getZwischen_netto() {
		return zwischen_netto;
	}
	
	public String toString() {
		// Muss selbst ausgedacht werden!
		return null;
	}
}
