
public class CarEx {

	public static void main(String[] args) {

		//car 객체 생성
		Car myCar = new Car();
		
		
		//car 객체의 필드값 읽기
		System.out.println("모델명 : " + myCar.model);
		System.out.println("시동여부 : " + myCar.start);
		System.out.println("현재속도 : " + myCar.speed);
	}

}
