package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

	
			
		/* 게임 작성 */

		// 정답 램덤하게 만들기
		Random random = new Random();
		int correctNumber = random.nextInt( 100 ) + 1;
		//System.out.println(correctNumber);
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		System.out.println("1-100");
		
		int n = 1;
		int bottom = 1;
		int top = 100;
		while(true) {
			
			System.out.print(n++ + ">>");
			int number = scanner.nextInt();
			if (number < correctNumber) {
				System.out.println("더 높게");
				bottom = number;
				System.out.println(bottom + "-" + top);
			} else if (number > correctNumber) {
				System.out.println("더 낮게");
				top = number;
				System.out.println(bottom + "-" + top);
			} else {
				System.out.println("맞았습니다.");
				break;
			}
			
			
		}

		
		scanner.close();
	}

}