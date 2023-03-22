package shop_app.model.database;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import shop_app.model.DatenInterface;
import shop_app.model.artikel.Artikel;

public class ArtikelXMLAdapter implements DatenInterface<Artikel> {

	@Override
	public Artikel laden(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Artikel> alleLaden() {
		ArrayList<Artikel> artikelliste = new ArrayList<>();
		
		SAXBuilder sax = new SAXBuilder();
		try {
			Document doc = sax.build(new File("src/ArtikelXML.xml"));
			Element rootElement = doc.getRootElement();
			
			List<Element> elemente = rootElement.getChildren("Artikel");
			for(Element target : elemente) {
				int Artikelnummer = Integer.parseInt(target.getChildText("Artikelnummer"));
				String Bezeichnung = target.getChildText("Bezeichnung");
				//Jedes weitere Attribut
				
				Artikel artikel = new Artikel(Artikelnummer, Bezeichnung, "", 0, 0, 0, 0, "");
				artikelliste.add(artikel);
			}
		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return artikelliste;
	}

	@Override
	public void speichern(Artikel input) {
		Document doc = new Document();
		doc.setRootElement(new Element("Sortiment"));
		
		Element artikel = new Element("Artikel");
		artikel.addContent(new Element("Artikelnummer").setText(String.valueOf(input.getArtikelnummer())));
		artikel.addContent(new Element("Bezeichnung").setText(input.getBezeichnung()));
		//Alle weiteren Attribute
		
		doc.getRootElement().addContent(artikel);
		
		XMLOutputter outputter = new XMLOutputter();
		outputter.setFormat(Format.getPrettyFormat());
		try(FileWriter writer = new FileWriter("src/ArtikelXML.xml")){
			outputter.output(doc, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void loeschen(Artikel input) {
		// TODO Auto-generated method stub
		
	}

}
