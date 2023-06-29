package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();  //부모게 먼저 생성되고 자식게 생성
		s1.setGrade("1");
		
		Person p1 = s1; //Upcasting(암시적)
		p1.setName("홍길동");
		
		Student s2 = (Student) p1; //Downcasting(명시적)
		
		s2.setMajor("컴퓨터학과");
		s2.setGrade("3");
		
		
	}

}
