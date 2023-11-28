package application;

import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;


public class Main extends Application {
	
	@FXML
	public Parent rootPane;
	
	//Determine the graphics of the users screen (used for window positioning)
	public Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// Create a scene, set the scene, and load the login page
			Scene scene = new Scene(new Pane());
			ViewSwitcher.setScene(scene);
			ViewSwitcher.switchView(ViewEnum.APPT);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
