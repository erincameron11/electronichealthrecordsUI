package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ViewSwitcher {
	
	// Declare a scene variable
	private static Scene scene;
	
	// Method to set the scene dynamically
	public static void setScene(Scene scene) {
		ViewSwitcher.scene = scene;
	}
	
	// Method to select the view to switch to
	public static void switchView(ViewEnum view) throws IOException {
		
		Parent root = FXMLLoader.load(ViewSwitcher.class.getResource(view.getFilename()));
		
		scene.setRoot(root);
	}
	
}
