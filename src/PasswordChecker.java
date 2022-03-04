import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Hello, user! Please input a password via the console.");
		System.out.println("Your password must be between 7 and 12 characters, contain at least one uppercase and one lowercase letter, and contain an exclamation point.");
		String password = scnr.next();
		
		//parent conditional checks password min/max length, and if it contains "!"
		if (7 <= password.length() && password.length() <= 12 && password.contains("!")) {
			
			boolean upper = false;
			boolean lower = false;
			
			//for loop checks each character in password until uppercase 
			//and lowercase letters are found
			for(int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i))) {
					upper = true;
				}
				if (Character.isLowerCase(password.charAt(i))) {
					lower = true;
				}
				//System.out.println(i); //test, remove later
				if (upper == true && lower == true) {
					break;
				}
			}
			
			
			if (upper == true && lower == true) {
				System.out.println("Password valid and accepted");
			} else {
				System.out.println("Error");
			}
			//last conditional prints success if uppercase and lowercase letters were found,
			//error if not.
			
		} else {
			System.out.println("Error");
		}
		
		scnr.close();

	}
}
