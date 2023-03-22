package shop_app.model.database;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import shop_app.model.DatenInterface;
import shop_app.model.artikel.Artikel;

public class ArtikelJSONAdapter implements DatenInterface<Artikel> {

	@Override
	public Artikel laden(int id) {
		Artikel artikel = null;
		for(Artikel suche : this.alleLaden()) {
			if(suche.getArtikelnummer() == id) {
				artikel = suche;
			}
		}
		return artikel;
	}

	@Override
	public ArrayList<Artikel> alleLaden() {
		ArrayList<Artikel> artikelListe = new ArrayList<>();
		Gson gson = new Gson();
		
		try(FileReader reader = new FileReader("src/ArtikelJSON.json")){
			artikelListe = gson.fromJson(reader, new TypeToken<ArrayList<Artikel>>() {}.getType());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return artikelListe;
	}

	@Override
	public void speichern(Artikel input) {
		String filename = "src/ArtikelJSON.json";
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try (FileWriter writer = new FileWriter(filename)){
			gson.toJson(input, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void speichern(ArrayList<Artikel> input) {
		String filename = "src/ArtikelJSON.json";
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try (FileWriter writer = new FileWriter(filename)){
			gson.toJson(input, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void loeschen(Artikel input) {
		int index = 0;
		ArrayList<Artikel> liste = this.alleLaden();
		ArrayList<Artikel> speicherListe = this.alleLaden();
		for(Artikel suche : liste) {
			if(suche.getArtikelnummer() == input.getArtikelnummer()) {
				speicherListe.remove(index);
			}
			index++;
		}
		System.out.println(speicherListe);
		this.speichern(speicherListe);
	}

}
