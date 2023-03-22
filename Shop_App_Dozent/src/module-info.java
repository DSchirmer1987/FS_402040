/**
 * 
 */
/**
 * @author Jenartor
 *
 */
module Shop_App_Dozent {
	requires java.desktop;
	requires java.sql;
	requires com.google.gson;
	
	opens shop_app.model.artikel to com.google.gson;
}