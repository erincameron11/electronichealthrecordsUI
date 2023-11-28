package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class LoginController {
	
	@FXML
	public Pane rootPane;
	public TextField email;
	public PasswordField pass;
	
	private boolean emailValid = true;
    private boolean passValid = true;
	
	// Create fake logins for Health Care Professionals and Patients
	private String healthCareProviderEmail = "hcp@email.com";
	private String healthCareProviderPass = "admin123";
	private String patientEmail = "pat@email.com";
	private String patientPass = "health456";
	
	@FXML
	public void loginClicked(ActionEvent event) throws IOException {
		// Check that both fields are filled and validated input
		checkRequiredFields();
		
		// Get data from textfield and passwordfield
		String username = email.getText();
		String password = pass.getText();
		
		// Check DB with the username and password
		if(emailValid && passValid) {
			// In this case we use mock emails/passwords to confirm info
			if(username.equals(healthCareProviderEmail) && password.equals(healthCareProviderPass)) {
				// Render the HCP home page
				ViewSwitcher.switchView(ViewEnum.HCPSEARCH);
			} else if(username.equals(patientEmail) && password.equals(patientPass)) {
				// Render the patient home page
				ViewSwitcher.switchView(ViewEnum.HOME);
			} else {
				email.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
	            emailValid = false;
				pass.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
	            passValid = false;
			}
		}
	}
	
	@FXML
	public void forgotPassClicked(ActionEvent event) throws IOException {
		// Render the patient login page
		ViewSwitcher.switchView(ViewEnum.FORGOTPASS);
	}
	
	
    // Method: check that all required fields are filled out
    public void checkRequiredFields() {
    	// Check email
        if(!InputValidation.validateEmail(email)) {
        	email.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
            emailValid = false;
        } else {
        	email.setStyle(null);
            emailValid = true;
        }

        // Check password
        if(!InputValidation.validatePassword(pass)) {
            pass.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
            passValid = false;
        } else {
            pass.setStyle(null);
            passValid = true;
        }
    }
	
}
