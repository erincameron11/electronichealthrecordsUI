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
	
	public User patient;
	public User hcp;
	
	//Determine the graphics of the users screen (used for window positioning)
	public Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
	
	@Override
	public void start(Stage primaryStage) {
		try {

			// Create some mock users
			patient = new User("Erin", "Cameron", "857-986-6532", "ercameron@algomau.ca", "algoma123", PermissionEnum.PATIENT);
			hcp = new User("Emily", "Gray", "416-999-4117", "hcp@algomau.ca", "hcp123", PermissionEnum.HCP);			
			
			// Create a scene, set the scene, and load the login page
			Scene scene = new Scene(new Pane());
			ViewSwitcher.setScene(scene);
			ViewSwitcher.switchView(ViewEnum.LOGIN);
			
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
