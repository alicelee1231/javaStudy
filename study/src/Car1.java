
public class Car1 {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car1(String model){
		this(model,"은색",250);
		System.out.println("1");
	}
	Car1(String model, String color){
		this(model,color,250);
		System.out.println("2");
	}	
	Car1(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("3");
	}
	
}
