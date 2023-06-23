package chapter01;

public class Ex13IfStatement {

	public static void main(String[] args) {
		int score = 92;
		char grade = ' ';
		
		if (score >90) {
			grade = 'A';
		} else if (score >80) {
			grade = 'B';
		} else if (score > 70 ) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println(grade);

		
		int score2 = score / 10;
		
		switch (score2) {
		case 9:
			System.out.println('A');
			break;
			
		case 8:
			System.out.println('B');
			break;
			
		case 7:
			System.out.println('C');
			break;
		
		default:
			System.out.println('D');
			break;
		}
	}
	
	
	
}
