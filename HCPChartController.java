package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class HCPChartController {
	
	@FXML
	public Pane rootPane;
	public Button createChart;
	
	@FXML
	public void submitChartClicked(ActionEvent event) throws IOException {
		// Get info and store it in DB
		
		// Make a new chart with the info provided
		
		// Render the chart page with the new addition
		ViewSwitcher.switchView(ViewEnum.HCPMED);
	}
	
	@FXML
	public void cancelChartClicked(ActionEvent event) throws IOException {
		// Render chart page
		ViewSwitcher.switchView(ViewEnum.HCPMED);
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
