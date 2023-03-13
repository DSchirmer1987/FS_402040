package shop_app.model.account;

public class Adresse {
	private int ID;
	private String strasse;
	private String hausnummer;
	private String ort;
	private String plz;
	private String land;
	private String zusatz;
	private String bei;
	private String adressart;
	
	public Adresse(int iD, String strasse, String hausnummer, String ort, String plz, String land, String zusatz,
			String bei, String adressart) {
		super();
		ID = iD;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.ort = ort;
		this.plz = plz;
		this.land = land;
		this.zusatz = zusatz;
		this.bei = bei;
		this.adressart = adressart;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getZusatz() {
		return zusatz;
	}

	public void setZusatz(String zusatz) {
		this.zusatz = zusatz;
	}

	public String getBei() {
		return bei;
	}

	public void setBei(String bei) {
		this.bei = bei;
	}

	public String getAdressart() {
		return adressart;
	}

	public void setAdressart(String adressart) {
		this.adressart = adressart;
	}

	public int getID() {
		return ID;
	}
	
	public String toString() {
		// Muss selbst ausgedacht werden!
		return null;
	}
}
