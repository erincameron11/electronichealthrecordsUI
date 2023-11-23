package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginController {
	
	@FXML
	public Pane rootPane;
	
	
	@FXML
	public void loginClicked(ActionEvent event) throws IOException {
		// Get data from textfield and passwordfield
		
		
		// Check DB with the username and password
		
		// Render the home page
		ViewSwitcher.switchView(ViewEnum.HOME);
	}
	
}
