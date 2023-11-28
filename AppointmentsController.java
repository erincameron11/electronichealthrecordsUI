package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class AppointmentsController {
	
	@FXML
	public Pane rootPane;
	private ComboBox<String> doctorNames;
	private ComboBox<String> visitReason;
	public TextArea notes;
	public DatePicker datePicker;
	public Button eleven;
	public Button one;
	public Button five;
	public Button six;
	
	@FXML
	public void visitReasonSelect(ActionEvent event) {
		// Get selected item
//		visitReason.setValue(visitReason.getSelectionModel().getSelectedItem().toString());
	}
	
	@FXML
	public void doctorSelect(ActionEvent event) {
		System.out.print(visitReason);
		// Display items in combo box
//		doctorNames.setItems(doctors);
//		doctorNames.setValue(doctorNames.getSelectionModel().getSelectedItem().toString());
//		doctorNames.getSelectionModel().getSelectedItem().toString();
	}
	
	
	// Method for when a date is selected - mock example when Dec 16 is picked
	@FXML
	public void datePicked(ActionEvent event) {
		// Get the date
		String dateSelected = datePicker.getValue().toString();
		// If the user selects Dec 16, 2023
		if(dateSelected.equals("2023-12-16")) {
			eleven.setDisable(true);
			one.setDisable(true);
			five.setDisable(true);
			six.setDisable(true);
		// If the user selects Dec 5, 2023
		} else if (dateSelected.equals("2023-12-05")) {
			five.setDisable(false);
			one.setDisable(false);
		// All other days are fully available for bookings
		} else {
			eleven.setDisable(false);
			one.setDisable(false);
			five.setDisable(false);
			six.setDisable(false);
		}
	}
	
	@FXML
	public void clearAppointmentClicked(ActionEvent event) {
		notes.setText(" ");
		datePicker.getEditor().clear();
//		doctorNames.getSelectionModel().clearSelection();
//		visitReason.getSelectionModel().clearSelection();
	}
	
	@FXML
	public void scheduleAppointmentClicked(ActionEvent event) {
//		String note = notes.getText();
//		String dateSelected = datePicker.getValue().toString();
//		notes.clear();
//		datePicker.cancelEdit();
//		visitReason.cancelEdit();
//		doctorNames.cancelEdit();
	}
	
	@FXML
	public void medInfoClicked(ActionEvent event) throws IOException {
		// Render the medical info page
		ViewSwitcher.switchView(ViewEnum.MED);
		
	}
	
	@FXML
	public void appointmentsClicked(ActionEvent event) throws IOException {
		// Do nothing
		ViewSwitcher.switchView(ViewEnum.APPT);
		
	}
	
	@FXML
	public void labResultsClicked(ActionEvent event) throws IOException {
		// Render the lab results page
		ViewSwitcher.switchView(ViewEnum.LAB);
		
	}
	
	@FXML
	public void logoClicked(ActionEvent event) throws IOException {
		// Render the home page
		ViewSwitcher.switchView(ViewEnum.HOME);
	}
	
	@FXML
	public void logoutClicked(ActionEvent event) throws IOException {
		// Render the login page
		ViewSwitcher.switchView(ViewEnum.LOGIN);
	}
	
}
