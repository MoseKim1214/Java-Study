package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i=0; i< COUNT_GOODS; i++) {
			String line = scanner.nextLine(); //한줄씩 받음
			String[] info = line.split(" ");
			String name = info[0];
			int price = Integer.parseInt(info[1]);
			int stock = Integer.parseInt(info[2]);
			goods[i] = new Goods(name, price, stock);
		}
		// 상품 출
		for(int i =0; i< COUNT_GOODS; i++) {
			System.out.println(goods[i].getName() +"(가격:"+goods[i].getPrice()+"원)이 "+
								goods[i].getStock()+"개 입고 되었습니다.");
		}
		
		// 자원정리
		scanner.close();
	}
}
