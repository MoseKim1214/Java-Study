package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		
		/* 코드 작성 */
		System.out.print("금액: ");
		int num = scanner.nextInt();
		
		System.out.println("50000원 : " + num/50000 +"개");
		num = num% 50000;
		
		System.out.println("10000원 : " + num/10000 +"개");
		num = num% 10000;
		
		System.out.println("5000원 : " + num/5000 +"개");
		num = num% 5000;
		
		System.out.println("1000원 : " + num/1000 +"개");
		num = num% 1000;
		
		System.out.println("500원 : " + num/500 +"개");
		num = num% 500;
		
		System.out.println("100원 : " + num/100 +"개");
		num = num% 100;
		
		System.out.println("50원 : " + num/50 +"개");
		num = num% 50;
		
		System.out.println("10원 : " + num/10 +"개");
		num = num% 10;
		
		System.out.println("5원 : " + num/5 +"개");
		num = num% 5;
		
		System.out.println("1원 : " + num/1 +"개");
		
		
		scanner.close();
 	}
}