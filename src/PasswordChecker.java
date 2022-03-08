import java.util.Scanner;

public class PasswordChecker {
	//second version: tells user what requirements their password failed, and repeats prompt until user inputs valid password.
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		boolean passwordNeeded = true;
		
		System.out.print("Hello, user! ");
		
		while (passwordNeeded) {
			System.out.println("Please input a password via the console.");
			System.out.println("Your password must be between 7 and 12 characters, contain at least one uppercase and one lowercase letter, and contain an exclamation point.");
		
			String password = scnr.next();
		
			boolean min = false;
			boolean max = false;
			boolean bang = false;
			boolean upper = false;
			boolean lower = false;
			
			if (7 <= password.length()) {
				min = true;
			}
			if (password.length() <= 12) {
				max = true;
			}
			if (password.contains("!")) {
				bang = true;
			}
			for(int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i))) {
					upper = true;
				}
				if (Character.isLowerCase(password.charAt(i))) {
					lower = true;
				}
				if (upper == true && lower == true) {
					break;
				}
			}
			
			if (min && max && bang && upper && lower) {
				System.out.println("password valid and accepted");
				passwordNeeded = false;
			} else {
				System.out.println("Error");
				
				String needs = "Your password ";
				if (!min || !max) {
					needs += "was ";
					if (!min) {
						needs += "shorter than 7 characters";
					} else {
						needs += "longer than 12 characters";
					}
					if (!bang || !upper || !lower) {
						needs += ", and ";
					}
				}
				
				if (!bang || !upper || !lower) {
					
					needs += "lacked ";
					
					if (!bang) {
						needs += "an exclamation point";
						if (!upper ^ !lower) {
							needs += ", and ";
						} else if (!upper || !lower) {
							needs += ", ";
						} else {
							needs += ".";
						}
					}
					
					if (!upper) {
						if (!lower) {
							needs += "an uppercase letter, and ";
						} else {
							needs += "an uppercase letter.";
						}
					}
					
					if (!lower) {
						needs += "a lowercase letter.";
					}
					
					
				} else {
					needs += ".";
				}
				
				System.out.println(needs);
			}
		
		}
	}
	
	/* First version below
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
*/
}
