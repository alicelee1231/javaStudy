package javaStudy;

public class Student1 {

	private int studentId;
	private String studentName;
	
	public Student1() {
		this(150,"dfs");
	}
	
	public Student1(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void showInfo() {
		System.out.println("학번 : "+ studentId);
		System.out.println("이름 :" + studentName);
	}
	
}
