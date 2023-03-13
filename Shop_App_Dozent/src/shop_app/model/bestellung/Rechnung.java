package shop_app.model.bestellung;

public class Rechnung {
	private int rechnungsnummer;
	private String datum;
	private double summe_brutto;
	private double summe_netto;
	private double mwst;
	private String zahlungsart;
	private String zahlungsziel;
	private boolean bezahlt;
	private Bestellung bestellung;
	
	public Rechnung(int rechnungsnummer, String datum, double summe_brutto, double summe_netto, double mwst,
			String zahlungsart, String zahlungsziel, boolean bezahlt, Bestellung bestellung) {
		super();
		this.rechnungsnummer = rechnungsnummer;
		this.datum = datum;
		this.summe_brutto = summe_brutto;
		this.summe_netto = summe_netto;
		this.mwst = mwst;
		this.zahlungsart = zahlungsart;
		this.zahlungsziel = zahlungsziel;
		this.bezahlt = bezahlt;
		this.bestellung = bestellung;
	}
	
	public Rechnung(Bestellung bestellung) {
		super();
		this.bestellung = bestellung;
		this.datum = this.bestellung.getDatum();
		for(BestellArtikel artikel : this.bestellung.getArtikelliste()) {
			this.summe_brutto += artikel.getZwischen_brutto();
			this.summe_netto += artikel.getZwischen_netto();
		}
		this.mwst = this.summe_brutto - this.summe_netto;
		this.bezahlt = false;
		this.bestellung = bestellung;
	}

	public int getRechnungsnummer() {
		return rechnungsnummer;
	}

	public void setRechnungsnummer(int rechnungsnummer) {
		this.rechnungsnummer = rechnungsnummer;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public double getSumme_brutto() {
		return summe_brutto;
	}

	public void setSumme_brutto(double summe_brutto) {
		this.summe_brutto = summe_brutto;
	}

	public double getSumme_netto() {
		return summe_netto;
	}

	public void setSumme_netto(double summe_netto) {
		this.summe_netto = summe_netto;
	}

	public double getMwst() {
		return mwst;
	}

	public void setMwst(double mwst) {
		this.mwst = mwst;
	}

	public String getZahlungsart() {
		return zahlungsart;
	}

	public void setZahlungsart(String zahlungsart) {
		this.zahlungsart = zahlungsart;
	}

	public String getZahlungsziel() {
		return zahlungsziel;
	}

	public void setZahlungsziel(String zahlungsziel) {
		this.zahlungsziel = zahlungsziel;
	}

	public boolean isBezahlt() {
		return bezahlt;
	}

	public void setBezahlt(boolean bezahlt) {
		this.bezahlt = bezahlt;
	}

	public Bestellung getBestellung() {
		return bestellung;
	}

	public void setBestellung(Bestellung bestellung) {
		this.bestellung = bestellung;
	}
	
	public String toString() {
		// Muss selbst ausgedacht werden!
		return null;
	}
}
