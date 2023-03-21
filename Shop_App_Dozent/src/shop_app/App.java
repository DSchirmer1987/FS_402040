package shop_app;

import java.awt.EventQueue;

import shop_app.model.artikel.Artikel;
import shop_app.model.database.ArtikelDBAdapter;
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
	}

}
