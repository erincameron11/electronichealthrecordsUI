package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class HCPSearchController {
	
	@FXML
	public Pane rootPane;
	public Button results;
	public TextField healthcard;
	public Text healthcardText;
	public VBox hasHealthcardBox;
	public VBox doesNotHaveHealthcardBox;
	public RadioButton hasHealthcard;
	public RadioButton doesNotHaveHealthcard;
	public Button search;
	public TextField firstname;
	public TextField lastname;
	public DatePicker dob;
	
	private boolean healthcardValid = true;
	private boolean firstnameValid = true;
	private boolean lastnameValid = true;
	private boolean dobValid = true;
	
	@FXML
	public void hasHealthcardClicked(ActionEvent event) {
		// Clear styling on no healthcard fields
		firstname.setStyle(null);
		firstname.setText(" ");
		lastname.setStyle(null);
		lastname.setText(" ");
		dob.setStyle(null);
		
		
		// Unselect the no healthcard radio option
		doesNotHaveHealthcard.setSelected(false);
		
		// Make the healthcard option type-able, and no healthcard disabled
		hasHealthcardBox.setDisable(false);
		doesNotHaveHealthcardBox.setDisable(true);
		
		// Set search to click-able
		search.setDisable(false);
	}
	
	@FXML
	public void doesNotHaveHealthcardClicked(ActionEvent event) {
		// Clear styling on healthcard field
		healthcard.setStyle(null);
		healthcardText.setText(" ");
		
		// Unselect the healthcard radio option
		hasHealthcard.setSelected(false);
		
		// Make the no healthcard option type-able
		doesNotHaveHealthcardBox.setDisable(false);
		hasHealthcardBox.setDisable(true);
		
		// Set search to click-able
		search.setDisable(false);
	}
	
	@FXML
	public void searchClicked(ActionEvent event) {
		// Check that fields are filled and validated input
		checkRequiredFields();
		
		// Get info from text fields
		String hc = healthcard.getText();

		// If the health card is valid, reset styling and show results
		if(hasHealthcard.isSelected() && healthcardValid) {
			// Show results
			results.setDisable(false);
			results.setStyle("-fx-text-fill: #0096bf; -fx-background-color: white;");
			results.setText("Evans, Patricia \t\t NH-234-4567 \t\t March 22, 1995");
		} else if(doesNotHaveHealthcard.isSelected() && firstnameValid && lastnameValid && dobValid) {
			// Show results
			results.setDisable(false);
			results.setStyle("-fx-text-fill: #0096bf; -fx-background-color: white;");
			results.setText("Evans, Patricia \t\t NH-234-4567 \t\t March 22, 1995");
		} else {
			// do nothing
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
    	// If healthcard selected
    	if(hasHealthcard.isSelected()) {
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
	    
	    // If no healthcard selected
    	} else {
    		// Check first name
    		if(!InputValidation.validateNotEmpty(firstname)) {
    			firstname.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
    			firstnameValid = false;
    		} else {
    			firstname.setStyle(null);
    			firstnameValid = true;
    		}
    		
    		// Check last name
    		if(!InputValidation.validateNotEmpty(lastname)) {
    			lastname.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
    			lastnameValid = false;
    		} else {
    			lastname.setStyle(null);
    			lastnameValid = true;
    		}
    		
    		// Check dob
    		if(!InputValidation.validateDatePicker(dob)) {
    			dob.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
    			dobValid = false;
    		} else {
    			dob.setStyle(null);
    			dobValid = true;
    		}
    			
    	}
    }
	
}
