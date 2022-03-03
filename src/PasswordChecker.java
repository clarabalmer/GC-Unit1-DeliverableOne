import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Hello, user! Please input a password via the console.");
		String password = scnr.next();
		System.out.println(password);
		
		//System.out.println("Password valid and accepted");
		//System.out.println("Error");
	}

}
