package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class LabResultsController {
	
	@FXML
	public Pane rootPane;
	
	
	@FXML
	public void medInfoClicked(ActionEvent event) throws IOException {
		// Render the medical info page
		ViewSwitcher.switchView(ViewEnum.MED);
	}
	
	@FXML
	public void appointmentsClicked(ActionEvent event) throws IOException {
		// Render the appointments page
		ViewSwitcher.switchView(ViewEnum.APPT);
	}
	
	@FXML
	public void labResultsClicked(ActionEvent event) throws IOException {
		// Do nothing
		ViewSwitcher.switchView(ViewEnum.LAB);
	}
	
	@FXML
	public void logoClicked(ActionEvent event) throws IOException {
		// Render the home page
		ViewSwitcher.switchView(ViewEnum.HOME);
	}
	
	@FXML
	public void patientLookupClicked(ActionEvent event) throws IOException {
		// Render the patients profile
		ViewSwitcher.switchView(ViewEnum.HCPSEARCH);
	}
	
	@FXML
	public void logoutClicked(ActionEvent event) throws IOException {
		// Render the login page
		ViewSwitcher.switchView(ViewEnum.LOGIN);
	}
	
}
