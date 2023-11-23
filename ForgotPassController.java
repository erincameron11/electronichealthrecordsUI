package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class ForgotPassController {
	
	@FXML
	public Pane rootPane;
	public TextField email;
	public TextField emailConfirm;
	
	public boolean emailValid = true;
	public boolean emailConfirmValid = true;
	
	@FXML
	public void backToLoginClicked(ActionEvent event) throws IOException {
		// Render the login page
		ViewSwitcher.switchView(ViewEnum.LOGIN);
	}
	
	@FXML
	public void recoverPassClicked(ActionEvent event) throws IOException {
		checkRequiredFields();
		
		// Get data from textfields
		String emailAddress = email.getText();
		String emailAddressConfirm = emailConfirm.getText();
		
		// If both fields are filled, and equal one-another
		if(emailValid  && emailConfirmValid) {
			if(emailAddress.equals(emailAddressConfirm)) {
				// Render the login page
				ViewSwitcher.switchView(ViewEnum.LOGIN);
			} else {
				email.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
	            emailValid = false;
	            emailConfirm.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
	        	emailConfirmValid = false;
			}
		}
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

        // Check second email slot
        if(!InputValidation.validateEmail(emailConfirm)) {
        	emailConfirm.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
        	emailConfirmValid = false;
        } else {
        	emailConfirm.setStyle(null);
        	emailConfirmValid = true;
        }
    }
}
