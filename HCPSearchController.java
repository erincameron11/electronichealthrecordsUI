package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class HCPSearchController {
	
	@FXML
	public Pane rootPane;
	public Button results;
	public TextField healthcard;
	public Text healthcardText;
	
	private boolean healthcardValid = true;
	
	
	@FXML
	public void searchClicked(ActionEvent event) {
		// Check that fields are filled and validated input
		checkRequiredFields();
		
		// Get info from text fields
		String hc = healthcard.getText();

		// If the health card is valid, reset styling and show results
		if(healthcardValid) {
			// Show results
			results.setDisable(false);
			results.setStyle("-fx-text-fill: #0096bf; -fx-background-color: white;");
			results.setText("Evans, Patricia \t\t NH-234-4567 \t\t March 22, 1995");
		}
	}
	
	@FXML
	public void patientLookupClicked(ActionEvent event) throws IOException {
		// Render the patients profile
		ViewSwitcher.switchView(ViewEnum.HCPSEARCH);
	}
	
	
	@FXML
	public void resultsClicked(ActionEvent event) throws IOException {
		// Render the patients profile
		ViewSwitcher.switchView(ViewEnum.HCPHOME);
	}
	
	
	// Methods for navigation pane
	@FXML
	public void homeClicked(ActionEvent event) throws IOException {
		// Render the home page
		ViewSwitcher.switchView(ViewEnum.HCPHOME);
	}
	
	@FXML
	public void medInfoClicked(ActionEvent event) throws IOException {
		// Render the medical info page
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
		// Do nothing
		ViewSwitcher.switchView(ViewEnum.HCPHOME);
	}
	
	@FXML
	public void logoutClicked(ActionEvent event) throws IOException {
		// Render the login page
		ViewSwitcher.switchView(ViewEnum.LOGIN);
	}
	
	// Method: check that all required fields are filled out
    public void checkRequiredFields() {
    	// Check healthcard
        if(!InputValidation.validateHealthCard(healthcard)) {
        	healthcard.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
        	healthcardText.setText("Enter a valid healthcard");
            healthcardValid = false;
        } else {
        	healthcard.setStyle(null);
        	healthcardText.setText(" ");
        	healthcardValid = true;
        }
    }
	
}
