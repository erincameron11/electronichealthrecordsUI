package application;

import java.util.regex.Pattern;

import javafx.scene.control.TextField;

public class InputValidation {

	public static boolean validateNotEmpty(TextField tf) {
		if(tf.getText().equals("")){
			return false;
		}
		return true;
	}
	
	public static boolean validateEmail(TextField tf) {
		
		if(validateNotEmpty(tf)){
			String email = tf.getText();
			String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
					+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
			return Pattern.compile(regexPattern).matcher(email).matches();
		}


		return false;
	}
	
	public static boolean validatePassword(TextField tf) {
		// Check that the password has at least 7 characters
		if(validateNotEmpty(tf)) {
			String password = tf.getText();

			if (password.length() > 6) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean validateHR(TextField tf) {
		String hr = tf.getText();
		String regexPattern = "^\\d{2,3}$";
		
		return Pattern.compile(regexPattern).matcher(hr).matches();
    }
	
	public static boolean validateSPO2(TextField tf) {
		String spo2 = tf.getText();
		String regexPattern = "^(\\d{1,3})%$";
		
		return Pattern.compile(regexPattern).matcher(spo2).matches();
    }
	
	public static boolean validateBP(TextField tf) {
		String bp = tf.getText();
		String regexPattern = "^\\d{2,3}/\\d{2,3}$";
		
		return Pattern.compile(regexPattern).matcher(bp).matches();
    }
	
	public static boolean validateHealthCard(TextField tf) {
		// Check in the form XX-111-2222
		String healthcard = tf.getText();
		String regexPattern = "^[A-Z]{2}-\\d{3}-\\d{4}$";
		
		return Pattern.compile(regexPattern).matcher(healthcard).matches();
	}
	
}
