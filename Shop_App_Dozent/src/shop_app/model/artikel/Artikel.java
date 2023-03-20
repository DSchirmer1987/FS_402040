package shop_app.model.artikel;

import java.util.ArrayList;

public class Artikel {
	private int artikelnummer;
	private String bezeichnung;
	private String beschreibung;
	private int lagerbestand;
	private double brutto;
	private double netto;
	private int mwst_satz;
	private String Kategorie;
	private ArrayList<Artikelbild> artikelbilder;
	
	public Artikel(int artikelnummer, String bezeichnung, String beschreibung, int lagerbestand, double brutto,
			double netto, int mwst_satz, String kategorie) {
		super();
		this.artikelnummer = artikelnummer;
		this.bezeichnung = bezeichnung;
		this.beschreibung = beschreibung;
		this.lagerbestand = lagerbestand;
		this.brutto = brutto;
		this.netto = netto;
		this.mwst_satz = mwst_satz;
		Kategorie = kategorie;
		artikelbilder = new ArrayList<Artikelbild>();
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public int getLagerbestand() {
		return lagerbestand;
	}

	public void setLagerbestand(int lagerbestand) {
		this.lagerbestand = lagerbestand;
	}

	public double getBrutto() {
		return brutto;
	}

	public void setBrutto(double brutto) {
		this.brutto = brutto;
	}

	public double getNetto() {
		return netto;
	}

	public void setNetto(double netto) {
		this.netto = netto;
	}

	public int getMwst_satz() {
		return mwst_satz;
	}

	public void setMwst_satz(int mwst_satz) {
		this.mwst_satz = mwst_satz;
	}

	public String getKategorie() {
		return Kategorie;
	}

	public void setKategorie(String kategorie) {
		Kategorie = kategorie;
	}

	public int getArtikelnummer() {
		return artikelnummer;
	}

	public ArrayList<Artikelbild> getArtikelbilder() {
		return artikelbilder;
	}

	public void setArtikelbilder(ArrayList<Artikelbild> artikelbilder) {
		this.artikelbilder = artikelbilder;
	}
	
	@Override
	public String toString() {
		return "Artikel [artikelnummer=" + artikelnummer + ", bezeichnung=" + bezeichnung + ", beschreibung="
				+ beschreibung + ", lagerbestand=" + lagerbestand + ", brutto=" + brutto + ", netto=" + netto
				+ ", mwst_satz=" + mwst_satz + ", Kategorie=" + Kategorie + "]";
	}

	public void addArtikelbild(Artikelbild bild) {
		this.artikelbilder.add(bild);
	}
	
	public void removeArtikelbild(Artikelbild bild) {
		this.artikelbilder.remove(bild);
	}
}
