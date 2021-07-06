package regexProblems;
import java.util.Scanner;
import java.util.regex.*;

public class PinCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a pin code ");
		String pinCode = "400086";
		String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(pinCode)	;
			boolean result = m.matches();
			if (result)
				System.out.println(" Valid Pincode");
			else 
				System.out.println(" Invalid pincode");
			
	}

}