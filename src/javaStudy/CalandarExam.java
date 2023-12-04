
package javaStudy;

import java.util.Calendar;

public class CalandarExam {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		
//		cal.add(Calendar.HOUR,5);
		System.out.println(cal.get(Calendar.HOUR));
	}
}
