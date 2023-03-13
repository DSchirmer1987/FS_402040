package shop_app.model.account;

import java.util.ArrayList;

public abstract class Kontakt {
	private String anrede;
	private String vorname;
	private String nachname;
	private String email;
	private String telefon;
	private String geschlecht;
	private String geburtsdatum;
	private ArrayList<Adresse> adressen;
	
	public Kontakt(String anrede, String vorname, String nachname, String email, String telefon, String geschlecht, String geburtsdatum) {
		super();
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.telefon = telefon;
		this.geschlecht = geschlecht;
		this.geburtsdatum = geburtsdatum;
		this.adressen = new ArrayList<Adresse>();
	}
	
	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public ArrayList<Adresse> getAdressen() {
		return adressen;
	}

	public void setAdressen(ArrayList<Adresse> adressen) {
		this.adressen = adressen;
	}
	
	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String toString() {
		// Muss selbst ausgedacht werden!
		return null;
	}
	
	public void addAdresse(Adresse adresse) {
		this.adressen.add(adresse);
	}
	
	public void removeAdresse(Adresse adresse) {
		this.adressen.remove(adresse);
	}
}
