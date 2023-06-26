package chapter01;

import java.util.Scanner;

public class Ex31ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//키보드와 연결된 인풋 스트림, ctrl+shift+o 로 임포트해줘야한다.
		
		System.out.println("상품 정보를 입력하세요");
		
		System.out.print("이름: ");
		
		String name = scanner.next(); //여기서 정지됨. block되서 입력을 기다림
		
		System.out.println("가격:");
		int price = scanner.nextInt();
		
		System.out.println("재고량");
		int countStock = scanner.nextInt();
		
		System.out.println(name+price + countStock);
		scanner.close();
	}

}
