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
	
}
