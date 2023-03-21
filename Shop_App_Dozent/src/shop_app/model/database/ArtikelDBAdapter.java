package shop_app.model.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import shop_app.model.DatenInterface;
import shop_app.model.artikel.Artikel;

public class ArtikelDBAdapter implements DatenInterface<Artikel>{

	@Override
	public Artikel laden(int id) {
		Database db = new Database("sqlite", "src", "Shop_App.db", null, null);
		
		Artikel artikel = null;
		String sql = "SELECT * FROM Artikel WHERE Artikelnummer = " + id;
		/*
		 * Beispiel int id = 10
		 * SELECT * FROM Artikel WHERE Artikelnummer = 10
		 */
		try {
			PreparedStatement stmt = db.getDb_conn().prepareStatement(sql);
			ResultSet results = stmt.executeQuery();
			while(results.next()) {
				String kat_sql = "SELECT Bezeichnung FROM Kategorie WHERE Kategorie_ID = " + results.getString("Kategorie_ID");
				PreparedStatement kat_stmt = db.getDb_conn().prepareStatement(kat_sql);
				ResultSet kat_results = kat_stmt.executeQuery();
				while(kat_results.next()) {
					artikel = new Artikel(results.getInt("Artikelnummer"),
							  results.getString("Bezeichnung"),
							  results.getString("Beschreibung"),
							  results.getInt("Lagerbestand"),
							  results.getDouble("Bruttopreis"),
							  results.getDouble("Nettopreis"),
							  results.getInt("Mwst_Satz"),
							  kat_results.getString("Bezeichnung")
							  );
				}
			}
			db.getDb_conn().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return artikel;
	}
	
	public Artikel ladenName(String name) {
		Database db = new Database("sqlite", "src", "Shop_App.db", null, null);
		Artikel artikel = null;
		String sql = "SELECT * FROM Artikel WHERE Bezeichnung = " + "\""+ name + "\"";
		System.out.println(sql);
		/*
		 * Beispiel int id = 10
		 * SELECT * FROM Artikel WHERE Artikelnummer = 10
		 * 
		 * PrepareStatement wandelt bestimmte Zeichen um.
		 * ; = &usp523&
		 */
		try {
			PreparedStatement stmt = db.getDb_conn().prepareStatement(sql);
			ResultSet results = stmt.executeQuery();
			while(results.next()) {
				String kat_sql = "SELECT Bezeichnung FROM Kategorie WHERE Kategorie_ID = " + results.getString("Kategorie_ID");
				PreparedStatement kat_stmt = db.getDb_conn().prepareStatement(kat_sql);
				ResultSet kat_results = kat_stmt.executeQuery();
				while(kat_results.next()) {
					artikel = new Artikel(results.getInt("Artikelnummer"),
							  results.getString("Bezeichnung"),
							  results.getString("Beschreibung"),
							  results.getInt("Lagerbestand"),
							  results.getDouble("Bruttopreis"),
							  results.getDouble("Nettopreis"),
							  results.getInt("Mwst_Satz"),
							  kat_results.getString("Bezeichnung")
							  );
				}
			}
			db.getDb_conn().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return artikel;
	}

	@Override
	public ArrayList<Artikel> alleLaden() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void speichern(Artikel input) {
		Database db = new Database("sqlite", "src", "Shop_App.db", null, null);
		
		String sql = "INSERT INTO Artikel (Bezeichnung, Beschreibung, Lagerbestand, Bruttopreis, Nettopreis, Mwst_Satz, Kategorie_ID) "
				+ 	 "VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement statement = db.getDb_conn().prepareStatement(sql);
			// Befüllen der Values-Werte
			statement.setString(1, input.getBezeichnung());
			statement.setString(2, input.getBeschreibung());
			statement.setInt(3, input.getLagerbestand());
			statement.setDouble(4, input.getBrutto());
			statement.setDouble(5, input.getNetto());
			statement.setInt(6, input.getMwst_satz());
			statement.setInt(7, Integer.parseInt(input.getKategorie()));
			
			statement.executeUpdate();
			
			db.getDb_conn().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void loeschen(Artikel input) {
		// TODO Auto-generated method stub
		
	}
	
}
