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
	requires org.jdom2;
	
	opens shop_app.model.artikel to com.google.gson;
}