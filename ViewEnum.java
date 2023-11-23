package application;

public enum ViewEnum {	
	// List of different views to load
	LOGIN("Login.fxml"),
	HOME("Home.fxml"),
	HCPHOME("HCPHome.fxml"),
	MED("MedicalInfo.fxml"),
	APPT("Appointments.fxml"),
	LAB("LabResults.fxml"),
	FORGOTPASS("ForgotPass.fxml");
	
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
