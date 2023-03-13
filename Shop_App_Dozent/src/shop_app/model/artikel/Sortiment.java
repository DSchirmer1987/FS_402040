package shop_app.model.artikel;

import java.util.ArrayList;

public class Sortiment {
	private ArrayList<Artikel> artikelliste;

	public Sortiment() {
		super();
		this.artikelliste = new ArrayList<Artikel>();
	}

	public ArrayList<Artikel> getArtikelliste() {
		return artikelliste;
	}

	public void setArtikelliste(ArrayList<Artikel> artikelliste) {
		this.artikelliste = artikelliste;
	}
	
	public String toString() {
		// Muss selbst ausgedacht werden!
		return null;
	}
	
	public void artikelHinzufuegen(Artikel artikel) {
		this.artikelliste.add(artikel);
	}
	
	public void artikelEntfernen(Artikel artikel) {
		this.artikelliste.remove(artikel);
	}
	
	public Artikel artikelSuchen(int artikelnummer) {
		for (Artikel artikel : artikelliste) {
			if(artikel.getArtikelnummer() == artikelnummer) {
				return artikel;
			}
		}
		return null;
	}
	
	public ArrayList<Artikel> artikelSuchen(String artikelnamen) {
		ArrayList<Artikel> suchergebnis = new ArrayList<Artikel>();
		for (Artikel artikel : artikelliste) {
			if(artikel.getBezeichnung().equals(artikelnamen)) {
				suchergebnis.add(artikel);
			}
		}
		return suchergebnis;
	}
}
