package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class HCPChartController {
	
	@FXML
	public Pane rootPane;
	public Button createChart;
	public TextField hr;
	public TextField spo2;
	public TextField bp;
	public DialogPane chartDialog;
	
	private boolean hrValid = true;
	private boolean spo2Valid = true;
	private boolean bpValid = true;
	
	@FXML
	public void submitChartClicked(ActionEvent event) throws IOException {
		// Check that all required fields are filled out
	    checkRequiredFields();
		
		// If HR, SPO2, and BP valid display the dialog box
	    if(hrValid && spo2Valid && bpValid) {
	    	chartDialog.setVisible(true);
	    }
	}
	
	@FXML
	public void cancelChartClicked(ActionEvent event) throws IOException {
		// Render chart page
		ViewSwitcher.switchView(ViewEnum.HCPMED);
	}
	
	@FXML
	public void continueClicked(ActionEvent event) throws IOException {
		// Render Lab results page
		ViewSwitcher.switchView(ViewEnum.HCPMED);
	}
	
	@FXML
	public void homeClicked(ActionEvent event) throws IOException {
		// Render the home page
		ViewSwitcher.switchView(ViewEnum.HCPHOME);
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
	
	// Method: check that all required fields are filled out
    public void checkRequiredFields() {
    	// Check hr
        if(!InputValidation.validateHR(hr)) {
        	hr.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
            hrValid = false;
        } else {
        	hr.setStyle(null);
            hrValid = true;
        }
        
        // Check spo2
        if(!InputValidation.validateSPO2(spo2)) {
        	spo2.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
        	spo2Valid = false;
        } else {
        	spo2.setStyle(null);
        	spo2Valid = true;
        }
        
        // Check bp
        if(!InputValidation.validateBP(bp)) {
        	bp.setStyle("-fx-text-box-border: red ;-fx-focus-color: red ;-fx-control-inner-background: #fabdb9");
        	bpValid = false;
        } else {
        	bp.setStyle(null);
        	bpValid = true;
        }
    }
	
}
