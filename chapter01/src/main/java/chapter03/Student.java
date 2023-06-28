package chapter03;

public class Student extends Person {
	
	
	private String grade;
	private String major;
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Student() {
		
		
		super(); //부모의 기본 생성자를 호출, 명시를 안해도 기본적으로 명시되어있음
		System.out.println("Student()이 생성됨");
	}
}
