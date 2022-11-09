package ch05;

public class CharAtExample {

	public static void main(String[] args) { //문자 추

		String ssn = "9412321111111";
		char gender = ssn.charAt(6);
		switch(gender) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2' :
			case '4' :
				System.out.println("여자입니다.");
				break;
		}	
	}

}
