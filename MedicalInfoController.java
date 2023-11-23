package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class MedicalInfoController {
	
	@FXML
	public Pane rootPane;
	
	
	@FXML
	public void medInfoClickedMed(ActionEvent event) throws IOException {
		// Do nothing
		ViewSwitcher.switchView(ViewEnum.MED);
		
	}
	
	@FXML
	public void appointmentsClickedMed(ActionEvent event) throws IOException {
		// Render the appointments page
		ViewSwitcher.switchView(ViewEnum.APPT);
		
	}
	
	@FXML
	public void labResultsClickedMed(ActionEvent event) throws IOException {
		// Render the lab results page
		ViewSwitcher.switchView(ViewEnum.LAB);
		
	}
	
	@FXML
	public void logoClickedMed(ActionEvent event) throws IOException {
		// Render the home page
		ViewSwitcher.switchView(ViewEnum.HOME);
	}
	
}
