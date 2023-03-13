package shop_app.model.artikel;

public class Artikelbild {
	private int artikelbild_id;
	private String bild_url;
	
	public Artikelbild(int artikelbild_id, String bild_url) {
		super();
		this.artikelbild_id = artikelbild_id;
		this.bild_url = bild_url;
	}

	public int getArtikelbild_id() {
		return artikelbild_id;
	}

	public void setArtikelbild_id(int artikelbild_id) {
		this.artikelbild_id = artikelbild_id;
	}

	public String getBild_url() {
		return bild_url;
	}

	public void setBild_url(String bild_url) {
		this.bild_url = bild_url;
	}
	
	public String toString() {
		// Muss selbst ausgedacht werden!
		return null;
	}
}
