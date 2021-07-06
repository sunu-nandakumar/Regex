package regexProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {

	public static void main(String[] args) {
		
		String email = "abc..2002@gmail.com";
		String regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2})*$";
		Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(email)	;
			boolean result = m.matches();
			if (result)
				System.out.println(" Valid Pincode");
			else 
				System.out.println(" Invalid pincode");
			
	}

}
