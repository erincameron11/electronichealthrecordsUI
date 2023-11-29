package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;


public class Main extends Application {
	
	@FXML
	public Parent rootPane;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// Create a scene, set the scene, and load the login page
			Scene scene = new Scene(new Pane());
			ViewSwitcher.setScene(scene);
			ViewSwitcher.switchView(ViewEnum.HCPCHART);
			
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
