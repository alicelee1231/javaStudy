package ch05;

public class SubStringEx {

	public static void main(String[] args) {

		String ssn = "9412321111111";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
	}

}
