
public class Television {
	//필드 선
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	//정적 블록
	static {
		System.out.println("1");
		info = company + "-" + model;
		info += "-" + model;
	}
	
	static {
		System.out.println("2");
	}
}
