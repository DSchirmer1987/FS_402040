package shop_app.model;

import java.util.ArrayList;

public interface DatenInterface<T> {
	public T laden(int id);
	public ArrayList<T> alleLaden();
	public void speichern(T input);
	public void loeschen(T input);
}
