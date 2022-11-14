
public class KoreanEx {

	public static void main(String[] args) {

		Korean k1 = new Korean("123445-123111","감자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//fianl이기 때문에 수정 불
//		k1.nation = "USA";
//		k1.ssn = "123j231321";
		
		k1.name ="이자바";
		
		System.out.println(k1.name);
	}

}
