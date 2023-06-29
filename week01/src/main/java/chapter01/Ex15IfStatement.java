package chapter01;

public class Ex15IfStatement {
	public static void main(String[] argv) {
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("참 잘했어");
			break;
			
		case 'B':
			System.out.println("좀 잘했어");
			break;
		default:
			System.out.println("노력해");
		}
	}
}
