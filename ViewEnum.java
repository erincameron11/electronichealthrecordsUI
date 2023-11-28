package application;

public enum ViewEnum {	
	// List of different views to load
	LOGIN("Login.fxml"),
	HOME("Home.fxml"),
	MED("MedicalInfo.fxml"),
	APPT("Appointments.fxml"),
	LAB("LabResults.fxml"),
	FORGOTPASS("ForgotPass.fxml"),
	HCPSEARCH("HCPSearch.fxml"),
	HCPHOME("HCPHome.fxml"),
	HCPMED("HCPMedicalInfo.fxml"),
	HCPCHART("HCPChart.fxml"),
	HCPAPPT("HCPAppointments.fxml"),
	HCPLAB("HCPLabResults.fxml");
	
	// Define variable
	private String filename;
	
	// Constructor
	ViewEnum(String filename) {
		this.filename = filename;
	}
	
	// Getter for filename
	public String getFilename() {
		return filename;
	}
	
}
