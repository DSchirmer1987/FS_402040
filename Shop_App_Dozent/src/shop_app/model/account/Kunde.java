package shop_app.model.account;

import java.util.ArrayList;

import shop_app.model.bestellung.Bestellung;

public class Kunde extends Kontakt {
	private int kundennummer;
	private String kunde_seit;
	private String erreichbarkeit;
	private String geschaeft;
	private ArrayList<Bestellung> bestellungen;
	
	public Kunde(int kundennummer, String anrede, String vorname, String nachname, String email, String telefon, String geschlecht,
			String geburtsdatum, String kunde_seit, String erreichbarkeit, String geschaeft) {
		super(anrede, vorname, nachname, email, telefon, geschlecht, geburtsdatum);
		this.kundennummer = kundennummer;
		this.kunde_seit = kunde_seit;
		this.erreichbarkeit = erreichbarkeit;
		this.geschaeft = geschaeft;
		this.bestellungen = new ArrayList<Bestellung>();
	}

	public String getKunde_seit() {
		return kunde_seit;
	}

	public void setKunde_seit(String kunde_seit) {
		this.kunde_seit = kunde_seit;
	}

	public String getErreichbarkeit() {
		return erreichbarkeit;
	}

	public void setErreichbarkeit(String erreichbarkeit) {
		this.erreichbarkeit = erreichbarkeit;
	}

	public String getGeschaeft() {
		return geschaeft;
	}

	public void setGeschaeft(String geschaeft) {
		this.geschaeft = geschaeft;
	}

	public int getKundennummer() {
		return kundennummer;
	}
	
	public String toString() {
		// Muss selbst ausgedacht werden!
		return null;
	}
	
	public void bestellungHinzufuegen(Bestellung bestellung) {
		this.bestellungen.add(bestellung);
	}
}
