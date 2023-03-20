package shop_app.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private Connection db_conn;
	private String db_server;
	private String db_database;
	private String db_host;
	
	public Connection getDb_conn() {
		return this.db_conn;
	}
	
	public Database(String server, String host, String database, String user, String password) {
		this.db_server = server;
		this.db_host = host;
		this.db_database = database;
		
		/*
		 * JDBC - Java DataBase Connection
		 * 
		 * jdbc String Schema:
		 * jdbc:serverTyp://ip/datenbank
		 * 
		 */
		String jdbc = "jdbc:" + db_server + ":" + db_host + "/" + database;
		
		/*
		 * Datenbankverbindung aufbauen
		 * 
		 * Nutzen von einem DriverManager - wählt automatisch den richtigen Treiber aus.
		 */
		
		try {
			this.db_conn = DriverManager.getConnection(jdbc, user, password);
			if(this.db_conn != null) {
				System.out.println("Verbindung hergestellt.");
			} else {
				System.out.println("Verbindung fehlgeschlagen.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
