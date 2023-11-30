package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class HCPLabReqController {
	
	@FXML
	public Pane rootPane;
	public CheckBox ne;
	public CheckBox ly;
	public CheckBox mo;
	public CheckBox ba;
	public CheckBox eo;
	public CheckBox iga;
	public CheckBox ige;
	public CheckBox igg;
	public CheckBox wbc;
	public CheckBox rbc;
	public CheckBox hepc;
	public CheckBox hepb;
	public CheckBox hepa;
	public CheckBox igi;
	public CheckBox glucose;
	public CheckBox creatine;
	public Text selectOption;
	public DialogPane labDialog;
	
	private boolean selectionValid = true;
	
	
	@FXML
	public void cancelLabReqClicked(ActionEvent event) throws IOException {
		// Render Lab results page
		ViewSwitcher.switchView(ViewEnum.HCPLAB);
	}
	
	@FXML
	public void submitLabReqClicked(ActionEvent event) {
		// Check that at least one selection has been made
		checkRequiredFields();
		
		// If at least one selection has been made render new page
		if(selectionValid) {
			// Make the dialog box visible
			labDialog.setVisible(true);
		}
	}
	
	@FXML
	public void homeClicked(ActionEvent event) throws IOException {
		// Render the home page
		ViewSwitcher.switchView(ViewEnum.HCPHOME);
	}
	
	@FXML
	public void continueClicked(ActionEvent event) throws IOException {
		// Render Lab results page
		ViewSwitcher.switchView(ViewEnum.HCPLAB);
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
		// Do nothing
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
    	// Check that at least one checkbox is selected
    	if(!ne.isSelected()
    		&& !ly.isSelected()
    		&& !mo.isSelected()
    		&& !ba.isSelected()
    		&& !eo.isSelected()
    		&& !iga.isSelected()
    		&& !ige.isSelected()
    		&& !igg.isSelected()
    		&& !wbc.isSelected()
    		&& !rbc.isSelected()
    		&& !hepc.isSelected()
    		&& !hepb.isSelected()
    		&& !hepa.isSelected()
    		&& !igi.isSelected()
    		&& !glucose.isSelected()
    		&& !creatine.isSelected()) {
    		// Invalidate the fields
    		selectOption.setText("Please select at least one option");
            selectionValid = false;
        } else {
        	selectOption.setText(" ");
        	selectionValid = true;
    	}
    }
	
}
