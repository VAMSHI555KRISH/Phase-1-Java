package ComPackages;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*; 
public class EmailValidation { 
	
	private static Scanner sc;

	public static void main(String[] args) {

	List<String> emails = new ArrayList<String>();
	// valid email addresses emails.add("Vamshi@.com"); 
	//invalid email addresses emails.add("Arjun.com");
	for (String value : emails) {
	System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));

	}
	System.out.println("Enter any email address to check"); sc = new Scanner(System.in);
	String input = sc.nextLine();
	System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));


	}

	public static boolean isValidEmail(String email) { String regex = "^(.+)@(.+)$";
	//initialize the Pattern object
	Pattern pattern = Pattern.compile(regex); Matcher matcher = pattern.matcher(email); return matcher.matches();


	}

	}



