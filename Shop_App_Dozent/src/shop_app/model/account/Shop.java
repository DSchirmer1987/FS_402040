package shop_app.model.account;

import java.util.ArrayList;

import shop_app.model.bestellung.Rechnung;

public class Shop extends Kontakt {
	private int id;
	private String shopname;
	private String steuernummer;
	private String ust_id;
	private String handelsregister;
	private ArrayList<Rechnung> rechnungen;
	
	public Shop(int id, String anrede, String vorname, String nachname, String email, String telefon, String geschlecht,
			String geburtsdatum, String shopname, String steuernummer, String ust_id, String handelsregister) {
		super(anrede, vorname, nachname, email, telefon, geschlecht, geburtsdatum);
		this.id = id;
		this.shopname = shopname;
		this.steuernummer = steuernummer;
		this.ust_id = ust_id;
		this.handelsregister = handelsregister;
		this.rechnungen = new ArrayList<Rechnung>();
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getSteuernummer() {
		return steuernummer;
	}

	public void setSteuernummer(String steuernummer) {
		this.steuernummer = steuernummer;
	}

	public String getUst_id() {
		return ust_id;
	}

	public void setUst_id(String ust_id) {
		this.ust_id = ust_id;
	}

	public String getHandelsregister() {
		return handelsregister;
	}

	public void setHandelsregister(String handelsregister) {
		this.handelsregister = handelsregister;
	}

	public int getId() {
		return id;
	}
	
	public String toString() {
		// Muss selbst ausgedacht werden!
		return null;
	}
	
	public void rechnungHinzufuegen(Rechnung rechnung) {
		this.rechnungen.add(rechnung);
	}
	
}
