package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class AppointmentsController {
	
	@FXML
	public Pane rootPane;
	
	
	@FXML
	public void medInfoClickedAppt(ActionEvent event) throws IOException {
		// Render the medical info page
		ViewSwitcher.switchView(ViewEnum.MED);
		
	}
	
	@FXML
	public void appointmentsClickedAppt(ActionEvent event) throws IOException {
		// Do nothing
		ViewSwitcher.switchView(ViewEnum.APPT);
		
	}
	
	@FXML
	public void labResultsClickedAppt(ActionEvent event) throws IOException {
		// Render the lab results page
		ViewSwitcher.switchView(ViewEnum.LAB);
		
	}
	
	@FXML
	public void logoClickedAppt(ActionEvent event) throws IOException {
		// Render the home page
		ViewSwitcher.switchView(ViewEnum.HOME);
	}
	
}
