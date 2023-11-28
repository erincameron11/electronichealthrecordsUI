package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class HCPMedicalInfoController {
	
	@FXML
	public Pane rootPane;
	public Button createChart;
	
	@FXML
	public void createChartClicked(ActionEvent event) throws IOException {
		// Render new page
		ViewSwitcher.switchView(ViewEnum.HCPCHART);
	}
	
	@FXML
	public void medInfoClicked(ActionEvent event) throws IOException {
		// Do nothing
		ViewSwitcher.switchView(ViewEnum.HCPMED);
		
	}
	
	@FXML
	public void appointmentsClicked(ActionEvent event) throws IOException {
		// Render the appointments page
		ViewSwitcher.switchView(ViewEnum.HCPAPPT);
		
	}
	
	@FXML
	public void labResultsClicked(ActionEvent event) throws IOException {
		// Render the lab results page
		ViewSwitcher.switchView(ViewEnum.HCPLAB);
		
	}
	
	@FXML
	public void logoClicked(ActionEvent event) throws IOException {
		// Render the home page
		ViewSwitcher.switchView(ViewEnum.HCPHOME);
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
