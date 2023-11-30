package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.DialogPane;
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
	public Button twelve;
	public Button one;
	public Button two;
	public Button three;
	public Button four;
	public Button five;
	public Button six;
	public DialogPane apptDialog;
	
	
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
    void oneClicked(ActionEvent event) {
    	one.setStyle("-fx-background-color: coral;");
    	two.setStyle("-fx-background-color: #d1e7fc;");
    	three.setStyle("-fx-background-color: #d1e7fc;");
    	four.setStyle("-fx-background-color: #d1e7fc;");
    	five.setStyle("-fx-background-color: #d1e7fc;");
    	six.setStyle("-fx-background-color: #d1e7fc;");
    	eleven.setStyle("-fx-background-color: #d1e7fc;");
    	twelve.setStyle("-fx-background-color: #d1e7fc;");
    }
    
    @FXML
    void twoClicked(ActionEvent event) {
    	one.setStyle("-fx-background-color: #d1e7fc;");
    	two.setStyle("-fx-background-color: coral;");
    	three.setStyle("-fx-background-color: #d1e7fc;");
    	four.setStyle("-fx-background-color: #d1e7fc;");
    	five.setStyle("-fx-background-color: #d1e7fc;");
    	six.setStyle("-fx-background-color: #d1e7fc;");
    	eleven.setStyle("-fx-background-color: #d1e7fc;");
    	twelve.setStyle("-fx-background-color: #d1e7fc;");
    }

    @FXML
    void threeClicked(ActionEvent event) {
    	one.setStyle("-fx-background-color: #d1e7fc;");
    	two.setStyle("-fx-background-color: #d1e7fc;");
    	three.setStyle("-fx-background-color: coral;");
    	four.setStyle("-fx-background-color: #d1e7fc;");
    	five.setStyle("-fx-background-color: #d1e7fc;");
    	six.setStyle("-fx-background-color: #d1e7fc;");
    	eleven.setStyle("-fx-background-color: #d1e7fc;");
    	twelve.setStyle("-fx-background-color: #d1e7fc;");
    }

    @FXML
    void fourClicked(ActionEvent event) {
    	one.setStyle("-fx-background-color: #d1e7fc;");
    	two.setStyle("-fx-background-color: #d1e7fc;");
    	three.setStyle("-fx-background-color: #d1e7fc;");
    	four.setStyle("-fx-background-color: coral;");
    	five.setStyle("-fx-background-color: #d1e7fc;");
    	six.setStyle("-fx-background-color: #d1e7fc;");
    	eleven.setStyle("-fx-background-color: #d1e7fc;");
    	twelve.setStyle("-fx-background-color: #d1e7fc;");
    }
	
    @FXML
    void fiveClicked(ActionEvent event) {
    	one.setStyle("-fx-background-color: #d1e7fc;");
    	two.setStyle("-fx-background-color: #d1e7fc;");
    	three.setStyle("-fx-background-color: #d1e7fc;");
    	four.setStyle("-fx-background-color: #d1e7fc;");
    	five.setStyle("-fx-background-color: coral;");
    	six.setStyle("-fx-background-color: #d1e7fc;");
    	eleven.setStyle("-fx-background-color: #d1e7fc;");
    	twelve.setStyle("-fx-background-color: #d1e7fc;");
    }

    @FXML
    void sixClicked(ActionEvent event) {
    	one.setStyle("-fx-background-color: #d1e7fc;");
    	two.setStyle("-fx-background-color: #d1e7fc;");
    	three.setStyle("-fx-background-color: #d1e7fc;");
    	four.setStyle("-fx-background-color: #d1e7fc;");
    	five.setStyle("-fx-background-color: #d1e7fc;");
    	six.setStyle("-fx-background-color: coral;");
    	eleven.setStyle("-fx-background-color: #d1e7fc;");
    	twelve.setStyle("-fx-background-color: #d1e7fc;");
    }

    @FXML
    void elevenClicked(ActionEvent event) {
    	one.setStyle("-fx-background-color: #d1e7fc;");
    	two.setStyle("-fx-background-color: #d1e7fc;");
    	three.setStyle("-fx-background-color: #d1e7fc;");
    	four.setStyle("-fx-background-color: #d1e7fc;");
    	five.setStyle("-fx-background-color: #d1e7fc;");
    	six.setStyle("-fx-background-color: #d1e7fc;");
    	eleven.setStyle("-fx-background-color: coral;");
    	twelve.setStyle("-fx-background-color: #d1e7fc;");
    }

    @FXML
    void twelveClicked(ActionEvent event) {
    	one.setStyle("-fx-background-color: #d1e7fc;");
    	two.setStyle("-fx-background-color: #d1e7fc;");
    	three.setStyle("-fx-background-color: #d1e7fc;");
    	four.setStyle("-fx-background-color: #d1e7fc;");
    	five.setStyle("-fx-background-color: #d1e7fc;");
    	six.setStyle("-fx-background-color: #d1e7fc;");
    	eleven.setStyle("-fx-background-color: #d1e7fc;");
    	twelve.setStyle("-fx-background-color: coral;");
    }
	
	@FXML
	public void clearAppointmentClicked(ActionEvent event) throws IOException {
		// Re-load the page
		ViewSwitcher.switchView(ViewEnum.APPT);
	}
	
	@FXML
	public void scheduleAppointmentClicked(ActionEvent event) throws IOException {
		// Display the dialog box
		apptDialog.setVisible(true);
	}
	
	@FXML
	public void continueClicked(ActionEvent event) throws IOException {
		// Render Lab results page
		ViewSwitcher.switchView(ViewEnum.APPT);
	}
	
	@FXML
	public void homeClicked(ActionEvent event) throws IOException {
		// Render the home page
		ViewSwitcher.switchView(ViewEnum.HOME);
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
