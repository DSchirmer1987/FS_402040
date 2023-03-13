package shop_app.model.bestellung;

import java.util.ArrayList;

import shop_app.model.account.Kunde;
import shop_app.model.account.Shop;

public class Bestellung {
	private int bestellungsnummer;
	private String datum;
	private ArrayList<BestellArtikel> artikelliste;
	
	public Bestellung(int bestellungsnummer, String datum) {
		super();
		this.bestellungsnummer = bestellungsnummer;
		this.datum = datum;
		this.artikelliste = new ArrayList<BestellArtikel>();
	}

	public int getBestellungsnummer() {
		return bestellungsnummer;
	}

	public void setBestellungsnummer(int bestellungsnummer) {
		this.bestellungsnummer = bestellungsnummer;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public ArrayList<BestellArtikel> getArtikelliste() {
		return artikelliste;
	}

	public void setArtikelliste(ArrayList<BestellArtikel> artikelliste) {
		this.artikelliste = artikelliste;
	}
	
	public String toString() {
		// Muss selbst ausgedacht werden!
		return null;
	}
	
	public void bestellung_abschicken(Kunde kunde, Shop shop) {
		kunde.bestellungHinzufuegen(this);
		shop.rechnungHinzufuegen(new Rechnung(this));
	}
}
