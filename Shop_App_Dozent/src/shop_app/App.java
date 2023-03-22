package shop_app;

import java.awt.EventQueue;
import java.util.ArrayList;

import shop_app.model.artikel.Artikel;
import shop_app.model.database.ArtikelDBAdapter;
import shop_app.model.database.ArtikelJSONAdapter;
import shop_app.model.database.ArtikelXMLAdapter;
import shop_app.model.database.Database;
import shop_app.view.hauptfenster;

public class App {

	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					hauptfenster frame = new hauptfenster();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		
//		Database db = new Database("sqlite", "src", "Shop_App.db", null, null);
		
		ArtikelDBAdapter artikelDB = new ArtikelDBAdapter();
		Artikel dbArtikel = artikelDB.laden(10);
		System.out.println(dbArtikel);
		
//		Artikel dbArtikelName = artikelDB.ladenName("PC-Spiel ANNO");
//		System.out.println(dbArtikelName);
//		
//		Artikel boeserArtikel = artikelDB.ladenName("PC-Spiel ANNO; DROP TABLE testTabelle");
//		System.out.println(boeserArtikel);
//		
//		Artikel neu = new Artikel(0, "Office 95", "Altes Office", 15, 19.99, 14.99, 19, "2");
//		System.out.println(neu);
//		artikelDB.speichern(neu);
		
		//JSON
		ArtikelJSONAdapter artikelJson = new ArtikelJSONAdapter();
		artikelJson.speichern(dbArtikel);
		ArrayList<Artikel> sortiment = new ArrayList<>();
		sortiment.add(dbArtikel);
		sortiment.add(artikelDB.laden(11));
		sortiment.add(artikelDB.laden(12));
		artikelJson.speichern(sortiment);
		Artikel ausJson = artikelJson.laden(12);
		System.out.println(ausJson);
		artikelJson.loeschen(dbArtikel);
		
		//XML
		ArtikelXMLAdapter artikelXML = new ArtikelXMLAdapter();
		artikelXML.speichern(dbArtikel);
		
		ArrayList<Artikel> xmlListe = artikelXML.alleLaden();
		System.out.println(xmlListe);
	}

}
